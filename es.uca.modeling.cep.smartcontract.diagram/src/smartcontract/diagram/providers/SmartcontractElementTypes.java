/*
 * 
 */
package smartcontract.diagram.providers;

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

import smartcontract.SmartcontractPackage;
import smartcontract.diagram.edit.parts.ContractFunctionEditPart;
import smartcontract.diagram.edit.parts.InputParameterEditPart;
import smartcontract.diagram.edit.parts.OutputParameterEditPart;
import smartcontract.diagram.edit.parts.SmartContractEditPart;
import smartcontract.diagram.edit.parts.SmartContractsEditPart;
import smartcontract.diagram.part.SmartcontractDiagramEditorPlugin;

/**
 * @generated
 */
public class SmartcontractElementTypes {

	/**
	* @generated
	*/
	private SmartcontractElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			SmartcontractDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType SmartContracts_1000 = getElementType(
			"es.uca.modeling.cep.smartcontract.diagram.SmartContracts_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SmartContract_2002 = getElementType(
			"es.uca.modeling.cep.smartcontract.diagram.SmartContract_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ContractFunction_3003 = getElementType(
			"es.uca.modeling.cep.smartcontract.diagram.ContractFunction_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InputParameter_3008 = getElementType(
			"es.uca.modeling.cep.smartcontract.diagram.InputParameter_3008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType OutputParameter_3007 = getElementType(
			"es.uca.modeling.cep.smartcontract.diagram.OutputParameter_3007"); //$NON-NLS-1$

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

			elements.put(SmartContracts_1000, SmartcontractPackage.eINSTANCE.getSmartContracts());

			elements.put(SmartContract_2002, SmartcontractPackage.eINSTANCE.getSmartContract());

			elements.put(ContractFunction_3003, SmartcontractPackage.eINSTANCE.getContractFunction());

			elements.put(InputParameter_3008, SmartcontractPackage.eINSTANCE.getInputParameter());

			elements.put(OutputParameter_3007, SmartcontractPackage.eINSTANCE.getOutputParameter());
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
			KNOWN_ELEMENT_TYPES.add(SmartContracts_1000);
			KNOWN_ELEMENT_TYPES.add(SmartContract_2002);
			KNOWN_ELEMENT_TYPES.add(ContractFunction_3003);
			KNOWN_ELEMENT_TYPES.add(InputParameter_3008);
			KNOWN_ELEMENT_TYPES.add(OutputParameter_3007);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case SmartContractsEditPart.VISUAL_ID:
			return SmartContracts_1000;
		case SmartContractEditPart.VISUAL_ID:
			return SmartContract_2002;
		case ContractFunctionEditPart.VISUAL_ID:
			return ContractFunction_3003;
		case InputParameterEditPart.VISUAL_ID:
			return InputParameter_3008;
		case OutputParameterEditPart.VISUAL_ID:
			return OutputParameter_3007;
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
			return smartcontract.diagram.providers.SmartcontractElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return smartcontract.diagram.providers.SmartcontractElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return smartcontract.diagram.providers.SmartcontractElementTypes.getElement(elementTypeAdapter);
		}
	};

}
