/*
* 
*/
package cepapp.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import cepapp.CEPApp;
import cepapp.CepappPackage;
import cepapp.ComplexEvent;
import cepapp.ComplexEventProperty;
import cepapp.Destination;
import cepapp.Event;
import cepapp.EventProperty;
import cepapp.InMemoryInput;
import cepapp.InMemoryOutput;
import cepapp.InputFile;
import cepapp.Link;
import cepapp.Origin;
import cepapp.OutputFile;
import cepapp.SinkElement;
import cepapp.SinkEmail;
import cepapp.SinkHttp;
import cepapp.SinkMongoDB;
import cepapp.SinkMqtt;
import cepapp.SinkRDBMS;
import cepapp.SourceElement;
import cepapp.SourceEmail;
import cepapp.SourceHttp;
import cepapp.SourceMqtt;
import cepapp.Twitter;
import cepapp.diagram.edit.parts.CEPAppEditPart;
import cepapp.diagram.edit.parts.ComplexEventComplexEventComplexEventPropertiesCompartmentEditPart;
import cepapp.diagram.edit.parts.ComplexEventEditPart;
import cepapp.diagram.edit.parts.ComplexEventProperty2EditPart;
import cepapp.diagram.edit.parts.ComplexEventPropertyComplexEventPropertyComplexEventPropertiesCompartment2EditPart;
import cepapp.diagram.edit.parts.ComplexEventPropertyComplexEventPropertyComplexEventPropertiesCompartmentEditPart;
import cepapp.diagram.edit.parts.ComplexEventPropertyEditPart;
import cepapp.diagram.edit.parts.EventEditPart;
import cepapp.diagram.edit.parts.EventEventEventPropertiesCompartmentEditPart;
import cepapp.diagram.edit.parts.EventProperty2EditPart;
import cepapp.diagram.edit.parts.EventPropertyEditPart;
import cepapp.diagram.edit.parts.EventPropertyEventPropertyEventPropertiesCompartment2EditPart;
import cepapp.diagram.edit.parts.EventPropertyEventPropertyEventPropertiesCompartmentEditPart;
import cepapp.diagram.edit.parts.InMemoryInputEditPart;
import cepapp.diagram.edit.parts.InMemoryOutputEditPart;
import cepapp.diagram.edit.parts.InputFileEditPart;
import cepapp.diagram.edit.parts.LinkEditPart;
import cepapp.diagram.edit.parts.OutputFileEditPart;
import cepapp.diagram.edit.parts.SinkEmailEditPart;
import cepapp.diagram.edit.parts.SinkHttpEditPart;
import cepapp.diagram.edit.parts.SinkMongoDBEditPart;
import cepapp.diagram.edit.parts.SinkMqttEditPart;
import cepapp.diagram.edit.parts.SinkRDBMSEditPart;
import cepapp.diagram.edit.parts.SourceEmailEditPart;
import cepapp.diagram.edit.parts.SourceHttpEditPart;
import cepapp.diagram.edit.parts.SourceMqttEditPart;
import cepapp.diagram.edit.parts.TwitterEditPart;
import cepapp.diagram.providers.CepappElementTypes;

/**
 * @generated
 */
