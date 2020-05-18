/*
* 
*/
package cepapp.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import cepapp.diagram.edit.commands.ComplexEventProperty2CreateCommand;
import cepapp.diagram.providers.CepappElementTypes;

/**
 * @generated
 */
public class ComplexEventPropertyComplexEventPropertyComplexEventPropertiesCompartmentItemSemanticEditPolicy
		extends CepappBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ComplexEventPropertyComplexEventPropertyComplexEventPropertiesCompartmentItemSemanticEditPolicy() {
		super(CepappElementTypes.ComplexEventProperty_3003);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CepappElementTypes.ComplexEventProperty_3004 == req.getElementType()) {
			return getGEFWrapper(new ComplexEventProperty2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
