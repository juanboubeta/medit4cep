/*
* 
*/
package smartcontract.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import smartcontract.diagram.edit.commands.OutputParameterCreateCommand;
import smartcontract.diagram.providers.SmartcontractElementTypes;

/**
 * @generated
 */
public class ContractFunctionContractFunctionOutputParametersFunctionCompartmentItemSemanticEditPolicy
		extends SmartcontractBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ContractFunctionContractFunctionOutputParametersFunctionCompartmentItemSemanticEditPolicy() {
		super(SmartcontractElementTypes.ContractFunction_3003);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SmartcontractElementTypes.OutputParameter_3007 == req.getElementType()) {
			return getGEFWrapper(new OutputParameterCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
