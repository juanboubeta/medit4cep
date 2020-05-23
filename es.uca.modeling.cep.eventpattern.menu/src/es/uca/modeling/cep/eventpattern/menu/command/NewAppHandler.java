package es.uca.modeling.cep.eventpattern.menu.command;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
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
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;
import cepapp.CEPApp;
import cepapp.diagram.part.CepappDiagramEditor;
import cepapp.diagram.part.CepappDiagramEditorUtil;
import cepapp.diagram.status.CepAppStatus;
import es.uca.modeling.cep.eventpattern.menu.dialog.NewAppDialog;

public class NewAppHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		Shell shell = HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell();
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		
		System.out.println("AQUIII!");
		System.out.println();
		IProject eventPatternProject = myWorkspaceRoot.getProject(CepAppStatus.getDomainName() + "_patterns");
		
		if(!eventPatternProject.exists()) {
			MessageDialog.openError(shell, "No event pattern found.", "There must exists an event pattern in order to create a cep application.");
		}
		else {
			IEditorPart ieditorpart = HandlerUtil.getActiveEditor(event); 
			
	        if (ieditorpart == null) {
	        	OpenDomainHandler domainHandler = new OpenDomainHandler();
				domainHandler.execute(event);
				ieditorpart = HandlerUtil.getActiveEditor(event); 
	        }
	        
	        ieditorpart.doSave(new NullProgressMonitor());
	        
	        IResource ir = (IResource) HandlerUtil.getActiveEditorInput(event).getAdapter(IResource.class);
	        IMarker[] problems = null;
	        int depth = IResource.DEPTH_INFINITE;
		
			try {
				problems = ir.findMarkers(IMarker.PROBLEM, true, depth);
			} catch (CoreException e1) {
				e1.printStackTrace();
			}
			
			if (problems.length > 0) {
				MessageDialog.openError(shell, "New Application", "There are some problems that must be solved before creating a new application.");
				
				try {
					HandlerUtil.getActiveWorkbenchWindowChecked(event).getActivePage().showView("org.eclipse.ui.views.ProblemView");
				} catch (PartInitException e) {
					e.printStackTrace();
				}					
				
	        	return null; 
			}
			
			
			
			NewAppDialog appDialog = new NewAppDialog(shell);
			appDialog.create();
			
			if(appDialog.open() == Window.OK) {
				String appName = appDialog.getAppName();
				String domainName = CepAppStatus.getDomainName();
				
				IProject appProject = myWorkspaceRoot.getProject(domainName + "_apps");
				
				if (!appProject.exists()) {
					try {
						appProject.create(null);
					} catch (CoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
					
				// Open if necessary
				if (!appProject.isOpen()) {
					try {
						appProject.open(null);
					} catch (CoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				IFile appFile = appProject.getFile(appName + ".cepapp_diagram");
				
				if(!appFile.exists()) {
					CepAppStatus.setActiveCepApp(appName);
					ResourceSet resourceSet = new ResourceSetImpl();
					
					File currentDir = new File(appProject.getLocationURI());
			        CepappDiagramEditor appDiagramEditor;
			        URI appDiagramUri;
			        Resource appDiagramResource;
			        
			        File[] files = currentDir.listFiles();
			        
			        for (File file : files) {
			        	if (!file.isDirectory() && file.getName().matches(".+cepapp_diagram")) {

							appDiagramUri = URI.createPlatformResourceURI(appProject
								.getFile(file.getName()).getFullPath().toString(), false);
									
							appDiagramResource = resourceSet.getResource(appDiagramUri, true);

							try {
								CepappDiagramEditorUtil.openDiagram(appDiagramResource);
							} catch (PartInitException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
					        appDiagramEditor = (CepappDiagramEditor) HandlerUtil.getActiveEditor(event);
							
							// save and validate
							appDiagramEditor.doSave(new NullProgressMonitor());
						}
			        }
			        
			        URI diagramUri = URI.createPlatformResourceURI(appProject.
							getFile(appName + ".cepapp_diagram").getFullPath().toString(), false);
					URI modelUri = URI.createPlatformResourceURI(appProject.
							getFile(appName + ".cepapp").getFullPath().toString(), false);
					Resource diagramResource = CepappDiagramEditorUtil.createDiagram(diagramUri, 
							modelUri, new NullProgressMonitor());
					
					if (diagramResource != null) {
						
						try {							
							// Set attributes of the new event pattern         
					        Resource modelResource = resourceSet.getResource(modelUri, true);
					        CEPApp app = (CEPApp) modelResource.getContents().get(0);
					        app.setName(appName);
					        app.setDescription(appDialog.getAppDescription());
					        app.setDomainName(domainName);
					        app.setCreationDate(new Date());
					        					        
					        try {
								modelResource.save(null);
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							CepappDiagramEditorUtil.openDiagram(diagramResource);
					        					      							
						} catch (PartInitException e) {
							ErrorDialog.openError(shell, "Open New Pattern", null, e.getStatus());
						}	
					}
				}
				else {
					MessageDialog.openError(shell, "Error", "Application '" + appName + "' already exists.");
		        	return null;
				}
			}
		}
		return null;
	}

}
