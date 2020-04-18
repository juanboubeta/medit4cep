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

import java.io.File;
import java.io.IOException;

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
import es.uca.modeling.cep.eventpattern.m2t.TransformEventPatternToCode;


public class GenerateExecuteSmartContractsHandler extends AbstractHandler {
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
			
		try {		
			
			Shell shell = HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell();
			
			String domainName = EventPatternsStatus.getDomainName();				
			IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
			IProject patternProject = myWorkspaceRoot.getProject(domainName + "_patterns");
							
			if (!patternProject.exists()) {
	        	MessageDialog.openError(shell, "Generate Smart Contracts", "There are no event patterns to be transformed into code.");
	        	return null;	
			}		
		
			if(!HandlerUtil.getActiveEditor(event).getClass().getName().equals("eventpattern.diagram.part.EventpatternDiagramEditor")) {
							
				MessageDialog.openError(shell, "Generate Smart Contracts", "An event pattern must be open.");
				return null;
			}
			
			// 1º Obtain the active editor's diagram
	        EventpatternDiagramEditor patternDiagramEditor = (EventpatternDiagramEditor) HandlerUtil.getActiveEditor(event);
	        
	        if (patternDiagramEditor == null || !patternDiagramEditor.getTitle().endsWith("pattern_diagram")) {
	        	MessageDialog.openError(shell, "Generate Smart Contracts", "An event pattern must be open.");
	        	return null; 
	        }
	        
	        // 2º Save all changes made in the editor       
	        patternDiagramEditor.doSave(new NullProgressMonitor());
	        
			// 3º Check if there are some problems that must be solved
	                
			IResource ir = (IResource) HandlerUtil.getActiveEditorInput(event).getAdapter(IResource.class);
	        IMarker[] problems = null;
	        int depth = IResource.DEPTH_INFINITE;
			problems = ir.findMarkers(IMarker.PROBLEM, true, depth);
				
			// problems.length is the number of errors of the active editor (not total errors).
			if (problems.length > 0) {
				MessageDialog.openError(shell, "Generate Smart Contracts", "There are some problems that must be solved before generating and executing the smart contracts.");
	        	return null; 
			}
		 	
			String activePatternName = patternDiagramEditor.getTitle().replace(".pattern_diagram","");
			
			// Open if necessary
			if (!patternProject.isOpen()) {
				patternProject.open(null);
			}
						
			URI activePatternModelUri = URI.createPlatformResourceURI(patternProject
					.getFile(activePatternName + ".pattern").getFullPath().toString(), false);
							
		    ResourceSet resourceSet = new ResourceSetImpl(); 
		   	Resource patternModelResource = resourceSet.getResource(activePatternModelUri, true);
		   				
		    CEPEventPattern eventPatternModel = (CEPEventPattern) patternModelResource.getContents().get(0);
		    		    
			// 4º Select the directory to generate the smartcontracts for the event pattern, if there are smartcontracts.
						
			if (!eventPatternModel.getSmartContracts().isEmpty() && EventPatternsStatus.getGeneratedSmartContractPath() == null) {
				String selectedDir = null; 
			    DirectoryDialog dirDialog = new DirectoryDialog(shell);
			    dirDialog.setText("Choose a folder where to save the generated smartcontract code.");
			    selectedDir = dirDialog.open();
					    	    
			    if (selectedDir == null) {
			       	return null; 	    	
			    }
			    else {
			    	EventPatternsStatus.setGeneratedSmartContractPath(selectedDir);
			    }
			}	
			
			// 5º Generate the smartcontracts for the event pattern in java code 
			
			if (!eventPatternModel.getSmartContracts().isEmpty()) { // There are actions for the event pattern
						
				final Model sourceModel4 = new InMemoryEmfModel("SourceModel", patternModelResource, EventpatternPackage.eINSTANCE);
				sourceModel4.setStoredOnDisposal(false);
				sourceModel4.setReadOnLoad(true);
									
				File outputSmartContractFile;
				String patternToSmartContractPath;
						
				for(int i = 0; i < eventPatternModel.getSmartContracts().size(); i++) {
					
				if(eventPatternModel.getSmartContracts().get(i).getTypeName().equals("Auction") ||
						eventPatternModel.getSmartContracts().get(i).getTypeName().equals("Purchase") ||
						eventPatternModel.getSmartContracts().get(i).getTypeName().equals("Voting") ||
						eventPatternModel.getSmartContracts().get(i).getTypeName().equals("VaccineDelivery")) {
						
						patternToSmartContractPath = "/egl/eventpattern-to-" + eventPatternModel.getSmartContracts().get(i).getTypeName() +".egl";
						outputSmartContractFile = new File(EventPatternsStatus.getGeneratedSmartContractPath() + "\\Smartcontract_" + eventPatternModel.getSmartContracts().get(i).getTypeName(), 
								eventPatternModel.getSmartContracts().get(i).getTypeName() + ".java");	
						System.out.println("\noutputSmartContractFile.getAbsolutePath(): " + outputSmartContractFile.getAbsolutePath());
													
						TransformEventPatternToCode.executeEGL(sourceModel4, eventPatternModel, patternToSmartContractPath, outputSmartContractFile);
					
				} //Fin-if
					
				} //Fin-for	
			}
						
			
			// 6º Transform the invocations of the smartcontracts for the event pattern to java code 
			
			if (!eventPatternModel.getSmartContracts().isEmpty()) { // There are actions for the event pattern
			
				Model sourceModel3;
				
				File outputContractFunctionFile;
				String patternToContractFunctionPath;
						
				for(int i = 0; i < eventPatternModel.getSmartContracts().size(); i++) {
					if(eventPatternModel.getSmartContracts().get(i).getTypeName().equals("Auction") ||
							eventPatternModel.getSmartContracts().get(i).getTypeName().equals("Purchase") ||
							eventPatternModel.getSmartContracts().get(i).getTypeName().equals("Voting") ||
							eventPatternModel.getSmartContracts().get(i).getTypeName().equals("VaccineDelivery")) {
					sourceModel3 = new InMemoryEmfModel("SourceModel", patternModelResource, EventpatternPackage.eINSTANCE);
					sourceModel3.setStoredOnDisposal(false);
					sourceModel3.setReadOnLoad(true);
					
					patternToContractFunctionPath = "/egl/eventpattern-to-" + eventPatternModel.getSmartContracts().get(i).getTypeName() +"-invocation.egl";
					outputContractFunctionFile = new File(EventPatternsStatus.getGeneratedSmartContractPath() + "\\Smartcontract_" + eventPatternModel.getSmartContracts().get(i).getTypeName(), 
							eventPatternModel.getSmartContracts().get(i).getTypeName() + "_invocation.java");	
					System.out.println("\noutputSmartContractFile.getAbsolutePath(): " + outputContractFunctionFile.getAbsolutePath());
												
					TransformEventPatternToCode.executeEGL(sourceModel3, eventPatternModel, patternToContractFunctionPath, outputContractFunctionFile);
					
					} else {
						
						sourceModel3 = new InMemoryEmfModel("SourceModel", patternModelResource, EventpatternPackage.eINSTANCE);
						sourceModel3.setStoredOnDisposal(false);
						sourceModel3.setReadOnLoad(true);
						
						patternToContractFunctionPath = "/egl/eventpattern-to-SmartContract-invocation.egl";
						outputContractFunctionFile = new File(EventPatternsStatus.getGeneratedSmartContractPath() + "\\Smartcontract_" + eventPatternModel.getSmartContracts().get(i).getTypeName(), 
								eventPatternModel.getSmartContracts().get(i).getTypeName() + "_invocation.java");	
						System.out.println("\noutputSmartContractFile.getAbsolutePath(): " + outputContractFunctionFile.getAbsolutePath());
													
						TransformEventPatternToCode.executeEGL(sourceModel3, eventPatternModel, patternToContractFunctionPath, outputContractFunctionFile);
						
					}
					
					//ejecutar la invocacion de cada contrato
					
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
				} //Fin for					
			}
			
			MessageDialog.openInformation(shell, "Generate Smart Contracts", 
		    		"The Smart Contracts has been transformed into java code and executed.");	
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
				
		return null;
	}
}
