/*
* 
*/
package cepapp.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import cepapp.diagram.edit.commands.ComplexEventPropertyCreateCommand;
import cepapp.diagram.providers.CepappElementTypes;

/**
 * @generated
 */
public class ComplexEventComplexEventComplexEventPropertiesCompartmentItemSemanticEditPolicy
		extends CepappBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ComplexEventComplexEventComplexEventPropertiesCompartmentItemSemanticEditPolicy() {
		super(CepappElementTypes.ComplexEvent_2010);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CepappElementTypes.ComplexEventProperty_3003 == req.getElementType()) {
			return getGEFWrapper(new ComplexEventPropertyCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
