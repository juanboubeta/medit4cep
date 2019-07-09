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

		System.out.println("AQUI ESTOY");
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

				Object array = parser.parse(new FileReader("SmartContracts.smartcontractype"));
				JSONArray jsonArray = (JSONArray) array;

				String name = dialog.getSmartContractsName();
				String description = dialog.getSmartContractsDescription();
				smartcontractProject.create(null);

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
						smartcontract.ContractFunction ContractFunction = factory.createContractFunction();
						smartcontract.InputParameter InputParameter = factory.createInputParameter();
						smartcontract.OutputParameter OutputParameter = factory.createOutputParameter();

						for (int i = 0; i < jsonArray.size(); i++) {
							contractsArray = (JSONObject) jsonArray.get(i);
							functionsArray = (JSONArray) contractsArray.get("functions");
							// JSONArray inputsArray = (JSONArray) inputsArray.get("inputs");

							String SmartContractName = (String) contractsArray.get("name");
							System.out.println("Contrato " + (i + 1) + " : " + SmartContractName);

							// put the name of the smart contract and add into the SmartContracts List
							SmartContract.setTypeName(SmartContractName);
							smartcontracts.getSmartcontracts().add(SmartContract);

							Iterator<JSONObject> iterator = functionsArray.iterator();

							while (iterator.hasNext()) {

								aux = iterator.next();
								String ContractFunctionName = (String) aux.get("name");
								System.out.println("Metodo : " + aux.get("name"));

								// put the name of the contract function and add into the SmartContract List
								ContractFunction.setName(ContractFunctionName);
								SmartContract.getSmartContractProperties().add(ContractFunction);

								inputsParameter = (JSONArray) aux.get("inputs");

								for (int j = 0; j < inputsParameter.size(); j++) {
									inputParameter = (JSONObject) inputsParameter.get(j);
									String InputParameterName = (String) inputParameter.get("name");
									smartcontract.PropertyTypeValue InputParameterType = (smartcontract.PropertyTypeValue) inputParameter
											.get("type");
									System.out.println("Input Parameter - " + inputParameter.get("name") + " : "
											+ inputParameter.get("type"));

									// put the name and type of the input parameter and add into the
									// ContractFunction List
									InputParameter.setName(InputParameterName);
									InputParameter.setType(InputParameterType);
									ContractFunction.getInputParametersFunction().add(InputParameter);

								}

								outputParameter = (JSONObject) aux.get("output");
								String OutputParameterName = (String) outputParameter.get("name");
								smartcontract.PropertyTypeValue OutputParameterType = (smartcontract.PropertyTypeValue) outputParameter
										.get("type");
								System.out.println("Output Parameter - " + outputParameter.get("name") + " : "
										+ outputParameter.get("type"));

								// put the name and type of the input parameter and add into the
								// ContractFunction List
								OutputParameter.setName(OutputParameterName);
								OutputParameter.setType(OutputParameterType);
								ContractFunction.setOutputParametersFunction(OutputParameter);
							} // Fin while

						} // Fin for

						// ContractFunction = (ContractFunction) getContractFunction();
						// SmartContract.getSmartContractProperties().add(ContractFunction);
						// InputParameter = (InputParameter) getInputParameter();
						// OutputParameter = (OutputParameter) getOutputParameter();
						// ContractFunction.getInputParametersFunction().add(InputParameter);
						// ContractFunction.getOutputParametersFunction().add(OutputParameter);

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
