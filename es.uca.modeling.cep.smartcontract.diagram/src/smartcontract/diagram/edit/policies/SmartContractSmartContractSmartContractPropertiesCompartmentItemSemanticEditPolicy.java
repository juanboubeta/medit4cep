/*
* 
*/
package smartcontract.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import smartcontract.diagram.edit.commands.ContractFunctionCreateCommand;
import smartcontract.diagram.providers.SmartcontractElementTypes;

/**
 * @generated
 */
public class SmartContractSmartContractSmartContractPropertiesCompartmentItemSemanticEditPolicy
		extends SmartcontractBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SmartContractSmartContractSmartContractPropertiesCompartmentItemSemanticEditPolicy() {
		super(SmartcontractElementTypes.SmartContract_2002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SmartcontractElementTypes.ContractFunction_3003 == req.getElementType()) {
			return getGEFWrapper(new ContractFunctionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
