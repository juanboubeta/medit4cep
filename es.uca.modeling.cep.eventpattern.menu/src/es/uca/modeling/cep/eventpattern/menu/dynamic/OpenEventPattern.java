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

package es.uca.modeling.cep.eventpattern.menu.dynamic;

import java.io.File;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.ContributionItem;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.ui.PartInitException;

import eventpattern.diagram.part.EventpatternDiagramEditorUtil;
import eventpattern.diagram.status.EventPatternsStatus;

public class OpenEventPattern extends ContributionItem {

	public OpenEventPattern() {
	}

	public OpenEventPattern(String id) {
		super(id);
	}
	
	@Override
	public void fill(Menu menu, int index) {
		
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		String domainName = EventPatternsStatus.getDomainName();
		final IProject patternProject = myWorkspaceRoot.getProject(domainName + "_patterns");
					
		try {
			
			if (!patternProject.exists()) {
				patternProject.create(null);
			}
							
			// Open if necessary
			if (!patternProject.isOpen()) {
				patternProject.open(null);
			}
			
			File currentDir = new File(patternProject.getLocationURI()); 
			File[] files = currentDir.listFiles();
			String fileName; 
			int menuPos = 0;
						
			for (final File file : files) {
				
				fileName = file.getName();
													
				if (!file.isDirectory() && fileName.matches(".+pattern_diagram")) {	
			
					// Create the menu item
					MenuItem menuItem = new MenuItem(menu, SWT.CHECK, menuPos);
					menuItem.setText(fileName.replace(".pattern_diagram", ""));
					
					menuItem.addSelectionListener(new SelectionAdapter() {
						public void widgetSelected(SelectionEvent e) {
							
							URI diagramUri = URI.createPlatformResourceURI(patternProject
									.getFile(file.getName()).getFullPath().toString(), false);
							
							ResourceSet resourceSet = new ResourceSetImpl();
							Resource diagramResource = resourceSet.getResource(diagramUri, true);
							
							try {
								EventpatternDiagramEditorUtil.openDiagram(diagramResource);
							} catch (PartInitException e1) {
								e1.printStackTrace();
							}		
						}
					});
					
					menuPos++;					
				}
			}				

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}	
	
	// It allows the dynamic menu to be changed from time to time
	@Override
	public boolean isDynamic() {
		return true;
	}

}
