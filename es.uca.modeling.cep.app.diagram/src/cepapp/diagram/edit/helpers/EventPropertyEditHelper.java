/*
 * 
 */
package cepapp.diagram.edit.helpers;

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.UnexecutableCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class EventPropertyEditHelper extends CepappBaseEditHelper {
	/**
	 * @generated NOT
	 */
	protected ICommand getDestroyElementCommand(DestroyElementRequest req) {
		// Disable the "Delete from model" popup menu for EventProperty 
		return UnexecutableCommand.INSTANCE;
	}
}
