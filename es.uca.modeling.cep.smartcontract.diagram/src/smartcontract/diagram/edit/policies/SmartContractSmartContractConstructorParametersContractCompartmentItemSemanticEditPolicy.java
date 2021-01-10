/*
* 
*/
package smartcontract.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import smartcontract.diagram.edit.commands.ConstructorParameterCreateCommand;
import smartcontract.diagram.providers.SmartcontractElementTypes;

/**
 * @generated
 */
public class SmartContractSmartContractConstructorParametersContractCompartmentItemSemanticEditPolicy
		extends SmartcontractBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SmartContractSmartContractConstructorParametersContractCompartmentItemSemanticEditPolicy() {
		super(SmartcontractElementTypes.SmartContract_2003);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SmartcontractElementTypes.ConstructorParameter_3012 == req.getElementType()) {
			return getGEFWrapper(new ConstructorParameterCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
