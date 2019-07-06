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
public class EventEventEventPropertiesCompartment3ItemSemanticEditPolicy
		extends EventpatternBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EventEventEventPropertiesCompartment3ItemSemanticEditPolicy() {
		super(EventpatternElementTypes.Event_3053);
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
