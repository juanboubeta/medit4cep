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
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;

import eventpattern.CEPEventPattern;
import eventpattern.diagram.status.EventPatternsStatus;
import eventpattern.diagram.part.EventpatternDiagramEditor;
import eventpattern.diagram.part.EventpatternDiagramEditorUtil;
import es.uca.modeling.cep.eventpattern.menu.dialog.NewPatternDialog;


public class NewEventPatternHandler extends AbstractHandler {
		
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
			
		Shell shell = HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell();
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		
		IProject domainProject = myWorkspaceRoot.getProject("domain");
		
		try {
			
			if (!domainProject.exists()) {
	        	MessageDialog.openError(shell, "New Event Pattern", "A domain must be previously created or imported.");
	        	return null;	
			}
			else {
					
				NewPatternDialog dialog = new NewPatternDialog(shell);
				dialog.create();
				
				if (dialog.open() == Window.OK) {
					
					String patternName = dialog.getPatternName();
					String domainName = EventPatternsStatus.getDomainName();
					
					IProject patternProject = myWorkspaceRoot.getProject(domainName + "_patterns");
											
					if (!patternProject.exists()) {
						patternProject.create(null);
					}
						
					// Open if necessary
					if (!patternProject.isOpen()) {
						patternProject.open(null);
					}
					
					IFile patternFile = patternProject.getFile(patternName + ".pattern_diagram");
					
					if (!patternFile.exists()) {
						
						EventPatternsStatus.setActivePatternName(patternName);
				        ResourceSet resourceSet = new ResourceSetImpl(); 				
				        
				        // Save and validate all the patterns which exist in patternProject, before creating the new one.
				        File currentDir = new File(patternProject.getLocationURI());
				        EventpatternDiagramEditor eventpatternDiagramEditor;
				        URI patternDiagramUri;
				        Resource patternDiagramResource;
				        
						File[] files = currentDir.listFiles();
						
						for (File file : files) {
													
							if (!file.isDirectory() && file.getName().matches(".+pattern_diagram")) {

								patternDiagramUri = URI.createPlatformResourceURI(patternProject
									.getFile(file.getName()).getFullPath().toString(), false);
										
								patternDiagramResource = resourceSet.getResource(patternDiagramUri, true);

								EventpatternDiagramEditorUtil.openDiagram(patternDiagramResource);
						        eventpatternDiagramEditor = (EventpatternDiagramEditor) HandlerUtil.getActiveEditor(event);
								
								// save and validate
								eventpatternDiagramEditor.doSave(new NullProgressMonitor());
							}
						}
						
						// After saving and validating all existing patterns, then create the new one.
						URI diagramUri = URI.createPlatformResourceURI(patternProject.
								getFile(patternName + ".pattern_diagram").getFullPath().toString(), false);
						URI modelUri = URI.createPlatformResourceURI(patternProject.
								getFile(patternName + ".pattern").getFullPath().toString(), false);
						Resource diagramResource = EventpatternDiagramEditorUtil.createDiagram(diagramUri, 
								modelUri, new NullProgressMonitor());
						
						if (diagramResource != null) {
					
							try {							
								// Set attributes of the new event pattern         
						        Resource modelResource = resourceSet.getResource(modelUri, true);
						        CEPEventPattern pattern = (CEPEventPattern) modelResource.getContents().get(0);
						        pattern.setPatternName(patternName);
						        pattern.setPatternDescription(dialog.getPatternDescription());
						        pattern.setDomainName(domainName);
						        pattern.setPatternCreationDate(new Date());
						        pattern.setPatternDeployed(false);
						        					        
						        modelResource.save(null);
								EventpatternDiagramEditorUtil.openDiagram(diagramResource);
						        					      							
							} catch (PartInitException e) {
								ErrorDialog.openError(shell, "Open New Pattern", null, e.getStatus());
							}	
						}
					}
					else {
						MessageDialog.openError(shell, "Error", "Pattern '" + patternName + "' already exists.");
			        	return null;
					}
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null; 
	}	
}
