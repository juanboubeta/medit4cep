/*
 * 
 */
package cepapp.diagram.edit.helpers;

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

import cepapp.CepappFactory;
import cepapp.CepappPackage;
import cepapp.ComplexEventProperty;

/**
 * @generated NOT
 */
public class EventEditHelper extends CepappBaseEditHelper {
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

				String domainName = cepapp.diagram.status.CepAppStatus.getDomainName();
				IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

				EcoreUtil.Copier domainEventTocustomEventCopier = new EcoreUtil.Copier() {

					// Overriding getTarget() we can easily change the type of instance (cepapp.Event) 
					// that is created as the copy of an object (domain.Event) 
					protected EClass getTarget(EClass e) {

						if (e.getInstanceClassName().equals("domain.Event")) {

							// return EClass for "cepapp.Event" 
							return CepappPackage.Literals.EVENT;
						}

						if (e.getInstanceClassName().equals("domain.EventProperty")) {

							// return EClass for "cepapp.Property"
							return CepappPackage.Literals.EVENT_PROPERTY;
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

							if (eAttribute.getEType().getInstanceClassName().equals("domain.PropertyTypeValue")) {

								Enumerator value = (Enumerator) eObject.eGet(eAttribute);

								copyEObject.eSet(getTarget(eAttribute),
										cepapp.PropertyTypeValue.getByName(value.getLiteral()));
							}

						} else {
							copyEObject.eSet(getTarget(eAttribute), eObject.eGet(eAttribute));
						}
					}

				};

				if (params.containsKey("clickedEventTool")) {

					String toolName = (String) params.get("clickedEventTool");

					if (toolName != null) {
						cepapp.Event customEvent = (cepapp.Event) o;
						customEvent.setTypeName(toolName);

						// Location where the domain model is
						IProject domainProject = myWorkspaceRoot.getProject("domain");

						if (domainProject.exists()) {

							// Open if necessary
							if (!domainProject.isOpen()) {
								try {
									domainProject.open(null);
								} catch (CoreException e1) {
									e1.printStackTrace();
								}
							}

							ResourceSet resourceSet = new ResourceSetImpl();

							if (domainProject.getFile(domainName + ".domain") != null) {

								URI domainModelUri = URI.createPlatformResourceURI(
										domainProject.getFile(domainName + ".domain").getFullPath().toString(), false);

								Resource domainModelResource = resourceSet.getResource(domainModelUri, true);

								// Find the equivalent event to the event dropped onto the canvas in the "domain" model					         						    
								for (Iterator iter = EcoreUtil.getAllContents(domainModelResource.getContents().get(0),
										true); iter.hasNext();) {

									EObject eObject = (EObject) iter.next();

									if (eObject.getClass().getSimpleName().equals("EventImpl")
											&& ((domain.Event) eObject).getTypeName().equals(toolName)) {

										Resource customResource = customEvent.eResource();
										cepapp.CEPApp customDomain = (cepapp.CEPApp) customResource.getContents()
												.get(0);

										// Create an instance of eventpattern.Event with the information of an instance of domain.Event 
										cepapp.Event customEventCopy = (cepapp.Event) domainEventTocustomEventCopier
												.copy(eObject);

										// Find the event dropped onto the canvas in the "eventpattern" model 
										// where properties must be added.
										for (Iterator iter2 = EcoreUtil.getAllContents(customDomain, true); iter
												.hasNext();) {

											EObject eObject2 = (EObject) iter2.next();

											if (eObject2.equals(customEvent)) {

												EcoreUtil.replace(eObject2, customEventCopy);
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

				else if (params.containsKey("clickedComplexEventTool")) {

					String toolName = (String) params.get("clickedComplexEventTool");

					if (toolName != null && domainName != null) {
						cepapp.Event customEvent = (cepapp.Event) o;
						customEvent.setTypeName(toolName);

						// Location where the domain model is
						IProject domainProject = myWorkspaceRoot.getProject(domainName + "_complex_events");

						if (domainProject.exists()) {

							// Open if necessary
							if (!domainProject.isOpen()) {
								try {
									domainProject.open(null);
								} catch (CoreException e1) {
									e1.printStackTrace();
								}
							}

							ResourceSet resourceSet = new ResourceSetImpl();

							if (domainProject.getFile(domainName + "_complex_events.domain") != null) {

								URI domainModelUri = URI.createPlatformResourceURI(domainProject
										.getFile(domainName + "_complex_events.domain").getFullPath().toString(),
										false);

								Resource domainModelResource = resourceSet.getResource(domainModelUri, true);

								// Find the equivalent event to the event dropped onto the canvas in the "domain" model					         						    
								for (Iterator iter = EcoreUtil.getAllContents(domainModelResource.getContents().get(0),
										true); iter.hasNext();) {

									EObject eObject = (EObject) iter.next();

									if (eObject.getClass().getSimpleName().equals("EventImpl")
											&& ((domain.Event) eObject).getTypeName().equals(toolName)) {

										Resource customResource = customEvent.eResource();
										cepapp.CEPApp customDomain = (cepapp.CEPApp) customResource.getContents()
												.get(0);

										// Create an instance of eventpattern.Event with the information of an instance of domain.Event 
										cepapp.Event customEventCopy = (cepapp.Event) domainEventTocustomEventCopier
												.copy(eObject);

										// Find the event dropped onto the canvas in the "eventpattern" model 
										// where properties must be added.
										for (Iterator iter2 = EcoreUtil.getAllContents(customDomain, true); iter
												.hasNext();) {

											EObject eObject2 = (EObject) iter2.next();

											if (eObject2.equals(customEvent)) {

												EcoreUtil.replace(eObject2, customEventCopy);
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
				} else if (params.containsKey("clickedComplexEventTool")) {

					String toolName = (String) params.get("clickedComplexEventTool");
					String patternName = (String) params.get("patternName");

					if (toolName != null && patternName != null && domainName != null) {
						cepapp.ComplexEvent customEvent = (cepapp.ComplexEvent) o;
						customEvent.setTypeName(toolName);

						// Location where the pattern model is
						IProject patternProject = myWorkspaceRoot.getProject(domainName + "_patterns");

						if (patternProject.exists()) {

							// Open if necessary
							if (!patternProject.isOpen()) {
								try {
									patternProject.open(null);
								} catch (CoreException e1) {
									e1.printStackTrace();
								}
							}

							ResourceSet resourceSet = new ResourceSetImpl();

							if (patternProject.getFile(patternName + ".pattern") != null) {

								URI patternModelUri = URI.createPlatformResourceURI(
										patternProject.getFile(patternName + ".pattern").getFullPath().toString(),
										false);

								Resource patternModelResource = resourceSet.getResource(patternModelUri, true);

								CepappPackage.eINSTANCE.eClass();
								// Get the default factory singleton
								CepappFactory factory = CepappFactory.eINSTANCE;

								// Set the same properties of the complex event to the dropped event					         						    
								for (TreeIterator iter = EcoreUtil.getAllContents(
										patternModelResource.getContents().get(0), true); iter.hasNext();) {

									EObject eObject = (EObject) iter.next();

									if (eObject.getClass().getSimpleName().equals("ComplexEventPropertyImpl")) {

										cepapp.ComplexEventProperty property = factory.createComplexEventProperty();
										property.setName(((ComplexEventProperty) eObject).getName());
										property.setImagePath(((ComplexEventProperty) eObject).getImagePath());

										customEvent.getComplexEventProperties().add(property);

										iter.prune();
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
