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

import java.util.Date;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;

import smartcontract.SmartContracts;
import smartcontract.diagram.part.SmartcontractDiagramEditorUtil;
import es.uca.modeling.cep.eventpattern.menu.dialog.NewSmartcontractDialog;
import eventpattern.diagram.status.EventPatternsStatus;


public class NewSmartContractHandler extends AbstractHandler {
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		Shell shell = HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell();
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		
		IProject smartcontractsProject = myWorkspaceRoot.getProject("smartcontract");
		
		try {
			
			if (smartcontractsProject.exists()) {
	        	MessageDialog.openError(shell, "New SmartContracts", "The editor has already been customised.");
	        	return null;	
			}
			else {
			
				NewSmartcontractDialog dialog = new NewSmartcontractDialog(shell);
				dialog.create();
				
				if (dialog.open() == Window.OK) {
					
					String name = dialog.getName();
					String description = dialog.getDescription();
					EventPatternsStatus.setDomainName(name);				
					smartcontractsProject.create(null);
					
					// Open if necessary
					if (!smartcontractsProject.isOpen()) {
						smartcontractsProject.open(null);
					}
							
					URI diagramUri = URI.createPlatformResourceURI(smartcontractsProject.
							getFile(name + ".smartc_diagram").getFullPath().toString(), false);
					URI modelUri = URI.createPlatformResourceURI(smartcontractsProject.
							getFile(name + ".smartc").getFullPath().toString(), false);
					Resource diagramResource = SmartcontractDiagramEditorUtil.
							createDiagram(diagramUri, modelUri, new NullProgressMonitor());
					
					if (diagramResource != null) {
						
						try {												
							// Set model's attributes
					        ResourceSet resourceSet = new ResourceSetImpl();         
					        Resource modelResource = resourceSet.getResource(modelUri, true);
					        SmartContracts domain = ((SmartContracts) modelResource.getContents().get(0)); 
					        domain.setName(name);
					        domain.setCreationDate(new Date());
					        domain.setDescription(description);
					        
					        modelResource.save(null);
					        
					        SmartcontractDiagramEditorUtil.openDiagram(diagramResource);
					        					      							
						} catch (PartInitException e) {
							ErrorDialog.openError(shell, "New SmartContracts", null, e.getStatus());
						}
					}								
				} 		
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 						
				
		return null; 
		
	}
}
