package es.uca.modeling.cep.eventpattern.menu.command;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

import cepapp.diagram.part.CepappDiagramEditor;
import cepapp.diagram.status.CepAppStatus;

public class DeleteAppHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Shell shell = HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell();
		
		String domainName = CepAppStatus.getDomainName();
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IProject appProject = myWorkspaceRoot.getProject(domainName + "_apps");
		
		if (!appProject.exists()) {
        	MessageDialog.openError(shell, "Delete Application", "There are no applications to be deleted.");
        	return null;	
		}
		
		if(!HandlerUtil.getActiveEditor(event).getClass().getName().equals("cepapp.diagram.part.CepappDiagramEditor")) {
			MessageDialog.openError(shell, "Delete Application", "An application must be open.");
			return null;
		}
		
		if (MessageDialog.openConfirm(shell, "Delete CEP Application", 
				"Are you sure that you want to permanently delete this application?")) {
			CepappDiagramEditor appDiagramEditor = (CepappDiagramEditor) HandlerUtil.getActiveEditor(event);
			
			if (appDiagramEditor == null || !appDiagramEditor.getTitle().endsWith("cepapp_diagram")) {
	        	MessageDialog.openError(shell, "Delete Event Pattern", "An event pattern must be open.");
	        	return null; 
	        }
			String activeAppName = appDiagramEditor.getTitle().replace(".cepapp_diagram","");
			IFile activeAppModelFile = appProject.getFile(activeAppName + ".cepapp");
			IFile activeAppDiagramFile = appProject.getFile(activeAppName + ".cepapp_diagram");
			
			if (!appProject.isOpen()) {
				try {
					appProject.open(null);
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			//ResourceSet resourceSet = new ResourceSetImpl(); 
			
			try {
				activeAppModelFile.delete(true, null);
				activeAppDiagramFile.delete(true, null);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			MessageDialog.openInformation(shell, "Delete CEP Application", "The application has been deleted.");
						
		}
		
		return null;
	}
}
