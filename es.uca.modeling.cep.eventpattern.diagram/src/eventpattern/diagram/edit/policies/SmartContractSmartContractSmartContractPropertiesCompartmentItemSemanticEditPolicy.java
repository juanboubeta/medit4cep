/*
* 
*/
package eventpattern.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import eventpattern.diagram.edit.commands.ContractFunctionCreateCommand;
import eventpattern.diagram.providers.EventpatternElementTypes;

/**
 * @generated
 */
public class SmartContractSmartContractSmartContractPropertiesCompartmentItemSemanticEditPolicy
		extends EventpatternBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SmartContractSmartContractSmartContractPropertiesCompartmentItemSemanticEditPolicy() {
		super(EventpatternElementTypes.SmartContract_2041);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EventpatternElementTypes.ContractFunction_3061 == req.getElementType()) {
			return getGEFWrapper(new ContractFunctionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
