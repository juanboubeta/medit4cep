/*
* 
*/
package cepapp.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import cepapp.diagram.providers.CepappElementTypes;

/**
 * @generated
 */
public class LinkItemSemanticEditPolicy extends CepappBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public LinkItemSemanticEditPolicy() {
		super(CepappElementTypes.Link_4001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
