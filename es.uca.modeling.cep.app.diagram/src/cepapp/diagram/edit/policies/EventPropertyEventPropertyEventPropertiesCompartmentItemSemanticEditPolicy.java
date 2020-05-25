/*
* 
*/
package cepapp.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import cepapp.diagram.edit.commands.EventProperty2CreateCommand;
import cepapp.diagram.providers.CepappElementTypes;

/**
 * @generated
 */
public class EventPropertyEventPropertyEventPropertiesCompartmentItemSemanticEditPolicy
		extends CepappBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public EventPropertyEventPropertyEventPropertiesCompartmentItemSemanticEditPolicy() {
		super(CepappElementTypes.EventProperty_3001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CepappElementTypes.EventProperty_3002 == req.getElementType()) {
			return getGEFWrapper(new EventProperty2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
