/*
* 
*/
package cepapp.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import cepapp.diagram.edit.commands.EventPropertyCreateCommand;
import cepapp.diagram.providers.CepappElementTypes;

/**
 * @generated
 */
public class EventEventEventPropertiesCompartmentItemSemanticEditPolicy extends CepappBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public EventEventEventPropertiesCompartmentItemSemanticEditPolicy() {
		super(CepappElementTypes.Event_2009);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CepappElementTypes.EventProperty_3001 == req.getElementType()) {
			return getGEFWrapper(new EventPropertyCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
