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
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

import eventpattern.ComplexEvent;
import eventpattern.ComplexEventProperty;
import eventpattern.diagram.status.EventPatternsStatus;


public class ImportEventPatternsHandler extends AbstractHandler {
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		Shell shell = HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell();
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
				
		try {
			
		    FileDialog dialog = new FileDialog(shell, SWT.OPEN);
			dialog.setText("Select the Event Patterns to be imported.");
			
			String OS = System.getProperty("os.name").toLowerCase();
			
			if (OS.indexOf("mac") >= 0) {
				dialog.setFilterExtensions(new String[] { "*.zip" });
			}
			else {
				dialog.setFilterExtensions(new String[] { "*_patterns.zip" });
			}			
			
			dialog.setFilterNames(new String[] { "Event Patterns archive (*_patterns.zip)" });
			dialog.open();
	
			if (dialog.getFileName() != null && !dialog.getFileName().equals("")) {		
				
				String patternZipName = dialog.getFileName();
				String patternPath = dialog.getFilterPath() + "/" + patternZipName;
				
				String domainName = patternZipName.replace("_patterns.zip", "");
				EventPatternsStatus.setDomainName(domainName);
				
				IProject domainProject = myWorkspaceRoot.getProject("domain");		
				IProject complexEventProject = myWorkspaceRoot.getProject(domainName + "_complex_events");
				IProject patternProject = myWorkspaceRoot.getProject(domainName + "_patterns");
				
				if (domainProject.exists()) {
					if (MessageDialog.openConfirm(shell, "Confirm", 
							"The editor has already been customised. Are you sure that you want to replace the existing domain by the imported one?")) {
						domainProject.delete(true, null);
						domainProject.create(null);
					}
					else {
						return null;
					}
				}
				else {
					domainProject.create(null);
				}
				
				if (patternProject.exists()) {
					if (MessageDialog.openConfirm(shell, "Confirm", 
							"Are you sure that you want to permanently delete the event patterns in domain'" + domainName + "'?")) {
						patternProject.delete(true, null);
						patternProject.create(null);
					}
					else {
						return null;
					}						
				}
				else {
					patternProject.create(null);
				}
				
				if (complexEventProject.exists()) {
					complexEventProject.delete(true, null);
					complexEventProject.create(null);
				}
				else {
					complexEventProject.create(null);
				}
			
				// Open if necessary
				if (!domainProject.isOpen()) {
					domainProject.open(null);
				}
				
				// Open if necessary
				if (!complexEventProject.isOpen()) {
					complexEventProject.open(null);
				}
				
				// Open if necessary
				if (!patternProject.isOpen()) {
					patternProject.open(null);
				}
				
				
				// Copy files from imported .zip archive to domainProject, complexEventProject and patternProject
				
				FileInputStream fis = new FileInputStream(patternPath);
			    ZipInputStream zis = new ZipInputStream(fis);
			    ZipEntry entry = null;
			    String entryName; 
			    String parentEntryName; 
			    String unzippedEntryPath = null; 
			    IFile newFile; 
			    FileInputStream fileStream;
			    ResourceSet resourceSet = new ResourceSetImpl();  
			    File file; 
			    
			    while ((entry = zis.getNextEntry( )) != null) {
			    	entryName = entry.getName().replaceAll(".+/", "");
			    	parentEntryName = entry.getName().replaceAll("/(.+)", "");
			    	
					if (!entry.isDirectory()) {
			
						unzippedEntryPath = dialog.getFilterPath() + "/" + entryName;
															
						file = new File(unzippedEntryPath);
						OutputStream out = new FileOutputStream(file, false);  
		        
				        for (int c = zis.read(); c != -1; c = zis.read( )) {
				        	out.write(c);
				        }
				        out.close();
				        
				        if (parentEntryName.equals("domain")) {

				        	// Create a new file in the Eclipse domainProject
					      	newFile = domainProject.getFile(entryName);
					      	fileStream = new FileInputStream(unzippedEntryPath);
					      	
					      	if (!newFile.exists()) {
					      		newFile.create(fileStream, false, null);

							    if (entryName.matches(".+domain")) {
							    	
							    	URI modelUri = URI.createPlatformResourceURI(domainProject.
											getFile(entryName).getFullPath().toString(), false);
																	
							        Resource modelResource = resourceSet.getResource(modelUri, true);			        
								    String imageFilePath = null; 
								    String objectName;
								    
									for (Iterator iter = EcoreUtil.getAllContents(modelResource, true); iter.hasNext(); ) {
										EObject eObject = (EObject) iter.next(); 							
										objectName = eObject.getClass().getSimpleName();
				
										if (objectName.equals("EventPropertyImpl")) {
											if (((domain.EventProperty) eObject).getImagePath() != null && 
													!((domain.EventProperty) eObject).getImagePath().trim().isEmpty()) {
												
												imageFilePath = domainProject.getFile(((domain.EventProperty) eObject).
														getImagePath()).getLocation().toString();
												
												((domain.EventProperty) eObject).setImagePath(imageFilePath); 	
											}
										}
										else if (objectName.equals("EventImpl")) {		
											if (((domain.Event) eObject).getImagePath() != null && 
													!((domain.Event) eObject).getImagePath().trim().isEmpty()) {
												
												imageFilePath = domainProject.getFile(((domain.Event) eObject).
														getImagePath()).getLocation().toString();
												
												((domain.Event) eObject).setImagePath(imageFilePath); 								
											}									
										}
									}
							        modelResource.save(null);
							    }
					      	}
					      	fileStream.close();
				        }
				        else if (parentEntryName.matches(".+complex_events")) {
							
				        	// Create a new file in the Eclipse complexEventProject
					      	newFile = complexEventProject.getFile(entryName);
					      	fileStream = new FileInputStream(unzippedEntryPath);
					      	
					      	if (!newFile.exists()) {							      	
					      		newFile.create(fileStream, false, null);					
					      	
							    if (entryName.matches(".+domain")) {
							    	
							    	URI modelUri = URI.createPlatformResourceURI(complexEventProject.
											getFile(entryName).getFullPath().toString(), false);
																	
							        Resource modelResource = resourceSet.getResource(modelUri, true);			        
								    String imageFilePath = null; 
								    String objectName;
								    
									for (Iterator iter = EcoreUtil.getAllContents(modelResource, true); iter.hasNext(); ) {
										EObject eObject = (EObject) iter.next(); 							
										objectName = eObject.getClass().getSimpleName();
										
										if (objectName.equals("EventPropertyImpl")) {
											if (((domain.EventProperty) eObject).getImagePath() != null && 
													!((domain.EventProperty) eObject).getImagePath().trim().isEmpty()) {
												
												imageFilePath = complexEventProject.getFile(((domain.EventProperty) eObject).
														getImagePath()).getLocation().toString();
												
												((domain.EventProperty) eObject).setImagePath(imageFilePath); 	
											}
										}
										else if (objectName.equals("EventImpl")) {		
											if (((domain.Event) eObject).getImagePath() != null && 
													!((domain.Event) eObject).getImagePath().trim().isEmpty()) {
												
												imageFilePath = complexEventProject.getFile(((domain.Event) eObject).
														getImagePath()).getLocation().toString();
												
												((domain.Event) eObject).setImagePath(imageFilePath); 								
											}									
										}
									}
							        modelResource.save(null);
							    }
					      	}
					      	fileStream.close();
				        }
				        else if (parentEntryName.matches(".+patterns")) {
							
				        	// Create a new file in the Eclipse complexEventProject
					      	newFile = patternProject.getFile(entryName);
					      	fileStream = new FileInputStream(unzippedEntryPath);
					      	
					      	if (!newFile.exists()) {							      								      	
					      		newFile.create(fileStream, false, null);
					      	
							    if (entryName.matches(".+pattern")) {
							    	
							    	URI modelUri = URI.createPlatformResourceURI(patternProject.
											getFile(entryName).getFullPath().toString(), false);
																	
							        Resource modelResource = resourceSet.getResource(modelUri, true);			        
								    String imageFilePath = null; 
								    String objectName;
								    
									for (Iterator iter = EcoreUtil.getAllContents(modelResource, true); iter.hasNext(); ) {
										EObject eObject = (EObject) iter.next(); 							
										objectName = eObject.getClass().getSimpleName();
										
										if (objectName.equals("EventPropertyImpl")) {
											if (((eventpattern.EventProperty) eObject).getImagePath() != null && 
													!((eventpattern.EventProperty) eObject).getImagePath().trim().isEmpty()) {
												
												imageFilePath = patternProject.getFile(((eventpattern.EventProperty) eObject).
														getImagePath()).getLocation().toString();
												
												((eventpattern.EventProperty) eObject).setImagePath(imageFilePath); 	
											}
										}
										else if (objectName.equals("EventImpl")) {		
											if (((eventpattern.Event) eObject).getImagePath() != null && 
													!((eventpattern.Event) eObject).getImagePath().trim().isEmpty()) {
												
												imageFilePath = patternProject.getFile(((eventpattern.Event) eObject).
														getImagePath()).getLocation().toString();
												
												((eventpattern.Event) eObject).setImagePath(imageFilePath); 								
											}									
										}
										else if (objectName.equals("ComplexEventPropertyImpl")) {
											if (((ComplexEventProperty) eObject).getImagePath() != null && 
													!((ComplexEventProperty) eObject).getImagePath().trim().isEmpty()) {
												
												imageFilePath = patternProject.getFile(((ComplexEventProperty) eObject).
														getImagePath()).getLocation().toString();
																							
												((ComplexEventProperty) eObject).setImagePath(imageFilePath); 	
											}
										}
										else if (objectName.equals("ComplexEventImpl")) {		
											if (((ComplexEvent) eObject).getImagePath() != null && 
													!((ComplexEvent) eObject).getImagePath().trim().isEmpty()) {
												
												imageFilePath = patternProject.getFile(((ComplexEvent) eObject).
														getImagePath()).getLocation().toString();
																								
												((ComplexEvent) eObject).setImagePath(imageFilePath); 								
											}									
										}										
									}
							        modelResource.save(null);
							    }
					      	}
					      	fileStream.close();
					      	
				        }						        
				      	
				      	if (!file.delete()) {
				      		throw new IOException("Unable to delete file: " + file.getAbsolutePath());
				      	}
					}	
				    	
			        zis.closeEntry();
				}
			    zis.close( );
			    
				MessageDialog.openInformation(shell, "Import Event Patterns", "The event patterns of domain '" + domainName + 
						"' have been correctly imported.");
			}
			
		} catch (Exception e1) {
			e1.printStackTrace();
		} 
			
		return null; 
	}
	
}
