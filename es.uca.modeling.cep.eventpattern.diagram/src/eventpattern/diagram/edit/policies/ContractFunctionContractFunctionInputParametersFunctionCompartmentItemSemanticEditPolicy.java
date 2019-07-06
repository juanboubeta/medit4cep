/*
* 
*/
package eventpattern.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import eventpattern.diagram.edit.commands.InputParameterCreateCommand;
import eventpattern.diagram.providers.EventpatternElementTypes;

/**
 * @generated
 */
public class ContractFunctionContractFunctionInputParametersFunctionCompartmentItemSemanticEditPolicy
		extends EventpatternBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ContractFunctionContractFunctionInputParametersFunctionCompartmentItemSemanticEditPolicy() {
		super(EventpatternElementTypes.ContractFunction_3061);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EventpatternElementTypes.InputParameter_3062 == req.getElementType()) {
			return getGEFWrapper(new InputParameterCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
