package es.uca.modeling.cep.eventpattern.menu.command;

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
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;

import cepapp.diagram.part.CepappDiagramEditor;
import cepapp.diagram.status.CepAppStatus;
import domain.CEPDomain;
import domain.DomainFactory;
import domain.DomainPackage;
import domain.diagram.part.DomainDiagramEditorUtil;


public class SaveValidateAppHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Shell shell = HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell();	
		
		CepappDiagramEditor appDiagramEditor = (CepappDiagramEditor) HandlerUtil.getActiveEditor(event);
		
		if(appDiagramEditor == null || !appDiagramEditor.getTitle().endsWith("cepapp_diagram")) {
			MessageDialog.openError(shell, "Save and Validate App", "An app must be open.");
			return null;
		}
		
		appDiagramEditor.doSave(new NullProgressMonitor());
		
		IResource ir = (IResource) HandlerUtil.getActiveEditorInput(event).getAdapter(IResource.class);
        IMarker[] problems = null;
        int depth = IResource.DEPTH_INFINITE;
		
        try {
			problems = ir.findMarkers(IMarker.PROBLEM, true, depth);
		} catch (CoreException e1) {
			e1.printStackTrace();
		}
		
        if (problems.length > 0) {
			MessageDialog.openError(shell, "Save and Validate App", "There are some problems that must be solved before saving the application.");
			
			try {
				HandlerUtil.getActiveWorkbenchWindowChecked(event).getActivePage().showView("org.eclipse.ui.views.ProblemView");
			} catch (PartInitException e) {
				e.printStackTrace();
			}
			
        	return null; 
		}
        
        String domainName = CepAppStatus.getDomainName();
        String activeAppName = CepAppStatus.getActiveCepApp();
        
        IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IProject appProject = myWorkspaceRoot.getProject(domainName + "_apps");
		
		// Open if necessary
		if (!appProject.isOpen()) {
			try {
				appProject.open(null);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		MessageDialog.openInformation(shell, "Save and Validate CEP Application", 
        		"The CEP application has been correctly saved and validated.");
		
	   	return null;
	}
}
