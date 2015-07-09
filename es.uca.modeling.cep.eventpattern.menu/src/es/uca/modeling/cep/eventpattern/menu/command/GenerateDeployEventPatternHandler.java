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

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
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
		
		Shell shell = HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell();
		
		if(!HandlerUtil.getActiveEditor(event).getClass().getName().equals("eventpattern.diagram.part.EventpatternDiagramEditor")) {
						
			MessageDialog.openError(shell, "Generate and Deploy Pattern Code", "An event pattern must be open.");
			return null;
		}
		
		// 1º Obtain the active editor's diagram
        EventpatternDiagramEditor patternDiagramEditor = (EventpatternDiagramEditor) HandlerUtil.getActiveEditor(event);
        
        if (patternDiagramEditor == null || !patternDiagramEditor.getTitle().endsWith("pattern_diagram")) {
        	MessageDialog.openError(shell, "Generate and Deploy Pattern Code", "An event pattern must be open.");
        	return null; 
        }
        
        // 2º Save all changes made in the editor       
        patternDiagramEditor.doSave(new NullProgressMonitor());
        
		// 3º Check if there are some problems that must be solved
                
		IResource ir = (IResource) HandlerUtil.getActiveEditorInput(event).getAdapter(IResource.class);
        IMarker[] problems = null;
        int depth = IResource.DEPTH_INFINITE;
	
		try {
			problems = ir.findMarkers(IMarker.PROBLEM, true, depth);
		} catch (CoreException e1) {
			e1.printStackTrace();
		}
		
		// problems.length is the number of errors of the active editor (not total errors).
		if (problems.length > 0) {
			MessageDialog.openError(shell, "Generate and Deploy Pattern Code", "There are some problems that must be solved before generating and deploying the code.");
        	return null; 
		}
	 		
		String domainName = EventPatternsStatus.getDomainName();
		String activePatternName = patternDiagramEditor.getTitle().replace(".pattern_diagram","");
		
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IProject patternProject = myWorkspaceRoot.getProject(domainName + "_patterns");
		
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
		
		// 5º Select the directory to generate the action for event pattern.
		// It should be the 'new-action' directory in the Mule project where the action will be deployed.
		
		if (EventPatternsStatus.getGeneratedActionPath() == null) {
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
				
		try {
			
			// Open if necessary
			if (!patternProject.isOpen()) {
				patternProject.open(null);
			}
						
			URI activePatternModelUri = URI.createPlatformResourceURI(patternProject
					.getFile(activePatternName + ".pattern").getFullPath().toString(), false);
							
		    ResourceSet resourceSet = new ResourceSetImpl(); 
		   	Resource patternModelResource = resourceSet.getResource(activePatternModelUri, true);
		   				
		    CEPEventPattern eventPatternModel = (CEPEventPattern) patternModelResource.getContents().get(0);	
		    
		    // 6º Transform the event pattern (except to actions) to EPL code 
		    
		    // EventpatternPackage.eINSTANCE contains accessors for the meta objects 
			final Model sourceModel = new InMemoryEmfModel("SourceModel", patternModelResource, EventpatternPackage.eINSTANCE);
			sourceModel.setStoredOnDisposal(false);
			sourceModel.setReadOnLoad(true);
			
			final String patternToEplPath = "/egl/eventpattern-to-epl.egl";
			
			/*
			final Path pathToModel = new Path(patternModelResource.getURI().toPlatformString(true));
			final IFile ifModel = ResourcesPlugin.getWorkspace().getRoot().getFile(pathToModel);
			final File fModel = ifModel.getLocation().toFile().getCanonicalFile();
			final File outputFile = new File(fModel.getParentFile(), "event-pattern-code.epl");
			*/
			
			final File outputPatternFile = new File(EventPatternsStatus.getGeneratedEventPatternPath(), 
					eventPatternModel.getPatternName() + ".epl");		
			System.out.println("\noutputPatternFile.getAbsolutePath(): " + outputPatternFile.getAbsolutePath());
						
			TransformEventPatternToCode.executeEGL(sourceModel, eventPatternModel, patternToEplPath, outputPatternFile);
			
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
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	    
		MessageDialog.openInformation(shell, "Generate and Deploy Pattern Code", 
	    		"The event pattern has been transformed into code and deployed.");	
				
		return null;
		
	}
}
