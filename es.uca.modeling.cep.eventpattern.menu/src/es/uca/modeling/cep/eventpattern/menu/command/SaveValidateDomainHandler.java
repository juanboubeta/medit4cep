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
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;

import domain.diagram.part.DomainDiagramEditor;
import domain.diagram.part.DomainDiagramEditorUtil;
import domain.diagram.status.DomainStatus;
import eventpattern.diagram.part.EventpatternDiagramEditor;
import eventpattern.diagram.part.EventpatternDiagramEditorUtil;
import eventpattern.diagram.status.EventPatternsStatus;


public class SaveValidateDomainHandler extends AbstractHandler {
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		Shell shell = HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell();		
		
		// 1º Obtain the active editor's diagram
		
        DomainDiagramEditor domainDiagramEditor = (DomainDiagramEditor) HandlerUtil.getActiveEditor(event);
        
        if (domainDiagramEditor == null || !domainDiagramEditor.getTitle().endsWith("domain_diagram")) {
        	MessageDialog.openError(shell, "Save and Validate CEP Domain", "The domain must be open.");
        	return null; 
        }
        
        
        // 2º Save all changes made in the editor   
   
        domainDiagramEditor.doSave(new NullProgressMonitor());
        
        
		// 3º Check if there are some problems which must be solved

		IResource ir = (IResource) HandlerUtil.getActiveEditorInput(event).getAdapter(IResource.class);
        IMarker[] problems = null;
        int depth = IResource.DEPTH_INFINITE;
	
		try {
			problems = ir.findMarkers(IMarker.PROBLEM, true, depth);
		} catch (CoreException e1) {
			e1.printStackTrace();
		}
		
		if (problems.length > 0) {
			MessageDialog.openError(shell, "Save and Validate CEP Domain", "There are some problems that must be solved before saving the domain.");
			
			try {
				HandlerUtil.getActiveWorkbenchWindowChecked(event).getActivePage().showView("org.eclipse.ui.views.ProblemView");
			} catch (PartInitException e) {
				e.printStackTrace();
			}			
			
        	return null; 
		}
		
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		String domainName = EventPatternsStatus.getDomainName();
		IProject patternProject = myWorkspaceRoot.getProject(domainName + "_patterns");
		
		// If the domain has been modified, then the simple event tools of every event pattern's palette will be updated.
		if (DomainStatus.getDomainModified() != null && DomainStatus.getDomainModified() && 
				patternProject.exists()) {
			
			try {
				// Open if necessary
				if (!patternProject.isOpen()) {
					patternProject.open(null);
				}
				
				// Change the palette of all existing editors
				File currentDir = new File(patternProject.getLocationURI()); 
				File[] files = currentDir.listFiles();
				ResourceSet resourceSet = new ResourceSetImpl();
				
				for (File file : files) {
											
					// Refresh simple event tools for all event patterns
					if (!file.isDirectory() && file.getName().matches(".+pattern_diagram")) {
																	
						URI diagramUri = URI.createPlatformResourceURI(patternProject
								.getFile(file.getName()).getFullPath().toString(), false);
								
						Resource diagramResource = resourceSet.getResource(diagramUri, true);
						
						EventpatternDiagramEditorUtil.openDiagram(diagramResource);
						EventpatternDiagramEditor diagramEditor = (EventpatternDiagramEditor) HandlerUtil.getActiveEditor(event);
																
						diagramEditor.refreshPaletteSimpleEvent();
						
					}
				}
				
				IProject domainProject = myWorkspaceRoot.getProject("domain");
				
				// Open if necessary
				if (!domainProject.isOpen()) {
					domainProject.open(null);
				}
				
				URI domainDiagramUri = URI.createPlatformResourceURI(domainProject
						.getFile(domainName + ".domain_diagram").getFullPath().toString(), false);
				
			 	Resource domainDiagramResource = resourceSet.getResource(domainDiagramUri, true);
			 	
			 	DomainDiagramEditorUtil.openDiagram(domainDiagramResource);
				
			 	DomainStatus.setDomainModified(false);
								
			} catch (Exception exception) {
				exception.printStackTrace();
			}
			
		}
		
		MessageDialog.openInformation(shell, "Save and Validate CEP Domain", 
        		"The domain has been correctly saved and validated.");
		
		return null;
		
	}
}
