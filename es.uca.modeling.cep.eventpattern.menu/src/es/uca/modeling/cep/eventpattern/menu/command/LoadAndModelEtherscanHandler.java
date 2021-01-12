package es.uca.modeling.cep.eventpattern.menu.command;

import java.io.BufferedWriter;
import java.io.File;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.swing.JOptionPane;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
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
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import es.uca.modeling.cep.eventpattern.menu.dialog.AutodetectSmartContractDialog;
import es.uca.modeling.cep.eventpattern.menu.dialog.LoadAndModelEtherscanDialog;
import eventpattern.diagram.status.EventPatternsStatus;
import smartcontract.ContractFunction;
import smartcontract.PropertyTypeValue;
import smartcontract.SmartContract;
import smartcontract.SmartContracts;
import smartcontract.SmartcontractFactory;
import smartcontract.diagram.part.SmartcontractDiagramEditorUtil;



public class LoadAndModelEtherscanHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		String domainName = EventPatternsStatus.getDomainName();
		Shell shell = HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell();
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		
		IProject smartcontractsProject = myWorkspaceRoot.getProject("smartcontract");
		IProject domainProject = myWorkspaceRoot.getProject("domain");
		IProject runtimeProject = myWorkspaceRoot.getProject(domainName + "_runtime");
		
		if (EventPatternsStatus.getProjectPath() == null) {
			
			String selectedDir = null;
		    DirectoryDialog dirDialog = new DirectoryDialog(shell);
		    dirDialog.setText("Choose MEdit4CEP folder.");
		    selectedDir = dirDialog.open();
	    	    
		    if (selectedDir == null) {
	        	return null; 	    	
		    }
		    else {
		    	System.out.println(selectedDir);
		    	selectedDir += "\\es.uca.modeling.cep.smartcontract.code\\src\\es\\uca\\modeling\\cep\\smartcontract\\code";
		    	EventPatternsStatus.setProjectPath(selectedDir);
		    	System.out.println(selectedDir);
		    }
		}
		
		String projectPath = EventPatternsStatus.getProjectPath();
		
		String EtherscanAddress = "";
		
		String contractAddress = "";
		
		String APISelected;
		
		try {
			if (!domainProject.exists()) {
	        	MessageDialog.openError(shell, "Load and Model from Etherscan", "A CEP domain must be previously created or imported.");
	        	return null;	
			} else {
				if (smartcontractsProject.exists()) {
		        	MessageDialog.openError(shell, "Load and Model from Etherscan", "The editor has already been customised.");
		        	return null;	
				}
				else {
					
					String[] options = new String[3];
					options[0]="Main";options[1]="Ropsten";options[2]="Rinkeby";
				   	
					//Dialog for select what model are going to be modeled
				   	APISelected = (String)JOptionPane.showInputDialog(
		            					null,
		                                "Select the API you want to use",
		                                "Selection of Etherscan API",
		                                JOptionPane.PLAIN_MESSAGE,
		                                null,
		                                options,
		                                options[0]);
					
					LoadAndModelEtherscanDialog dialog = new LoadAndModelEtherscanDialog(shell);
					dialog.create();
					
					if (dialog.open() == Window.OK) {
						
						contractAddress = dialog.getAddress();
						
						switch(APISelected) {
							case "Main":
								EtherscanAddress = "https://api.etherscan.io/api?module=contract&action=getsourcecode&address=" + contractAddress + "&apikey=V4NAYD81I26SR7JJM8PYJKK56EB2FUVAJE";
								break;
							case "Ropsten":
								EtherscanAddress = "https://api-ropsten.etherscan.io/api?module=contract&action=getsourcecode&address=" + contractAddress + "&apikey=V4NAYD81I26SR7JJM8PYJKK56EB2FUVAJE";
								break;
							case "Rinkeby":
								EtherscanAddress = "https://api-rinkeby.etherscan.io/api?module=contract&action=getsourcecode&address=" + contractAddress + "&apikey=V4NAYD81I26SR7JJM8PYJKK56EB2FUVAJE";
								break;
						}
					} 		
				}
				System.out.println(APISelected);
				System.out.println(EtherscanAddress);
				//Connect to the API and get the models
				URL url = new URL(EtherscanAddress);
	            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	            conn.setRequestMethod("GET");
	            conn.setRequestProperty("Accept", "application/json");
	            if (conn.getResponseCode() != 200) {
	                throw new RuntimeException("Failed : HTTP Error code : "
	                        + conn.getResponseCode());
	            }
	            InputStreamReader in = new InputStreamReader(conn.getInputStream());
	            BufferedReader br = new BufferedReader(in);
	            Set<String> EtherscanContract = new HashSet<String>();
	            //HashMap<Object, String> modelsWithABI = new HashMap<Object, String>();
	            //HashMap<Object, String> modelsWithBIN = new HashMap<Object, String>();
	            String output;
	            
	            while ((output = br.readLine()) != null) {
	            	EtherscanContract.add(output);
	            }
	            conn.disconnect();
	            
	            //Parse the models to JSON
	            JSONParser parser = new JSONParser();
	            
	            Iterator<String> it = EtherscanContract.iterator();
	            JSONObject modelJSON = (JSONObject) new JSONParser().parse(it.next());
	            JSONArray jsonArray = (JSONArray) modelJSON.get("result");
	            
	          	for (int i = 0; i < jsonArray.size(); i++) {
	          		modelJSON = (JSONObject) jsonArray.get(i);
	          		//System.out.println(modelJSON.get("SourceCode").toString());
	          		System.out.println(modelJSON);
	          		System.out.println(modelJSON.get("ABI").toString());
	          		//System.out.println(modelJSON.get("ContractName").toString());
	          	}
	                
		            					
				if(!runtimeProject.exists()) {
					runtimeProject.create(null);							
				}
					
				//Auto initializing smart contract from abi file
				AutodetectSmartContractDialog newDialog = new AutodetectSmartContractDialog(shell);
				newDialog.create();
					
				if (newDialog.open() != Window.OK) {
					return null;
				}
		
				// Create local variables
				JSONObject outputParameter;
				JSONArray inputsArray;
				JSONArray outputsArray;
				JSONObject inputParameter;
		
				// Open the file .abi that contains solidity in JSON format.
					
				Object array = parser.parse(modelJSON.get("ABI").toString());
				jsonArray = (JSONArray) array;
		
				String name = newDialog.getSmartContractsName();
				String description = newDialog.getSmartContractsDescription();
				smartcontractsProject.create(null);
				EventPatternsStatus.setSmartcontractsName(name);
		
				// Open if necessary
				if (!smartcontractsProject.isOpen()) {
					smartcontractsProject.open(null);
				}
					
				URI diagramUri = URI.createPlatformResourceURI(
						smartcontractsProject.getFile(name + ".smartc_diagram").getFullPath().toString(), false);
				URI modelUri = URI.createPlatformResourceURI(
						smartcontractsProject.getFile(name + ".smartc").getFullPath().toString(), false);
				Resource diagramResource = SmartcontractDiagramEditorUtil.createDiagram(diagramUri, modelUri,
						new NullProgressMonitor());
					
				if (diagramResource != null) {
					try {
						// Set model's attributes
						ResourceSet resourceSet = new ResourceSetImpl();
						Resource modelResource = resourceSet.getResource(modelUri, true);
						SmartContracts smartcontracts = ((SmartContracts) modelResource.getContents().get(0));
						smartcontracts.setName(name);
						smartcontracts.setCreationDate(new Date());
						smartcontracts.setDescription(description);
							
						// Get the default factory singleton
						SmartcontractFactory factory = SmartcontractFactory.eINSTANCE;
						smartcontract.SmartContract SmartContract = factory.createSmartContract();
							
						// put the name of the smart contract and add into the SmartContracts List
						SmartContract.setTypeName(modelJSON.get("ContractName").toString());
						SmartContract.setContractAddress(contractAddress);
						smartcontracts.getSmartcontracts().add(SmartContract);
							
						//modificar a partir de aqui la lectura del ABI						
						for (int i = 0; i < jsonArray.size(); i++) {
		
							JSONObject functionsArray = (JSONObject) jsonArray.get(i);
							if(functionsArray.get("name") != null) {
								smartcontract.ContractFunction ContractFunction = factory.createContractFunction();
								
								String ContractFunctionName = (String) functionsArray.get("name");
									
								// put the name of the contract function and add into the SmartContract List
								ContractFunction.setName(ContractFunctionName);
								SmartContract.getSmartContractProperties().add(ContractFunction);
								ContractFunction.setReferencedSmartContract(SmartContract);
								
								inputsArray = (JSONArray) functionsArray.get("inputs");
								if(inputsArray != null) {
									for (int j = 0; j < inputsArray.size(); j++) {
										smartcontract.InputParameter InputParameter = factory.createInputParameter();
										inputParameter = (JSONObject) inputsArray.get(j);
											
										String InputParameterName = (String) inputParameter.get("name");
												
										smartcontract.PropertyTypeValue InputParameterType;
										switch((String) inputParameter.get("type")) {
										case "bool":
											InputParameterType = PropertyTypeValue.BOOLEAN;
											break;
										case "integer":
											InputParameterType = PropertyTypeValue.INTEGER;
											break;
										case "long":
											InputParameterType = PropertyTypeValue.LONG;
											break;
										case "double":
											InputParameterType = PropertyTypeValue.DOUBLE;
											break;
										case "float":
											InputParameterType = PropertyTypeValue.FLOAT;
											break;
										case "string":
											InputParameterType = PropertyTypeValue.STRING;
											break;
										case "address":
											InputParameterType = PropertyTypeValue.STRING;
											break;
										default:
											Pattern p = Pattern.compile("int\\d{0,3}");
										    Matcher mat = p.matcher((String) inputParameter.get("type"));
											if(mat.matches()) {
												InputParameterType = PropertyTypeValue.INTEGER;
											} else {
												p = Pattern.compile("uint\\d{0,3}");
												mat = p.matcher((String) inputParameter.get("type"));
												if(mat.matches()) {
													InputParameterType = PropertyTypeValue.INTEGER;
												} else {
													InputParameterType = PropertyTypeValue.UNKNOWN;
												}
											}
										}
												
										// put the name and type of the input parameter and add into the
										// ContractFunction List
										InputParameter.setName(InputParameterName);
										InputParameter.setType(InputParameterType);
										InputParameter.setInputReferencedFunction(ContractFunction);
										ContractFunction.getInputParametersFunction().add(InputParameter);
											
									}
								}
									
								outputsArray = (JSONArray) functionsArray.get("outputs");
									
								if(outputsArray != null) {
									for (int k = 0; k < outputsArray.size(); k++) {
										smartcontract.OutputParameter OutputParameter = factory.createOutputParameter();
										outputParameter = (JSONObject) outputsArray.get(k);
										String OutputParameterName = (String) outputParameter.get("name");
												
										smartcontract.PropertyTypeValue OutputParameterType;
												
										switch((String) outputParameter.get("type")) {
										case "boolean":
											OutputParameterType = PropertyTypeValue.BOOLEAN;
											break;
										case "integer":
											OutputParameterType = PropertyTypeValue.INTEGER;
											break;
										case "long":
											OutputParameterType = PropertyTypeValue.LONG;
											break;
										case "double":
											OutputParameterType = PropertyTypeValue.DOUBLE;
											break;
										case "float":
											OutputParameterType = PropertyTypeValue.FLOAT;
											break;
										case "string":
											OutputParameterType = PropertyTypeValue.STRING;
											break;
										case "address":
											OutputParameterType = PropertyTypeValue.STRING;
											break;
										default:
											OutputParameterType = PropertyTypeValue.UNKNOWN;
										}
												
										// put the name and type of the input parameter and add into the
										// ContractFunction List
										OutputParameter.setName(OutputParameterName);
										OutputParameter.setType(OutputParameterType);
										OutputParameter.setOutputReferencedFunction(ContractFunction);
										ContractFunction.setOutputParametersFunction(OutputParameter);	
											
									}
								}
							} else if (functionsArray.get("type").equals("constructor")) {
								
								inputsArray = (JSONArray) functionsArray.get("inputs");
								for (int j = 0; j < inputsArray.size(); j++) {
									smartcontract.ConstructorParameter ConstructorParameter = factory.createConstructorParameter();
									inputParameter = (JSONObject) inputsArray.get(j);
										
									String ConstructorParameterName = (String) inputParameter.get("name");
											
									smartcontract.PropertyTypeValue ConstructorParameterType;
									switch((String) inputParameter.get("type")) {
									case "bool":
										ConstructorParameterType = PropertyTypeValue.BOOLEAN;
										break;
									case "integer":
										ConstructorParameterType = PropertyTypeValue.INTEGER;
										break;
									case "long":
										ConstructorParameterType = PropertyTypeValue.LONG;
										break;
									case "double":
										ConstructorParameterType = PropertyTypeValue.DOUBLE;
										break;
									case "float":
										ConstructorParameterType = PropertyTypeValue.FLOAT;
										break;
									case "string":
										ConstructorParameterType = PropertyTypeValue.STRING;
										break;
									case "address":
										ConstructorParameterType = PropertyTypeValue.STRING;
										break;
									default:
										Pattern p = Pattern.compile("int\\d{0,3}");
									    Matcher mat = p.matcher((String) inputParameter.get("type"));
										if(mat.matches()) {
											ConstructorParameterType = PropertyTypeValue.INTEGER;
										} else {
											p = Pattern.compile("uint\\d{0,3}");
											mat = p.matcher((String) inputParameter.get("type"));
											if(mat.matches()) {
												ConstructorParameterType = PropertyTypeValue.INTEGER;
											} else {
												ConstructorParameterType = PropertyTypeValue.UNKNOWN;
											}
										}
									}
									
									// put the name and type of the constructor parameter and add into the
									// ConstructorParameter List
									ConstructorParameter.setName(ConstructorParameterName);
									ConstructorParameter.setType(ConstructorParameterType);
									ConstructorParameter.setConstructorParameterReferencedContract(SmartContract);
									SmartContract.getConstructorParametersContract().add(ConstructorParameter);
								}
							}
						} // Fin for
		
						modelResource.save(null);
							
						SmartcontractDiagramEditorUtil.openDiagram(diagramResource);
					} catch (PartInitException e) {
						ErrorDialog.openError(shell, "Auto-initialize Smart Contracts", null, e.getStatus());
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					} catch (Exception e) {
						e.printStackTrace();
					} // Fin try-catch
				} //Fin if sin else	          	
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 						
				
		return null; 

	}

}
