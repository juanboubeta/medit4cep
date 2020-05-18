package es.uca.modeling.cep.eventpattern.menu.dynamic;

import java.io.File;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
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

import cepapp.diagram.part.CepappDiagramEditorUtil;
import cepapp.diagram.status.CepAppStatus;

public class OpenApp extends ContributionItem {

	public OpenApp() {
		// TODO Auto-generated constructor stub
	}

	public OpenApp(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fill(Menu menu, int index) {
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		String domainName = CepAppStatus.getDomainName();
		
		if(domainName != null) {
			final IProject appProject = myWorkspaceRoot.getProject(domainName + "_apps");
		
			if(!appProject.exists()) {
				try {
					appProject.create(null);
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(!appProject.isOpen()) {
				try {
					appProject.open(null);
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			File currentDir = new File(appProject.getLocationURI()); 
			File[] files = currentDir.listFiles();
			String fileName; 
			int menuPos = 0;
			
			for(final File file : files) {
				
				fileName = file.getName();
				
				if(!file.isDirectory() && fileName.matches(".+cepapp_diagram")) {
					MenuItem menuItem = new MenuItem(menu, SWT.CHECK, menuPos);
					menuItem.setText(fileName.replace(".cepapp_diagram", ""));
					
					menuItem.addSelectionListener(new SelectionAdapter() {
						public void widgetSelected(SelectionEvent e) {
							URI diagramUri = URI.createPlatformResourceURI(appProject
									.getFile(file.getName()).getFullPath().toString(), false);
							
							ResourceSet resourceSet = new ResourceSetImpl();
							Resource diagramResource = resourceSet.getResource(diagramUri, true);
						
							try {
								CepappDiagramEditorUtil.openDiagram(diagramResource);
							} catch (PartInitException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					});
					
					menuPos++;
				}
			}
		}
	}
	
	// It allows the dynamic menu to be changed from time to time
	@Override
	public boolean isDynamic() {
		return true;
	}
}
