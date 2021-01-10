/*
* 
*/
package smartcontract.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import smartcontract.ConstructorParameter;
import smartcontract.ContractFunction;
import smartcontract.InputParameter;
import smartcontract.OutputParameter;
import smartcontract.SmartContract;
import smartcontract.SmartContracts;
import smartcontract.diagram.edit.parts.ConstructorParameterEditPart;
import smartcontract.diagram.edit.parts.ContractFunctionContractFunctionInputParametersFunctionCompartmentEditPart;
import smartcontract.diagram.edit.parts.ContractFunctionContractFunctionOutputParametersFunctionCompartmentEditPart;
import smartcontract.diagram.edit.parts.ContractFunctionEditPart;
import smartcontract.diagram.edit.parts.InputParameterEditPart;
import smartcontract.diagram.edit.parts.OutputParameterEditPart;
import smartcontract.diagram.edit.parts.SmartContractEditPart;
import smartcontract.diagram.edit.parts.SmartContractSmartContractConstructorParametersContractCompartmentEditPart;
import smartcontract.diagram.edit.parts.SmartContractSmartContractSmartContractPropertiesCompartmentEditPart;
import smartcontract.diagram.edit.parts.SmartContractsEditPart;

/**
 * @generated
 */
public class SmartcontractDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<SmartcontractNodeDescriptor> getSemanticChildren(View view) {
		switch (SmartcontractVisualIDRegistry.getVisualID(view)) {
		case SmartContractsEditPart.VISUAL_ID:
			return getSmartContracts_1000SemanticChildren(view);
		case SmartContractSmartContractSmartContractPropertiesCompartmentEditPart.VISUAL_ID:
			return getSmartContractSmartContractSmartContractPropertiesCompartment_7007SemanticChildren(view);
		case SmartContractSmartContractConstructorParametersContractCompartmentEditPart.VISUAL_ID:
			return getSmartContractSmartContractConstructorParametersContractCompartment_7010SemanticChildren(view);
		case ContractFunctionContractFunctionInputParametersFunctionCompartmentEditPart.VISUAL_ID:
			return getContractFunctionContractFunctionInputParametersFunctionCompartment_7008SemanticChildren(view);
		case ContractFunctionContractFunctionOutputParametersFunctionCompartmentEditPart.VISUAL_ID:
			return getContractFunctionContractFunctionOutputParametersFunctionCompartment_7009SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<SmartcontractNodeDescriptor> getSmartContracts_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SmartContracts modelElement = (SmartContracts) view.getElement();
		LinkedList<SmartcontractNodeDescriptor> result = new LinkedList<SmartcontractNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSmartcontracts().iterator(); it.hasNext();) {
			SmartContract childElement = (SmartContract) it.next();
			int visualID = SmartcontractVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SmartContractEditPart.VISUAL_ID) {
				result.add(new SmartcontractNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<SmartcontractNodeDescriptor> getSmartContractSmartContractSmartContractPropertiesCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SmartContract modelElement = (SmartContract) containerView.getElement();
		LinkedList<SmartcontractNodeDescriptor> result = new LinkedList<SmartcontractNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSmartContractProperties().iterator(); it.hasNext();) {
			ContractFunction childElement = (ContractFunction) it.next();
			int visualID = SmartcontractVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ContractFunctionEditPart.VISUAL_ID) {
				result.add(new SmartcontractNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<SmartcontractNodeDescriptor> getSmartContractSmartContractConstructorParametersContractCompartment_7010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SmartContract modelElement = (SmartContract) containerView.getElement();
		LinkedList<SmartcontractNodeDescriptor> result = new LinkedList<SmartcontractNodeDescriptor>();
		for (Iterator<?> it = modelElement.getConstructorParametersContract().iterator(); it.hasNext();) {
			ConstructorParameter childElement = (ConstructorParameter) it.next();
			int visualID = SmartcontractVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ConstructorParameterEditPart.VISUAL_ID) {
				result.add(new SmartcontractNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<SmartcontractNodeDescriptor> getContractFunctionContractFunctionInputParametersFunctionCompartment_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ContractFunction modelElement = (ContractFunction) containerView.getElement();
		LinkedList<SmartcontractNodeDescriptor> result = new LinkedList<SmartcontractNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputParametersFunction().iterator(); it.hasNext();) {
			InputParameter childElement = (InputParameter) it.next();
			int visualID = SmartcontractVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputParameterEditPart.VISUAL_ID) {
				result.add(new SmartcontractNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<SmartcontractNodeDescriptor> getContractFunctionContractFunctionOutputParametersFunctionCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ContractFunction modelElement = (ContractFunction) containerView.getElement();
		LinkedList<SmartcontractNodeDescriptor> result = new LinkedList<SmartcontractNodeDescriptor>();
		{
			OutputParameter childElement = modelElement.getOutputParametersFunction();
			int visualID = SmartcontractVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OutputParameterEditPart.VISUAL_ID) {
				result.add(new SmartcontractNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<SmartcontractLinkDescriptor> getContainedLinks(View view) {
		switch (SmartcontractVisualIDRegistry.getVisualID(view)) {
		case SmartContractsEditPart.VISUAL_ID:
			return getSmartContracts_1000ContainedLinks(view);
		case SmartContractEditPart.VISUAL_ID:
			return getSmartContract_2003ContainedLinks(view);
		case ConstructorParameterEditPart.VISUAL_ID:
			return getConstructorParameter_3012ContainedLinks(view);
		case ContractFunctionEditPart.VISUAL_ID:
			return getContractFunction_3009ContainedLinks(view);
		case InputParameterEditPart.VISUAL_ID:
			return getInputParameter_3010ContainedLinks(view);
		case OutputParameterEditPart.VISUAL_ID:
			return getOutputParameter_3011ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<SmartcontractLinkDescriptor> getIncomingLinks(View view) {
		switch (SmartcontractVisualIDRegistry.getVisualID(view)) {
		case SmartContractEditPart.VISUAL_ID:
			return getSmartContract_2003IncomingLinks(view);
		case ConstructorParameterEditPart.VISUAL_ID:
			return getConstructorParameter_3012IncomingLinks(view);
		case ContractFunctionEditPart.VISUAL_ID:
			return getContractFunction_3009IncomingLinks(view);
		case InputParameterEditPart.VISUAL_ID:
			return getInputParameter_3010IncomingLinks(view);
		case OutputParameterEditPart.VISUAL_ID:
			return getOutputParameter_3011IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<SmartcontractLinkDescriptor> getOutgoingLinks(View view) {
		switch (SmartcontractVisualIDRegistry.getVisualID(view)) {
		case SmartContractEditPart.VISUAL_ID:
			return getSmartContract_2003OutgoingLinks(view);
		case ConstructorParameterEditPart.VISUAL_ID:
			return getConstructorParameter_3012OutgoingLinks(view);
		case ContractFunctionEditPart.VISUAL_ID:
			return getContractFunction_3009OutgoingLinks(view);
		case InputParameterEditPart.VISUAL_ID:
			return getInputParameter_3010OutgoingLinks(view);
		case OutputParameterEditPart.VISUAL_ID:
			return getOutputParameter_3011OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SmartcontractLinkDescriptor> getSmartContracts_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<SmartcontractLinkDescriptor> getSmartContract_2003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<SmartcontractLinkDescriptor> getConstructorParameter_3012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<SmartcontractLinkDescriptor> getContractFunction_3009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<SmartcontractLinkDescriptor> getInputParameter_3010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<SmartcontractLinkDescriptor> getOutputParameter_3011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<SmartcontractLinkDescriptor> getSmartContract_2003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<SmartcontractLinkDescriptor> getConstructorParameter_3012IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<SmartcontractLinkDescriptor> getContractFunction_3009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<SmartcontractLinkDescriptor> getInputParameter_3010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<SmartcontractLinkDescriptor> getOutputParameter_3011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<SmartcontractLinkDescriptor> getSmartContract_2003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<SmartcontractLinkDescriptor> getConstructorParameter_3012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<SmartcontractLinkDescriptor> getContractFunction_3009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<SmartcontractLinkDescriptor> getInputParameter_3010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<SmartcontractLinkDescriptor> getOutputParameter_3011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<SmartcontractNodeDescriptor> getSemanticChildren(View view) {
			return SmartcontractDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<SmartcontractLinkDescriptor> getContainedLinks(View view) {
			return SmartcontractDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<SmartcontractLinkDescriptor> getIncomingLinks(View view) {
			return SmartcontractDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<SmartcontractLinkDescriptor> getOutgoingLinks(View view) {
			return SmartcontractDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
