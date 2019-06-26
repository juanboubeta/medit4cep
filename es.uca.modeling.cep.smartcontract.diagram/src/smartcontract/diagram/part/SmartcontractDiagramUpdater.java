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

import smartcontract.ContractFunction;
import smartcontract.InputParameter;
import smartcontract.OutputParameter;
import smartcontract.SmartContract;
import smartcontract.SmartContracts;
import smartcontract.diagram.edit.parts.ContractFunctionContractFunctionInputParametersFunctionCompartmentEditPart;
import smartcontract.diagram.edit.parts.ContractFunctionContractFunctionOutputParametersFunctionCompartmentEditPart;
import smartcontract.diagram.edit.parts.ContractFunctionEditPart;
import smartcontract.diagram.edit.parts.InputParameterEditPart;
import smartcontract.diagram.edit.parts.OutputParameterEditPart;
import smartcontract.diagram.edit.parts.SmartContractEditPart;
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
			return getSmartContractSmartContractSmartContractPropertiesCompartment_7004SemanticChildren(view);
		case ContractFunctionContractFunctionInputParametersFunctionCompartmentEditPart.VISUAL_ID:
			return getContractFunctionContractFunctionInputParametersFunctionCompartment_7005SemanticChildren(view);
		case ContractFunctionContractFunctionOutputParametersFunctionCompartmentEditPart.VISUAL_ID:
			return getContractFunctionContractFunctionOutputParametersFunctionCompartment_7006SemanticChildren(view);
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
	public static List<SmartcontractNodeDescriptor> getSmartContractSmartContractSmartContractPropertiesCompartment_7004SemanticChildren(
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
	public static List<SmartcontractNodeDescriptor> getContractFunctionContractFunctionInputParametersFunctionCompartment_7005SemanticChildren(
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
	public static List<SmartcontractNodeDescriptor> getContractFunctionContractFunctionOutputParametersFunctionCompartment_7006SemanticChildren(
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
			return getSmartContract_2002ContainedLinks(view);
		case ContractFunctionEditPart.VISUAL_ID:
			return getContractFunction_3003ContainedLinks(view);
		case InputParameterEditPart.VISUAL_ID:
			return getInputParameter_3008ContainedLinks(view);
		case OutputParameterEditPart.VISUAL_ID:
			return getOutputParameter_3007ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<SmartcontractLinkDescriptor> getIncomingLinks(View view) {
		switch (SmartcontractVisualIDRegistry.getVisualID(view)) {
		case SmartContractEditPart.VISUAL_ID:
			return getSmartContract_2002IncomingLinks(view);
		case ContractFunctionEditPart.VISUAL_ID:
			return getContractFunction_3003IncomingLinks(view);
		case InputParameterEditPart.VISUAL_ID:
			return getInputParameter_3008IncomingLinks(view);
		case OutputParameterEditPart.VISUAL_ID:
			return getOutputParameter_3007IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<SmartcontractLinkDescriptor> getOutgoingLinks(View view) {
		switch (SmartcontractVisualIDRegistry.getVisualID(view)) {
		case SmartContractEditPart.VISUAL_ID:
			return getSmartContract_2002OutgoingLinks(view);
		case ContractFunctionEditPart.VISUAL_ID:
			return getContractFunction_3003OutgoingLinks(view);
		case InputParameterEditPart.VISUAL_ID:
			return getInputParameter_3008OutgoingLinks(view);
		case OutputParameterEditPart.VISUAL_ID:
			return getOutputParameter_3007OutgoingLinks(view);
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
	public static List<SmartcontractLinkDescriptor> getSmartContract_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SmartcontractLinkDescriptor> getContractFunction_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SmartcontractLinkDescriptor> getInputParameter_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SmartcontractLinkDescriptor> getOutputParameter_3007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SmartcontractLinkDescriptor> getSmartContract_2002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SmartcontractLinkDescriptor> getContractFunction_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SmartcontractLinkDescriptor> getInputParameter_3008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SmartcontractLinkDescriptor> getOutputParameter_3007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SmartcontractLinkDescriptor> getSmartContract_2002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SmartcontractLinkDescriptor> getContractFunction_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SmartcontractLinkDescriptor> getInputParameter_3008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SmartcontractLinkDescriptor> getOutputParameter_3007OutgoingLinks(View view) {
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
