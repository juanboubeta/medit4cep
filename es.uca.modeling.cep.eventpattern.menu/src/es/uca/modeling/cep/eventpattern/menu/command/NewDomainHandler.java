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

import domain.CEPDomain;
import domain.diagram.part.DomainDiagramEditorUtil;
import es.uca.modeling.cep.eventpattern.menu.dialog.NewDomainDialog;


public class NewDomainHandler extends AbstractHandler {
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		Shell shell = HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell();
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		
		IProject domainProject = myWorkspaceRoot.getProject("domain");
		
		try {
			
			if (domainProject.exists()) {
	        	MessageDialog.openError(shell, "New CEP Domain", "The editor has already been customised.");
	        	return null;	
			}
			else {
			
				NewDomainDialog dialog = new NewDomainDialog(shell);
				dialog.create();
				
				if (dialog.open() == Window.OK) {
					
					String domainName = dialog.getDomainName();
					String domainDescription = dialog.getDomainDescription();
									
					domainProject.create(null);
					
					// Open if necessary
					if (!domainProject.isOpen()) {
						domainProject.open(null);
					}
							
					URI diagramUri = URI.createPlatformResourceURI(domainProject.
							getFile(domainName + ".domain_diagram").getFullPath().toString(), false);
					URI modelUri = URI.createPlatformResourceURI(domainProject.
							getFile(domainName + ".domain").getFullPath().toString(), false);
					Resource diagramResource = DomainDiagramEditorUtil.
							createDiagram(diagramUri, modelUri, new NullProgressMonitor());
					
					if (diagramResource != null) {
						
						try {												
							// Set model's attributes
					        ResourceSet resourceSet = new ResourceSetImpl();         
					        Resource modelResource = resourceSet.getResource(modelUri, true);
					        CEPDomain domain = ((CEPDomain) modelResource.getContents().get(0)); 
					        domain.setDomainName(domainName);
					        domain.setDomainCreationDate(new Date());
					        domain.setDomainDescription(domainDescription);
					        
					        modelResource.save(null);
					        
							DomainDiagramEditorUtil.openDiagram(diagramResource);
					        					      							
						} catch (PartInitException e) {
							ErrorDialog.openError(shell, "New CEP Domain", null, e.getStatus());
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
