/*
* 
*/
package smartcontract.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import smartcontract.diagram.edit.commands.InputParameterCreateCommand;
import smartcontract.diagram.providers.SmartcontractElementTypes;

/**
 * @generated
 */
public class ContractFunctionContractFunctionInputParametersFunctionCompartmentItemSemanticEditPolicy
		extends SmartcontractBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ContractFunctionContractFunctionInputParametersFunctionCompartmentItemSemanticEditPolicy() {
		super(SmartcontractElementTypes.ContractFunction_3009);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SmartcontractElementTypes.InputParameter_3010 == req.getElementType()) {
			return getGEFWrapper(new InputParameterCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
