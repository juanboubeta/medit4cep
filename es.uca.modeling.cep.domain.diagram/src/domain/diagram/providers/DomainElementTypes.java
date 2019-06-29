/*
 * 
 */
package domain.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import domain.DomainPackage;
import domain.diagram.edit.parts.CEPDomainEditPart;
import domain.diagram.edit.parts.EventEditPart;
import domain.diagram.edit.parts.EventProperty2EditPart;
import domain.diagram.edit.parts.EventPropertyEditPart;
import domain.diagram.part.DomainDiagramEditorPlugin;

/**
 * @generated
 */
public class DomainElementTypes {

	/**
	 * @generated
	 */
	private DomainElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			DomainDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType CEPDomain_1000 = getElementType(
			"es.uca.modeling.cep.domain.diagram.CEPDomain_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Event_2001 = getElementType("es.uca.modeling.cep.domain.diagram.Event_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EventProperty_3001 = getElementType(
			"es.uca.modeling.cep.domain.diagram.EventProperty_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EventProperty_3002 = getElementType(
			"es.uca.modeling.cep.domain.diagram.EventProperty_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(CEPDomain_1000, DomainPackage.eINSTANCE.getCEPDomain());

			elements.put(Event_2001, DomainPackage.eINSTANCE.getEvent());

			elements.put(EventProperty_3001, DomainPackage.eINSTANCE.getEventProperty());

			elements.put(EventProperty_3002, DomainPackage.eINSTANCE.getEventProperty());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(CEPDomain_1000);
			KNOWN_ELEMENT_TYPES.add(Event_2001);
			KNOWN_ELEMENT_TYPES.add(EventProperty_3001);
			KNOWN_ELEMENT_TYPES.add(EventProperty_3002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case CEPDomainEditPart.VISUAL_ID:
			return CEPDomain_1000;
		case EventEditPart.VISUAL_ID:
			return Event_2001;
		case EventPropertyEditPart.VISUAL_ID:
			return EventProperty_3001;
		case EventProperty2EditPart.VISUAL_ID:
			return EventProperty_3002;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return domain.diagram.providers.DomainElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return domain.diagram.providers.DomainElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return domain.diagram.providers.DomainElementTypes.getElement(elementTypeAdapter);
		}
	};

}
