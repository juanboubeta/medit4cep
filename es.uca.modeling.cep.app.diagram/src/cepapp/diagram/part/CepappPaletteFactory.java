
/*
 * 
 */
package cepapp.diagram.part;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gef.Request;
import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeRequest;
import org.eclipse.gmf.runtime.diagram.ui.tools.CreationTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import cepapp.diagram.providers.CepappElementTypes;
import cepapp.diagram.status.CepAppStatus;

/**
 * @generated
 */
public class CepappPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createDefault1Group());
		paletteRoot.add(createSimpleEvents2Group());
		paletteRoot.add(createComplexEvents3Group());
		paletteRoot.add(createFile4Group());
		paletteRoot.add(createMQTT5Group());
		paletteRoot.add(createInternalQueue6Group());
	}

	/**
	* Creates "Default" palette tool group
	* @generated
	*/
	private PaletteContainer createDefault1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Default1Group_title);
		paletteContainer.setId("createDefault1Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Default1Group_desc);
		paletteContainer.add(createLink1CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Simple Events" palette tool group
	* @generated NOT
	*/
	/*private PaletteContainer createSimpleEvents2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.SimpleEvents2Group_title);
		paletteContainer.setId("createSimpleEvents2Group"); //$NON-NLS-1$
		paletteContainer.add(createEvent1CreationTool());
		paletteContainer.add(createEventProperty2CreationTool());
		return paletteContainer;
	}*/

	private PaletteContainer createSimpleEvents2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.SimpleEvents2Group_title);
		paletteContainer.setId("createSimpleEvents2Group"); //$NON-NLS-1$

		// Added
		addSimpleEventTools(paletteContainer);

		return paletteContainer;
	}

	protected void addSimpleEventTools(PaletteContainer paletteContainer) {

		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IProject domainProject = myWorkspaceRoot.getProject("domain");

		try {

			if (domainProject.exists()) {

				if (!domainProject.isOpen()) {
					domainProject.open(null);
				}
				// Cambiar para que introduzca en eventos, tambien aquellos que se utilicen en patrones como eventos simples.
				String domainName = CepAppStatus.getDomainName();

				if (domainProject.getFile(domainName + ".domain") != null) {

					URI modelUri = URI.createPlatformResourceURI(
							domainProject.getFile(domainName + ".domain").getFullPath().toString(), false);

					ResourceSet resourceSet = new ResourceSetImpl();
					Resource modelResource = resourceSet.getResource(modelUri, true);
					String toolName = null;
					String imagePath = null;

					for (TreeIterator iter = EcoreUtil.getAllContents(modelResource, true); iter.hasNext();) {
						EObject eObject = (EObject) iter.next();

						if (eObject.getClass().getSimpleName().equals("EventImpl")) {

							toolName = ((domain.Event) eObject).getTypeName().toString();
							imagePath = ((domain.Event) eObject).getImagePath();
							paletteContainer.add(createCustomisedEventCreationTool(toolName, imagePath));

							iter.prune(); // Causes the following next() call to skip over any children of the current node								

						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Added
	private ToolEntry createCustomisedEventCreationTool(String toolName, String imagePath) {

		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(CepappElementTypes.Event_2009);

		NodeToolEntry entry = new NodeToolEntry(toolName, "Add " + toolName, types);
		entry.setId("create" + toolName + "CreationTool");

		if (imagePath == null || imagePath.equals("") || !(new File(imagePath).exists())) {
			entry.setSmallIcon(CepappElementTypes.getImageDescriptor(CepappElementTypes.Event_2009));
		} else {
			try {
				File file = new File(imagePath);
				URL url = file.toURI().toURL();
				Image scaledImage = new Image(Display.getDefault(),
						ImageDescriptor.createFromURL(url).getImageData().scaledTo(20, 20));

				entry.setSmallIcon(ImageDescriptor.createFromURL(url).createFromImage(scaledImage));
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}

		entry.setLargeIcon(entry.getSmallIcon());

		return entry;
	}

	/**
	* Creates "Complex Events" palette tool group
	* @generated NOT
	*/
	/*private PaletteContainer createComplexEvents3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.ComplexEvents3Group_title);
		paletteContainer.setId("createComplexEvents3Group"); //$NON-NLS-1$
		paletteContainer.add(createNewComplexEvent1CreationTool());
		paletteContainer.add(createNewComplexEventProperty2CreationTool());
		return paletteContainer;
	}*/

	private PaletteContainer createComplexEvents3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.ComplexEvents3Group_title);
		paletteContainer.setId("createComplexEvents3Group"); //$NON-NLS-1$
		/*paletteContainer.add(createNewComplexEvent1CreationTool());
		paletteContainer.add(createNewComplexEventProperty2CreationTool());*/

		// Added
		addComplexEventTools(paletteContainer);

		return paletteContainer;
	}

	/**
	* Creates "File" palette tool group
	* @generated
	*/
	private PaletteContainer createFile4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.File4Group_title);
		paletteContainer.setId("createFile4Group"); //$NON-NLS-1$
		paletteContainer.add(createInputFile1CreationTool());
		paletteContainer.add(createOutputFile2CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "MQTT" palette tool group
	* @generated
	*/
	private PaletteContainer createMQTT5Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.MQTT5Group_title);
		paletteContainer.setId("createMQTT5Group"); //$NON-NLS-1$
		paletteContainer.add(createSourceMQTT1CreationTool());
		paletteContainer.add(createSinkMQTT2CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Internal Queue" palette tool group
	* @generated
	*/
	private PaletteContainer createInternalQueue6Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.InternalQueue6Group_title);
		paletteContainer.setId("createInternalQueue6Group"); //$NON-NLS-1$
		paletteContainer.add(createInMemorySource1CreationTool());
		paletteContainer.add(createInMemorySink2CreationTool());
		return paletteContainer;
	}

	protected void addComplexEventTools(PaletteContainer paletteContainer) {

		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

		String activeAppName = CepAppStatus.getActiveCepApp();
		String domainName = CepAppStatus.getDomainName();

		IProject complexEventProject = myWorkspaceRoot.getProject(domainName + "_complex_events");

		try {

			if (complexEventProject.exists()) {

				if (!complexEventProject.isOpen()) {
					complexEventProject.open(null);
				}

				if (complexEventProject.getFile(domainName + "_complex_events.domain") != null) {

					URI modelUri = URI.createPlatformResourceURI(
							complexEventProject.getFile(domainName + "_complex_events.domain").getFullPath().toString(),
							false);

					ResourceSet resourceSet = new ResourceSetImpl();
					Resource modelResource = resourceSet.getResource(modelUri, true);
					String toolName = null;
					String imagePath = null;

					for (TreeIterator iter = EcoreUtil.getAllContents(modelResource, true); iter.hasNext();) {
						EObject eObject = (EObject) iter.next();

						if (eObject.getClass().getSimpleName().equals("EventImpl")) {

							toolName = ((domain.Event) eObject).getTypeName().toString();
							imagePath = ((domain.Event) eObject).getImagePath();
							paletteContainer
									.add(createCustomisedComplexEventCreationTool(toolName, imagePath, activeAppName));

							iter.prune(); // Causes the following next() call to skip over any children of the current node								

						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Added
	private ToolEntry createCustomisedComplexEventCreationTool(String toolName, String imagePath, String patternName) {

		NodeToolEntry entry = new NodeToolEntry(toolName, "Add " + toolName,
				Collections.singletonList(CepappElementTypes.ComplexEvent_2010), patternName);
		entry.setId("create" + toolName + "CreationTool");

		if (imagePath == null || imagePath.equals("") || !(new File(imagePath).exists())) {
			entry.setSmallIcon(CepappElementTypes.getImageDescriptor(CepappElementTypes.ComplexEvent_2010));
		} else {
			try {
				File file = new File(imagePath);
				URL url = file.toURI().toURL();
				Image scaledImage = new Image(Display.getDefault(),
						ImageDescriptor.createFromURL(url).getImageData().scaledTo(20, 20));

				entry.setSmallIcon(ImageDescriptor.createFromURL(url).createFromImage(scaledImage));
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}

		entry.setLargeIcon(entry.getSmallIcon());

		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLink1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Link1CreationTool_title,
				Messages.Link1CreationTool_desc, Collections.singletonList(CepappElementTypes.Link_4001));
		entry.setId("createLink1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CepappElementTypes.getImageDescriptor(CepappElementTypes.Link_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEvent1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Event1CreationTool_title,
				Messages.Event1CreationTool_desc, Collections.singletonList(CepappElementTypes.Event_2009));
		entry.setId("createEvent1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CepappElementTypes.getImageDescriptor(CepappElementTypes.Event_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEventProperty2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(CepappElementTypes.EventProperty_3001);
		types.add(CepappElementTypes.EventProperty_3002);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.EventProperty2CreationTool_title,
				Messages.EventProperty2CreationTool_desc, types);
		entry.setId("createEventProperty2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CepappElementTypes.getImageDescriptor(CepappElementTypes.EventProperty_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createNewComplexEvent1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.NewComplexEvent1CreationTool_title,
				Messages.NewComplexEvent1CreationTool_desc,
				Collections.singletonList(CepappElementTypes.ComplexEvent_2010));
		entry.setId("createNewComplexEvent1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CepappElementTypes.getImageDescriptor(CepappElementTypes.ComplexEvent_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createNewComplexEventProperty2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(CepappElementTypes.ComplexEventProperty_3003);
		types.add(CepappElementTypes.ComplexEventProperty_3004);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.NewComplexEventProperty2CreationTool_title,
				Messages.NewComplexEventProperty2CreationTool_desc, types);
		entry.setId("createNewComplexEventProperty2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CepappElementTypes.getImageDescriptor(CepappElementTypes.ComplexEventProperty_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInputFile1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InputFile1CreationTool_title,
				Messages.InputFile1CreationTool_desc, Collections.singletonList(CepappElementTypes.InputFile_2001));
		entry.setId("createInputFile1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CepappElementTypes.getImageDescriptor(CepappElementTypes.InputFile_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOutputFile2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.OutputFile2CreationTool_title,
				Messages.OutputFile2CreationTool_desc, Collections.singletonList(CepappElementTypes.OutputFile_2005));
		entry.setId("createOutputFile2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CepappElementTypes.getImageDescriptor(CepappElementTypes.OutputFile_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSourceMQTT1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SourceMQTT1CreationTool_title,
				Messages.SourceMQTT1CreationTool_desc, Collections.singletonList(CepappElementTypes.SourceMqtt_2004));
		entry.setId("createSourceMQTT1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CepappElementTypes.getImageDescriptor(CepappElementTypes.SourceMqtt_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSinkMQTT2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SinkMQTT2CreationTool_title,
				Messages.SinkMQTT2CreationTool_desc, Collections.singletonList(CepappElementTypes.SinkMqtt_2008));
		entry.setId("createSinkMQTT2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CepappElementTypes.getImageDescriptor(CepappElementTypes.SinkMqtt_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInMemorySource1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InMemorySource1CreationTool_title,
				Messages.InMemorySource1CreationTool_desc,
				Collections.singletonList(CepappElementTypes.InMemoryInput_2011));
		entry.setId("createInMemorySource1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CepappElementTypes.getImageDescriptor(CepappElementTypes.InMemoryInput_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInMemorySink2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InMemorySink2CreationTool_title,
				Messages.InMemorySink2CreationTool_desc,
				Collections.singletonList(CepappElementTypes.InMemoryOutput_2012));
		entry.setId("createInMemorySink2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CepappElementTypes.getImageDescriptor(CepappElementTypes.InMemoryOutput_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated NOT
	*/

	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated NOT
		 */
		private final List<IElementType> elementTypes;
		//Added
		private String patternName = null;

		/**
		 * @generated NOT
		 */
		private NodeToolEntry(String title, String description, List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		// Added
		public NodeToolEntry(String title, String description, List<IElementType> elementTypes, String patternName) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
			this.patternName = patternName;
		}

		/**
		 * @generated NOT
		 */
		public Tool createTool() {

			Tool tool;

			if (elementTypes.contains(CepappElementTypes.Event_2009)) {

				tool = new CustomisedEventTypeCreationTool(elementTypes, this.getLabel());

			} else if (elementTypes.contains(CepappElementTypes.ComplexEvent_2010)) { // except to "New Complex Event" component
				ArrayList<IElementType> types = new ArrayList<IElementType>(1);
				// types.add(CepappElementTypes.Event_2009);
				types.add(CepappElementTypes.ComplexEvent_2010);

				// Complex Event Tools will have the same type as the Event Tools 
				// because when we use Complex Event Tools into canvas they will 
				// be considered as Events in order to create new complexer Complex Events.
				tool = new CustomisedComplexEventTypeCreationTool(types, this.getLabel(), patternName);
			} else {
				tool = new UnspecifiedTypeCreationTool(elementTypes);
			}

			tool.setProperties(getToolProperties());

			return tool;
		}

		/* Add class
		 * 
		 * @see eventpattern.diagram.edit.helpers.EventEditHelper
		 */
		public class CustomisedEventTypeCreationTool extends CreationTool {

			protected String node;
			private List elementTypes;

			public CustomisedEventTypeCreationTool(List elementTypes, String node) {
				super();
				this.node = node;
				this.elementTypes = elementTypes;
			}

			protected Request createTargetRequest() {

				CreateUnspecifiedTypeRequest request = new CreateUnspecifiedTypeRequest(elementTypes,
						getPreferencesHint());

				request.getExtendedData().put("clickedEventTool", node);

				return request;
			}
		}

		/* Add class
		 * 
		 * @see eventpattern.diagram.edit.helpers.EventEditHelper
		 */
		public class CustomisedComplexEventTypeCreationTool extends CreationTool {

			protected String node;
			private List elementTypes;

			// Added
			private String patternName;

			public CustomisedComplexEventTypeCreationTool(List elementTypes, String node, String patternName) {
				super();
				this.node = node;
				this.elementTypes = elementTypes;
				this.patternName = patternName;
			}

			protected Request createTargetRequest() {

				CreateUnspecifiedTypeRequest request = new CreateUnspecifiedTypeRequest(elementTypes,
						getPreferencesHint());

				request.getExtendedData().put("clickedComplexEventTool", node);
				request.getExtendedData().put("patternName", patternName);

				return request;
			}
		}
	}
}
