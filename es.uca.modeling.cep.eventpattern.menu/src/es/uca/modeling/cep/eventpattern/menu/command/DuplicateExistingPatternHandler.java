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
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Date;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;

import eventpattern.CEPEventPattern;
import eventpattern.diagram.status.EventPatternsStatus;
import eventpattern.diagram.part.EventpatternDiagramEditor;
import eventpattern.diagram.part.EventpatternDiagramEditorUtil;
import es.uca.modeling.cep.eventpattern.menu.dialog.DuplicateExistingPatternDialog;


public class DuplicateExistingPatternHandler extends AbstractHandler {
		
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		Shell shell = HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell();
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
				
		if(!HandlerUtil.getActiveEditor(event).getClass().getName().equals("eventpattern.diagram.part.EventpatternDiagramEditor")) {
						
			MessageDialog.openError(shell, "Duplicate Existing Pattern", "An event pattern must be open.");
			return null;
		}
		
		// Obtain the active editor's diagram
        EventpatternDiagramEditor sourcePatternDiagramEditor = (EventpatternDiagramEditor) HandlerUtil.getActiveEditor(event);
        String sourcePatternName = sourcePatternDiagramEditor.getTitle().replace(".pattern_diagram","");

        if (sourcePatternDiagramEditor == null || !sourcePatternDiagramEditor.getTitle().endsWith("pattern_diagram")) {
        	MessageDialog.openError(shell, "Duplicate Existing Pattern", "An event pattern must be open.");
        	return null; 
        }		
            
        DuplicateExistingPatternDialog dialog = new DuplicateExistingPatternDialog(shell);
		dialog.create();
		
		if (dialog.open() != Window.OK) {
			return null;
		}
		
		String targetPatternName = dialog.getPatternName();
		String domainName = EventPatternsStatus.getDomainName();
		
		IProject patternProject = myWorkspaceRoot.getProject(domainName + "_patterns");
		
        String sourcePatternDiagramPath = "/" + sourcePatternDiagramEditor.getTitleToolTip();
        String sourcePatternPath = sourcePatternDiagramPath.replace("_diagram", "");
        String targetPatternDiagramPath = sourcePatternDiagramPath.replace(sourcePatternName, targetPatternName);
        String targetPatternPath = targetPatternDiagramPath.replace("_diagram", "");
        
		try {
			// Open if necessary
			if (!patternProject.isOpen()) {
				patternProject.open(null);
			}
			
			IFile targetPatternDiagramFile = patternProject.getFile(targetPatternName + ".pattern_diagram");
			IFile targetPatternFile = patternProject.getFile(targetPatternName + ".pattern");

			if (!targetPatternDiagramFile.exists() && !targetPatternFile.exists()) { 

				// Create targetPatternDiagramName.pattern_diagram as a copy of 
				// sourcePatternDiagramName.pattern_diagram and create targetPatternName.pattern_diagram 
				// as a copy of sourcePatternName.pattern_diagram

				URL sourcePatternDiagramUrl = new URL("platform:/resource" + sourcePatternDiagramPath);   
	            InputStream sourcePatternDiagramInputStream = sourcePatternDiagramUrl.openConnection().getInputStream();
				URL sourcePatternUrl = new URL("platform:/resource" + sourcePatternPath);   
	            InputStream sourcePatternInputStream = sourcePatternUrl.openConnection().getInputStream();
	            
				targetPatternFile.create(sourcePatternInputStream, true, null);
	            
				
				// Modify the content of targetPatternDiagramName.pattern_diagram replacing sourcePatternName 
				// by targetPatternName
				
		        String targetPatternDiagramText = "";
		        String inputLine = "";
	            BufferedReader reader = new BufferedReader(new InputStreamReader(sourcePatternDiagramInputStream));

		        while ((inputLine = reader.readLine()) != null) {
		        	targetPatternDiagramText += inputLine.replaceAll(sourcePatternName, targetPatternName) + "\r\n";
		        }
		      	
				reader.close();
								
				File newfile = new File(patternProject.getLocation() + "/" + targetPatternName + ".pattern_diagram");
				FileWriter fw;
				
				try {
					fw = new FileWriter(newfile);
					fw.write(targetPatternDiagramText);
					fw.close();				
				} catch (IOException e) {
					e.printStackTrace();
				}	
				
				
				// Modify the model of targetPatternName.pattern replacing pattern name, pattern description, 
				// creation date, deployed (and complex event name) by new ones.  
				
		        URI modelUri = URI.createURI("platform:/resource" + targetPatternPath);
		        URI diagramUri = URI.createURI("platform:/resource" + targetPatternDiagramPath);
		        ResourceSet resourceSet = new ResourceSetImpl();   
		        Resource modelResource = resourceSet.getResource(modelUri, true);
			    
		        // Set attributes of the new event pattern         
   		        CEPEventPattern pattern = (CEPEventPattern) modelResource.getContents().get(0);
			    pattern.setPatternName(targetPatternName);
			    pattern.setPatternDescription(dialog.getPatternDescription());
			    pattern.setPatternCreationDate(new Date());
			    pattern.setPatternDeployed(false);
			        
		        if (((CEPEventPattern) modelResource.getContents().get(0)).getComplexEvent() != null) {
		        	((CEPEventPattern) modelResource.getContents().get(0)).getComplexEvent().setTypeName(targetPatternName);
		        }
			    
			    modelResource.save(null);
			    
			    Resource diagramResource = resourceSet.getResource(diagramUri, true);
				EventpatternDiagramEditorUtil.openDiagram(diagramResource);		
				
				// Save the editor of new event pattern
				IEditorPart iEditor = (EventpatternDiagramEditor) HandlerUtil.getActiveEditor(event);
				iEditor.doSave(new NullProgressMonitor());	
				
			}
			else {
				MessageDialog.openError(shell, "Error", "The pattern '" + targetPatternName + "' already exists.");
	        	return null;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		return null;
	}
		
}
