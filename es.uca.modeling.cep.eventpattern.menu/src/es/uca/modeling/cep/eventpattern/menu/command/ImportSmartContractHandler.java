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
import org.eclipse.core.runtime.CoreException;
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

import smartcontract.SmartContract;
import smartcontract.ContractFunction;
import eventpattern.diagram.status.EventPatternsStatus;


public class ImportSmartContractHandler extends AbstractHandler {
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		Shell shell = HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell();
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		
		IProject smartcontractProject = myWorkspaceRoot.getProject("smartcontract");
		
		try {
			
			if (smartcontractProject.exists()) {
	        	MessageDialog.openError(shell, "Import Smart Contracts", "The editor has already been customised.");
	        	return null;	
			}
			else {
				
				String smartcontractPath = null; 
				String smartcontractFile = null; 
				
			    FileDialog dialog = new FileDialog(shell, SWT.OPEN);
				dialog.setText("Select the Smart Contracts to be imported.");
				
				String OS = System.getProperty("os.name").toLowerCase();
				
				if (OS.indexOf("mac") >= 0) {
					dialog.setFilterExtensions(new String[] { "*.zip" });
				}
				else {
					dialog.setFilterExtensions(new String[] { "*_smartc.zip" });
				} 
				
				dialog.setFilterNames(new String[] { "Smartcontract archive (*_smartc.zip)" });
				dialog.open();
		
				if (dialog.getFileName() != null && !dialog.getFileName().equals("")) {		
					
					smartcontractFile = dialog.getFileName();
					String name = smartcontractFile.replace("_smartc.zip", "");
					EventPatternsStatus.setSmartcontractsName(name);
					smartcontractPath = dialog.getFilterPath() + "/" + smartcontractFile;					
					smartcontractProject.create(null);
					
					// Open if necessary
					if (!smartcontractProject.isOpen()) {
						smartcontractProject.open(null);
					}
				    
					// Copy files from imported .zip archive to smartContractProject
					FileInputStream fis = new FileInputStream(smartcontractPath);
				    ZipInputStream zis = new ZipInputStream(fis);
				    ZipEntry entry = null;
				    String entryName = null;
				    String ext; 
				    String unzippedEntryPath = null; 
				    
				    while ((entry = zis.getNextEntry( )) != null) {
				    	entryName = entry.getName();
				    	
						if (!entry.isDirectory()) {
							ext = getFileExtension(entryName); 
							
							// Check if entry is a file .smartc, .smartc_diagram or image.
							if (ext.equalsIgnoreCase("smartc") || ext.equalsIgnoreCase("smartc_diagram") 
									|| ext.equalsIgnoreCase("jpg") || ext.equalsIgnoreCase("jpeg") 
									|| ext.equalsIgnoreCase("gif") || ext.equalsIgnoreCase("bmp") 
									|| ext.equalsIgnoreCase("png") || ext.equalsIgnoreCase("ico")) {
								
								unzippedEntryPath = dialog.getFilterPath() + "/" + entryName;
																	
								File file = new File(unzippedEntryPath);
								OutputStream out = new FileOutputStream(file, false);  
				        
						        for (int c = zis.read(); c != -1; c = zis.read( )) {
						        	out.write(c);
						        }
						        out.close();
		
								// Create a new file in the Eclipse smartContractProject
						      	IFile newFile = smartcontractProject.getFile(entryName);
						      	FileInputStream fileStream = new FileInputStream(unzippedEntryPath);
						      	newFile.create(fileStream, false, null);
						      	
						      	if (!file.delete()) {
						      		throw new IOException("Unable to delete file: " + file.getAbsolutePath());
						      	}
							}	
						}
				        zis.closeEntry();
					}
				    zis.close( );	
				    
			        ResourceSet resourceSet = new ResourceSetImpl();   
				    
				    if (smartcontractProject.getFile(name + ".smartc") != null) {
				    	
				    	URI modelUri = URI.createPlatformResourceURI(smartcontractProject.
								getFile(name + ".smartc").getFullPath().toString(), false);
														
				        Resource modelResource = resourceSet.getResource(modelUri, true);			        
					    String imageFilePath = null; 
					    String objectName;
					    
						for (Iterator iter = EcoreUtil.getAllContents(modelResource, true); iter.hasNext(); ) {
							EObject eObject = (EObject) iter.next(); 							
							objectName = eObject.getClass().getSimpleName();
							
							if (objectName.equals("ContractFunctionImpl")) {
			
								if (((ContractFunction) eObject).getImagePath() != null && 
										!((ContractFunction) eObject).getImagePath().trim().isEmpty()) {
									
									imageFilePath = smartcontractProject.getFile(((ContractFunction) eObject).
											getImagePath()).getLocation().toString();
									((ContractFunction) eObject).setImagePath(imageFilePath); 	
								}
							}
							else if (objectName.equals("SmartContractImpl")) {		
								if (((SmartContract) eObject).getImagePath() != null && 
										!((SmartContract) eObject).getImagePath().trim().isEmpty()) {
									
									imageFilePath = smartcontractProject.getFile(((SmartContract) eObject).
											getImagePath()).getLocation().toString();
									((SmartContract) eObject).setImagePath(imageFilePath); 								
								}									
							}
						}
				        modelResource.save(null);
				        
				        MessageDialog.openInformation(shell, "Import Smart Contracts", 
				        		"The editor has been customised with Smart Contracts '" + name + "'.");
				    }
				    				    
				}
			}
		} catch (IOException | CoreException e1) {
			e1.printStackTrace();
		} 
		
		return null; 
	}
	

	public static String getFileExtension(String filename) {
		
		int index;
		String ext = null; 
		
		if (filename != null) {
			index = filename.lastIndexOf(".");
			if(index != -1) {
				ext = filename.substring(index + 1);
			}
		}
		
		return ext; 
	}
	
}
