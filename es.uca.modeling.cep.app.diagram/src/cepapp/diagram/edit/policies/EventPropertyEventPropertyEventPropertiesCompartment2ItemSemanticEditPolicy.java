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
public class EventPropertyEventPropertyEventPropertiesCompartment2ItemSemanticEditPolicy
		extends CepappBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public EventPropertyEventPropertyEventPropertiesCompartment2ItemSemanticEditPolicy() {
		super(CepappElementTypes.EventProperty_3002);
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
