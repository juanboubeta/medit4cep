/*
 * 
 */
package cepapp.diagram.providers;

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

import cepapp.CepappPackage;
import cepapp.diagram.edit.parts.CEPAppEditPart;
import cepapp.diagram.edit.parts.ComplexEventEditPart;
import cepapp.diagram.edit.parts.ComplexEventProperty2EditPart;
import cepapp.diagram.edit.parts.ComplexEventPropertyEditPart;
import cepapp.diagram.edit.parts.EventEditPart;
import cepapp.diagram.edit.parts.EventProperty2EditPart;
import cepapp.diagram.edit.parts.EventPropertyEditPart;
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
import cepapp.diagram.part.CepappDiagramEditorPlugin;

/**
 * @generated
 */
public class CepappElementTypes {

	/**
	* @generated
	*/
	private CepappElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			CepappDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType CEPApp_1000 = getElementType("es.uca.modeling.cep.app.diagram.CEPApp_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SinkMongoDB_2019 = getElementType(
			"es.uca.modeling.cep.app.diagram.SinkMongoDB_2019"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InMemoryInput_2021 = getElementType(
			"es.uca.modeling.cep.app.diagram.InMemoryInput_2021"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SourceEmail_2022 = getElementType(
			"es.uca.modeling.cep.app.diagram.SourceEmail_2022"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InputFile_2001 = getElementType("es.uca.modeling.cep.app.diagram.InputFile_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SourceHttp_2003 = getElementType(
			"es.uca.modeling.cep.app.diagram.SourceHttp_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SourceMqtt_2004 = getElementType(
			"es.uca.modeling.cep.app.diagram.SourceMqtt_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InMemoryOutput_2023 = getElementType(
			"es.uca.modeling.cep.app.diagram.InMemoryOutput_2023"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SinkEmail_2024 = getElementType("es.uca.modeling.cep.app.diagram.SinkEmail_2024"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType OutputFile_2005 = getElementType(
			"es.uca.modeling.cep.app.diagram.OutputFile_2005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SinkHttp_2007 = getElementType("es.uca.modeling.cep.app.diagram.SinkHttp_2007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SinkMqtt_2008 = getElementType("es.uca.modeling.cep.app.diagram.SinkMqtt_2008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Event_2009 = getElementType("es.uca.modeling.cep.app.diagram.Event_2009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ComplexEvent_2010 = getElementType(
			"es.uca.modeling.cep.app.diagram.ComplexEvent_2010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType EventProperty_3001 = getElementType(
			"es.uca.modeling.cep.app.diagram.EventProperty_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType EventProperty_3002 = getElementType(
			"es.uca.modeling.cep.app.diagram.EventProperty_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ComplexEventProperty_3003 = getElementType(
			"es.uca.modeling.cep.app.diagram.ComplexEventProperty_3003"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType ComplexEventProperty_3004 = getElementType(
			"es.uca.modeling.cep.app.diagram.ComplexEventProperty_3004"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Link_4001 = getElementType("es.uca.modeling.cep.app.diagram.Link_4001"); //$NON-NLS-1$

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

			elements.put(CEPApp_1000, CepappPackage.eINSTANCE.getCEPApp());

			elements.put(SinkMongoDB_2019, CepappPackage.eINSTANCE.getSinkMongoDB());

			elements.put(InMemoryInput_2021, CepappPackage.eINSTANCE.getInMemoryInput());

			elements.put(SourceEmail_2022, CepappPackage.eINSTANCE.getSourceEmail());

			elements.put(InputFile_2001, CepappPackage.eINSTANCE.getInputFile());

			elements.put(SourceHttp_2003, CepappPackage.eINSTANCE.getSourceHttp());

			elements.put(SourceMqtt_2004, CepappPackage.eINSTANCE.getSourceMqtt());

			elements.put(InMemoryOutput_2023, CepappPackage.eINSTANCE.getInMemoryOutput());

			elements.put(SinkEmail_2024, CepappPackage.eINSTANCE.getSinkEmail());

			elements.put(OutputFile_2005, CepappPackage.eINSTANCE.getOutputFile());

			elements.put(SinkHttp_2007, CepappPackage.eINSTANCE.getSinkHttp());

			elements.put(SinkMqtt_2008, CepappPackage.eINSTANCE.getSinkMqtt());

			elements.put(Event_2009, CepappPackage.eINSTANCE.getEvent());

			elements.put(ComplexEvent_2010, CepappPackage.eINSTANCE.getComplexEvent());

			elements.put(EventProperty_3001, CepappPackage.eINSTANCE.getEventProperty());

			elements.put(EventProperty_3002, CepappPackage.eINSTANCE.getEventProperty());

			elements.put(ComplexEventProperty_3003, CepappPackage.eINSTANCE.getComplexEventProperty());

			elements.put(ComplexEventProperty_3004, CepappPackage.eINSTANCE.getComplexEventProperty());

			elements.put(Link_4001, CepappPackage.eINSTANCE.getLink());
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
			KNOWN_ELEMENT_TYPES.add(CEPApp_1000);
			KNOWN_ELEMENT_TYPES.add(SinkMongoDB_2019);
			KNOWN_ELEMENT_TYPES.add(InMemoryInput_2021);
			KNOWN_ELEMENT_TYPES.add(SourceEmail_2022);
			KNOWN_ELEMENT_TYPES.add(InputFile_2001);
			KNOWN_ELEMENT_TYPES.add(SourceHttp_2003);
			KNOWN_ELEMENT_TYPES.add(SourceMqtt_2004);
			KNOWN_ELEMENT_TYPES.add(InMemoryOutput_2023);
			KNOWN_ELEMENT_TYPES.add(SinkEmail_2024);
			KNOWN_ELEMENT_TYPES.add(OutputFile_2005);
			KNOWN_ELEMENT_TYPES.add(SinkHttp_2007);
			KNOWN_ELEMENT_TYPES.add(SinkMqtt_2008);
			KNOWN_ELEMENT_TYPES.add(Event_2009);
			KNOWN_ELEMENT_TYPES.add(ComplexEvent_2010);
			KNOWN_ELEMENT_TYPES.add(EventProperty_3001);
			KNOWN_ELEMENT_TYPES.add(EventProperty_3002);
			KNOWN_ELEMENT_TYPES.add(ComplexEventProperty_3003);
			KNOWN_ELEMENT_TYPES.add(ComplexEventProperty_3004);
			KNOWN_ELEMENT_TYPES.add(Link_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case CEPAppEditPart.VISUAL_ID:
			return CEPApp_1000;
		case SinkMongoDBEditPart.VISUAL_ID:
			return SinkMongoDB_2019;
		case InMemoryInputEditPart.VISUAL_ID:
			return InMemoryInput_2021;
		case SourceEmailEditPart.VISUAL_ID:
			return SourceEmail_2022;
		case InputFileEditPart.VISUAL_ID:
			return InputFile_2001;
		case SourceHttpEditPart.VISUAL_ID:
			return SourceHttp_2003;
		case SourceMqttEditPart.VISUAL_ID:
			return SourceMqtt_2004;
		case InMemoryOutputEditPart.VISUAL_ID:
			return InMemoryOutput_2023;
		case SinkEmailEditPart.VISUAL_ID:
			return SinkEmail_2024;
		case OutputFileEditPart.VISUAL_ID:
			return OutputFile_2005;
		case SinkHttpEditPart.VISUAL_ID:
			return SinkHttp_2007;
		case SinkMqttEditPart.VISUAL_ID:
			return SinkMqtt_2008;
		case EventEditPart.VISUAL_ID:
			return Event_2009;
		case ComplexEventEditPart.VISUAL_ID:
			return ComplexEvent_2010;
		case EventPropertyEditPart.VISUAL_ID:
			return EventProperty_3001;
		case EventProperty2EditPart.VISUAL_ID:
			return EventProperty_3002;
		case ComplexEventPropertyEditPart.VISUAL_ID:
			return ComplexEventProperty_3003;
		case ComplexEventProperty2EditPart.VISUAL_ID:
			return ComplexEventProperty_3004;
		case LinkEditPart.VISUAL_ID:
			return Link_4001;
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
			return cepapp.diagram.providers.CepappElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return cepapp.diagram.providers.CepappElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return cepapp.diagram.providers.CepappElementTypes.getElement(elementTypeAdapter);
		}
	};

}
