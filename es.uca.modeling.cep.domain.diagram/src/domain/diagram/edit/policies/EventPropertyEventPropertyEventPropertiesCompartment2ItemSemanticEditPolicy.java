/*
 * 
 */
package domain.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import domain.diagram.edit.commands.EventProperty2CreateCommand;
import domain.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class EventPropertyEventPropertyEventPropertiesCompartment2ItemSemanticEditPolicy
		extends DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EventPropertyEventPropertyEventPropertiesCompartment2ItemSemanticEditPolicy() {
		super(DomainElementTypes.EventProperty_3002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.EventProperty_3002 == req.getElementType()) {
			return getGEFWrapper(new EventProperty2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
