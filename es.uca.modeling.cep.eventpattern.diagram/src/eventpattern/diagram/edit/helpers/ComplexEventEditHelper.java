/*******************************************************************************
 * Copyright (c) 2011, 2015 Juan Boubeta-Puig
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Juan Boubeta-Puig - modifications marked as @generated NOT
 ******************************************************************************/

package eventpattern.diagram.edit.helpers;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.ConfigureElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;

import eventpattern.ComplexEvent;
import eventpattern.diagram.status.EventPatternsStatus;

/**
 * @generated NOT
 */

// Set the attribute "typeName" of New Complex Event Type to the name of the event pattern containing this complex event.
public class ComplexEventEditHelper extends EventpatternBaseEditHelper {

	@Override
	protected ICommand getConfigureCommand(final ConfigureRequest req) {

		ICommand configureCommand = new ConfigureElementCommand(req) {

			protected CommandResult doExecute(IProgressMonitor progressMonitor) {

				Object o = req.getElementToConfigure();
				return this.getCommandResult();
			}

			protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {

				Object o = req.getElementToConfigure();
				eventpattern.ComplexEvent complexEvent = (eventpattern.ComplexEvent) o;
				complexEvent.setTypeName(EventPatternsStatus.getActivePatternName());

				return this.getCommandResult();
			}
		};

		return CompositeCommand.compose(configureCommand, super.getConfigureCommand(req));
	}
}
