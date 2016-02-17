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
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import domain.CEPDomain;
import eventpattern.Link;
import eventpattern.diagram.part.EventpatternDiagramEditor;
import eventpattern.diagram.part.EventpatternDiagramEditorUtil;
import eventpattern.diagram.status.EventPatternsStatus;


public class DeleteEventPatternHandler extends AbstractHandler {
		
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		try {
			
			Shell shell = HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell();
			
			String domainName = EventPatternsStatus.getDomainName();				
			IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
			IProject patternProject = myWorkspaceRoot.getProject(domainName + "_patterns");
							
			if (!patternProject.exists()) {
	        	MessageDialog.openError(shell, "Delete Event Pattern", "There are no event patterns to be deleted.");
	        	return null;	
			}		
			
			if(!HandlerUtil.getActiveEditor(event).getClass().getName().equals("eventpattern.diagram.part.EventpatternDiagramEditor")) {
				
				MessageDialog.openError(shell, "Delete Event Pattern", "An event pattern must be open.");
				return null;
			}
	
			if (MessageDialog.openConfirm(shell, "Confirm", "Are you sure that you want to permanently delete this pattern?")) {
							
				// Obtain the active editor's diagram
		        EventpatternDiagramEditor patternDiagramEditor = (EventpatternDiagramEditor) HandlerUtil.getActiveEditor(event);
		        
		        if (patternDiagramEditor == null || !patternDiagramEditor.getTitle().endsWith("pattern_diagram")) {
		        	MessageDialog.openError(shell, "Delete Event Pattern", "An event pattern must be open.");
		        	return null; 
		        }
		        
				String activePatternName = patternDiagramEditor.getTitle().replace(".pattern_diagram","");
				IProject complexEventProject = myWorkspaceRoot.getProject(domainName + "_complex_events");
				IFile complexEventFile = complexEventProject.getFile(domainName + "_complex_events" + ".domain_diagram");
				IFile activePatternModelFile = patternProject.getFile(activePatternName + ".pattern");
				IFile activePatternDiagramFile = patternProject.getFile(activePatternName + ".pattern_diagram");	
												
				// Open if necessary
				if (!patternProject.isOpen()) {
					patternProject.open(null);
				}
								
			    ResourceSet resourceSet = new ResourceSetImpl(); 
			    
				// modifiedPatterns will contain the names of event patterns that have been modified.
				List<String> modifiedPatterns = new ArrayList<String>();
			    	
				if (complexEventProject.exists() && complexEventFile.exists()) {
					
					// Open if necessary
					if (!complexEventProject.isOpen()) {
						complexEventProject.open(null);
					}
					
					File currentDir = new File(patternProject.getLocationURI()); 
	
					File[] files = currentDir.listFiles();
					
					for (File file : files) {
												
						if (!file.isDirectory() && file.getName().matches(".+pattern") && !file.getName().
								equals(activePatternName + ".pattern")) {
																				
							URI modelUri = URI.createPlatformResourceURI(patternProject
									.getFile(file.getName()).getFullPath().toString(), false);
																
							Resource modelResource = resourceSet.getResource(modelUri, true);
							
							URI diagramUri = URI.createPlatformResourceURI(patternProject
									.getFile(file.getName() + "_diagram").getFullPath().toString(), false);
								
							Resource diagramResource = resourceSet.getResource(diagramUri, true);
										
							EventpatternDiagramEditorUtil.openDiagram(diagramResource);
							IEditorPart iEditor = (EventpatternDiagramEditor) HandlerUtil.getActiveEditor(event);
							
							// eventsToBeDeleted will contain the events to be deleted.
							List<eventpattern.Event> eventsToBeDeleted = new ArrayList<eventpattern.Event>();
														
							// linksToBeDeleted will contain the links to be deleted.
							List<Link> linksToBeDeleted = new ArrayList<Link>();
							
						    // Delete the complex event (corresponding to the pattern to be deleted) from 
							// the rest of patterns 
							for (TreeIterator iter1 = EcoreUtil.getAllContents(modelResource, true); iter1.hasNext();) {
								EObject eObject = (EObject) iter1.next();
								
								if (eObject.getClass().getSimpleName().equals("EventImpl")) {
									
									eventpattern.Event ev = (eventpattern.Event)eObject;
									
									if (ev.getTypeName().equals(activePatternName)) {
									
										eventsToBeDeleted.add(ev);
										
										EList<Link> eventOutboundLinks = ev.getOutboundLink();
										
										for (Link link : eventOutboundLinks) {
											linksToBeDeleted.add(link);
										}	
									}
								}
							}
							
							if (eventsToBeDeleted.size() > 0) {
								modifiedPatterns.add(file.getName());
							}
														
							for (eventpattern.Event e : eventsToBeDeleted) {
								EcoreUtil.delete(e, true); 
							}
							
							for (Link l : linksToBeDeleted) {
								EcoreUtil.delete(l);
							}
							
							modelResource.save(null);
										
							// Close and open later in order to refresh visual elements of the editor.
							PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().closeEditor(iEditor, true);
							
						}
					}
					
					URI complexEventModelUri = URI.createPlatformResourceURI(complexEventProject.
							getFile(domainName + "_complex_events" + ".domain").getFullPath().toString(), false);		
				    
				    Resource complexEventModelResource = resourceSet.getResource(complexEventModelUri, true);
				    				    
				    CEPDomain domainModel = (CEPDomain) complexEventModelResource.getContents().get(0);
				    				    
				    // Delete the complex event (corresponding to the pattern to be deleted) from the complex event model
					for (TreeIterator iter = EcoreUtil.getAllContents(domainModel, true); iter.hasNext();) {
						
						EObject eObject = (EObject) iter.next();
						
						if (eObject.getClass().getSimpleName().equals("EventImpl")) {
							
							domain.Event domainEvent = (domain.Event)eObject;
							
							if(domainEvent.getTypeName().equals(activePatternName)) {
								EcoreUtil.remove(domainEvent);
								break;
							}
						}
					}
					
					complexEventModelResource.save(null);
					//EventpatternDiagramEditorUtil.openDiagram(complexEventDiagramResource);		
				}
				
				activePatternModelFile.delete(true, null);
				activePatternDiagramFile.delete(true, null);
				
				// Open the patterns where complex events have been deleted. 
				// If these patterns have errors, they will be shown.
				for (String patternName : modifiedPatterns) {
					
					URI diagramUri = URI.createPlatformResourceURI(patternProject
							.getFile(patternName + "_diagram").getFullPath().toString(), false);
						
					Resource diagramResource = resourceSet.getResource(diagramUri, true);
					
					EventpatternDiagramEditorUtil.openDiagram(diagramResource);			
					IEditorPart iEditor = (EventpatternDiagramEditor) HandlerUtil.getActiveEditor(event);
					iEditor.doSave(new NullProgressMonitor());		
				}
				
				MessageDialog.openInformation(shell, "Delete Event Pattern", 
		        		"The pattern has been deleted correctly.");
				
			}
				
		} catch (CoreException | IOException e) {
			e.printStackTrace();
		}
		
		return null; 	
	}
	
}
