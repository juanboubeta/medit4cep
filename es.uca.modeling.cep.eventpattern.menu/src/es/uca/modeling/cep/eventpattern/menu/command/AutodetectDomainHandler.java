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
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.ObjectInputStream;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;

import domain.CEPDomain;
import domain.DomainFactory;
import domain.DomainPackage;
import domain.Event;
import domain.EventProperty;
import domain.PropertyTypeValue;
import domain.diagram.part.DomainDiagramEditorUtil;
import es.uca.modeling.cep.eventpattern.menu.dialog.AutodetectDomainDialog;
import eventpattern.diagram.status.EventPatternsStatus;


public class AutodetectDomainHandler extends AbstractHandler {
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		Shell shell = HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell();
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		
		IProject domainProject = myWorkspaceRoot.getProject("domain");
		
		try {
			
			if (!domainProject.exists()) {
				
				AutodetectDomainDialog dialog = new AutodetectDomainDialog(shell);
				dialog.create();
				
				if (dialog.open() != Window.OK) {
					return null;
				}

				// Select the directory to get event types. 
				// It should be the 'new-eventtype' directory in the Mule project where the pattern will be deployed.
				
				if (EventPatternsStatus.getEventTypePath() == null) {
					String selectedDir = null; 
				    DirectoryDialog dirDialog = new DirectoryDialog(shell);
				    dirDialog.setText("Select the directory to automatically get the event types.");
					selectedDir = dirDialog.open();
				    	    
				    if (selectedDir == null) {
			        	return null; 	    	
				    }
				    else {
				    	EventPatternsStatus.setEventTypePath(selectedDir);
				    }		
				}
				
				File eventTypeDirectory = new File(EventPatternsStatus.getEventTypePath());
				
				FilenameFilter fileFilter = new FilenameFilter() {
					@Override
		            public boolean accept(File dir, String name) {
						String lowercaseName = name.toLowerCase();
		                if (lowercaseName.endsWith(".eventtype")) {
		                	return true;
		                } else {
		                	return false;
		                }
					}
		        };

		        File[] eventTypeFiles = eventTypeDirectory.listFiles(fileFilter);
		        
		        if (eventTypeFiles.length == 0) {
		        	MessageDialog.openError(shell, "Auto-detect Domain", "There are no event types to create the domain.");
		        	return null;	
		        }
								
				String domainName = dialog.getDomainName();
				String domainDescription = dialog.getDomainDescription();
			    domainProject.create(null);
					
				// Open if necessary
				if (!domainProject.isOpen()) {
					domainProject.open(null);
				}
						
				URI diagramUri = URI.createPlatformResourceURI(domainProject.
						getFile(domainName + ".domain_diagram").getFullPath().toString(), false);
				URI modelUri = URI.createPlatformResourceURI(domainProject.
						getFile(domainName + ".domain").getFullPath().toString(), false);
				Resource diagramResource = DomainDiagramEditorUtil.
						createDiagram(diagramUri, modelUri, new NullProgressMonitor());
				
				if (diagramResource != null) {
					
					try {												
						// Set model's attributes
				        ResourceSet resourceSet = new ResourceSetImpl();         
				        Resource modelResource = resourceSet.getResource(modelUri, true);
				        CEPDomain domain = ((CEPDomain) modelResource.getContents().get(0)); 
				        domain.setDomainName(domainName);
				        domain.setDomainCreationDate(new Date());
				        domain.setDomainDescription(domainDescription);
					        	
				        for (File file : eventTypeFiles) {
				        	if (file.isFile()) {
				        		System.out.println("fileName: " + file.getName());
				                System.out.println("file.getAbsolutePath(): " + file.getAbsolutePath());
				      
				                FileInputStream fis = new FileInputStream(file.getAbsolutePath());
							    ObjectInputStream ois = new ObjectInputStream(fis);
							    
							    @SuppressWarnings("unchecked")
								Map<String, Object> eventType = (Map<String, Object>) ois.readObject();
							    ois.close();
							
							    System.out.println("eventType: " + eventType);
	
							    String eventTypeName = (String) eventType.keySet().toArray()[0];
							    
						        DomainPackage.eINSTANCE.eClass();
								// Get the default factory singleton
								DomainFactory factory = DomainFactory.eINSTANCE;
								
								domain.Event domainEvent = factory.createEvent();
								domainEvent.setTypeName(eventTypeName);
								
								domainEvent = (Event) getDomainEvent(eventTypeName, eventType, domainEvent, factory); 
								domain.getEvents().add(domainEvent);					        					 
				        	}
				        }
					       		        
					    modelResource.save(null);
					        
					    DomainDiagramEditorUtil.openDiagram(diagramResource);
					        					      							
					} catch (PartInitException e) {
						ErrorDialog.openError(shell, "Auto-detect Domain", null, e.getStatus());
					}							
				}
			}
			else {
				
				if (MessageDialog.openConfirm(shell, "Auto-detect Domain", 
						"The editor has already been customised. Would you like to update the existing domain?")) {
							
					// Open if necessary
					if (!domainProject.isOpen()) {
						domainProject.open(null);
					}
										
					File currentDir = new File(domainProject.getLocationURI()); 
					File[] files = currentDir.listFiles();
					
					for (File domainFile : files) {
												
						if (!domainFile.isDirectory() && domainFile.getName().matches(".+domain_diagram")) {
						
							URI diagramUri = URI.createPlatformResourceURI(domainProject
									.getFile(domainFile.getName()).getFullPath().toString(), false);
							URI modelUri = URI.createPlatformResourceURI(domainProject
									.getFile(domainFile.getName().replace("_diagram", "")).getFullPath().toString(), false);
								
							ResourceSet resourceSet = new ResourceSetImpl(); 
							Resource diagramResource = resourceSet.getResource(diagramUri, true);
							Resource modelResource = resourceSet.getResource(modelUri, true);
							CEPDomain domain = ((CEPDomain) modelResource.getContents().get(0)); 
							
					        DomainPackage.eINSTANCE.eClass();
							// Get the default factory singleton
							DomainFactory factory = DomainFactory.eINSTANCE;
							
							// Repeat 
							
							File eventTypeDirectory = new File(EventPatternsStatus.getEventTypePath());
							
							FilenameFilter fileFilter = new FilenameFilter() {
								@Override
					            public boolean accept(File dir, String name) {
									String lowercaseName = name.toLowerCase();
					                if (lowercaseName.endsWith(".eventtype")) {
					                	return true;
					                } else {
					                	return false;
					                }
								}
					        };

					        File[] eventTypeFiles = eventTypeDirectory.listFiles(fileFilter);
					        
					        if (eventTypeFiles.length == 0) {
					        	MessageDialog.openError(shell, "Auto-detect Domain", "There are no event types to create the domain.");
					        	return null;	
					        }
					        
					        boolean updatedDomain = false; 
					        
					        for (File file : eventTypeFiles) {
					        	if (file.isFile()) {
					        		System.out.println("fileName: " + file.getName());
					                System.out.println("file.getAbsolutePath(): " + file.getAbsolutePath());
					      
					                FileInputStream fis = new FileInputStream(file.getAbsolutePath());
								    ObjectInputStream ois = new ObjectInputStream(fis);
								    
								    @SuppressWarnings("unchecked")
									Map<String, Object> eventType = (Map<String, Object>) ois.readObject();
								    ois.close();
								
								    System.out.println("eventType: " + eventType);
		
								    String eventTypeName = (String) eventType.keySet().toArray()[0];
								    
								    boolean eventExist = false;  
								    
								    for (Iterator iter = EcoreUtil.getAllContents(modelResource, true); iter.hasNext();) {
										EObject eObject = (EObject) iter.next();
										
										if (eObject.getClass().getSimpleName().equals("EventImpl")) {

											Event e = ((Event) eObject);
											
											if (e.getTypeName().equals(eventTypeName)) {
												eventExist = true; 
												updatedDomain = true;
											}
										}
								    }
											
								    if (!eventExist) {

										domain.Event domainEvent = factory.createEvent();
										domainEvent.setTypeName(eventTypeName);
										
										domainEvent = (Event) getDomainEvent(eventTypeName, eventType, domainEvent, factory); 
										domain.getEvents().add(domainEvent);	
								    }
					        	}
					        }
					        
					        if (updatedDomain) {
					        	modelResource.save(null);
					        	DomainDiagramEditorUtil.openDiagram(diagramResource);
					        }
					        else {
					        	MessageDialog.openInformation(shell, "Auto-detect Domain", "The domain has not been updated.");
					        }
						}
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} 						
				
		return null; 
		
	}
				
	private Object getDomainEvent(String eventTypeName, Map<String, Object> eventType, Object node, DomainFactory factory) {

		for (String key : eventType.keySet()) {
			
			Object value = eventType.get(key);

			if (value instanceof Map) {
		        
		        if (key.equals(eventTypeName)) {
		        	getDomainEvent(eventTypeName, (Map<String, Object>) value, node, factory);
		        }
		        else {
	                EventProperty eventProperty = factory.createEventProperty();
	            	eventProperty.setName(key);
	            	
	            	if (node.getClass().getSimpleName().equals("EventImpl")) {
	            		((Event)node).getEventProperties().add(eventProperty);
	            	}
	            	else if (node.getClass().getSimpleName().equals("EventPropertyImpl")) {
	            		((EventProperty)node).getEventProperties().add(eventProperty);
	            	}
	            	
	            	getDomainEvent(eventTypeName, (Map<String, Object>) value, eventProperty, factory);
		        }
		        
            } else {
            	
                EventProperty eventProperty = factory.createEventProperty();
            	eventProperty.setName(key);

            	if (value.toString().compareTo("class java.lang.String") == 0) { 
            		eventProperty.setType(PropertyTypeValue.STRING);
				}
				else if (value.toString().compareTo("class java.lang.Double") == 0) { 
					eventProperty.setType(PropertyTypeValue.DOUBLE);
				}
				else if (value.toString().compareTo("class java.lang.Float") == 0) { 
					eventProperty.setType(PropertyTypeValue.FLOAT);
				}
				else if (value.toString().compareTo("class java.lang.Long") == 0) { 
					eventProperty.setType(PropertyTypeValue.LONG);
				}
				else if (value.toString().compareTo("class java.lang.Integer") == 0) { 
					eventProperty.setType(PropertyTypeValue.INTEGER);
				}
				else if (value.toString().compareTo("class java.lang.Boolean") == 0) { 
					eventProperty.setType(PropertyTypeValue.BOOLEAN);
				}            	
            	
            	System.out.println("node.getClass().getSimpleName(): " + node.getClass().getSimpleName());
            	
            	if (node.getClass().getSimpleName().equals("EventImpl")) {
            		((Event)node).getEventProperties().add(eventProperty);
            	}
            	else if (node.getClass().getSimpleName().equals("EventPropertyImpl")) {
            		((EventProperty)node).getEventProperties().add(eventProperty);
            	}
            }
        }
		
		return node;
    }			
}
