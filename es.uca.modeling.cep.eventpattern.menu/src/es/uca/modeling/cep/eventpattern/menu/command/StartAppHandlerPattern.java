package es.uca.modeling.cep.eventpattern.menu.command;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;

//import app.esper.NetworkAttackCSVSimulator.java;

//import app.esper.NetworkAttackCSVSimulator;
//import app.esper.Simulator;
import domain.CEPDomain;
import domain.DomainFactory;
import domain.DomainPackage;
import domain.diagram.part.DomainDiagramEditorUtil;
import eventpattern.CEPEventPattern;
import eventpattern.ComplexEvent;
import eventpattern.ComplexEventProperty;
import eventpattern.Value;
import eventpattern.diagram.part.EventpatternDiagramEditor;
import eventpattern.diagram.part.EventpatternDiagramEditorUtil;
import eventpattern.diagram.status.EventPatternsStatus;

public class StartAppHandlerPattern extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		Shell shell = HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell();
		
		// 1º Obtain the active editor's diagram
        EventpatternDiagramEditor patternDiagramEditor = (EventpatternDiagramEditor) HandlerUtil.getActiveEditor(event);
        
        if (patternDiagramEditor == null || !patternDiagramEditor.getTitle().endsWith("pattern_diagram")) {
        	MessageDialog.openError(shell, "Start App", "An event pattern must be open.");
        	return null; 
        }
        
        // 2º Save all changes made in the editor       
        patternDiagramEditor.doSave(new NullProgressMonitor());
        
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
			MessageDialog.openError(shell, "Start App", "There are some problems that must be solved before saving the event pattern.");
			
			try {
				HandlerUtil.getActiveWorkbenchWindowChecked(event).getActivePage().showView("org.eclipse.ui.views.ProblemView");
			} catch (PartInitException e) {
				e.printStackTrace();
			}
			
        	return null; 
		}
	 		
		String domainName = EventPatternsStatus.getDomainName();
		String smartContractsName = EventPatternsStatus.getSmartcontractsName();
		String activePatternName = patternDiagramEditor.getTitle().replace(".pattern_diagram","");
				
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IProject CEPdomainProject = myWorkspaceRoot.getProject("domain");
		IProject SmartContractProject = myWorkspaceRoot.getProject("smartcontract");
		IProject complexEventProject = myWorkspaceRoot.getProject(domainName + "_complex_events");
		IProject patternProject = myWorkspaceRoot.getProject(domainName + "_patterns");
        
		try {
			if (!complexEventProject.exists()) {
				complexEventProject.create(null);
			}
				
			// Open if necessary
			if (!complexEventProject.isOpen()) {
				complexEventProject.open(null);
			}
			
			// Open if necessary
			if (!patternProject.isOpen()) {
				patternProject.open(null);
			}
			
			IFile complexEventFile = complexEventProject.getFile(domainName + "_complex_events" + ".domain_diagram");
			
			URI complexEventDiagramUri = URI.createPlatformResourceURI(complexEventProject.
					getFile(domainName + "_complex_events" + ".domain_diagram").getFullPath().toString(), false);
			URI complexEventModelUri = URI.createPlatformResourceURI(complexEventProject.
					getFile(domainName + "_complex_events" + ".domain").getFullPath().toString(), false);
			
			URI activePatternModelUri = URI.createPlatformResourceURI(patternProject
					.getFile(activePatternName + ".pattern").getFullPath().toString(), false);
			
			URI activePatternDiagramUri = URI.createPlatformResourceURI(patternProject
					.getFile(activePatternName + ".pattern_diagram").getFullPath().toString(), false);
						
			if (!complexEventFile.exists()) {
				DomainDiagramEditorUtil.createDiagram(complexEventDiagramUri, complexEventModelUri, new NullProgressMonitor());
			}
			
		    ResourceSet resourceSet = new ResourceSetImpl(); 
		    
		    //Resource CEPdomainModelResource = resourceSet.getResource(CEPdomainDiagramUri, true);
		    //Resource SmartContractModelResource = resourceSet.getResource(SmartContractsDiagramUri, true);
		    
		    Resource complexEventModelResource = resourceSet.getResource(complexEventModelUri, true);
		   	Resource patternModelResource = resourceSet.getResource(activePatternModelUri, true);
		   	Resource patternDiagramResource = resourceSet.getResource(activePatternDiagramUri, true);
		   	
		   	CEPDomain domainModel = (CEPDomain) complexEventModelResource.getContents().get(0);
		   	//System.out.println(domainModel.getDomainName());
		   	
		   	CEPEventPattern patternModel = (CEPEventPattern) patternModelResource.getContents().get(0);
		   	//System.out.println(patternModel.getComplexEvent().getTypeName());	
		   	
		   	String csvPath = null;
			String csvFile = null;
			
			FileDialog dialog = new FileDialog(shell, SWT.OPEN);
			dialog.setText("Select the CSV File to send the events.");
			
			dialog.setFilterExtensions(new String[] { "*.csv" });
			
			dialog.setFilterNames(new String[] { "CSV Files (*.csv)" });
			dialog.open();

			if (dialog.getFileName() != null && !dialog.getFileName().equals("")) {
				csvFile = dialog.getFileName();
				csvPath = dialog.getFilterPath();
				csvPath = csvPath + "/" + csvFile;
			}
			
			System.out.println(csvPath);
			
			try {
				complexEventModelResource.save(null);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			try {
				//Simulator.runApp(domainModel, patternModel, csvPath);
				//NetworkAttackCSVSimulator.runApp();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
			
		} catch (CoreException e1) {
			e1.printStackTrace();
		}
		
		MessageDialog.openInformation(shell, "Application running", "Application succesfully started.");
		
		return null;
	}

}
