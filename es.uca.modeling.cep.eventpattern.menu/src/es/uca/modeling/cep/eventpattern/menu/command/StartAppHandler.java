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

import app.esper.NetworkAttackCSVSimulator;
import app.esper.Simulator;
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

public class StartAppHandler extends AbstractHandler {

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
			
			/*URI CEPdomainDiagramUri = URI.createPlatformResourceURI(CEPdomainProject.
					getFile(domainName + ".domain_diagram").getFullPath().toString(), false);
			URI CEPdomainModelUri = URI.createPlatformResourceURI(CEPdomainProject.
					getFile(domainName + ".domain").getFullPath().toString(), false);
			
			URI SmartContractsDiagramUri = URI.createPlatformResourceURI(SmartContractProject.
					getFile(smartContractsName + ".smartc_diagram").getFullPath().toString(), false);
			URI SmartcontractsModelUri = URI.createPlatformResourceURI(SmartContractProject.
					getFile(smartContractsName + ".smartc").getFullPath().toString(), false);*/
			
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
		   	
		    /*CEPDomain domainModel = (CEPDomain) complexEventModelResource.getContents().get(0);
		    domainModel.setDomainName(domainName);
		    
		    DomainPackage.eINSTANCE.eClass();
			// Get the default factory singleton
			DomainFactory factory = DomainFactory.eINSTANCE;
			
			domain.Event e = factory.createEvent();
			
			for (Iterator iter = EcoreUtil.getAllContents(patternModelResource, true); iter.hasNext();) {
				EObject eObject = (EObject) iter.next();
				
				if (eObject.getClass().getSimpleName().equals("ComplexEventImpl")) {

					ComplexEvent complexEvent = ((ComplexEvent) eObject);
					
					e.setTypeName(complexEvent.getTypeName());
					e.setImagePath(complexEvent.getImagePath());
					
					// If the NewComplexEvent is linked with an event, which does not have nested properties 
					if (complexEvent.getComplexEventProperties().isEmpty()) {
						
						for (eventpattern.EventProperty property : ((eventpattern.Event) complexEvent.getInboundLink().
								get(0).getOperand()).getEventProperties()) {
							
							domain.EventProperty p = factory.createEventProperty();
							p.setImagePath(property.getImagePath());
							p.setName(property.getName());
							
							eventpattern.PropertyTypeValue type;
							type = property.getType();
							
							if (type.compareTo(eventpattern.PropertyTypeValue.STRING) == 0) { 
								p.setType(domain.PropertyTypeValue.STRING);
							}
							else if (type.compareTo(eventpattern.PropertyTypeValue.DOUBLE) == 0) { 
								p.setType(domain.PropertyTypeValue.DOUBLE);
							}
							else if (type.compareTo(eventpattern.PropertyTypeValue.FLOAT) == 0) { 
								p.setType(domain.PropertyTypeValue.FLOAT);
							}
							else if (type.compareTo(eventpattern.PropertyTypeValue.LONG) == 0) { 
								p.setType(domain.PropertyTypeValue.LONG);
							}
							else if (type.compareTo(eventpattern.PropertyTypeValue.INTEGER) == 0) { 
								p.setType(domain.PropertyTypeValue.INTEGER);
							}
							else if (type.compareTo(eventpattern.PropertyTypeValue.BOOLEAN) == 0) { 
								p.setType(domain.PropertyTypeValue.BOOLEAN);
							}
						
							e.getEventProperties().add(p);
						}							
	
					}
					else { // If the NewComplexEvent contains complex event properties linked with event properties.
						for (ComplexEventProperty complexProperty : complexEvent.getComplexEventProperties()) {
							domain.EventProperty p = factory.createEventProperty();
							p.setImagePath(complexProperty.getImagePath());
							p.setName(complexProperty.getName()); 
	
							// Obtain the type of complex event property
							
							// complexProperty will only have an inboundLink because it is a unary operator
							String operandName = complexProperty.getInboundLink().get(0).getOperand().getClass().getSimpleName();
							eventpattern.PropertyTypeValue type; 
							
							if (operandName.equals("ValueImpl")) {
								 type = ((Value)complexProperty.getInboundLink().get(0).getOperand()).getType();
							}
							else if (operandName.equals("EventPropertyImpl")) {
								 type = ((eventpattern.EventProperty)complexProperty.getInboundLink().get(0).getOperand()).getType();
							}
							else { // operand of complex event property is an aggregation or arithmetic operator
								type = eventpattern.PropertyTypeValue.DOUBLE;
							}
										
							
							if (type.compareTo(eventpattern.PropertyTypeValue.STRING) == 0) { 
								p.setType(domain.PropertyTypeValue.STRING);
							}
							else if (type.compareTo(eventpattern.PropertyTypeValue.DOUBLE) == 0) { 
								p.setType(domain.PropertyTypeValue.DOUBLE);
							}
							else if (type.compareTo(eventpattern.PropertyTypeValue.FLOAT) == 0) { 
								p.setType(domain.PropertyTypeValue.FLOAT);
							}
							else if (type.compareTo(eventpattern.PropertyTypeValue.LONG) == 0) { 
								p.setType(domain.PropertyTypeValue.LONG);
							}
							else if (type.compareTo(eventpattern.PropertyTypeValue.INTEGER) == 0) { 
								p.setType(domain.PropertyTypeValue.INTEGER);
							}
							else if (type.compareTo(eventpattern.PropertyTypeValue.BOOLEAN) == 0) { 
								p.setType(domain.PropertyTypeValue.BOOLEAN);
							}
							
							e.getEventProperties().add(p);
						}
					}
					
					break;
				}
			}
        
			boolean simpleEventExists = false; 
	    	
			for (Iterator iter = EcoreUtil.getAllContents(domainModel.getEvents(), true); iter.hasNext();) {
				EObject eObject = (EObject) iter.next();
				
				if (eObject.getClass().getSimpleName().equals("EventImpl")) {
					
					domain.Event simpleEvent = (domain.Event)eObject;
															
					// If the simple event already exists
					if (simpleEvent.getTypeName().equals(e.getTypeName())) {
						simpleEventExists = true;
						
						// If the existing simple event has been graphically changed, then it will be modified in 
						// the complex event model.
						// see ComplexEventEditPart.java
						  if(EventPatternsStatus.getComplexEventChanges().get(activePatternName) != null && 
								  EventPatternsStatus.getComplexEventChanges().get(activePatternName)) {
							  								
								EcoreUtil.replace(simpleEvent, e);
								complexEventModelResource.save(null);
									
								// Change the palette of all existing editors
								File currentDir = new File(patternProject.getLocationURI()); 
								        
								File[] files = currentDir.listFiles();
								
								for (File file : files) {
															
									// Add a complex event tool per complex event component defined in each pattern (except to 
									// the complex event defined in the active pattern).
									if (!file.isDirectory() && file.getName().matches(".+pattern_diagram") && !file.getName().
											equals(activePatternName + ".pattern_diagram")) {
																																
										URI diagramUri = URI.createPlatformResourceURI(patternProject
												.getFile(file.getName()).getFullPath().toString(), false);
												
										Resource diagramResource = resourceSet.getResource(diagramUri, true);
										
										EventpatternDiagramEditorUtil.openDiagram(diagramResource);
										EventpatternDiagramEditor diagramEditor = 
												(EventpatternDiagramEditor) HandlerUtil.getActiveEditor(event);
																				
										diagramEditor.refreshPaletteComplexEvent();
										
									}
								}
								
								EventpatternDiagramEditorUtil.openDiagram(patternDiagramResource);
								EventPatternsStatus.getComplexEventChanges().put(activePatternName, false);
						  }
					}
				}
			}
			
			if(!simpleEventExists) {
				domainModel.getEvents().add(e);
				complexEventModelResource.save(null);
			}*/
			
			try {
				complexEventModelResource.save(null);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			try {
				Simulator.runApp(domainModel, patternModel, csvPath);
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
