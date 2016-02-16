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
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
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
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

import eventpattern.ComplexEvent;
import eventpattern.ComplexEventProperty;
import eventpattern.diagram.status.EventPatternsStatus;


public class ExportEventPatternsHandler extends AbstractHandler {
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		Shell shell = HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell();
			
		String domainName = EventPatternsStatus.getDomainName();				
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

		IProject domainProject = myWorkspaceRoot.getProject("domain");		
		IProject complexEventProject = myWorkspaceRoot.getProject(domainName + "_complex_events");
		IProject patternProject = myWorkspaceRoot.getProject(domainName + "_patterns");
		
		try {
			
			if (!domainProject.exists() || !patternProject.exists()) {
		        	MessageDialog.openError(shell, "Export Event Patterns", "There are no event patterns to be exported.");
		        	return null;	
			}
			
			// Open if necessary
			if (!domainProject.isOpen()) {
				patternProject.open(null);
			}
			
			// Open if necessary
			if (!patternProject.isOpen()) {
				patternProject.open(null);
			}
			
			
			// 1º Select the directory to export the domain
			
			String selectedDir = null; 
		    DirectoryDialog dirDialog = new DirectoryDialog(shell);
		    dirDialog.setText("Choose a folder where to export the event patterns.");
		    selectedDir = dirDialog.open();
		    	    
		    if (selectedDir == null) {
	        	return null; 	    	
		    }	
					    		    				
		    Path imagePath = null;
		    String tempDirPath = selectedDir + "/" + domainName + "_temp/";
		    String imageFileName;
		    String objectName;
		    URI imageUri;
		    OutputStream out;
		    Image image;
		    Image reducedImage;
		    int imageSize = 20;
		    
			ResourceSet resourceSet = new ResourceSetImpl();
			
			
			// 2º Export domain
			
		    File domainDir = new File(domainProject.getLocationURI()); 
			File[] domainFiles = domainDir.listFiles();
		    
			for (File file : domainFiles) {
											
				if (!file.isDirectory() && file.getName().matches(".+domain")) {
				
				    // Iterate over all the nodes of the domain model in order to convert absolute image path to relative one. 
				    // Moreover, create a temporal directory containing this modified model and its reduced images  
			       
					URI modelUri = URI.createURI(file.toURI().toString());					
					Resource modelResource = resourceSet.getResource(modelUri, true);
					
					for (Iterator iter = EcoreUtil.getAllContents(modelResource, true); iter.hasNext(); ) {
						EObject eObject = (EObject) iter.next(); 			
						objectName = eObject.getClass().getSimpleName();
						imageFileName = null;
						
						if (objectName.equals("EventPropertyImpl")) {
							
							if (((domain.EventProperty) eObject).getImagePath() != null && !((domain.EventProperty) eObject).getImagePath().trim().isEmpty()) {
								imagePath = FileSystems.getDefault().getPath(((domain.EventProperty) eObject).getImagePath().toString());
								imageFileName = imagePath.getFileName().toString(); 
								
								if (imageFileName != null) { 
									((domain.EventProperty) eObject).setImagePath(imageFileName); 
								}
							}
						}
						else if (objectName.equals("EventImpl")) {
										
							if(((domain.Event) eObject).getImagePath() != null && !((domain.Event) eObject).getImagePath().trim().isEmpty()) {
								imagePath = FileSystems.getDefault().getPath(((domain.Event) eObject).getImagePath().toString());
								imageFileName = imagePath.getFileName().toString(); 
											
								if(imageFileName != null) { 
									((domain.Event) eObject).setImagePath(imageFileName); 
								}
							}
						}				
						
						if (imageFileName != null) {
							
							imageUri = URI.createURI("file:///" + tempDirPath + "/domain/" + imageFileName);
							
							try {
								out = resourceSet.getURIConverter().createOutputStream(imageUri);			
								File imageFile = new File(imagePath.toString());
										
								try {
									image = ImageDescriptor.createFromURL(imageFile.toURI().toURL()).createImage();							 
									reducedImage = rescaleImage(image, imageSize);
									saveImage(reducedImage, getFileExtension(imageFileName), out); 
								} 
								catch (MalformedURLException e) {
									e.printStackTrace();
								}
								out.close();
										
							} catch (IOException e) {
								e.printStackTrace();
							}
						}		
					}
							
					URI modelFileUri = URI.createURI("file:///" + tempDirPath + "domain/" + file.getName());
					Resource modelFileResource = resourceSet.createResource(modelFileUri);
					modelFileResource.getContents().add(modelResource.getContents().get(0));
					
					try {
						modelFileResource.save(null);			
					} 
					catch (IOException e) {
						e.printStackTrace();
					}	
				}
				else if (!file.isDirectory() && file.getName().matches(".+domain_diagram")) {
					
					File newfile = new File(tempDirPath + "domain/" + file.getName());
					newfile.getParentFile().mkdirs();
				
					URL diagramUrl = new URL(file.toURI().toString());   
		            InputStream inputStream = diagramUrl.openConnection().getInputStream();
				    
			        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
			        String inputLine = "", diagramText = "";
			        
			        while ((inputLine = reader.readLine()) != null) {
			            	diagramText += inputLine + "\r\n";
			        }
			        
			        reader.close();
			        					
					FileWriter fw;						
					fw = new FileWriter(newfile);
					fw.write(diagramText);
					fw.close();				
				}
			}
			

			// 3º Export complex events
			
			if (complexEventProject.exists()) {
			
				// Open if necessary
				if (!complexEventProject.isOpen()) {
					patternProject.open(null);
				}
				
			    File complexEventDir = new File(complexEventProject.getLocationURI()); 
				File[] complexEventFiles = complexEventDir.listFiles();
			    
				for (File file : complexEventFiles) {
												
					if (!file.isDirectory() && file.getName().matches(".+domain")) {
					
					    // Iterate over all the nodes of the complex event model in order to convert absolute image path to relative one. 
					    // Moreover, create a temporal directory containing this modified model and its reduced images  
				        
						URI modelUri = URI.createURI(file.toURI().toString());					
						Resource modelResource = resourceSet.getResource(modelUri, true);
						
						for (Iterator iter = EcoreUtil.getAllContents(modelResource, true); iter.hasNext(); ) {
							EObject eObject = (EObject) iter.next(); 			
							objectName = eObject.getClass().getSimpleName();
							imageFileName = null;
							
							if (objectName.equals("EventPropertyImpl")) {
								
								if (((domain.EventProperty) eObject).getImagePath() != null && !((domain.EventProperty) eObject).getImagePath().trim().isEmpty()) {
									imagePath = FileSystems.getDefault().getPath(((domain.EventProperty) eObject).getImagePath().toString());
									imageFileName = imagePath.getFileName().toString(); 
									
									if (imageFileName != null) { 
										((domain.EventProperty) eObject).setImagePath(imageFileName); 
									}
								}
							}
							else if (objectName.equals("EventImpl")) {
											
								if(((domain.Event) eObject).getImagePath() != null && !((domain.Event) eObject).getImagePath().trim().isEmpty()) {
									imagePath = FileSystems.getDefault().getPath(((domain.Event) eObject).getImagePath().toString());
									imageFileName = imagePath.getFileName().toString(); 
												
									if(imageFileName != null) { 
										((domain.Event) eObject).setImagePath(imageFileName); 
									}
								}
							}				
							
							if (imageFileName != null) {
								
								imageUri = URI.createURI("file:///" + tempDirPath + domainName + "_complex_events/" + imageFileName);
								
								try {
									out = resourceSet.getURIConverter().createOutputStream(imageUri);			
									File imageFile = new File(imagePath.toString());
											
									try {
										image = ImageDescriptor.createFromURL(imageFile.toURI().toURL()).createImage();							 
										reducedImage = rescaleImage(image, imageSize);
										saveImage(reducedImage, getFileExtension(imageFileName), out); 
									} 
									catch (MalformedURLException e) {
										e.printStackTrace();
									}
									out.close();
											
								} catch (IOException e) {
									e.printStackTrace();
								}
							}		
						}

						URI modelFileUri = URI.createURI("file:///" + tempDirPath + domainName + "_complex_events/" + file.getName());
						Resource modelFileResource = resourceSet.createResource(modelFileUri);
						modelFileResource.getContents().add(modelResource.getContents().get(0));
						
						try {
							modelFileResource.save(null);			
						} 
						catch (IOException e) {
							e.printStackTrace();
						}
					}
					else if (!file.isDirectory() && file.getName().matches(".+domain_diagram")) {
						
						File newfile = new File(tempDirPath + domainName + "_complex_events/" + file.getName());
						newfile.getParentFile().mkdirs();
					
						URL diagramUrl = new URL(file.toURI().toString());   
			            InputStream inputStream = diagramUrl.openConnection().getInputStream();
					    
				        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
				        String inputLine = "", diagramText = "";
				        
				        while ((inputLine = reader.readLine()) != null) {
				            	diagramText += inputLine + "\r\n";
				        }
				        
				        reader.close();
				        					
						FileWriter fw;						
						fw = new FileWriter(newfile);
						fw.write(diagramText);
						fw.close();				
					}
				}
				
			}
			
		
			// 4º Export event patterns
				
		    File patternDir = new File(patternProject.getLocationURI()); 
			File[] patternFiles = patternDir.listFiles();
		    
			for (File file : patternFiles) {
											
				if (!file.isDirectory() && file.getName().matches(".+pattern")) {
				
				    // Iterate over all the nodes of the event pattern model in order to convert absolute image path to relative one
					// ("../domain/" or "../domainName_complex_events/")
				    // Moreover, create a temporal directory containing this modified model
			       
					URI modelUri = URI.createURI(file.toURI().toString());
					Resource modelResource = resourceSet.getResource(modelUri, true);
					
					for (Iterator iter = EcoreUtil.getAllContents(modelResource, true); iter.hasNext(); ) {
						EObject eObject = (EObject) iter.next(); 			
						objectName = eObject.getClass().getSimpleName();
						imageFileName = null;
						
						if (objectName.equals("EventPropertyImpl")) {
							
							if (((eventpattern.EventProperty) eObject).getImagePath() != null && !((eventpattern.EventProperty) eObject).getImagePath().trim().isEmpty()) {
								imagePath = FileSystems.getDefault().getPath(((eventpattern.EventProperty) eObject).getImagePath().toString());
								imageFileName = imagePath.getFileName().toString(); 
								
								if (imageFileName != null) { 
									((eventpattern.EventProperty) eObject).setImagePath("../domain/" + imageFileName); 
								}
							}
						}
						else if (objectName.equals("EventImpl")) {
										
							if(((eventpattern.Event) eObject).getImagePath() != null && !((eventpattern.Event) eObject).getImagePath().trim().isEmpty()) {
								imagePath = FileSystems.getDefault().getPath(((eventpattern.Event) eObject).getImagePath().toString());
								imageFileName = imagePath.getFileName().toString(); 
											
								if(imageFileName != null) { 
									((eventpattern.Event) eObject).setImagePath("../domain/" + imageFileName);
								}
							}
						}				
						else if (objectName.equals("ComplexEventPropertyImpl")) {
							
							if (((ComplexEventProperty) eObject).getImagePath() != null && !((ComplexEventProperty) eObject).getImagePath().trim().isEmpty()) {
								imagePath = FileSystems.getDefault().getPath(((ComplexEventProperty) eObject).getImagePath().toString());
								imageFileName = imagePath.getFileName().toString(); 
								
								if (imageFileName != null) { 
									((ComplexEventProperty) eObject).setImagePath("../" + domainName + "_complex_events/" + imageFileName);
								}
							}
						}
						else if (objectName.equals("ComplexEventImpl")) {
										
							if(((ComplexEvent) eObject).getImagePath() != null && !((ComplexEvent) eObject).getImagePath().trim().isEmpty()) {
								imagePath = FileSystems.getDefault().getPath(((ComplexEvent) eObject).getImagePath().toString());
								imageFileName = imagePath.getFileName().toString(); 
											
								if(imageFileName != null) { 
									((ComplexEvent) eObject).setImagePath("../" + domainName + "_complex_events/" + imageFileName);
								}
							}
						}						
							
					}
							
					URI modelFileUri = URI.createURI("file:///" + tempDirPath + domainName + "_patterns/" + file.getName());
					Resource modelFileResource = resourceSet.createResource(modelFileUri);
					modelFileResource.getContents().add(modelResource.getContents().get(0));
					
					try {
						modelFileResource.save(null);			
					} 
					catch (IOException e) {
						e.printStackTrace();
					}	
				}
				else if (!file.isDirectory() && file.getName().matches(".+pattern_diagram")) {
					
					File newfile = new File(tempDirPath + domainName + "_patterns/" + file.getName());
					newfile.getParentFile().mkdirs();
				
					URL diagramUrl = new URL(file.toURI().toString());   
		            InputStream inputStream = diagramUrl.openConnection().getInputStream();
				    
			        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
			        String inputLine = "", diagramText = "";
			        
			        while ((inputLine = reader.readLine()) != null) {
			            	diagramText += inputLine + "\r\n";
			        }
			        
			        reader.close();
			        					
					FileWriter fw;						
					fw = new FileWriter(newfile);
					fw.write(diagramText);
					fw.close();				
				}
			}
			
			
			// 5º A zip archive is created containing all directories from the temporal directory 
			// (domain, domainName_complex_events and domainName_patterns). 
			// Then, this temporal directory is removed.				
					
			File tempDir = new File(tempDirPath);
			String zipPath = selectedDir + "/" + domainName + "_patterns.zip";
		    ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(zipPath));
		    addDirZip(tempDir, zout);
		    zout.close();
		    
