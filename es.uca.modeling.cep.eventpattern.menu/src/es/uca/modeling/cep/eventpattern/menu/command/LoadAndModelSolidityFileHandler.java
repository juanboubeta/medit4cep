package es.uca.modeling.cep.eventpattern.menu.command;

import java.io.BufferedWriter;
import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

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
import eventpattern.diagram.status.EventPatternsStatus;
import smartcontract.ContractFunction;
import smartcontract.PropertyTypeValue;
import smartcontract.SmartContract;
import smartcontract.SmartContracts;
import smartcontract.SmartcontractFactory;
import smartcontract.diagram.part.SmartcontractDiagramEditorUtil;



public class LoadAndModelSolidityFileHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		String domainName = EventPatternsStatus.getDomainName();
		Shell shell = HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell();
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

		IProject smartcontractProject = myWorkspaceRoot.getProject("smartcontract");
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
		
		//First of all we must check if exist some smart contract project
		try {
			if (!domainProject.exists()) {
	        	MessageDialog.openError(shell, "Load and Model from Solidity File", "A CEP domain must be previously created or imported.");
	        	return null;	
			} else {
				if (!smartcontractProject.exists()) {
					
					//Open the dialog to select the solidity file
					String solidityPath = null;
					String smartcontractPath = null;
					String smartcontractFile = null;
	
					FileDialog dialog = new FileDialog(shell, SWT.OPEN);
					dialog.setText("Select the Solidity File to be imported.");
					
					dialog.setFilterExtensions(new String[] { "*.sol" });
					
					dialog.setFilterNames(new String[] { "Solidity Files (*.sol)" });
					dialog.open();
	
					if (dialog.getFileName() != null && !dialog.getFileName().equals("")) {
						smartcontractFile = dialog.getFileName();
						//String name = smartcontractFile.replace(".sol", "");
						//EventPatternsStatus.setSmartcontractsName(name);
						solidityPath = dialog.getFilterPath();
						smartcontractPath = solidityPath + "/" + smartcontractFile;
					}
					
					System.out.println(smartcontractPath);
					
					//Generating bin and abi files from solidity file
					try {
						String [] cmd = {"solc", smartcontractPath,"--bin", "--abi", "--optimize", "-o", solidityPath}; //Comando de apagado en windows
						System.out.println(cmd);
						Runtime.getRuntime().exec(cmd);
					} catch (IOException ioe) {
						System.out.println(ioe);
					}
					
					//Generating java smart contract from abi and bin files
					String ruta = solidityPath + "/GeneracionJava.ps1";
					File archivo = new File(ruta);
					String abiPath = solidityPath + "/" + smartcontractFile.replace(".sol", ".abi");
					String binPath = solidityPath + "/" + smartcontractFile.replace(".sol", ".bin");
					BufferedWriter bw;
					//System.out.println("web3j " + "solidity " + "generate " + "-a " + '"' + abiPath + '"' + " -b " + '"' + binPath + '"' + " -o " + '"' + myWorkspaceRoot.getLocation().toString() + runtimeProject.getFullPath() + "/" + '"' + " -p " + "es.uca.modeling.cep.smartcontract.code");
					if(archivo.exists()) {
						bw = new BufferedWriter(new FileWriter(archivo));
					    bw.write("web3j " + "solidity " + "generate " + "-a " + '"' + abiPath + '"' + " -b " + '"' + binPath + '"' + " -o " + '"' + projectPath.replace("es\\uca\\modeling\\cep\\smartcontract\\code", "") + '"' + " -p " + "es.uca.modeling.cep.smartcontract.code");
					    bw.close();
					} else {
						bw = new BufferedWriter(new FileWriter(archivo));
						bw.write("web3j " + "solidity " + "generate " + "-a " + '"' + abiPath + '"' + " -b " + '"' + binPath + '"' + " -o " + '"' + projectPath.replace("es\\uca\\modeling\\cep\\smartcontract\\code", "") + '"' + " -p " + "es.uca.modeling.cep.smartcontract.code");
						bw.close();
					}
	
					try {
						String [] cmd = {"PowerShell.exe","-Command",ruta}; //Comando de apagado en windows
						Runtime.getRuntime().exec(cmd);
					} catch (IOException ioe) {
						System.out.println (ioe);
					}
										
					//Auto initializing smart contract from abi file
					AutodetectSmartContractDialog newDialog = new AutodetectSmartContractDialog(shell);
					newDialog.create();
					
					if (newDialog.open() != Window.OK) {
						return null;
					}
					
					JSONParser parser = new JSONParser();
	
					// Create local variables
					JSONObject outputParameter;
					JSONArray inputsArray;
					JSONArray outputsArray;
					JSONObject inputParameter;
	
					// Open the file .abi that contains solidity in JSON format.
					
					final String smartcontractype = solidityPath + "/" + smartcontractFile.replace(".sol", ".abi");
					Object array = parser.parse(new FileReader(smartcontractype));
					JSONArray jsonArray = (JSONArray) array;
	
					String name = newDialog.getSmartContractsName();
					String description = newDialog.getSmartContractsDescription();
					smartcontractProject.create(null);
					EventPatternsStatus.setSmartcontractsName(name);
	
					// Open if necessary
					if (!smartcontractProject.isOpen()) {
						smartcontractProject.open(null);
					}
					
					URI diagramUri = URI.createPlatformResourceURI(
							smartcontractProject.getFile(name + ".smartc_diagram").getFullPath().toString(), false);
					URI modelUri = URI.createPlatformResourceURI(
							smartcontractProject.getFile(name + ".smartc").getFullPath().toString(), false);
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
							SmartContract.setTypeName(smartcontractFile.replace(".sol", ""));
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
									
									outputsArray = (JSONArray) functionsArray.get("outputs");
									
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
					
				} else {
					MessageDialog.openError(shell, "Load and Model from Solidity File",
							"The editor has already been customised.");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}

}
