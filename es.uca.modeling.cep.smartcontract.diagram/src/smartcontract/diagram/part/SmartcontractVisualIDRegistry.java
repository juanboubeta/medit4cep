/*
* 
*/
package smartcontract.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import smartcontract.SmartContracts;
import smartcontract.SmartcontractPackage;
import smartcontract.diagram.edit.parts.ConstructorParameterEditPart;
import smartcontract.diagram.edit.parts.ConstructorParameterNameEditPart;
import smartcontract.diagram.edit.parts.ContractFunctionContractFunctionInputParametersFunctionCompartmentEditPart;
import smartcontract.diagram.edit.parts.ContractFunctionContractFunctionOutputParametersFunctionCompartmentEditPart;
import smartcontract.diagram.edit.parts.ContractFunctionEditPart;
import smartcontract.diagram.edit.parts.ContractFunctionNameEditPart;
import smartcontract.diagram.edit.parts.InputParameterEditPart;
import smartcontract.diagram.edit.parts.InputParameterNameEditPart;
import smartcontract.diagram.edit.parts.OutputParameterEditPart;
import smartcontract.diagram.edit.parts.OutputParameterNameEditPart;
import smartcontract.diagram.edit.parts.SmartContractEditPart;
import smartcontract.diagram.edit.parts.SmartContractSmartContractConstructorParametersContractCompartmentEditPart;
import smartcontract.diagram.edit.parts.SmartContractSmartContractSmartContractPropertiesCompartmentEditPart;
import smartcontract.diagram.edit.parts.SmartContractTypeNameEditPart;
import smartcontract.diagram.edit.parts.SmartContractsEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class SmartcontractVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "es.uca.modeling.cep.smartcontract.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (SmartContractsEditPart.MODEL_ID.equals(view.getType())) {
				return SmartContractsEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return smartcontract.diagram.part.SmartcontractVisualIDRegistry.getVisualID(view.getType());
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
				SmartcontractDiagramEditorPlugin.getInstance()
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
		if (SmartcontractPackage.eINSTANCE.getSmartContracts().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((SmartContracts) domainElement)) {
			return SmartContractsEditPart.VISUAL_ID;
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
		String containerModelID = smartcontract.diagram.part.SmartcontractVisualIDRegistry.getModelID(containerView);
		if (!SmartContractsEditPart.MODEL_ID.equals(containerModelID) && !"smartc".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (SmartContractsEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = smartcontract.diagram.part.SmartcontractVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SmartContractsEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case SmartContractsEditPart.VISUAL_ID:
			if (SmartcontractPackage.eINSTANCE.getSmartContract().isSuperTypeOf(domainElement.eClass())) {
				return SmartContractEditPart.VISUAL_ID;
			}
			break;
		case SmartContractSmartContractSmartContractPropertiesCompartmentEditPart.VISUAL_ID:
			if (SmartcontractPackage.eINSTANCE.getContractFunction().isSuperTypeOf(domainElement.eClass())) {
				return ContractFunctionEditPart.VISUAL_ID;
			}
			break;
		case SmartContractSmartContractConstructorParametersContractCompartmentEditPart.VISUAL_ID:
			if (SmartcontractPackage.eINSTANCE.getConstructorParameter().isSuperTypeOf(domainElement.eClass())) {
				return ConstructorParameterEditPart.VISUAL_ID;
			}
			break;
		case ContractFunctionContractFunctionInputParametersFunctionCompartmentEditPart.VISUAL_ID:
			if (SmartcontractPackage.eINSTANCE.getInputParameter().isSuperTypeOf(domainElement.eClass())) {
				return InputParameterEditPart.VISUAL_ID;
			}
			break;
		case ContractFunctionContractFunctionOutputParametersFunctionCompartmentEditPart.VISUAL_ID:
			if (SmartcontractPackage.eINSTANCE.getOutputParameter().isSuperTypeOf(domainElement.eClass())) {
				return OutputParameterEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = smartcontract.diagram.part.SmartcontractVisualIDRegistry.getModelID(containerView);
		if (!SmartContractsEditPart.MODEL_ID.equals(containerModelID) && !"smartc".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (SmartContractsEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = smartcontract.diagram.part.SmartcontractVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SmartContractsEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case SmartContractsEditPart.VISUAL_ID:
			if (SmartContractEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SmartContractEditPart.VISUAL_ID:
			if (SmartContractTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SmartContractSmartContractSmartContractPropertiesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SmartContractSmartContractConstructorParametersContractCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConstructorParameterEditPart.VISUAL_ID:
			if (ConstructorParameterNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContractFunctionEditPart.VISUAL_ID:
			if (ContractFunctionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContractFunctionContractFunctionInputParametersFunctionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContractFunctionContractFunctionOutputParametersFunctionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputParameterEditPart.VISUAL_ID:
			if (InputParameterNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OutputParameterEditPart.VISUAL_ID:
			if (OutputParameterNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SmartContractSmartContractSmartContractPropertiesCompartmentEditPart.VISUAL_ID:
			if (ContractFunctionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SmartContractSmartContractConstructorParametersContractCompartmentEditPart.VISUAL_ID:
			if (ConstructorParameterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContractFunctionContractFunctionInputParametersFunctionCompartmentEditPart.VISUAL_ID:
			if (InputParameterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContractFunctionContractFunctionOutputParametersFunctionCompartmentEditPart.VISUAL_ID:
			if (OutputParameterEditPart.VISUAL_ID == nodeVisualID) {
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
	private static boolean isDiagram(SmartContracts element) {
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
		case SmartContractSmartContractSmartContractPropertiesCompartmentEditPart.VISUAL_ID:
		case SmartContractSmartContractConstructorParametersContractCompartmentEditPart.VISUAL_ID:
		case ContractFunctionContractFunctionInputParametersFunctionCompartmentEditPart.VISUAL_ID:
		case ContractFunctionContractFunctionOutputParametersFunctionCompartmentEditPart.VISUAL_ID:
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
		case SmartContractsEditPart.VISUAL_ID:
			return false;
		case InputParameterEditPart.VISUAL_ID:
		case OutputParameterEditPart.VISUAL_ID:
		case ConstructorParameterEditPart.VISUAL_ID:
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
			return smartcontract.diagram.part.SmartcontractVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return smartcontract.diagram.part.SmartcontractVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return smartcontract.diagram.part.SmartcontractVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return smartcontract.diagram.part.SmartcontractVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return smartcontract.diagram.part.SmartcontractVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return smartcontract.diagram.part.SmartcontractVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
