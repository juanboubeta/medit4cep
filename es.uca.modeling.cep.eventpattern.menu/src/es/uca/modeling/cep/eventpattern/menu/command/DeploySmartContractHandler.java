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

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
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
			IProject runtimeProject = myWorkspaceRoot.getProject(domainName + "_runtime");
			IProject smartcontractsProject = myWorkspaceRoot.getProject("smartcontract");				
			
			if (EventPatternsStatus.getProjectPath() == null) {
				
				String selectedDir = null;
			    DirectoryDialog dirDialog = new DirectoryDialog(shell);
			    dirDialog.setText("Choose MEdit4CEP folder.");
			    selectedDir = dirDialog.open();
		    	    
			    if (selectedDir == null) {
		        	return null; 	    	
			    }
			    else {
			    	System.out.println(selectedDir);
			    	selectedDir += "\\es.uca.modeling.cep.smartcontract.code\\src\\es\\uca\\modeling\\cep\\smartcontract\\code";
			    	EventPatternsStatus.setProjectPath(selectedDir);
			    	System.out.println(selectedDir);
			    }
			}
			
			String projectPath = EventPatternsStatus.getProjectPath();
			
			if (!smartcontractsProject.exists()) {
	        	MessageDialog.openError(shell, "Deploy Smart Contract", "There are no Smart Contratcs to be deployed.");
	        	return null;	
			} else {
				// 1� Obtain the active editor's diagram
		        SmartcontractDiagramEditor smartcontractDiagramEditor = (SmartcontractDiagramEditor) HandlerUtil.getActiveEditor(event);
				if (smartcontractDiagramEditor == null || !smartcontractDiagramEditor.getTitle().endsWith("smartc_diagram")) {
		        	MessageDialog.openError(shell, "Deploy Smart Contract", "An Smart Contract must be open.");
		        	return null; 
				} else {
					if (!domainProject.exists()) {
			        	MessageDialog.openError(shell, "Deploy Smart Contract", "A CEP domain must be previously created or imported.");
			        	return null;	
					} else {
					
				        // 2� Save all changes made in the editor       
				        smartcontractDiagramEditor.doSave(new NullProgressMonitor());
				        
				        // 3� Check if there are some problems that must be solved		 
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
					   	Resource modelResource = resourceSet.getResource(activeSmartcontractModelUri, true);
					   	
					   	SmartContracts smartContractModel = (SmartContracts) smartcontractModelResource.getContents().get(0);
						
					   	String[] options = new String[smartContractModel.getSmartcontracts().size()];
					   	String smartContractSelected;
					   	
					   	if(smartContractModel.getSmartcontracts().size() == 1) {
					   		smartContractSelected = smartContractModel.getSmartcontracts().get(0).getTypeName();
					   	} else {
					   	
						   	for(int i = 0; i < smartContractModel.getSmartcontracts().size(); i++) {
						   		options[i] = smartContractModel.getSmartcontracts().get(i).getTypeName();
						   	}
						   	
						   	//Dialog for select what model are going to be modeled
				            smartContractSelected = (String)JOptionPane.showInputDialog(
				            					null,
				                                "Select the Smart Contract that you want to deploy",
				                                "Selection of Smart Contract model",
				                                JOptionPane.PLAIN_MESSAGE,
				                                null,
				                                options,
				                                options[0]);
					   	}
					 
			            // 4� Select the directory to generate the smartcontracts for the event pattern, if there are smartcontracts.
						if (EventPatternsStatus.getGeneratedSmartContractPath() == null) {
							EventPatternsStatus.setGeneratedSmartContractPath(myWorkspaceRoot.getLocation().toString() + runtimeProject.getFullPath() + "\\");
						}	
						
						// 5� Generate the smartcontracts for deploy in java code 
						
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
									outputSmartContractFile = new File(projectPath, smartContractSelected + ".java");	
									System.out.println("\noutputSmartContractFile.getAbsolutePath(): " + outputSmartContractFile.getAbsolutePath());
																
									String result = TransformEventPatternToCode.executeEGL(sourceModel4, smartContractModel, patternToSmartContractPath, outputSmartContractFile);
							} //Fin-if
						}

						// 6� Transform the invocations of the smartcontracts for the event pattern to java code 
						
						if (!smartContractModel.getSmartcontracts().isEmpty()) { // There are actions for the event pattern
						
							Model sourceModel3;
							
							File outputSmartContractDeployFile;
							String patternToSmartContractDeployPath;
							
							if(!runtimeProject.exists()) {
								runtimeProject.create(null);							
							}
							
							
							// 4� Select the directory to generate the event pattern. 
							// It should be the 'new-eventpattern' directory in the Mule project where the pattern will be deployed.
														
							sourceModel3 = new InMemoryEmfModel("SourceModel", smartcontractModelResource, SmartcontractPackage.eINSTANCE);
							sourceModel3.setStoredOnDisposal(false);
							sourceModel3.setReadOnLoad(true);
							
							patternToSmartContractDeployPath = "/egl/eventpattern-to-SmartContract-Deploy.egl";
							outputSmartContractDeployFile = new File(projectPath, smartContractSelected + "_deploy.java");	
							
							String result = TransformEventPatternToCode.executeEGL(sourceModel3, smartContractModel, patternToSmartContractDeployPath, outputSmartContractDeployFile);
							
							//Despliegue del Smart Contract											
							
							//ResourcesPlugin.getWorkspace().getRoot().getProject( "" ).refreshLocal( IResource.DEPTH_INFINITE, new NullProgressMonitor() );
							Thread.sleep(5000);
							String deployedSmartContract = "es.uca.modeling.cep.smartcontract.code." + smartContractSelected + "_deploy";
							Class c = Class.forName(deployedSmartContract);
							c.newInstance();
							
							File contractAddressFile = new File (smartContractSelected + "_contractAddress.txt");
							FileReader fr = new FileReader (contractAddressFile);
							BufferedReader br = new BufferedReader(fr);
							String contractAddress = br.readLine();
							//System.out.println(contractAddress);
							//System.out.println(contractAddressFile.getAbsolutePath());
							//contractAddressFile.delete();
							br.close();
							
							for(int i = 0; i < smartContractModel.getSmartcontracts().size(); i++) {
						   		if(smartContractModel.getSmartcontracts().get(i).getTypeName() == smartContractSelected) {
						   			//System.out.println(smartContractModel.getSmartcontracts().get(i).getTypeName());
						   			smartContractModel.getSmartcontracts().get(i).setContractAddress(contractAddress);
						   			modelResource.save(null);
						   			//System.out.println(smartContractModel.getSmartcontracts().get(i).getContractAddress());
						   		}
						   	}
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