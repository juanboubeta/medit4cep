/*
* 
*/
package cepapp.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import cepapp.CEPApp;
import cepapp.CepappPackage;
import cepapp.diagram.edit.parts.CEPAppEditPart;
import cepapp.diagram.edit.parts.ComplexEventComplexEventComplexEventPropertiesCompartmentEditPart;
import cepapp.diagram.edit.parts.ComplexEventEditPart;
import cepapp.diagram.edit.parts.ComplexEventProperty2EditPart;
import cepapp.diagram.edit.parts.ComplexEventPropertyComplexEventPropertyComplexEventPropertiesCompartment2EditPart;
import cepapp.diagram.edit.parts.ComplexEventPropertyComplexEventPropertyComplexEventPropertiesCompartmentEditPart;
import cepapp.diagram.edit.parts.ComplexEventPropertyEditPart;
import cepapp.diagram.edit.parts.ComplexEventPropertyName2EditPart;
import cepapp.diagram.edit.parts.ComplexEventPropertyNameEditPart;
import cepapp.diagram.edit.parts.ComplexEventTypeNameEditPart;
import cepapp.diagram.edit.parts.EventEditPart;
import cepapp.diagram.edit.parts.EventEventEventPropertiesCompartmentEditPart;
import cepapp.diagram.edit.parts.EventProperty2EditPart;
import cepapp.diagram.edit.parts.EventPropertyEditPart;
import cepapp.diagram.edit.parts.EventPropertyEventPropertyEventPropertiesCompartment2EditPart;
import cepapp.diagram.edit.parts.EventPropertyEventPropertyEventPropertiesCompartmentEditPart;
import cepapp.diagram.edit.parts.EventPropertyName2EditPart;
import cepapp.diagram.edit.parts.EventPropertyNameEditPart;
import cepapp.diagram.edit.parts.EventTypeNameEditPart;
import cepapp.diagram.edit.parts.InMemoryInputEditPart;
import cepapp.diagram.edit.parts.InMemoryOutputEditPart;
import cepapp.diagram.edit.parts.InputFileEditPart;
import cepapp.diagram.edit.parts.LinkEditPart;
import cepapp.diagram.edit.parts.LinkOrderEditPart;
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

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class CepappVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "es.uca.modeling.cep.app.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (CEPAppEditPart.MODEL_ID.equals(view.getType())) {
				return CEPAppEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return cepapp.diagram.part.CepappVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				CepappDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (CepappPackage.eINSTANCE.getCEPApp().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((CEPApp) domainElement)) {
			return CEPAppEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = cepapp.diagram.part.CepappVisualIDRegistry.getModelID(containerView);
		if (!CEPAppEditPart.MODEL_ID.equals(containerModelID) && !"cepapp".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (CEPAppEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = cepapp.diagram.part.CepappVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CEPAppEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case CEPAppEditPart.VISUAL_ID:
			if (CepappPackage.eINSTANCE.getInMemoryInput().isSuperTypeOf(domainElement.eClass())) {
				return InMemoryInputEditPart.VISUAL_ID;
			}
			if (CepappPackage.eINSTANCE.getInputFile().isSuperTypeOf(domainElement.eClass())) {
				return InputFileEditPart.VISUAL_ID;
			}
			if (CepappPackage.eINSTANCE.getSourceMqtt().isSuperTypeOf(domainElement.eClass())) {
				return SourceMqttEditPart.VISUAL_ID;
			}
			if (CepappPackage.eINSTANCE.getInMemoryOutput().isSuperTypeOf(domainElement.eClass())) {
				return InMemoryOutputEditPart.VISUAL_ID;
			}
			if (CepappPackage.eINSTANCE.getOutputFile().isSuperTypeOf(domainElement.eClass())) {
				return OutputFileEditPart.VISUAL_ID;
			}
			if (CepappPackage.eINSTANCE.getSinkMqtt().isSuperTypeOf(domainElement.eClass())) {
				return SinkMqttEditPart.VISUAL_ID;
			}
			if (CepappPackage.eINSTANCE.getEvent().isSuperTypeOf(domainElement.eClass())) {
				return EventEditPart.VISUAL_ID;
			}
			if (CepappPackage.eINSTANCE.getComplexEvent().isSuperTypeOf(domainElement.eClass())) {
				return ComplexEventEditPart.VISUAL_ID;
			}
			break;
		case EventEventEventPropertiesCompartmentEditPart.VISUAL_ID:
			if (CepappPackage.eINSTANCE.getEventProperty().isSuperTypeOf(domainElement.eClass())) {
				return EventPropertyEditPart.VISUAL_ID;
			}
			break;
		case EventPropertyEventPropertyEventPropertiesCompartmentEditPart.VISUAL_ID:
			if (CepappPackage.eINSTANCE.getEventProperty().isSuperTypeOf(domainElement.eClass())) {
				return EventProperty2EditPart.VISUAL_ID;
			}
			break;
		case EventPropertyEventPropertyEventPropertiesCompartment2EditPart.VISUAL_ID:
			if (CepappPackage.eINSTANCE.getEventProperty().isSuperTypeOf(domainElement.eClass())) {
				return EventProperty2EditPart.VISUAL_ID;
			}
			break;
		case ComplexEventComplexEventComplexEventPropertiesCompartmentEditPart.VISUAL_ID:
			if (CepappPackage.eINSTANCE.getComplexEventProperty().isSuperTypeOf(domainElement.eClass())) {
				return ComplexEventPropertyEditPart.VISUAL_ID;
			}
			break;
		case ComplexEventPropertyComplexEventPropertyComplexEventPropertiesCompartmentEditPart.VISUAL_ID:
			if (CepappPackage.eINSTANCE.getComplexEventProperty().isSuperTypeOf(domainElement.eClass())) {
				return ComplexEventProperty2EditPart.VISUAL_ID;
			}
			break;
		case ComplexEventPropertyComplexEventPropertyComplexEventPropertiesCompartment2EditPart.VISUAL_ID:
			if (CepappPackage.eINSTANCE.getComplexEventProperty().isSuperTypeOf(domainElement.eClass())) {
				return ComplexEventProperty2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = cepapp.diagram.part.CepappVisualIDRegistry.getModelID(containerView);
		if (!CEPAppEditPart.MODEL_ID.equals(containerModelID) && !"cepapp".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (CEPAppEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = cepapp.diagram.part.CepappVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CEPAppEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case CEPAppEditPart.VISUAL_ID:
			if (InMemoryInputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputFileEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SourceMqttEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InMemoryOutputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputFileEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SinkMqttEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComplexEventEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventEditPart.VISUAL_ID:
			if (EventTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventEventEventPropertiesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComplexEventEditPart.VISUAL_ID:
			if (ComplexEventTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComplexEventComplexEventComplexEventPropertiesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventPropertyEditPart.VISUAL_ID:
			if (EventPropertyNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventPropertyEventPropertyEventPropertiesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventProperty2EditPart.VISUAL_ID:
			if (EventPropertyName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventPropertyEventPropertyEventPropertiesCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComplexEventPropertyEditPart.VISUAL_ID:
			if (ComplexEventPropertyNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComplexEventPropertyComplexEventPropertyComplexEventPropertiesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComplexEventProperty2EditPart.VISUAL_ID:
			if (ComplexEventPropertyName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComplexEventPropertyComplexEventPropertyComplexEventPropertiesCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventEventEventPropertiesCompartmentEditPart.VISUAL_ID:
			if (EventPropertyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventPropertyEventPropertyEventPropertiesCompartmentEditPart.VISUAL_ID:
			if (EventProperty2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventPropertyEventPropertyEventPropertiesCompartment2EditPart.VISUAL_ID:
			if (EventProperty2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComplexEventComplexEventComplexEventPropertiesCompartmentEditPart.VISUAL_ID:
			if (ComplexEventPropertyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComplexEventPropertyComplexEventPropertyComplexEventPropertiesCompartmentEditPart.VISUAL_ID:
			if (ComplexEventProperty2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComplexEventPropertyComplexEventPropertyComplexEventPropertiesCompartment2EditPart.VISUAL_ID:
			if (ComplexEventProperty2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (CepappPackage.eINSTANCE.getLink().isSuperTypeOf(domainElement.eClass())) {
			return LinkEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(CEPApp element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case EventEventEventPropertiesCompartmentEditPart.VISUAL_ID:
		case EventPropertyEventPropertyEventPropertiesCompartmentEditPart.VISUAL_ID:
		case EventPropertyEventPropertyEventPropertiesCompartment2EditPart.VISUAL_ID:
		case ComplexEventComplexEventComplexEventPropertiesCompartmentEditPart.VISUAL_ID:
		case ComplexEventPropertyComplexEventPropertyComplexEventPropertiesCompartmentEditPart.VISUAL_ID:
		case ComplexEventPropertyComplexEventPropertyComplexEventPropertiesCompartment2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case CEPAppEditPart.VISUAL_ID:
			return false;
		case InputFileEditPart.VISUAL_ID:
		case SourceMqttEditPart.VISUAL_ID:
		case OutputFileEditPart.VISUAL_ID:
		case SinkMqttEditPart.VISUAL_ID:
		case InMemoryInputEditPart.VISUAL_ID:
		case InMemoryOutputEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return cepapp.diagram.part.CepappVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return cepapp.diagram.part.CepappVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return cepapp.diagram.part.CepappVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return cepapp.diagram.part.CepappVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return cepapp.diagram.part.CepappVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return cepapp.diagram.part.CepappVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
