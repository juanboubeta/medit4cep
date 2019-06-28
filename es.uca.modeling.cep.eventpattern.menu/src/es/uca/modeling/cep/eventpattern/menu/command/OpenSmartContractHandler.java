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

import java.io.File;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

import smartcontract.diagram.part.SmartcontractDiagramEditorUtil;


public class OpenSmartContractHandler extends AbstractHandler {
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		Shell shell = HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell();
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		
		IProject smartcontractProject = myWorkspaceRoot.getProject("smartcontract");
		
		try {
			
			if (!smartcontractProject.exists()) {
	        	MessageDialog.openError(shell, "Open Smart Contracts", "Smart Contracts does not exist.");
	        	return null;	
			}
			else {
			
				// Open if necessary
				if (!smartcontractProject.isOpen()) {
					smartcontractProject.open(null);
				}
									
				File currentDir = new File(smartcontractProject.getLocationURI()); 
				File[] files = currentDir.listFiles();
				
				for (File file : files) {
											
					if (!file.isDirectory() && file.getName().matches(".+smartc_diagram")) {
					
						URI diagramUri = URI.createPlatformResourceURI(smartcontractProject
								.getFile(file.getName()).getFullPath().toString(), false);
							
						ResourceSet resourceSet = new ResourceSetImpl(); 
						Resource diagramResource = resourceSet.getResource(diagramUri, true);
						
						SmartcontractDiagramEditorUtil.openDiagram(diagramResource);				
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 						
				
		return null; 
		
	}
}