		    // Delete temporal directory
			for (File dir: tempDir.listFiles()) {
		
				if (dir.isDirectory()) { // domain, domainName_complex_events and domainName_patterns directories
					
					for (File f: dir.listFiles()) {
						f.delete();
					}
					
				}
				dir.delete();
			}
			tempDir.delete();
				
			String OS = System.getProperty("os.name").toLowerCase();
			if (OS.indexOf("win") >= 0) {
				zipPath = zipPath.replace("/", "\\");
			}
			
			MessageDialog.openInformation(shell, "Export Event Patterns", "The event patterns of domain '" + domainName + 
					"' have been exported to " + zipPath);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
		
	}	
	
	
	static void addDirZip(File dir, ZipOutputStream out) throws IOException {
		
	    byte[] tempBuf = new byte[1024];
	    File[] files = dir.listFiles();

	    for (int i = 0; i < files.length; i++) {
	    	
	    	if (files[i].isDirectory()) {
	    		addDirZip(files[i], out);
		    	continue;
	    	}
		      
		    FileInputStream in = new FileInputStream(files[i].getAbsolutePath());
		    out.putNextEntry(new ZipEntry(files[i].getParentFile().getName() + "/" + files[i].getName()));
		      
		    int l;
		    while ((l = in.read(tempBuf)) > 0) {
		    	out.write(tempBuf, 0, l);
		    }
		      
		    out.closeEntry();
		    in.close();
	    }
	}
	
	
	public static Image rescaleImage(Image source, int width) {
		
		Rectangle rect = source.getBounds();
		double s = (double) width / (double) rect.width;
		double w = (double) rect.width * s;
		double h = (double) rect.height * s;
		
		ImageData imageData = source.getImageData();
		Image scaledImage = new Image(Display.getDefault(), imageData.scaledTo((int) w, (int) h));
		
		return scaledImage;
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
	
	
	public static void saveImage(Image i, String fileExtension, OutputStream out) {
					
		ImageLoader loader = new ImageLoader();
	    loader.data = new ImageData[] { i.getImageData() };

        int imageFormat = -1; 
        
        if (fileExtension.equalsIgnoreCase("jpeg") || fileExtension.equalsIgnoreCase("jpg")) {
        	imageFormat = SWT.IMAGE_JPEG;
        } else if (fileExtension.equalsIgnoreCase("gif")) {
        	imageFormat = SWT.IMAGE_GIF;
        } else if (fileExtension.equalsIgnoreCase("bmp")) {
        	imageFormat = SWT.IMAGE_BMP;
        } else if (fileExtension.equalsIgnoreCase("png")) {
    	   imageFormat = SWT.IMAGE_PNG;
        } else if (fileExtension.equalsIgnoreCase("ico")) {
           imageFormat = SWT.IMAGE_ICO;
        }
        
        if (imageFormat != -1) {
        	try {
        		loader.save(out, imageFormat);
        	}
        	catch(Exception e) {
        		e.printStackTrace();
        	}
        }
	}	
	
}