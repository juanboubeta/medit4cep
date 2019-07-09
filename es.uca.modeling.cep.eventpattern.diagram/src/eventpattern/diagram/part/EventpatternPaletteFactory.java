/*******************************************************************************
 * Copyright (c) 2011, 2015 Juan Boubeta-Puig
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Juan Boubeta-Puig - modifications marked as @generated NOT
 ******************************************************************************/

package eventpattern.diagram.part;

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
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import eventpattern.diagram.status.EventPatternsStatus;
import eventpattern.diagram.part.Messages;
import eventpattern.diagram.providers.EventpatternElementTypes;

/**
 * @generated
 */
public class EventpatternPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createDefault1Group());
		paletteRoot.add(createSimpleEvents2Group());
		paletteRoot.add(createSmartContracts3Group());
		paletteRoot.add(createComplexEvents4Group());
		paletteRoot.add(createPatternTimers5Group());
		paletteRoot.add(createPatternOperators6Group());
		paletteRoot.add(createLogicalOperators7Group());
		paletteRoot.add(createComparisonOperators8Group());
		paletteRoot.add(createArithmeticOperators9Group());
		paletteRoot.add(createAggregationOperators10Group());
		paletteRoot.add(createDataWindows11Group());
		paletteRoot.add(createActions12Group());
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
		paletteContainer.add(createValue2CreationTool());
		paletteContainer.add(createGroupBy3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Simple Events" palette tool group
	 * @generated NOT
	 */
	/*
	private PaletteContainer createSimpleEvents2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.SimpleEvents2Group_title);
		paletteContainer.setId("createSimpleEvents2Group"); //$NON-NLS-1$
		paletteContainer.add(createEvent1CreationTool());
		paletteContainer.add(createEventProperty2CreationTool());
		return paletteContainer;
	}
	 */
	private PaletteContainer createSimpleEvents2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.SimpleEvents2Group_title);
		paletteContainer.setId("createSimpleEvents2Group"); //$NON-NLS-1$

		// Added
		addSimpleEventTools(paletteContainer);

		return paletteContainer;
	}

	/**
	* Creates "Pattern Timers" palette tool group
	* @generated
	*/
	private PaletteContainer createPatternTimers5Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.PatternTimers5Group_title);
		paletteContainer.setId("createPatternTimers5Group"); //$NON-NLS-1$
		paletteContainer.add(createTimeInterval1CreationTool());
		paletteContainer.add(createTimeSchedule2CreationTool());
		paletteContainer.add(createWithinTimer3CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Pattern Operators" palette tool group
	* @generated
	*/
	private PaletteContainer createPatternOperators6Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.PatternOperators6Group_title);
		paletteContainer.setId("createPatternOperators6Group"); //$NON-NLS-1$
		paletteContainer.add(createEvery1CreationTool());
		paletteContainer.add(createEveryDistinct2CreationTool());
		paletteContainer.add(createFollowedBy3CreationTool());
		paletteContainer.add(createRange4CreationTool());
		paletteContainer.add(createRepeat5CreationTool());
		paletteContainer.add(createUntil6CreationTool());
		paletteContainer.add(createWhile7CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Logical Operators" palette tool group
	* @generated
	*/
	private PaletteContainer createLogicalOperators7Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.LogicalOperators7Group_title);
		paletteContainer.setId("createLogicalOperators7Group"); //$NON-NLS-1$
		paletteContainer.add(createAnd1CreationTool());
		paletteContainer.add(createNot2CreationTool());
		paletteContainer.add(createOr3CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Comparison Operators" palette tool group
	* @generated
	*/
	private PaletteContainer createComparisonOperators8Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.ComparisonOperators8Group_title);
		paletteContainer.setId("createComparisonOperators8Group"); //$NON-NLS-1$
		paletteContainer.add(createEqual1CreationTool());
		paletteContainer.add(createGreaterEqual2CreationTool());
		paletteContainer.add(createGreaterThan3CreationTool());
		paletteContainer.add(createLessEqual4CreationTool());
		paletteContainer.add(createLessThan5CreationTool());
		paletteContainer.add(createNotEqual6CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Arithmetic Operators" palette tool group
	* @generated
	*/
	private PaletteContainer createArithmeticOperators9Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.ArithmeticOperators9Group_title);
		paletteContainer.setId("createArithmeticOperators9Group"); //$NON-NLS-1$
		paletteContainer.add(createAddition1CreationTool());
		paletteContainer.add(createDivision2CreationTool());
		paletteContainer.add(createModulus3CreationTool());
		paletteContainer.add(createMultiplication4CreationTool());
		paletteContainer.add(createSubtraction5CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Aggregation Operators" palette tool group
	* @generated
	*/
	private PaletteContainer createAggregationOperators10Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.AggregationOperators10Group_title);
		paletteContainer.setId("createAggregationOperators10Group"); //$NON-NLS-1$
		paletteContainer.add(createAvg1CreationTool());
		paletteContainer.add(createCount2CreationTool());
		paletteContainer.add(createMax3CreationTool());
		paletteContainer.add(createMin4CreationTool());
		paletteContainer.add(createSum5CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Data Windows" palette tool group
	* @generated
	*/
	private PaletteContainer createDataWindows11Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.DataWindows11Group_title);
		paletteContainer.setId("createDataWindows11Group"); //$NON-NLS-1$
		paletteContainer.add(createBatchingEventInterval1CreationTool());
		paletteContainer.add(createBatchingTimeInterval2CreationTool());
		paletteContainer.add(createSlidingEventInterval3CreationTool());
		paletteContainer.add(createSlidingTimeInterval4CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Actions" palette tool group
	* @generated
	*/
	private PaletteContainer createActions12Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Actions12Group_title);
		paletteContainer.setId("createActions12Group"); //$NON-NLS-1$
		paletteContainer.add(createEmail1CreationTool());
		paletteContainer.add(createTwitter2CreationTool());
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

				String domainName = EventPatternsStatus.getDomainName();

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

		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(EventpatternElementTypes.Event_2027);
		types.add(EventpatternElementTypes.Event_3024);
		types.add(EventpatternElementTypes.Event_3053);

		NodeToolEntry entry = new NodeToolEntry(toolName, "Add " + toolName, types);
		entry.setId("create" + toolName + "CreationTool");

		if (imagePath == null || imagePath.equals("") || !(new File(imagePath).exists())) {
			entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.Event_2027));
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
	/*
	private PaletteContainer createComplexEvents4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.ComplexEvents4Group_title);
		paletteContainer.setId("createComplexEvents4Group"); //$NON-NLS-1$
		paletteContainer.add(createNewComplexEvent1CreationTool());
		paletteContainer.add(createNewComplexEventProperty2CreationTool());
		return paletteContainer;
	}*/

	private PaletteContainer createComplexEvents4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.ComplexEvents4Group_title);
		paletteContainer.setId("createComplexEvents4Group"); //$NON-NLS-1$
		paletteContainer.add(createNewComplexEvent1CreationTool());
		paletteContainer.add(createNewComplexEventProperty2CreationTool());

		// Added
		addComplexEventTools(paletteContainer);

		return paletteContainer;
	}

	protected void addComplexEventTools(PaletteContainer paletteContainer) {

		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

		String activePatternName = EventPatternsStatus.getActivePatternName();
		String domainName = EventPatternsStatus.getDomainName();

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

							// If the complex event tool to be created is different to the complex event 
							// defined in the active pattern
							if (!toolName.equals(activePatternName))
								paletteContainer.add(createCustomisedComplexEventCreationTool(toolName, imagePath,
										activePatternName));

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
				Collections.singletonList(EventpatternElementTypes.ComplexEvent_2038), patternName);
		entry.setId("create" + toolName + "CreationTool");

		if (imagePath == null || imagePath.equals("") || !(new File(imagePath).exists())) {
			entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.ComplexEvent_2038));
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
	 * Creates "Smart Contracts" palette tool group
	 * @generated NOT
	 */
	/*
	private PaletteContainer createSmartContracts3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.SmartContracts3Group_title);
		paletteContainer.setId("createSmartContracts3Group"); //$NON-NLS-1$
		paletteContainer.add(createSmartContract1CreationTool());
		paletteContainer.add(createContractFunction2CreationTool());
		paletteContainer.add(createInputParameter3CreationTool());
		paletteContainer.add(createOutputParameter4CreationTool());
		return paletteContainer;
	}
	 */

	private PaletteContainer createSmartContracts3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.SmartContracts3Group_title);
		paletteContainer.setId("SmartContracts3Group"); //$NON-NLS-1$

		// Added
		addSmartContractTools(paletteContainer);

		return paletteContainer;
	}

	protected void addSmartContractTools(PaletteContainer paletteContainer) {

		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IProject smartcontractProject = myWorkspaceRoot.getProject("smartcontract");

		try {

			if (smartcontractProject.exists()) {

				if (!smartcontractProject.isOpen()) {
					smartcontractProject.open(null);
				}

				String smartcontractName = EventPatternsStatus.getSmartcontractsName();

				if (smartcontractProject.getFile(smartcontractName + ".smartc") != null) {

					URI modelUri = URI.createPlatformResourceURI(
							smartcontractProject.getFile(smartcontractName + ".smartc").getFullPath().toString(),
							false);

					ResourceSet resourceSet = new ResourceSetImpl();
					Resource modelResource = resourceSet.getResource(modelUri, true);
					String toolName = null;
					String imagePath = null;

					for (TreeIterator iter = EcoreUtil.getAllContents(modelResource, true); iter.hasNext();) {
						EObject eObject = (EObject) iter.next();

						if (eObject.getClass().getSimpleName().equals("SmartContractImpl")) {

							toolName = ((smartcontract.SmartContract) eObject).getTypeName().toString();
							imagePath = ((smartcontract.SmartContract) eObject).getImagePath();
							paletteContainer.add(createCustomisedSmartContractCreationTool(toolName, imagePath));

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
	private ToolEntry createCustomisedSmartContractCreationTool(String toolName, String imagePath) {

		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(EventpatternElementTypes.SmartContract_2041);

		NodeToolEntry entry = new NodeToolEntry(toolName, "Add " + toolName, types);
		entry.setId("create" + toolName + "CreationTool");

		if (imagePath == null || imagePath.equals("") || !(new File(imagePath).exists())) {
			entry.setSmallIcon(
					EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.SmartContract_2041));
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
	private ToolEntry createAddition1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(EventpatternElementTypes.Addition_2004);
		types.add(EventpatternElementTypes.Addition_3006);
		types.add(EventpatternElementTypes.Addition_3030);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Addition1CreationTool_title,
				Messages.Addition1CreationTool_desc, types);
		entry.setId("createAddition1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.Addition_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDivision2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(EventpatternElementTypes.Division_2007);
		types.add(EventpatternElementTypes.Division_3009);
		types.add(EventpatternElementTypes.Division_3033);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Division2CreationTool_title,
				Messages.Division2CreationTool_desc, types);
		entry.setId("createDivision2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.Division_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createModulus3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(EventpatternElementTypes.Modulus_2008);
		types.add(EventpatternElementTypes.Modulus_3010);
		types.add(EventpatternElementTypes.Modulus_3034);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Modulus3CreationTool_title,
				Messages.Modulus3CreationTool_desc, types);
		entry.setId("createModulus3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.Modulus_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMultiplication4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(EventpatternElementTypes.Multiplication_2006);
		types.add(EventpatternElementTypes.Multiplication_3008);
		types.add(EventpatternElementTypes.Multiplication_3032);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Multiplication4CreationTool_title,
				Messages.Multiplication4CreationTool_desc, types);
		entry.setId("createMultiplication4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.Multiplication_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSubtraction5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(EventpatternElementTypes.Subtraction_2005);
		types.add(EventpatternElementTypes.Subtraction_3007);
		types.add(EventpatternElementTypes.Subtraction_3031);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Subtraction5CreationTool_title,
				Messages.Subtraction5CreationTool_desc, types);
		entry.setId("createSubtraction5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.Subtraction_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAvg1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(EventpatternElementTypes.Avg_2024);
		types.add(EventpatternElementTypes.Avg_3050);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Avg1CreationTool_title,
				Messages.Avg1CreationTool_desc, types);
		entry.setId("createAvg1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.Avg_2024));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCount2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(EventpatternElementTypes.Count_2025);
		types.add(EventpatternElementTypes.Count_3051);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Count2CreationTool_title,
				Messages.Count2CreationTool_desc, types);
		entry.setId("createCount2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.Count_2025));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMax3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(EventpatternElementTypes.Max_2022);
		types.add(EventpatternElementTypes.Max_3048);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Max3CreationTool_title,
				Messages.Max3CreationTool_desc, types);
		entry.setId("createMax3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.Max_2022));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMin4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(EventpatternElementTypes.Min_2023);
		types.add(EventpatternElementTypes.Min_3049);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Min4CreationTool_title,
				Messages.Min4CreationTool_desc, types);
		entry.setId("createMin4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.Min_2023));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSum5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(EventpatternElementTypes.Sum_2026);
		types.add(EventpatternElementTypes.Sum_3052);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Sum5CreationTool_title,
				Messages.Sum5CreationTool_desc, types);
		entry.setId("createSum5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.Sum_2026));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBatchingEventInterval1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.BatchingEventInterval1CreationTool_title,
				Messages.BatchingEventInterval1CreationTool_desc,
				Collections.singletonList(EventpatternElementTypes.BatchingEventInterval_2035));
		entry.setId("createBatchingEventInterval1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.BatchingEventInterval_2035));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBatchingTimeInterval2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.BatchingTimeInterval2CreationTool_title,
				Messages.BatchingTimeInterval2CreationTool_desc,
				Collections.singletonList(EventpatternElementTypes.BatchingTimeInterval_2037));
		entry.setId("createBatchingTimeInterval2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.BatchingTimeInterval_2037));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSlidingEventInterval3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SlidingEventInterval3CreationTool_title,
				Messages.SlidingEventInterval3CreationTool_desc,
				Collections.singletonList(EventpatternElementTypes.SlidingEventInterval_2034));
		entry.setId("createSlidingEventInterval3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.SlidingEventInterval_2034));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSlidingTimeInterval4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SlidingTimeInterval4CreationTool_title,
				Messages.SlidingTimeInterval4CreationTool_desc,
				Collections.singletonList(EventpatternElementTypes.SlidingTimeInterval_2036));
		entry.setId("createSlidingTimeInterval4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.SlidingTimeInterval_2036));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEmail1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Email1CreationTool_title,
				Messages.Email1CreationTool_desc, Collections.singletonList(EventpatternElementTypes.Email_2033));
		entry.setId("createEmail1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.Email_2033));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTwitter2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Twitter2CreationTool_title,
				Messages.Twitter2CreationTool_desc, Collections.singletonList(EventpatternElementTypes.Twitter_2039));
		entry.setId("createTwitter2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.Twitter_2039));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLink1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Link1CreationTool_title,
				Messages.Link1CreationTool_desc, Collections.singletonList(EventpatternElementTypes.Link_4001));
		entry.setId("createLink1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.Link_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createValue2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(EventpatternElementTypes.Value_2029);
		types.add(EventpatternElementTypes.Value_3026);
		types.add(EventpatternElementTypes.Value_3055);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Value2CreationTool_title,
				Messages.Value2CreationTool_desc, types);
		entry.setId("createValue2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.Value_2029));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGroupBy3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(EventpatternElementTypes.GroupBy_2040);
		types.add(EventpatternElementTypes.GroupBy_3060);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.GroupBy3CreationTool_title,
				Messages.GroupBy3CreationTool_desc, types);
		entry.setId("createGroupBy3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.GroupBy_2040));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEvent1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(EventpatternElementTypes.Event_2027);
		types.add(EventpatternElementTypes.Event_3024);
		types.add(EventpatternElementTypes.Event_3053);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Event1CreationTool_title,
				Messages.Event1CreationTool_desc, types);
		entry.setId("createEvent1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.Event_2027));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEventProperty2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(EventpatternElementTypes.EventProperty_3001);
		types.add(EventpatternElementTypes.EventProperty_3002);
		types.add(EventpatternElementTypes.EventProperty_2028);
		types.add(EventpatternElementTypes.EventProperty_3025);
		types.add(EventpatternElementTypes.EventProperty_3054);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.EventProperty2CreationTool_title,
				Messages.EventProperty2CreationTool_desc, types);
		entry.setId("createEventProperty2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.EventProperty_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSmartContract1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SmartContract1CreationTool_title,
				Messages.SmartContract1CreationTool_desc,
				Collections.singletonList(EventpatternElementTypes.SmartContract_2041));
		entry.setId("createSmartContract1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.SmartContract_2041));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createContractFunction2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ContractFunction2CreationTool_title,
				Messages.ContractFunction2CreationTool_desc,
				Collections.singletonList(EventpatternElementTypes.ContractFunction_3061));
		entry.setId("createContractFunction2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.ContractFunction_3061));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInputParameter3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InputParameter3CreationTool_title,
				Messages.InputParameter3CreationTool_desc,
				Collections.singletonList(EventpatternElementTypes.InputParameter_3062));
		entry.setId("createInputParameter3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.InputParameter_3062));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOutputParameter4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.OutputParameter4CreationTool_title,
				Messages.OutputParameter4CreationTool_desc,
				Collections.singletonList(EventpatternElementTypes.OutputParameter_3063));
		entry.setId("createOutputParameter4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.OutputParameter_3063));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNewComplexEvent1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.NewComplexEvent1CreationTool_title,
				Messages.NewComplexEvent1CreationTool_desc,
				Collections.singletonList(EventpatternElementTypes.ComplexEvent_2038));
		entry.setId("createNewComplexEvent1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.ComplexEvent_2038));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNewComplexEventProperty2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.NewComplexEventProperty2CreationTool_title,
				Messages.NewComplexEventProperty2CreationTool_desc,
				Collections.singletonList(EventpatternElementTypes.ComplexEventProperty_3059));
		entry.setId("createNewComplexEventProperty2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.ComplexEventProperty_3059));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTimeInterval1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(EventpatternElementTypes.TimeInterval_2031);
		types.add(EventpatternElementTypes.TimeInterval_3057);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TimeInterval1CreationTool_title,
				Messages.TimeInterval1CreationTool_desc, types);
		entry.setId("createTimeInterval1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.TimeInterval_2031));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTimeSchedule2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(EventpatternElementTypes.TimeSchedule_2032);
		types.add(EventpatternElementTypes.TimeSchedule_3058);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TimeSchedule2CreationTool_title,
				Messages.TimeSchedule2CreationTool_desc, types);
		entry.setId("createTimeSchedule2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.TimeSchedule_2032));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWithinTimer3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(EventpatternElementTypes.WithinTimer_2030);
		types.add(EventpatternElementTypes.WithinTimer_3056);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.WithinTimer3CreationTool_title,
				Messages.WithinTimer3CreationTool_desc, types);
		entry.setId("createWithinTimer3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.WithinTimer_2030));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEvery1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(EventpatternElementTypes.Every_2015);
		types.add(EventpatternElementTypes.Every_3017);
		types.add(EventpatternElementTypes.Every_3041);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Every1CreationTool_title,
				Messages.Every1CreationTool_desc, types);
		entry.setId("createEvery1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.Every_2015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEveryDistinct2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(EventpatternElementTypes.EveryDistinct_2016);
		types.add(EventpatternElementTypes.EveryDistinct_3018);
		types.add(EventpatternElementTypes.EveryDistinct_3042);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.EveryDistinct2CreationTool_title,
				Messages.EveryDistinct2CreationTool_desc, types);
		entry.setId("createEveryDistinct2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.EveryDistinct_2016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFollowedBy3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(EventpatternElementTypes.FollowedBy_2020);
		types.add(EventpatternElementTypes.FollowedBy_3022);
		types.add(EventpatternElementTypes.FollowedBy_3046);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.FollowedBy3CreationTool_title,
				Messages.FollowedBy3CreationTool_desc, types);
		entry.setId("createFollowedBy3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.FollowedBy_2020));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRange4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(EventpatternElementTypes.Range_2019);
		types.add(EventpatternElementTypes.Range_3021);
		types.add(EventpatternElementTypes.Range_3045);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Range4CreationTool_title,
				Messages.Range4CreationTool_desc, types);
		entry.setId("createRange4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.Range_2019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRepeat5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(EventpatternElementTypes.Repeat_2017);
		types.add(EventpatternElementTypes.Repeat_3019);
		types.add(EventpatternElementTypes.Repeat_3043);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Repeat5CreationTool_title,
				Messages.Repeat5CreationTool_desc, types);
		entry.setId("createRepeat5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.Repeat_2017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUntil6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(EventpatternElementTypes.Until_2018);
		types.add(EventpatternElementTypes.Until_3020);
		types.add(EventpatternElementTypes.Until_3044);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Until6CreationTool_title,
				Messages.Until6CreationTool_desc, types);
		entry.setId("createUntil6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.Until_2018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWhile7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(EventpatternElementTypes.While_2021);
		types.add(EventpatternElementTypes.While_3023);
		types.add(EventpatternElementTypes.While_3047);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.While7CreationTool_title,
				Messages.While7CreationTool_desc, types);
		entry.setId("createWhile7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.While_2021));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAnd1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(EventpatternElementTypes.And_2001);
		types.add(EventpatternElementTypes.And_3003);
		types.add(EventpatternElementTypes.And_3027);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.And1CreationTool_title,
				Messages.And1CreationTool_desc, types);
		entry.setId("createAnd1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.And_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNot2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(EventpatternElementTypes.Not_2003);
		types.add(EventpatternElementTypes.Not_3005);
		types.add(EventpatternElementTypes.Not_3029);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Not2CreationTool_title,
				Messages.Not2CreationTool_desc, types);
		entry.setId("createNot2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.Not_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOr3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(EventpatternElementTypes.Or_2002);
		types.add(EventpatternElementTypes.Or_3004);
		types.add(EventpatternElementTypes.Or_3028);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Or3CreationTool_title,
				Messages.Or3CreationTool_desc, types);
		entry.setId("createOr3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.Or_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEqual1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(EventpatternElementTypes.Equal_2009);
		types.add(EventpatternElementTypes.Equal_3011);
		types.add(EventpatternElementTypes.Equal_3035);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Equal1CreationTool_title,
				Messages.Equal1CreationTool_desc, types);
		entry.setId("createEqual1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.Equal_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGreaterEqual2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(EventpatternElementTypes.GreaterEqual_2014);
		types.add(EventpatternElementTypes.GreaterEqual_3016);
		types.add(EventpatternElementTypes.GreaterEqual_3040);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.GreaterEqual2CreationTool_title,
				Messages.GreaterEqual2CreationTool_desc, types);
		entry.setId("createGreaterEqual2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.GreaterEqual_2014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGreaterThan3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(EventpatternElementTypes.GreaterThan_2012);
		types.add(EventpatternElementTypes.GreaterThan_3014);
		types.add(EventpatternElementTypes.GreaterThan_3038);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.GreaterThan3CreationTool_title,
				Messages.GreaterThan3CreationTool_desc, types);
		entry.setId("createGreaterThan3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.GreaterThan_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLessEqual4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(EventpatternElementTypes.LessEqual_2013);
		types.add(EventpatternElementTypes.LessEqual_3015);
		types.add(EventpatternElementTypes.LessEqual_3039);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.LessEqual4CreationTool_title,
				Messages.LessEqual4CreationTool_desc, types);
		entry.setId("createLessEqual4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.LessEqual_2013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLessThan5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(EventpatternElementTypes.LessThan_2011);
		types.add(EventpatternElementTypes.LessThan_3013);
		types.add(EventpatternElementTypes.LessThan_3037);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.LessThan5CreationTool_title,
				Messages.LessThan5CreationTool_desc, types);
		entry.setId("createLessThan5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.LessThan_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNotEqual6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(EventpatternElementTypes.NotEqual_2010);
		types.add(EventpatternElementTypes.NotEqual_3012);
		types.add(EventpatternElementTypes.NotEqual_3036);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.NotEqual6CreationTool_title,
				Messages.NotEqual6CreationTool_desc, types);
		entry.setId("createNotEqual6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventpatternElementTypes.getImageDescriptor(EventpatternElementTypes.NotEqual_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated NOT
	 */
	/*
	private static class NodeToolEntry extends ToolEntry {
	
		private final List<IElementType> elementTypes;
	
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}
	
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
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

			if (elementTypes.contains(EventpatternElementTypes.Event_2027)
					|| elementTypes.contains(EventpatternElementTypes.Event_3024)
					|| elementTypes.contains(EventpatternElementTypes.Event_3053)) {

				tool = new CustomisedEventTypeCreationTool(elementTypes, this.getLabel());

			} else if (elementTypes.contains(EventpatternElementTypes.SmartContract_2041)) {

				tool = new CustomisedSmartContractTypeCreationTool(elementTypes, this.getLabel());

			} else if (elementTypes.contains(EventpatternElementTypes.ComplexEvent_2038)
					&& !this.getLabel().equals("New Complex Event")) { // except to "New Complex Event" component
				ArrayList<IElementType> types = new ArrayList<IElementType>(3);
				types.add(EventpatternElementTypes.Event_2027);
				types.add(EventpatternElementTypes.Event_3024);
				types.add(EventpatternElementTypes.Event_3053);

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

		/* Add class
		 * 
		 * @see eventpattern.diagram.edit.helpers.SmartContractEditHelper
		 */
		public class CustomisedSmartContractTypeCreationTool extends CreationTool {

			protected String node;
			private List elementTypes;

			public CustomisedSmartContractTypeCreationTool(List elementTypes, String node) {
				super();
				this.node = node;
				this.elementTypes = elementTypes;
			}

			protected Request createTargetRequest() {

				CreateUnspecifiedTypeRequest request = new CreateUnspecifiedTypeRequest(elementTypes,
						getPreferencesHint());

				request.getExtendedData().put("clickedSmartContractTool", node);

				return request;
			}
		}
	}
}
