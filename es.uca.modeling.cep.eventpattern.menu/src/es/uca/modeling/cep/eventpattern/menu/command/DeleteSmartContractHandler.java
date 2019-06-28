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
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;


public class DeleteSmartContractHandler extends AbstractHandler {
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		try {
			
			Shell shell = HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell();
			IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();		
			IProject smartcontractProject = myWorkspaceRoot.getProject("smartcontract");
			
			if (!smartcontractProject.exists()) {
	        	MessageDialog.openError(shell, "Delete Smart Contracts", "Smart Contracts does not exist.");
	        	return null;	
			}
			else {
				
				if(!HandlerUtil.getActiveEditor(event).getClass().getName().equals("smartcontract.diagram.part.SmartcontractDiagramEditor")) {
					
					MessageDialog.openError(shell, "Delete Smart Contracts", "The Smart Contracts must be open.");
					return null;
				}
			
				// Open if necessary
				if (!smartcontractProject.isOpen()) {
					smartcontractProject.open(null);
				}

				if (MessageDialog.openConfirm(shell, "Delete Smart Contracts", 
						"Are you sure that you want to permanently delete the Smart Contracts?")) {
							
					smartcontractProject.delete(true, null);
					myWorkspaceRoot.refreshLocal(2, null);

					MessageDialog.openInformation(shell, "Delete Smart Contracts", "The Smart Contracts has been deleted.");
								
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 	
		
		return null;
	}
}
