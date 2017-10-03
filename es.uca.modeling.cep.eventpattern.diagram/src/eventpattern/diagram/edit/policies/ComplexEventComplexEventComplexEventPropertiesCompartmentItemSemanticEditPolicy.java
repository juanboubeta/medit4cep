/*
 * 
 */
package eventpattern.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import eventpattern.diagram.edit.commands.ComplexEventPropertyCreateCommand;
import eventpattern.diagram.providers.EventpatternElementTypes;

/**
 * @generated
 */
public class ComplexEventComplexEventComplexEventPropertiesCompartmentItemSemanticEditPolicy
		extends EventpatternBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComplexEventComplexEventComplexEventPropertiesCompartmentItemSemanticEditPolicy() {
		super(EventpatternElementTypes.ComplexEvent_2038);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EventpatternElementTypes.ComplexEventProperty_3059 == req.getElementType()) {
			return getGEFWrapper(new ComplexEventPropertyCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
