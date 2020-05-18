/*******************************************************************************
 * Copyright (c) 2011, 2015 Juan Boubeta-Puig
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Juan Boubeta-Puig - initial API and implementation
 ******************************************************************************/

package es.uca.modeling.cep.eventpattern.menu.command;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;


public class SaveValidateHandler extends AbstractHandler {
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		Shell shell = HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell();
		String diagramEditor = HandlerUtil.getActiveEditor(event).getClass().getName();
		
		if (diagramEditor.equals("domain.diagram.part.DomainDiagramEditor")) {		
			SaveValidateDomainHandler domainHandler = new SaveValidateDomainHandler();
			return domainHandler.execute(event);
		}
		else if (diagramEditor.equals("eventpattern.diagram.part.EventpatternDiagramEditor")) {
			SaveValidateEventPatternHandler eventPatternHandler = new SaveValidateEventPatternHandler();
			return eventPatternHandler.execute(event);
		} 
		else if (diagramEditor.equals("smartcontract.diagram.part.SmartcontractDiagramEditor")) {
			SaveValidateSmartContractHandler smartContractHandler = new SaveValidateSmartContractHandler();
			return smartContractHandler.execute(event);
		} else if(diagramEditor.equals("cepapp.diagram.part.CepappDiagramEditor")){
			SaveValidateAppHandler appHandler = new SaveValidateAppHandler();
			return appHandler.execute(event);
		} else {
			MessageDialog.openError(shell, "Save and Validate", "An event pattern, domain or smart contract must be open.");
			return null;
		}
	}
}
