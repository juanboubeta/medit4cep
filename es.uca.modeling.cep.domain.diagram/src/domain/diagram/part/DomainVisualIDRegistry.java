/*
 * 
 */
package domain.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import domain.CEPDomain;
import domain.DomainPackage;
import domain.diagram.edit.parts.CEPDomainEditPart;
import domain.diagram.edit.parts.EventEditPart;
import domain.diagram.edit.parts.EventEventEventPropertiesCompartmentEditPart;
import domain.diagram.edit.parts.EventProperty2EditPart;
import domain.diagram.edit.parts.EventPropertyEditPart;
import domain.diagram.edit.parts.EventPropertyEventPropertyEventPropertiesCompartment2EditPart;
import domain.diagram.edit.parts.EventPropertyEventPropertyEventPropertiesCompartmentEditPart;
import domain.diagram.edit.parts.EventPropertyName2EditPart;
import domain.diagram.edit.parts.EventPropertyNameEditPart;
import domain.diagram.edit.parts.EventPropertyNameType2EditPart;
import domain.diagram.edit.parts.EventPropertyNameTypeEditPart;
import domain.diagram.edit.parts.EventTypeNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class DomainVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "es.uca.modeling.cep.domain.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (CEPDomainEditPart.MODEL_ID.equals(view.getType())) {
				return CEPDomainEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return domain.diagram.part.DomainVisualIDRegistry.getVisualID(view.getType());
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
				DomainDiagramEditorPlugin.getInstance()
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
		if (DomainPackage.eINSTANCE.getCEPDomain().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((CEPDomain) domainElement)) {
			return CEPDomainEditPart.VISUAL_ID;
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
		String containerModelID = domain.diagram.part.DomainVisualIDRegistry.getModelID(containerView);
		if (!CEPDomainEditPart.MODEL_ID.equals(containerModelID) && !"domain".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (CEPDomainEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = domain.diagram.part.DomainVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CEPDomainEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case CEPDomainEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getEvent().isSuperTypeOf(domainElement.eClass())) {
				return EventEditPart.VISUAL_ID;
			}
			break;
		case EventEventEventPropertiesCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getEventProperty().isSuperTypeOf(domainElement.eClass())) {
				return EventPropertyEditPart.VISUAL_ID;
			}
			break;
		case EventPropertyEventPropertyEventPropertiesCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getEventProperty().isSuperTypeOf(domainElement.eClass())) {
				return EventProperty2EditPart.VISUAL_ID;
			}
			break;
		case EventPropertyEventPropertyEventPropertiesCompartment2EditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getEventProperty().isSuperTypeOf(domainElement.eClass())) {
				return EventProperty2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = domain.diagram.part.DomainVisualIDRegistry.getModelID(containerView);
		if (!CEPDomainEditPart.MODEL_ID.equals(containerModelID) && !"domain".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (CEPDomainEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = domain.diagram.part.DomainVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CEPDomainEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case CEPDomainEditPart.VISUAL_ID:
			if (EventEditPart.VISUAL_ID == nodeVisualID) {
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
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(CEPDomain element) {
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
		case CEPDomainEditPart.VISUAL_ID:
			return false;
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
			return domain.diagram.part.DomainVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return domain.diagram.part.DomainVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return domain.diagram.part.DomainVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return domain.diagram.part.DomainVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return domain.diagram.part.DomainVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return domain.diagram.part.DomainVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
