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
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
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
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;

import smartcontract.SmartContracts;
import smartcontract.SmartContract;
import smartcontract.ContractFunction;


public class ExportSmartContractHandler extends AbstractHandler {
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		Shell shell = HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell();
			
		
		// 1º Obtain the active editor's diagram to be exported
			
		IEditorPart ieditorpart = HandlerUtil.getActiveEditor(event); 
		
        if (ieditorpart == null || !ieditorpart.getTitle().endsWith("smartc_diagram")) {
        	MessageDialog.openError(shell, "Export Smart Contracts", "The Smart Contracts must be open.");
        	return null; 
        }
          
        
        // 2º Save all changes made in the editor       
        ieditorpart.doSave(new NullProgressMonitor());
        
        
		// 3º Check if there are some problems which must be solved before exporting the active diagram
	
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
			MessageDialog.openError(shell, "Export Smart Contracts", "There are some problems that must be solved before exporting this Smart Contracts.");
        	return null; 
		}
		
		
		// 4º Select the directory to export the domain
		
		String selectedDir = null; 
	    DirectoryDialog dirDialog = new DirectoryDialog(shell);
	    dirDialog.setText("Choose a folder where to export the Smart Contracts.");
	    selectedDir = dirDialog.open();
	    
	    if (selectedDir == null) {
        	return null; 	    	
	    }	
		
	    
        // 5º Check what is the model file linked by diagram file (see href attribute in diagram file)
                         	
        String diagramPath = "/" + ieditorpart.getTitleToolTip();
        String diagramFileName = ieditorpart.getTitle();        
        URL diagramUrl;
              
        // modelHref can be like 'default.smartc' or 
        //   'platform:/resource/proyecto1/default.smartc' (if the model is not in the same directory of diagram file) 
        String modelHref = null; 
        String diagramOriginalText = "";
        
        try {
        	diagramUrl = new URL("platform:/resource" + diagramPath);   
            InputStream inputStream = diagramUrl.openConnection().getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String inputLine = "";
            boolean hrefNotFound = false;
         
            while ((inputLine = reader.readLine()) != null) {
            	
            	diagramOriginalText += inputLine + "\r\n";
            	
                if (!hrefNotFound && inputLine.contains("<element xmi:type=\"smartcontract:SmartContracts\" href=\"")) {
                	modelHref = inputLine.replaceAll("<element.*href=\"", "");
                	modelHref = modelHref.replaceAll("#.*", "").trim();
                	hrefNotFound = true;
                }
            }
            reader.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        // 6º Get the value of smartcontract name from model file
        
        URI modelUri; 
        
        if (modelHref.contains("platform:")) { // modelHref is like 'platform:/resource/proyecto1/default.smartc'
        	modelUri = URI.createURI(modelHref);
        }
        else { // modelHref is like 'default.smartc' 
        	modelUri = URI.createURI("platform:/resource" + diagramPath.replace(diagramFileName, modelHref));
        }
                 
        ResourceSet resourceSet = new ResourceSetImpl();         
        Resource modelResource = resourceSet.getResource(modelUri, true);
        String smartcontractName = null;
        
        if (((SmartContracts) modelResource.getContents().get(0)).getName() != null && 
        		!((SmartContracts) modelResource.getContents().get(0)).getName().trim().isEmpty()) {
        	smartcontractName = ((SmartContracts) modelResource.getContents().get(0)).getName().trim();
        }
        else {   // This has already been checked with EVL
        	MessageDialog.openError(shell, "Export Smart Contracts", "'SmartContracts Name' property cannot be empty.");
        	return null; 	       	
        }
		
		
	    // 7º Iterate over all the nodes of the active model in order to convert absolute image path to relative one. 
	    // Moreover, create a temporal directory containing this modified model and its reduced images  
        
	    Path imagePath = null;
	    String tempDirPath = selectedDir + "/" + smartcontractName + "_temp/";
	    String imageFileName;
	    String objectName;
	    URI imageUri;
	    OutputStream out;
	    File file;
	    Image image;
	    Image reducedImage;
	    int imageSize = 20; 
	    
		for (Iterator iter = EcoreUtil.getAllContents(modelResource, true); iter.hasNext(); ) {
			EObject eObject = (EObject) iter.next(); 			
			objectName = eObject.getClass().getSimpleName();
			imageFileName = null;
			
			if (objectName.equals("ContractFunctionImpl")) {
				
				if (((ContractFunction) eObject).getImagePath() != null && !((ContractFunction) eObject).getImagePath().trim().isEmpty()) {
					imagePath = FileSystems.getDefault().getPath(((ContractFunction) eObject).getImagePath().toString());
					imageFileName = imagePath.getFileName().toString(); 
					
					if (imageFileName != null) { 
						((ContractFunction) eObject).setImagePath(imageFileName); 
					}
				}
			}
			else if (objectName.equals("SmartContractImpl")) {
							
				if(((SmartContract) eObject).getImagePath() != null && !((SmartContract) eObject).getImagePath().trim().isEmpty()) {
					imagePath = FileSystems.getDefault().getPath(((SmartContract) eObject).getImagePath().toString());
					imageFileName = imagePath.getFileName().toString(); 
								
					if(imageFileName != null) { 
						((SmartContract) eObject).setImagePath(imageFileName); 
					}
				}
			}
			
			if(imageFileName != null) {
				
				imageUri = URI.createURI("file:///" + tempDirPath + imageFileName);
				
				try {
					out = resourceSet.getURIConverter().createOutputStream(imageUri);			
					file = new File(imagePath.toString());
							
					try {
						image = ImageDescriptor.createFromURL(file.toURI().toURL()).createImage();							 
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
				
		URI modelFileUri = URI.createURI("file:///" + tempDirPath + smartcontractName + ".smartc");
		Resource modelFileResource = resourceSet.createResource(modelFileUri);
		modelFileResource.getContents().add(modelResource.getContents().get(0));
		
		try {
			modelFileResource.save(null);			
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
	    // 8º Replace the value of name attribute from diagram file by the value of name 
		// attribute (name.smartc_diagram). Also, replace absolute paths of href by 
		// relative ones (name.smartc).
		// A new file (.smartc_diagram) containing this modified information is created in the temporal directory 
					
		String diagramNewText = "";
		diagramNewText = diagramOriginalText.replaceFirst("name=\".*.smartc_diagram", 
				"name=\"" + smartcontractName + ".smartc_diagram");
				
		diagramNewText = diagramNewText.replaceAll("href=\".*.smartc", "href=\"" + smartcontractName + ".smartc");

		File newfile = new File(tempDirPath + smartcontractName + ".smartc_diagram");
		FileWriter fw;
		
		try {
			fw = new FileWriter(newfile);
			fw.write(diagramNewText);
			fw.close();				
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		// 9º A zip archive is created containing all files from the temporal directory (.smartc, .smartc_diagram 
		// and image files). Then, this directory is removed.
		
		FileOutputStream fout;
		ZipOutputStream zout; 
		String zipPath = selectedDir + "/" + smartcontractName + "_smartc.zip";
		
		try {
			fout = new FileOutputStream(zipPath);
		    zout = new ZipOutputStream(fout);
		
		    File folder = new File(tempDirPath);
		    File[] files = folder.listFiles();
		    	   	    
		    for (int i = 0; i < files.length; i++) {
		    	if (files[i].isFile()) {
		    		ZipEntry ze = new ZipEntry(files[i].getName());
		    		FileInputStream fis = new FileInputStream(files[i]);
		    		
		    		try {
		    			zout.putNextEntry(ze);
		    			for (int c = fis.read(); c != -1; c = fis.read()) {
		    				zout.write(c);
		    			}
		    		}
		    		finally {
		    			fis.close( );
		    		}
		    	}
		    }
		    zout.close( );
		    
			for (File f: folder.listFiles())
				f.delete();
			
			if (folder.isDirectory())
				folder.delete();
	    
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String OS = System.getProperty("os.name").toLowerCase();
		if (OS.indexOf("win") >= 0) {
			zipPath = zipPath.replace("/", "\\");
		}
			
		MessageDialog.openInformation(shell, "Export Smart Contracts", "Smart Contracts '" + smartcontractName + 
				"' has been exported to " + zipPath);
		
		return null;
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