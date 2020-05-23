package es.uca.modeling.cep.eventpattern.menu.command;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

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
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;

//import app.esper.GenericListener;
//import app.esper.NetworkAttackCSVSimulator;
//import app.esper.Simulator;
import domain.CEPDomain;
import domain.diagram.part.DomainDiagramEditorUtil;
import es.uca.modeling.cep.app.esper.Simulator;
import cepapp.CEPApp;
import cepapp.Event;
import cepapp.InputFile;
import cepapp.diagram.part.CepappDiagramEditor;
import cepapp.impl.EventImpl;

import eventpattern.ComplexEvent;
import eventpattern.CEPEventPattern;
import eventpattern.diagram.part.EventpatternDiagramEditor;
import eventpattern.diagram.status.EventPatternsStatus;
import smartcontract.PropertyTypeValue;

public class StartAppHandler extends AbstractHandler {
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Shell shell = HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell();
		
		// 1º Obtain the active editor's diagram
		
		CepappDiagramEditor cepappDiagramEditor = (CepappDiagramEditor) HandlerUtil.getActiveEditor(event);
		
        if (cepappDiagramEditor == null || !cepappDiagramEditor.getTitle().endsWith("cepapp_diagram")) {
        	MessageDialog.openError(shell, "Start App", "An CEP application must be open.");
        	return null; 
        }
        
        // 2º Save all changes made in the editor       
        cepappDiagramEditor.doSave(new NullProgressMonitor());
        
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
			MessageDialog.openError(shell, "Start App", "There are some problems that must be solved before saving the CEP application.");
			
			try {
				HandlerUtil.getActiveWorkbenchWindowChecked(event).getActivePage().showView("org.eclipse.ui.views.ProblemView");
			} catch (PartInitException e) {
				e.printStackTrace();
			}
			
        	return null; 
		}
	 	
		String domainName = EventPatternsStatus.getDomainName();
		String smartContractsName = EventPatternsStatus.getSmartcontractsName();
		//String activePatternName = patternDiagramEditor.getTitle().replace(".pattern_diagram","");
		
		String activeCepappName = cepappDiagramEditor.getTitle().replace(".cepapp_diagram","");
		
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IProject CEPdomainProject = myWorkspaceRoot.getProject("domain");
		IProject SmartContractProject = myWorkspaceRoot.getProject("smartcontract");
		IProject complexEventProject = myWorkspaceRoot.getProject(domainName + "_complex_events");
		
		IProject cepappProject = myWorkspaceRoot.getProject(domainName + "_apps");

		try {
			if (!complexEventProject.exists()) {
				complexEventProject.create(null);
			}
				
			// Open if necessary
			if (!complexEventProject.isOpen()) {
				complexEventProject.open(null);
			}
			
			// Open if necessary
			if (!cepappProject.isOpen()) {
				cepappProject.open(null);
			}
			
			IFile complexEventFile = complexEventProject.getFile(domainName + "_complex_events" + ".domain_diagram");
			
			URI complexEventDiagramUri = URI.createPlatformResourceURI(complexEventProject.
					getFile(domainName + "_complex_events" + ".domain_diagram").getFullPath().toString(), false);
			URI complexEventModelUri = URI.createPlatformResourceURI(complexEventProject.
					getFile(domainName + "_complex_events" + ".domain").getFullPath().toString(), false);
					
			URI activeCepappModelUri = URI.createPlatformResourceURI(cepappProject
					.getFile(activeCepappName + ".cepapp").getFullPath().toString(), false);
			
			URI activeCepappDiagramUri = URI.createPlatformResourceURI(cepappProject
					.getFile(activeCepappName + ".cepapp_diagram").getFullPath().toString(), false);
			
			if (!complexEventFile.exists()) {
				DomainDiagramEditorUtil.createDiagram(complexEventDiagramUri, complexEventModelUri, new NullProgressMonitor());
			}
			
		    ResourceSet resourceSet = new ResourceSetImpl(); 
		    
		    //Resource CEPdomainModelResource = resourceSet.getResource(CEPdomainDiagramUri, true);
		    //Resource SmartContractModelResource = resourceSet.getResource(SmartContractsDiagramUri, true);
		    
		    Resource complexEventModelResource = resourceSet.getResource(complexEventModelUri, true);
		    
		    
		   	Resource cepappModelResource = resourceSet.getResource(activeCepappModelUri, true);
		   	Resource cepappDiagramResource = resourceSet.getResource(activeCepappDiagramUri, true);

		   	CEPDomain domainModel = (CEPDomain) complexEventModelResource.getContents().get(0);
		   	//System.out.println(domainModel.getDomainName());
		   	
		   	//System.out.println(cepappModelResource.getContents().get(0).getClass().toString());
		   	CEPApp cepappModel = (CEPApp) cepappModelResource.getContents().get(0);
		   	//System.out.println(patternModel.getComplexEvent().getTypeName());	
		   	
		   	System.out.println("Links");
		   	for (int i = 0; i < cepappModel.getLinks().size(); i++) {
		   		System.out.println(cepappModel.getLinks().get(i).toString());
		   	}
		   	
		   	System.out.println("Source elements");
		   	for (int j = 0; j < cepappModel.getSourceElements().size(); j++) {
		   		System.out.println(cepappModel.getSourceElements().get(j).toString());
		   	}
		   	
		   	System.out.println("Sink elements");
		   	for (int z = 0; z < cepappModel.getSinkElements().size(); z++) {
		   		System.out.println(cepappModel.getSinkElements().get(z).toString());
		   	}
			
			try {
				complexEventModelResource.save(null);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			
			try {
				Simulator.runApp(cepappModel);
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
