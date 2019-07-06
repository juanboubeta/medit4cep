/*******************************************************************************
 * Copyright (c) 2011, 2015 Juan Boubeta-Puig
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Juan Boubeta-Puig - modifications marked as @generated NOT
 ******************************************************************************/

package eventpattern.diagram.edit.helpers;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.ConfigureElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;

import eventpattern.ComplexEventProperty;
import eventpattern.EventpatternFactory;
import eventpattern.EventpatternPackage;

/**
 * @generated NOT
 */
public class SmartContractEditHelper extends EventpatternBaseEditHelper {

	@Override
	protected ICommand getConfigureCommand(final ConfigureRequest req) {

		ICommand configureCommand = new ConfigureElementCommand(req) {

			protected CommandResult doExecute(IProgressMonitor progressMonitor) {

				Object o = req.getElementToConfigure();
				return this.getCommandResult();
			}

			protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {

				Object o = req.getElementToConfigure();
				Map params = req.getParameters();

				String smartcontractName = eventpattern.diagram.status.EventPatternsStatus.getDomainName();
				IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

				EcoreUtil.Copier smartContractTocustomSmartcontractCopier = new EcoreUtil.Copier() {

					// Overriding getTarget() we can easily change the type of instance (eventpattern.SmartContract) 
					// that is created as the copy of an object (smartcontract.SmartContract) 
					protected EClass getTarget(EClass e) {

						if (e.getInstanceClassName().equals("smartcontract.SmartContract")) {

							// return EClass for "smartcontract.SmartContract" 
							return EventpatternPackage.Literals.SMART_CONTRACT;
						}

						if (e.getInstanceClassName().equals("smartcontract.ContractFunction")) {

							// return EClass for "smartcontract.ContractFunction"
							return EventpatternPackage.Literals.CONTRACT_FUNCTION;
						}
						
						if (e.getInstanceClassName().equals("smartcontract.InputParameter")) {

							// return EClass for "smartcontract.InputParameter"
							return EventpatternPackage.Literals.INPUT_PARAMETER;
						}
						
						if (e.getInstanceClassName().equals("smartcontract.OutputParameter")) {

							// return EClass for "smartcontract.OutputParameter"
							return EventpatternPackage.Literals.OUTPUT_PARAMETER;
						}

						return super.getTarget(e);
					}

					protected EStructuralFeature getTarget(EStructuralFeature eStructuralFeature) {

						EClass eClass = getTarget(eStructuralFeature.getEContainingClass());
						EStructuralFeature targetEFeature = eClass.getEStructuralFeature(eStructuralFeature.getName());
						return targetEFeature;

					}

					protected void copyAttribute(EAttribute eAttribute, EObject eObject, EObject copyEObject) {

						// EEnum must be copied manually
						if (eAttribute.getEType() instanceof EEnum) {

							if (eAttribute.getEType().getInstanceClassName().equals("smartcontract.PropertyTypeValue")) {

								Enumerator value = (Enumerator) eObject.eGet(eAttribute);

								copyEObject.eSet(getTarget(eAttribute),
										eventpattern.PropertyTypeValue.getByName(value.getLiteral()));
							}

						} else {
							copyEObject.eSet(getTarget(eAttribute), eObject.eGet(eAttribute));
						}
					}

				};

				if (params.containsKey("clickedSmartContractTool")) {

					String toolName = (String) params.get("clickedSmartContractTool");

					if (toolName != null) {
						eventpattern.SmartContract customSmartContract = (eventpattern.SmartContract) o;
						customSmartContract.setTypeName(toolName);

						// Location where the domain model is
						IProject smartcontractProject = myWorkspaceRoot.getProject("smartcontract");

						if (smartcontractProject.exists()) {

							// Open if necessary
							if (!smartcontractProject.isOpen()) {
								try {
									smartcontractProject.open(null);
								} catch (CoreException e1) {
									e1.printStackTrace();
								}
							}

							ResourceSet resourceSet = new ResourceSetImpl();

							if (smartcontractProject.getFile(smartcontractName + ".smartc") != null) {

								URI domainModelUri = URI.createPlatformResourceURI(
										smartcontractProject.getFile(smartcontractName + ".smartc").getFullPath().toString(), false);

								Resource smartcontractModelResource = resourceSet.getResource(domainModelUri, true);

								// Find the equivalent event to the event dropped onto the canvas in the "domain" model					         						    
								for (Iterator iter = EcoreUtil.getAllContents(smartcontractModelResource.getContents().get(0),
										true); iter.hasNext();) {

									EObject eObject = (EObject) iter.next();

									if (eObject.getClass().getSimpleName().equals("SmartContractImpl")
											&& ((smartcontract.SmartContract) eObject).getTypeName().equals(toolName)) {

										Resource customResource = customSmartContract.eResource();
										eventpattern.CEPEventPattern customDomain = (eventpattern.CEPEventPattern) customResource
												.getContents().get(0);

										// Create an instance of eventpattern.SmartContract with the information of an instance of smartcontract.SmartContract 
										eventpattern.SmartContract customSmartContractCopy = (eventpattern.SmartContract) smartContractTocustomSmartcontractCopier
												.copy(eObject);

										// Find the SmartContract dropped onto the canvas in the "eventpattern" model 
										// where properties must be added.
										for (Iterator iter2 = EcoreUtil.getAllContents(customDomain, true); iter
												.hasNext();) {

											EObject eObject2 = (EObject) iter2.next();

											if (eObject2.equals(customSmartContract)) {

												EcoreUtil.replace(eObject2, customSmartContractCopy);
												break;
											}
										}

										// 'break' because we have just found the specified Event in the domain model
										break;
									}
								}
							}
						}
					}
				}

				return this.getCommandResult();
			}
		};

		return CompositeCommand.compose(configureCommand, super.getConfigureCommand(req));
	}
}
