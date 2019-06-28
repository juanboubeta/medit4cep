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

import smartcontract.SmartContracts;
import smartcontract.SmartcontractFactory;
import smartcontract.SmartcontractPackage;
import smartcontract.SmartContract;
import smartcontract.ContractFunction;
import smartcontract.InputParameter;
import smartcontract.OutputParameter;
import smartcontract.Parameter;
import smartcontract.PropertyTypeValue;
import smartcontract.diagram.part.SmartcontractDiagramEditorUtil;
import es.uca.modeling.cep.eventpattern.menu.dialog.AutodetectSmartContractDialog;
import eventpattern.diagram.status.EventPatternsStatus;


public class AutodetectSmartContractHandler extends AbstractHandler {
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		Shell shell = HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell();
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		
		IProject smartcontractProject = myWorkspaceRoot.getProject("smartcontract");
		
		try {
			
			if (!smartcontractProject.exists()) {
				
				AutodetectSmartContractDialog dialog = new AutodetectSmartContractDialog(shell);
				dialog.create();
				
				if (dialog.open() != Window.OK) {
					return null;
				}

				// Select the directory to get event types. 
				// It should be the 'new-eventtype' directory in the Mule project where the pattern will be deployed.
				
				if (EventPatternsStatus.getEventTypePath() == null) {
					String selectedDir = null; 
				    DirectoryDialog dirDialog = new DirectoryDialog(shell);
				    dirDialog.setText("Select the directory to automatically get the Smart Contract types.");
					selectedDir = dirDialog.open();
				    	    
				    if (selectedDir == null) {
			        	return null; 	    	
				    }
				    else {
				    	EventPatternsStatus.setEventTypePath(selectedDir);
				    }		
				}
				
				File smartcontractTypeDirectory = new File(EventPatternsStatus.getEventTypePath());
				
				FilenameFilter fileFilter = new FilenameFilter() {
					@Override
		            public boolean accept(File dir, String name) {
						String lowercaseName = name.toLowerCase();
		                if (lowercaseName.endsWith(".smartcontracttype")) {
		                	return true;
		                } else {
		                	return false;
		                }
					}
		        };

		        File[] smartcontractTypeFiles = smartcontractTypeDirectory.listFiles(fileFilter);
		        
		        if (smartcontractTypeFiles.length == 0) {
		        	MessageDialog.openError(shell, "Auto-detect Smart Contracts", "There are no Smart Contract types to create the Smart Contracts.");
		        	return null;	
		        }
								
				String name = dialog.getSmartContractsName();
				String description = dialog.getSmartContractsDescription();
			    smartcontractProject.create(null);
					
				// Open if necessary
				if (!smartcontractProject.isOpen()) {
					smartcontractProject.open(null);
				}
						
				URI diagramUri = URI.createPlatformResourceURI(smartcontractProject.
						getFile(name + ".smartc_diagram").getFullPath().toString(), false);
				URI modelUri = URI.createPlatformResourceURI(smartcontractProject.
						getFile(name + ".smartc").getFullPath().toString(), false);
				Resource diagramResource = SmartcontractDiagramEditorUtil.
						createDiagram(diagramUri, modelUri, new NullProgressMonitor());
				
				if (diagramResource != null) {
					
					try {												
						// Set model's attributes
				        ResourceSet resourceSet = new ResourceSetImpl();         
				        Resource modelResource = resourceSet.getResource(modelUri, true);
				        SmartContracts smartcontracts = ((SmartContracts) modelResource.getContents().get(0)); 
				        smartcontracts.setName(name);
				        smartcontracts.setCreationDate(new Date());
				        smartcontracts.setDescription(description);
					        	
				        for (File file : smartcontractTypeFiles) {
				        	if (file.isFile()) {
				        		System.out.println("fileName: " + file.getName());
				                System.out.println("file.getAbsolutePath(): " + file.getAbsolutePath());
				      
				                FileInputStream fis = new FileInputStream(file.getAbsolutePath());
							    ObjectInputStream ois = new ObjectInputStream(fis);
							    
							    @SuppressWarnings("unchecked")
								Map<String, Object> smartcontractType = (Map<String, Object>) ois.readObject();
							    ois.close();
							
							    System.out.println("smartcontractType: " + smartcontractType);
	
							    String smartcontractTypeName = (String) smartcontractType.keySet().toArray()[0];
							    
						        SmartcontractPackage.eINSTANCE.eClass();
								// Get the default factory singleton
								SmartcontractFactory factory = SmartcontractFactory.eINSTANCE;
								
								smartcontract.SmartContract SmartContract = factory.createSmartContract();
								SmartContract.setTypeName(smartcontractTypeName);
								
								SmartContract = (SmartContract) getSmartContract(smartcontractTypeName, smartcontractType, SmartContract, factory); 
								smartcontracts.getSmartcontracts().add(SmartContract);					        					 
				        	}
				        }
					       		        
					    modelResource.save(null);
					        
					    SmartcontractDiagramEditorUtil.openDiagram(diagramResource);
					        					      							
					} catch (PartInitException e) {
						ErrorDialog.openError(shell, "Auto-detect Smart Contracts", null, e.getStatus());
					}							
				}
			}
			else {
				
				if (MessageDialog.openConfirm(shell, "Auto-detect Smart Contracts", 
						"The editor has already been customised. Would you like to update the existing Smart Contracts?")) {
							
					// Open if necessary
					if (!smartcontractProject.isOpen()) {
						smartcontractProject.open(null);
					}
										
					File currentDir = new File(smartcontractProject.getLocationURI()); 
					File[] files = currentDir.listFiles();
					
					for (File smartcontractFile : files) {
												
						if (!smartcontractFile.isDirectory() && smartcontractFile.getName().matches(".+smartc_diagram")) {
						
							URI diagramUri = URI.createPlatformResourceURI(smartcontractProject
									.getFile(smartcontractFile.getName()).getFullPath().toString(), false);
							URI modelUri = URI.createPlatformResourceURI(smartcontractProject
									.getFile(smartcontractFile.getName().replace("_diagram", "")).getFullPath().toString(), false);
								
							ResourceSet resourceSet = new ResourceSetImpl(); 
							Resource diagramResource = resourceSet.getResource(diagramUri, true);
							Resource modelResource = resourceSet.getResource(modelUri, true);
							SmartContracts smartcontracts = ((SmartContracts) modelResource.getContents().get(0)); 
							
					        SmartcontractPackage.eINSTANCE.eClass();
							// Get the default factory singleton
							SmartcontractFactory factory = SmartcontractFactory.eINSTANCE;
							
							// Repeat 
							
							File smartcontractTypeDirectory = new File(EventPatternsStatus.getEventTypePath());
							
							FilenameFilter fileFilter = new FilenameFilter() {
								@Override
					            public boolean accept(File dir, String name) {
									String lowercaseName = name.toLowerCase();
					                if (lowercaseName.endsWith(".smartcontracttype")) {
					                	return true;
					                } else {
					                	return false;
					                }
								}
					        };

					        File[] smartcontractTypeFiles = smartcontractTypeDirectory.listFiles(fileFilter);
					        
					        if (smartcontractTypeFiles.length == 0) {
					        	MessageDialog.openError(shell, "Auto-detect Smart Contracts", "There are no event types to create the domain.");
					        	return null;	
					        }
					        
					        boolean updatedSmartContract = false; 
					        
					        for (File file : smartcontractTypeFiles) {
					        	if (file.isFile()) {
					        		System.out.println("fileName: " + file.getName());
					                System.out.println("file.getAbsolutePath(): " + file.getAbsolutePath());
					      
					                FileInputStream fis = new FileInputStream(file.getAbsolutePath());
								    ObjectInputStream ois = new ObjectInputStream(fis);
								    
								    @SuppressWarnings("unchecked")
									Map<String, Object> smartcontractType = (Map<String, Object>) ois.readObject();
								    ois.close();
								
								    System.out.println("smartcontractType: " + smartcontractType);
		
								    String smartcontractTypeName = (String) smartcontractType.keySet().toArray()[0];
								    
								    boolean smartcontractExist = false;  
								    
								    for (Iterator iter = EcoreUtil.getAllContents(modelResource, true); iter.hasNext();) {
										EObject eObject = (EObject) iter.next();
										
										if (eObject.getClass().getSimpleName().equals("SmartContractImpl")) {

											SmartContract sc = ((SmartContract) eObject);
											
											if (sc.getTypeName().equals(smartcontractTypeName)) {
												smartcontractExist = true; 
												updatedSmartContract = true;
											}
										}
								    }
											
								    if (!smartcontractExist) {

										smartcontract.SmartContract smartcontractSmartcontract = factory.createSmartContract();
										smartcontractSmartcontract.setTypeName(smartcontractTypeName);
										
										smartcontractSmartcontract = (SmartContract) getSmartContract(smartcontractTypeName, smartcontractType, smartcontractSmartcontract, factory); 
										smartcontracts.getSmartcontracts().add(smartcontractSmartcontract);	
								    }
					        	}
					        }
					        
					        if (updatedSmartContract) {
					        	modelResource.save(null);
					        	SmartcontractDiagramEditorUtil.openDiagram(diagramResource);
					        }
					        else {
					        	MessageDialog.openInformation(shell, "Auto-detect Smart Contracts", "The domain has not been updated.");
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
				
	private Object getSmartContract(String smartcontractTypeName, Map<String, Object> samrtcontractType, Object node, SmartcontractFactory factory) {

		for (String key : samrtcontractType.keySet()) {
			
			Object value = samrtcontractType.get(key);

			if (value instanceof Map) {
		        
		        if (key.equals(smartcontractTypeName)) {
		        	getSmartContract(smartcontractTypeName, (Map<String, Object>) value, node, factory);
		        }
		        else {
	                ContractFunction contractFunction = factory.createContractFunction();
	            	contractFunction.setName(key);
	            	
	            	if (node.getClass().getSimpleName().equals("SmartContractImpl")) {
	            		((SmartContract)node).getSmartContractProperties().add(contractFunction);
	            	}
	            	else if (node.getClass().getSimpleName().equals("ContractFunctionImpl")) {
	            		((ContractFunction)node).setReferencedSmartContract(((SmartContract)node));
	            	}
	            	
	            	getSmartContract(smartcontractTypeName, (Map<String, Object>) value, contractFunction, factory);
		        }
		        
            } else {
            	 
            	//InputParameter inputParameter;
            	//OutputParameter outputParameter;
            	
            	if (node.getClass().getSimpleName().equals("InputParameterImpl")) {
            		InputParameter inputParameter = factory.createInputParameter();
            		
            		inputParameter.setName(key);

                	if (value.toString().compareTo("class java.lang.String") == 0) { 
                		inputParameter.setType(PropertyTypeValue.STRING);
    				}
    				else if (value.toString().compareTo("class java.lang.Double") == 0) { 
    					inputParameter.setType(PropertyTypeValue.DOUBLE);
    				}
    				else if (value.toString().compareTo("class java.lang.Float") == 0) { 
    					inputParameter.setType(PropertyTypeValue.FLOAT);
    				}
    				else if (value.toString().compareTo("class java.lang.Long") == 0) { 
    					inputParameter.setType(PropertyTypeValue.LONG);
    				}
    				else if (value.toString().compareTo("class java.lang.Integer") == 0) { 
    					inputParameter.setType(PropertyTypeValue.INTEGER);
    				}
    				else if (value.toString().compareTo("class java.lang.Boolean") == 0) { 
    					inputParameter.setType(PropertyTypeValue.BOOLEAN);
    				} 
                	
                	System.out.println("node.getClass().getSimpleName(): " + node.getClass().getSimpleName());
                	
                	if (node.getClass().getSimpleName().equals("ContractFunctionImpl")) {      	
            			((ContractFunction)node).getInputParametersFunction().add(inputParameter);
                	}
                	
            	} else if (node.getClass().getSimpleName().equals("OutputParameterImpl")) {
            		OutputParameter outputParameter = factory.createOutputParameter();
            		
            		outputParameter.setName(key);

                	if (value.toString().compareTo("class java.lang.String") == 0) { 
                		outputParameter.setType(PropertyTypeValue.STRING);
    				}
    				else if (value.toString().compareTo("class java.lang.Double") == 0) { 
    					outputParameter.setType(PropertyTypeValue.DOUBLE);
    				}
    				else if (value.toString().compareTo("class java.lang.Float") == 0) { 
    					outputParameter.setType(PropertyTypeValue.FLOAT);
    				}
    				else if (value.toString().compareTo("class java.lang.Long") == 0) { 
    					outputParameter.setType(PropertyTypeValue.LONG);
    				}
    				else if (value.toString().compareTo("class java.lang.Integer") == 0) { 
    					outputParameter.setType(PropertyTypeValue.INTEGER);
    				}
    				else if (value.toString().compareTo("class java.lang.Boolean") == 0) { 
    					outputParameter.setType(PropertyTypeValue.BOOLEAN);
    				} 
                	
                	System.out.println("node.getClass().getSimpleName(): " + node.getClass().getSimpleName());
                	
                	if (node.getClass().getSimpleName().equals("ContractFunctionImpl")) {      	
            			((ContractFunction)node).setOutputParametersFunction(outputParameter);
                	}
                	
            	}
            }
        }
		
		return node;
    }			
}
