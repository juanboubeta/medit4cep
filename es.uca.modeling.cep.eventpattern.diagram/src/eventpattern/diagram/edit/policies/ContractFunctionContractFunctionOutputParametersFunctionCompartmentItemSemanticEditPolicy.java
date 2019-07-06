/*
* 
*/
package eventpattern.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import eventpattern.diagram.edit.commands.OutputParameterCreateCommand;
import eventpattern.diagram.providers.EventpatternElementTypes;

/**
 * @generated
 */
public class ContractFunctionContractFunctionOutputParametersFunctionCompartmentItemSemanticEditPolicy
		extends EventpatternBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ContractFunctionContractFunctionOutputParametersFunctionCompartmentItemSemanticEditPolicy() {
		super(EventpatternElementTypes.ContractFunction_3061);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EventpatternElementTypes.OutputParameter_3063 == req.getElementType()) {
			return getGEFWrapper(new OutputParameterCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
