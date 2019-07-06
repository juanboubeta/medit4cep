/*
 * 
 */
package eventpattern.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import eventpattern.diagram.edit.commands.EventProperty2CreateCommand;
import eventpattern.diagram.providers.EventpatternElementTypes;

/**
 * @generated
 */
public class EventEventEventPropertiesCompartmentItemSemanticEditPolicy extends EventpatternBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EventEventEventPropertiesCompartmentItemSemanticEditPolicy() {
		super(EventpatternElementTypes.Event_2027);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EventpatternElementTypes.EventProperty_3001 == req.getElementType()) {
			return getGEFWrapper(new EventProperty2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
