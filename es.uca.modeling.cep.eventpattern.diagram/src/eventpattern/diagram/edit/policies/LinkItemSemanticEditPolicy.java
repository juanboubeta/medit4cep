/*
 * 
 */
package eventpattern.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import eventpattern.diagram.providers.EventpatternElementTypes;

/**
 * @generated
 */
public class LinkItemSemanticEditPolicy extends EventpatternBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public LinkItemSemanticEditPolicy() {
		super(EventpatternElementTypes.Link_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
