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
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
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

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

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

public class AutoinitializeSmartContractHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		Shell shell = HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell();
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

		IProject smartcontractProject = myWorkspaceRoot.getProject("smartcontract");

		try {

			if (!smartcontractProject.exists()) {

				JSONParser parser = new JSONParser();

				// Create local variables
				JSONObject contractsArray;
				JSONArray functionsArray;
				JSONObject outputParameter;
				JSONArray inputsParameter;
				JSONObject inputParameter;
				JSONObject aux;

				AutodetectSmartContractDialog dialog = new AutodetectSmartContractDialog(shell);
				dialog.create();

				if (dialog.open() != Window.OK) {
					return null;
				}

				// Open the file .smartcontractype that contains default SmartContracts.
				
				final String smartcontractype = "D:\\UNIVERSIDAD\\TFG\\medit4cep\\es.uca.modeling.cep.eventpattern.menu\\SmartContracts.smartcontractype";
				Object array = parser.parse(new FileReader(smartcontractype));
				JSONArray jsonArray = (JSONArray) array;

				String name = dialog.getSmartContractsName();
				String description = dialog.getSmartContractsDescription();
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

						

						for (int i = 0; i < jsonArray.size(); i++) {
							
							// Get the default factory singleton
							SmartcontractFactory factory = SmartcontractFactory.eINSTANCE;

							smartcontract.SmartContract SmartContract = factory.createSmartContract();							
							
							contractsArray = (JSONObject) jsonArray.get(i);
							functionsArray = (JSONArray) contractsArray.get("functions");

							String SmartContractName = (String) contractsArray.get("name");
							
							// put the name of the smart contract and add into the SmartContracts List
							SmartContract.setTypeName(SmartContractName);
							smartcontracts.getSmartcontracts().add(SmartContract);

							Iterator<JSONObject> iterator = functionsArray.iterator();

							while (iterator.hasNext()) {
								
								smartcontract.ContractFunction ContractFunction = factory.createContractFunction();
								smartcontract.OutputParameter OutputParameter = factory.createOutputParameter();

								aux = iterator.next();
								String ContractFunctionName = (String) aux.get("name");

								// put the name of the contract function and add into the SmartContract List
								ContractFunction.setName(ContractFunctionName);
								SmartContract.getSmartContractProperties().add(ContractFunction);

								inputsParameter = (JSONArray) aux.get("inputs");

								for (int j = 0; j < inputsParameter.size(); j++) {
									smartcontract.InputParameter InputParameter = factory.createInputParameter();
									inputParameter = (JSONObject) inputsParameter.get(j);
									String InputParameterName = (String) inputParameter.get("name");
									
									smartcontract.PropertyTypeValue InputParameterType;
									switch((String) inputParameter.get("type")) {
									case "boolean":
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
									default:
										InputParameterType = PropertyTypeValue.UNKNOWN;
									}
								
									// put the name and type of the input parameter and add into the
									// ContractFunction List
									InputParameter.setName(InputParameterName);
									InputParameter.setType(InputParameterType);
									ContractFunction.getInputParametersFunction().add(InputParameter);											
								}

								outputParameter = (JSONObject) aux.get("output");
								if(outputParameter != null) {
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
									default:
										OutputParameterType = PropertyTypeValue.UNKNOWN;
									}
									
									// put the name and type of the input parameter and add into the
									// ContractFunction List
									OutputParameter.setName(OutputParameterName);
									OutputParameter.setType(OutputParameterType);
									ContractFunction.setOutputParametersFunction(OutputParameter);	
								} // Fin if
							} // Fin while

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
				} // fin if
			} else {
				MessageDialog.openError(shell, "Auto-initialize Smart Contracts",
						"The editor has already been customised.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}
}
