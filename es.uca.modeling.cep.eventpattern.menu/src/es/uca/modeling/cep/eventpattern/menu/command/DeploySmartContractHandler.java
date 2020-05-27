/*******************************************************************************
 * Copyright (c) 2011, 2015 Juan Boubeta-Puig
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Juan Boubeta-Puig - initial API and implementation
 ******************************************************************************/

package es.uca.modeling.cep.eventpattern.menu.command;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.models.Model;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

import eventpattern.CEPEventPattern;
import eventpattern.EventpatternPackage;
import eventpattern.diagram.part.EventpatternDiagramEditor;
import eventpattern.diagram.status.EventPatternsStatus;
import smartcontract.SmartContracts;
import smartcontract.SmartcontractPackage;
import smartcontract.diagram.part.SmartcontractDiagramEditor;
import es.uca.modeling.cep.eventpattern.m2t.TransformEventPatternToCode;


public class DeploySmartContractHandler extends AbstractHandler {
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
			
		try {		
			
			Shell shell = HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell();
			
			String domainName = EventPatternsStatus.getDomainName();				
			IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
			IProject domainProject = myWorkspaceRoot.getProject("domain");
			IProject patternProject = myWorkspaceRoot.getProject(domainName + "_patterns");
			IProject runtimeProject = myWorkspaceRoot.getProject(domainName + "_runtime");
			IProject smartcontractsProject = myWorkspaceRoot.getProject("smartcontract");				
			
			if (!smartcontractsProject.exists()) {
	        	MessageDialog.openError(shell, "Deploy Smart Contract", "There are no Smart Contratcs to be deployed.");
	        	return null;	
			} else {
				// 1º Obtain the active editor's diagram
		        SmartcontractDiagramEditor smartcontractDiagramEditor = (SmartcontractDiagramEditor) HandlerUtil.getActiveEditor(event);
				if (smartcontractDiagramEditor == null || !smartcontractDiagramEditor.getTitle().endsWith("smartc_diagram")) {
		        	MessageDialog.openError(shell, "Deploy Smart Contract", "An Smart Contract must be open.");
		        	return null; 
				} else {
					if (!domainProject.exists()) {
			        	MessageDialog.openError(shell, "Deploy Smart Contract", "A CEP domain must be previously created or imported.");
			        	return null;	
					} else {
					
				        // 2º Save all changes made in the editor       
				        smartcontractDiagramEditor.doSave(new NullProgressMonitor());
				        
				        // 3º Check if there are some problems that must be solved		 
						IResource ir = (IResource) HandlerUtil.getActiveEditorInput(event).getAdapter(IResource.class);
				        IMarker[] problems = null;
				        int depth = IResource.DEPTH_INFINITE;
						problems = ir.findMarkers(IMarker.PROBLEM, true, depth);
						
						// problems.length is the number of errors of the active editor (not total errors).
						if (problems.length > 0) {
							MessageDialog.openError(shell, "Deploy Smart Contract", "There are some problems that must be solved before deploying the smart contract.");
				        	return null; 
						}
					 	
						String activeSmartcontractName = smartcontractDiagramEditor.getTitle().replace(".smartc_diagram","");
						
						// Open if necessary
						if (!smartcontractsProject.isOpen()) {
							smartcontractsProject.open(null);
						}
						
						URI activeSmartcontractModelUri = URI.createPlatformResourceURI(smartcontractsProject
								.getFile(activeSmartcontractName + ".smartc").getFullPath().toString(), false);
										
					    ResourceSet resourceSet = new ResourceSetImpl(); 
					   	Resource smartcontractModelResource = resourceSet.getResource(activeSmartcontractModelUri, true);
					   				
					   	SmartContracts smartContractModel = (SmartContracts) smartcontractModelResource.getContents().get(0);
						
					   	String[] options = new String[smartContractModel.getSmartcontracts().size()];
					   	
					   	for(int i = 0; i < smartContractModel.getSmartcontracts().size(); i++) {
					   		options[i] = smartContractModel.getSmartcontracts().get(i).getTypeName();
					   	}
					   	
					   	//Dialog for select what model are going to be modeled
			            String smartContractSelected = (String)JOptionPane.showInputDialog(
			            					null,
			                                "Select the Smart Contract that you want to deploy",
			                                "Selection of Smart Contract model",
			                                JOptionPane.PLAIN_MESSAGE,
			                                null,
			                                options,
			                                options[0]);
					 
			            // 4º Select the directory to generate the smartcontracts for the event pattern, if there are smartcontracts.
						if (EventPatternsStatus.getGeneratedSmartContractPath() == null) {
							EventPatternsStatus.setGeneratedSmartContractPath(myWorkspaceRoot.getLocation().toString() + runtimeProject.getFullPath() + "\\");
						}	
						
						// 5º Generate the smartcontracts for deploy in java code 
						
						if (!smartContractModel.getSmartcontracts().isEmpty()) { // There are Smart Contracts
									
							final Model sourceModel4 = new InMemoryEmfModel("SourceModel", smartcontractModelResource, SmartcontractPackage.eINSTANCE);
							sourceModel4.setStoredOnDisposal(false);
							sourceModel4.setReadOnLoad(true);
												
							File outputSmartContractFile;
							String patternToSmartContractPath;
							
							if(!runtimeProject.exists()) {
								runtimeProject.create(null);							
							}
							
							if(smartContractSelected.equals("Auction") || smartContractSelected.equals("Purchase") ||
									smartContractSelected.equals("Voting") || smartContractSelected.equals("VaccineDelivery")) {
									
									patternToSmartContractPath = "/egl/eventpattern-to-" + smartContractSelected +".egl";
									outputSmartContractFile = new File(EventPatternsStatus.getGeneratedSmartContractPath(), smartContractSelected + ".java");	
									System.out.println("\noutputSmartContractFile.getAbsolutePath(): " + outputSmartContractFile.getAbsolutePath());
																
									String result = TransformEventPatternToCode.executeEGL(sourceModel4, smartContractModel, patternToSmartContractPath, outputSmartContractFile);
							} //Fin-if
						}

						// 6º Transform the invocations of the smartcontracts for the event pattern to java code 
						
						if (!smartContractModel.getSmartcontracts().isEmpty()) { // There are actions for the event pattern
						
							Model sourceModel3;
							
							File outputSmartContractDeployFile;
							String patternToSmartContractDeployPath;
							
							if(!runtimeProject.exists()) {
								runtimeProject.create(null);							
							}
							
							sourceModel3 = new InMemoryEmfModel("SourceModel", smartcontractModelResource, SmartcontractPackage.eINSTANCE);
							sourceModel3.setStoredOnDisposal(false);
							sourceModel3.setReadOnLoad(true);
							
							patternToSmartContractDeployPath = "/egl/eventpattern-to-SmartContract-Deploy.egl";
							outputSmartContractDeployFile = new File(EventPatternsStatus.getGeneratedSmartContractPath(), smartContractSelected + "_deploy.java");	
							
							String result = TransformEventPatternToCode.executeEGL(sourceModel3, smartContractModel, patternToSmartContractDeployPath, outputSmartContractDeployFile);
							
							//Despliegue del Smart Contract
							
							
							
							/*try {
								//cmd = {"java",outputContractFunctionFile.getAbsolutePath()};
								System.out.println("java " + outputContractFunctionFile.getAbsolutePath());
								Runtime.getRuntime().exec("javac " + outputContractFunctionFile.getAbsolutePath());
								System.out.println("javac " + outputContractFunctionFile.getAbsolutePath());
								Runtime.getRuntime().exec("java -classpath " + EventPatternsStatus.getGeneratedSmartContractPath() + eventPatternModel.getSmartContracts().get(i).getTypeName() + "_invocation");
								System.out.println("java -classpath " + EventPatternsStatus.getGeneratedSmartContractPath() + " " + eventPatternModel.getSmartContracts().get(i).getTypeName() + "_invocation");
								//Runtime.getRuntime().exec("java -classpath " + EventPatternsStatus.getGeneratedSmartContractPath() + " " + eventPatternModel.getSmartContracts().get(i).getTypeName());
							} catch (IOException ioe) {
								System.out.println (ioe);
							} */ 	
						}
					}
				}	
			}	
			
			
			
				
		
			
	        
	        
	        
			
				
					
			
		    		    
			
			
			
						
			
							
			
			
			MessageDialog.openInformation(shell, "Deploy Smart Contract", 
		    		"The Smart Contract has been deployed.");	
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
				
		return null;
	}
}