public class CepappDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<CepappNodeDescriptor> getSemanticChildren(View view) {
		switch (CepappVisualIDRegistry.getVisualID(view)) {
		case CEPAppEditPart.VISUAL_ID:
			return getCEPApp_1000SemanticChildren(view);
		case EventEventEventPropertiesCompartmentEditPart.VISUAL_ID:
			return getEventEventEventPropertiesCompartment_7001SemanticChildren(view);
		case EventPropertyEventPropertyEventPropertiesCompartmentEditPart.VISUAL_ID:
			return getEventPropertyEventPropertyEventPropertiesCompartment_7002SemanticChildren(view);
		case EventPropertyEventPropertyEventPropertiesCompartment2EditPart.VISUAL_ID:
			return getEventPropertyEventPropertyEventPropertiesCompartment_7003SemanticChildren(view);
		case ComplexEventComplexEventComplexEventPropertiesCompartmentEditPart.VISUAL_ID:
			return getComplexEventComplexEventComplexEventPropertiesCompartment_7004SemanticChildren(view);
		case ComplexEventPropertyComplexEventPropertyComplexEventPropertiesCompartmentEditPart.VISUAL_ID:
			return getComplexEventPropertyComplexEventPropertyComplexEventPropertiesCompartment_7005SemanticChildren(
					view);
		case ComplexEventPropertyComplexEventPropertyComplexEventPropertiesCompartment2EditPart.VISUAL_ID:
			return getComplexEventPropertyComplexEventPropertyComplexEventPropertiesCompartment_7006SemanticChildren(
					view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CepappNodeDescriptor> getCEPApp_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CEPApp modelElement = (CEPApp) view.getElement();
		LinkedList<CepappNodeDescriptor> result = new LinkedList<CepappNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSinkElements().iterator(); it.hasNext();) {
			SinkElement childElement = (SinkElement) it.next();
			int visualID = CepappVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SinkMongoDBEditPart.VISUAL_ID) {
				result.add(new CepappNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InMemoryOutputEditPart.VISUAL_ID) {
				result.add(new CepappNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SinkEmailEditPart.VISUAL_ID) {
				result.add(new CepappNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OutputFileEditPart.VISUAL_ID) {
				result.add(new CepappNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SinkHttpEditPart.VISUAL_ID) {
				result.add(new CepappNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SinkMqttEditPart.VISUAL_ID) {
				result.add(new CepappNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ComplexEventEditPart.VISUAL_ID) {
				result.add(new CepappNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSourceElements().iterator(); it.hasNext();) {
			SourceElement childElement = (SourceElement) it.next();
			int visualID = CepappVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InMemoryInputEditPart.VISUAL_ID) {
				result.add(new CepappNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SourceEmailEditPart.VISUAL_ID) {
				result.add(new CepappNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputFileEditPart.VISUAL_ID) {
				result.add(new CepappNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SourceHttpEditPart.VISUAL_ID) {
				result.add(new CepappNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SourceMqttEditPart.VISUAL_ID) {
				result.add(new CepappNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EventEditPart.VISUAL_ID) {
				result.add(new CepappNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CepappNodeDescriptor> getEventEventEventPropertiesCompartment_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Event modelElement = (Event) containerView.getElement();
		LinkedList<CepappNodeDescriptor> result = new LinkedList<CepappNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEventProperties().iterator(); it.hasNext();) {
			EventProperty childElement = (EventProperty) it.next();
			int visualID = CepappVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EventPropertyEditPart.VISUAL_ID) {
				result.add(new CepappNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CepappNodeDescriptor> getEventPropertyEventPropertyEventPropertiesCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		EventProperty modelElement = (EventProperty) containerView.getElement();
		LinkedList<CepappNodeDescriptor> result = new LinkedList<CepappNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEventProperties().iterator(); it.hasNext();) {
			EventProperty childElement = (EventProperty) it.next();
			int visualID = CepappVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EventProperty2EditPart.VISUAL_ID) {
				result.add(new CepappNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CepappNodeDescriptor> getEventPropertyEventPropertyEventPropertiesCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		EventProperty modelElement = (EventProperty) containerView.getElement();
		LinkedList<CepappNodeDescriptor> result = new LinkedList<CepappNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEventProperties().iterator(); it.hasNext();) {
			EventProperty childElement = (EventProperty) it.next();
			int visualID = CepappVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EventProperty2EditPart.VISUAL_ID) {
				result.add(new CepappNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CepappNodeDescriptor> getComplexEventComplexEventComplexEventPropertiesCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ComplexEvent modelElement = (ComplexEvent) containerView.getElement();
		LinkedList<CepappNodeDescriptor> result = new LinkedList<CepappNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComplexEventProperties().iterator(); it.hasNext();) {
			ComplexEventProperty childElement = (ComplexEventProperty) it.next();
			int visualID = CepappVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ComplexEventPropertyEditPart.VISUAL_ID) {
				result.add(new CepappNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CepappNodeDescriptor> getComplexEventPropertyComplexEventPropertyComplexEventPropertiesCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ComplexEventProperty modelElement = (ComplexEventProperty) containerView.getElement();
		LinkedList<CepappNodeDescriptor> result = new LinkedList<CepappNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComplexEventProperties().iterator(); it.hasNext();) {
			ComplexEventProperty childElement = (ComplexEventProperty) it.next();
			int visualID = CepappVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ComplexEventProperty2EditPart.VISUAL_ID) {
				result.add(new CepappNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CepappNodeDescriptor> getComplexEventPropertyComplexEventPropertyComplexEventPropertiesCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ComplexEventProperty modelElement = (ComplexEventProperty) containerView.getElement();
		LinkedList<CepappNodeDescriptor> result = new LinkedList<CepappNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComplexEventProperties().iterator(); it.hasNext();) {
			ComplexEventProperty childElement = (ComplexEventProperty) it.next();
			int visualID = CepappVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ComplexEventProperty2EditPart.VISUAL_ID) {
				result.add(new CepappNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CepappLinkDescriptor> getContainedLinks(View view) {
		switch (CepappVisualIDRegistry.getVisualID(view)) {
		case CEPAppEditPart.VISUAL_ID:
			return getCEPApp_1000ContainedLinks(view);
		case SinkMongoDBEditPart.VISUAL_ID:
			return getSinkMongoDB_2019ContainedLinks(view);
		case InMemoryInputEditPart.VISUAL_ID:
			return getInMemoryInput_2021ContainedLinks(view);
		case SourceEmailEditPart.VISUAL_ID:
			return getSourceEmail_2022ContainedLinks(view);
		case InputFileEditPart.VISUAL_ID:
			return getInputFile_2001ContainedLinks(view);
		case SourceHttpEditPart.VISUAL_ID:
			return getSourceHttp_2003ContainedLinks(view);
		case SourceMqttEditPart.VISUAL_ID:
			return getSourceMqtt_2004ContainedLinks(view);
		case InMemoryOutputEditPart.VISUAL_ID:
			return getInMemoryOutput_2023ContainedLinks(view);
		case SinkEmailEditPart.VISUAL_ID:
			return getSinkEmail_2024ContainedLinks(view);
		case OutputFileEditPart.VISUAL_ID:
			return getOutputFile_2005ContainedLinks(view);
		case SinkHttpEditPart.VISUAL_ID:
			return getSinkHttp_2007ContainedLinks(view);
		case SinkMqttEditPart.VISUAL_ID:
			return getSinkMqtt_2008ContainedLinks(view);
		case EventEditPart.VISUAL_ID:
			return getEvent_2009ContainedLinks(view);
		case ComplexEventEditPart.VISUAL_ID:
			return getComplexEvent_2010ContainedLinks(view);
		case EventPropertyEditPart.VISUAL_ID:
			return getEventProperty_3001ContainedLinks(view);
		case EventProperty2EditPart.VISUAL_ID:
			return getEventProperty_3002ContainedLinks(view);
		case ComplexEventPropertyEditPart.VISUAL_ID:
			return getComplexEventProperty_3003ContainedLinks(view);
		case ComplexEventProperty2EditPart.VISUAL_ID:
			return getComplexEventProperty_3004ContainedLinks(view);
		case LinkEditPart.VISUAL_ID:
			return getLink_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CepappLinkDescriptor> getIncomingLinks(View view) {
		switch (CepappVisualIDRegistry.getVisualID(view)) {
		case SinkMongoDBEditPart.VISUAL_ID:
			return getSinkMongoDB_2019IncomingLinks(view);
		case InMemoryInputEditPart.VISUAL_ID:
			return getInMemoryInput_2021IncomingLinks(view);
		case SourceEmailEditPart.VISUAL_ID:
			return getSourceEmail_2022IncomingLinks(view);
		case InputFileEditPart.VISUAL_ID:
			return getInputFile_2001IncomingLinks(view);
		case SourceHttpEditPart.VISUAL_ID:
			return getSourceHttp_2003IncomingLinks(view);
		case SourceMqttEditPart.VISUAL_ID:
			return getSourceMqtt_2004IncomingLinks(view);
		case InMemoryOutputEditPart.VISUAL_ID:
			return getInMemoryOutput_2023IncomingLinks(view);
		case SinkEmailEditPart.VISUAL_ID:
			return getSinkEmail_2024IncomingLinks(view);
		case OutputFileEditPart.VISUAL_ID:
			return getOutputFile_2005IncomingLinks(view);
		case SinkHttpEditPart.VISUAL_ID:
			return getSinkHttp_2007IncomingLinks(view);
		case SinkMqttEditPart.VISUAL_ID:
			return getSinkMqtt_2008IncomingLinks(view);
		case EventEditPart.VISUAL_ID:
			return getEvent_2009IncomingLinks(view);
		case ComplexEventEditPart.VISUAL_ID:
			return getComplexEvent_2010IncomingLinks(view);
		case EventPropertyEditPart.VISUAL_ID:
			return getEventProperty_3001IncomingLinks(view);
		case EventProperty2EditPart.VISUAL_ID:
			return getEventProperty_3002IncomingLinks(view);
		case ComplexEventPropertyEditPart.VISUAL_ID:
			return getComplexEventProperty_3003IncomingLinks(view);
		case ComplexEventProperty2EditPart.VISUAL_ID:
			return getComplexEventProperty_3004IncomingLinks(view);
		case LinkEditPart.VISUAL_ID:
			return getLink_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CepappLinkDescriptor> getOutgoingLinks(View view) {
		switch (CepappVisualIDRegistry.getVisualID(view)) {
		case SinkMongoDBEditPart.VISUAL_ID:
			return getSinkMongoDB_2019OutgoingLinks(view);
		case InMemoryInputEditPart.VISUAL_ID:
			return getInMemoryInput_2021OutgoingLinks(view);
		case SourceEmailEditPart.VISUAL_ID:
			return getSourceEmail_2022OutgoingLinks(view);
		case InputFileEditPart.VISUAL_ID:
			return getInputFile_2001OutgoingLinks(view);
		case SourceHttpEditPart.VISUAL_ID:
			return getSourceHttp_2003OutgoingLinks(view);
		case SourceMqttEditPart.VISUAL_ID:
			return getSourceMqtt_2004OutgoingLinks(view);
		case InMemoryOutputEditPart.VISUAL_ID:
			return getInMemoryOutput_2023OutgoingLinks(view);
		case SinkEmailEditPart.VISUAL_ID:
			return getSinkEmail_2024OutgoingLinks(view);
		case OutputFileEditPart.VISUAL_ID:
			return getOutputFile_2005OutgoingLinks(view);
		case SinkHttpEditPart.VISUAL_ID:
			return getSinkHttp_2007OutgoingLinks(view);
		case SinkMqttEditPart.VISUAL_ID:
			return getSinkMqtt_2008OutgoingLinks(view);
		case EventEditPart.VISUAL_ID:
			return getEvent_2009OutgoingLinks(view);
		case ComplexEventEditPart.VISUAL_ID:
			return getComplexEvent_2010OutgoingLinks(view);
		case EventPropertyEditPart.VISUAL_ID:
			return getEventProperty_3001OutgoingLinks(view);
		case EventProperty2EditPart.VISUAL_ID:
			return getEventProperty_3002OutgoingLinks(view);
		case ComplexEventPropertyEditPart.VISUAL_ID:
			return getComplexEventProperty_3003OutgoingLinks(view);
		case ComplexEventProperty2EditPart.VISUAL_ID:
			return getComplexEventProperty_3004OutgoingLinks(view);
		case LinkEditPart.VISUAL_ID:
			return getLink_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getCEPApp_1000ContainedLinks(View view) {
		CEPApp modelElement = (CEPApp) view.getElement();
		LinkedList<CepappLinkDescriptor> result = new LinkedList<CepappLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getSinkMongoDB_2019ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getInMemoryInput_2021ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getSourceEmail_2022ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getInputFile_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getSourceHttp_2003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getSourceMqtt_2004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getInMemoryOutput_2023ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getSinkEmail_2024ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getOutputFile_2005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getSinkHttp_2007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getSinkMqtt_2008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getEvent_2009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getComplexEvent_2010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getEventProperty_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getEventProperty_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CepappLinkDescriptor> getComplexEventProperty_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CepappLinkDescriptor> getComplexEventProperty_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getLink_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getSinkMongoDB_2019IncomingLinks(View view) {
		SinkMongoDB modelElement = (SinkMongoDB) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CepappLinkDescriptor> result = new LinkedList<CepappLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getInMemoryInput_2021IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getSourceEmail_2022IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getInputFile_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getSourceHttp_2003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getSourceMqtt_2004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getInMemoryOutput_2023IncomingLinks(View view) {
		InMemoryOutput modelElement = (InMemoryOutput) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CepappLinkDescriptor> result = new LinkedList<CepappLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getSinkEmail_2024IncomingLinks(View view) {
		SinkEmail modelElement = (SinkEmail) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CepappLinkDescriptor> result = new LinkedList<CepappLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getOutputFile_2005IncomingLinks(View view) {
		OutputFile modelElement = (OutputFile) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CepappLinkDescriptor> result = new LinkedList<CepappLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getSinkHttp_2007IncomingLinks(View view) {
		SinkHttp modelElement = (SinkHttp) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CepappLinkDescriptor> result = new LinkedList<CepappLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getSinkMqtt_2008IncomingLinks(View view) {
		SinkMqtt modelElement = (SinkMqtt) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CepappLinkDescriptor> result = new LinkedList<CepappLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getEvent_2009IncomingLinks(View view) {
		Event modelElement = (Event) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CepappLinkDescriptor> result = new LinkedList<CepappLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getComplexEvent_2010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getEventProperty_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getEventProperty_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CepappLinkDescriptor> getComplexEventProperty_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CepappLinkDescriptor> getComplexEventProperty_3004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getLink_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getSinkMongoDB_2019OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getInMemoryInput_2021OutgoingLinks(View view) {
		InMemoryInput modelElement = (InMemoryInput) view.getElement();
		LinkedList<CepappLinkDescriptor> result = new LinkedList<CepappLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getSourceEmail_2022OutgoingLinks(View view) {
		SourceEmail modelElement = (SourceEmail) view.getElement();
		LinkedList<CepappLinkDescriptor> result = new LinkedList<CepappLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getInputFile_2001OutgoingLinks(View view) {
		InputFile modelElement = (InputFile) view.getElement();
		LinkedList<CepappLinkDescriptor> result = new LinkedList<CepappLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getSourceHttp_2003OutgoingLinks(View view) {
		SourceHttp modelElement = (SourceHttp) view.getElement();
		LinkedList<CepappLinkDescriptor> result = new LinkedList<CepappLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getSourceMqtt_2004OutgoingLinks(View view) {
		SourceMqtt modelElement = (SourceMqtt) view.getElement();
		LinkedList<CepappLinkDescriptor> result = new LinkedList<CepappLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getInMemoryOutput_2023OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getSinkEmail_2024OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getOutputFile_2005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getSinkHttp_2007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getSinkMqtt_2008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getEvent_2009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getComplexEvent_2010OutgoingLinks(View view) {
		ComplexEvent modelElement = (ComplexEvent) view.getElement();
		LinkedList<CepappLinkDescriptor> result = new LinkedList<CepappLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getEventProperty_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getEventProperty_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CepappLinkDescriptor> getComplexEventProperty_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CepappLinkDescriptor> getComplexEventProperty_3004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CepappLinkDescriptor> getLink_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<CepappLinkDescriptor> getContainedTypeModelFacetLinks_Link_4001(CEPApp container) {
		LinkedList<CepappLinkDescriptor> result = new LinkedList<CepappLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Link) {
				continue;
			}
			Link link = (Link) linkObject;
			if (LinkEditPart.VISUAL_ID != CepappVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Destination dst = link.getDestination();
			Origin src = link.getOrigin();
			result.add(new CepappLinkDescriptor(src, dst, link, CepappElementTypes.Link_4001, LinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CepappLinkDescriptor> getIncomingTypeModelFacetLinks_Link_4001(Destination target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CepappLinkDescriptor> result = new LinkedList<CepappLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != CepappPackage.eINSTANCE.getLink_Destination()
					|| false == setting.getEObject() instanceof Link) {
				continue;
			}
			Link link = (Link) setting.getEObject();
			if (LinkEditPart.VISUAL_ID != CepappVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Origin src = link.getOrigin();
			result.add(
					new CepappLinkDescriptor(src, target, link, CepappElementTypes.Link_4001, LinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CepappLinkDescriptor> getOutgoingTypeModelFacetLinks_Link_4001(Origin source) {
		CEPApp container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof CEPApp) {
				container = (CEPApp) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<CepappLinkDescriptor> result = new LinkedList<CepappLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Link) {
				continue;
			}
			Link link = (Link) linkObject;
			if (LinkEditPart.VISUAL_ID != CepappVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Destination dst = link.getDestination();
			Origin src = link.getOrigin();
			if (src != source) {
				continue;
			}
			result.add(new CepappLinkDescriptor(src, dst, link, CepappElementTypes.Link_4001, LinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated NOT
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * Override annotation has been removed.
		 * @generated NOT
		 */
		public List<CepappNodeDescriptor> getSemanticChildren(View view) {
			return CepappDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * Override annotation has been removed.
		 * @generated NOT
		 */
		public List<CepappLinkDescriptor> getContainedLinks(View view) {
			return CepappDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * Override annotation has been removed.
		 * @generated NOT
		 */
		public List<CepappLinkDescriptor> getIncomingLinks(View view) {
			return CepappDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * Override annotation has been removed.
		 * @generated NOT
		 */
		public List<CepappLinkDescriptor> getOutgoingLinks(View view) {
			return CepappDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
