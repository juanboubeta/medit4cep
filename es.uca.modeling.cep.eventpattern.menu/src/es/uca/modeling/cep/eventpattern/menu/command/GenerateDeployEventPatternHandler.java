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


public class GenerateDeployEventPatternHandler extends AbstractHandler {
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
			
		try {		
			
			Shell shell = HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell();
			
			String domainName = EventPatternsStatus.getDomainName();				
			IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
			IProject patternProject = myWorkspaceRoot.getProject(domainName + "_patterns");
			IProject runtimeProject = myWorkspaceRoot.getProject(domainName + "_runtime");
							
			if (!patternProject.exists()) {
	        	MessageDialog.openError(shell, "Generate Pattern Code", "There are no event patterns to be transformed into code.");
	        	return null;	
			}		
		
			if(!HandlerUtil.getActiveEditor(event).getClass().getName().equals("eventpattern.diagram.part.EventpatternDiagramEditor")) {
							
				MessageDialog.openError(shell, "Generate Pattern Code", "An event pattern must be open.");
				return null;
			}
			
			// 1º Obtain the active editor's diagram
	        EventpatternDiagramEditor patternDiagramEditor = (EventpatternDiagramEditor) HandlerUtil.getActiveEditor(event);
	        
	        if (patternDiagramEditor == null || !patternDiagramEditor.getTitle().endsWith("pattern_diagram")) {
	        	MessageDialog.openError(shell, "Generate Pattern Code", "An event pattern must be open.");
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
				MessageDialog.openError(shell, "Generate Pattern Code", "There are some problems that must be solved before generating and deploying the code.");
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
		    
			// 4º Select the directory to generate the event pattern. 
			// It should be the 'new-eventpattern' directory in the Mule project where the pattern will be deployed.
			
			if (EventPatternsStatus.getGeneratedEventPatternPath() == null) {
				String selectedDir = null; 
			    DirectoryDialog dirDialog = new DirectoryDialog(shell);
			    dirDialog.setText("Choose a folder where to save the generated event pattern code.");
			    selectedDir = dirDialog.open();
		    	    
			    if (selectedDir == null) {
		        	return null; 	    	
			    }
			    else {
			    	EventPatternsStatus.setGeneratedEventPatternPath(selectedDir);
			    }
			}
			
			// 5º Select the directory to generate the actions for the event pattern, if there are actions.
			// It should be the 'new-action' directory in the Mule project where the actions will be deployed.
			
			if (!eventPatternModel.getActions().isEmpty() && EventPatternsStatus.getGeneratedActionPath() == null) {
				String selectedDir = null; 
			    DirectoryDialog dirDialog = new DirectoryDialog(shell);
			    dirDialog.setText("Choose a folder where to save the generated action code.");
			    selectedDir = dirDialog.open();
		    	    
			    if (selectedDir == null) {
		        	return null; 	    	
			    }
			    else {
			    	EventPatternsStatus.setGeneratedActionPath(selectedDir);
			    }
			}			
		    
		    // 6º Transform the event pattern (except to actions) to EPL code 
		    
		    // EventpatternPackage.eINSTANCE contains accessors for the meta objects 
			final Model sourceModel = new InMemoryEmfModel("SourceModel", patternModelResource, EventpatternPackage.eINSTANCE);
			sourceModel.setStoredOnDisposal(false);
			sourceModel.setReadOnLoad(true);
			
			final String patternToEplPath = "/egl/eventpattern-to-epl.egl";			
			final File outputPatternFile = new File(EventPatternsStatus.getGeneratedEventPatternPath(), 
					eventPatternModel.getPatternName() + ".epl");		
			System.out.println("\noutputPatternFile.getAbsolutePath(): " + outputPatternFile.getAbsolutePath());
						
			String result = TransformEventPatternToCode.executeEGL(sourceModel, eventPatternModel, patternToEplPath, outputPatternFile);
			
			if(!runtimeProject.exists()) {
				runtimeProject.create(null);							
			}
			
			File archivo = new File(myWorkspaceRoot.getLocation().toString() + runtimeProject.getFullPath() + "\\" + eventPatternModel.getPatternName() + ".epl");

			BufferedWriter bw;

			if(archivo.exists()) {
				bw = new BufferedWriter(new FileWriter(archivo));
				bw.write(result);
				bw.close();
			} else {
				bw = new BufferedWriter(new FileWriter(archivo));
				bw.write(result);
				bw.close();
			}
			
		    // 7º Transform the actions for the event pattern to Mule flow code 
			
			if (!eventPatternModel.getActions().isEmpty()) { // There are actions for the event pattern
	
				final Model sourceModel2 = new InMemoryEmfModel("SourceModel", patternModelResource, EventpatternPackage.eINSTANCE);
				sourceModel2.setStoredOnDisposal(false);
				sourceModel2.setReadOnLoad(true);
				
				final String patternToActionPath = "/egl/eventpattern-to-action.egl";
				final File outputActionFile = new File(EventPatternsStatus.getGeneratedActionPath(), 
						eventPatternModel.getPatternName() + ".action");	
				System.out.println("\noutputActionFile.getAbsolutePath(): " + outputActionFile.getAbsolutePath());
				
				TransformEventPatternToCode.executeEGL(sourceModel2, eventPatternModel, patternToActionPath, outputActionFile);
			}
						
			MessageDialog.openInformation(shell, "Generate Pattern Code", 
		    		"The event pattern has been transformed into code.");	
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
				
		return null;
	}
}
