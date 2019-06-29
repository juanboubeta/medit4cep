/*
 * 
 */
package domain.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import domain.diagram.edit.commands.EventPropertyCreateCommand;
import domain.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class EventEventEventPropertiesCompartmentItemSemanticEditPolicy extends DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EventEventEventPropertiesCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.Event_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.EventProperty_3001 == req.getElementType()) {
			return getGEFWrapper(new EventPropertyCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
