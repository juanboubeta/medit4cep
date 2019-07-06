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

package eventpattern.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import eventpattern.diagram.edit.parts.*;
import eventpattern.diagram.part.EventpatternDiagramEditorPlugin;
import eventpattern.diagram.part.Messages;

/**
 * @generated
 */
public class EventpatternModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated NOT
	 */
	// Disable model assistant popup bar.
	public List getTypesForPopupBar(IAdaptable host) {
		/*
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof CEPEventPatternEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(38);
			types.add(EventpatternElementTypes.And_2001);
			types.add(EventpatternElementTypes.Or_2002);
			types.add(EventpatternElementTypes.Not_2003);
			types.add(EventpatternElementTypes.Addition_2004);
			types.add(EventpatternElementTypes.Subtraction_2005);
			types.add(EventpatternElementTypes.Multiplication_2006);
			types.add(EventpatternElementTypes.Division_2007);
			types.add(EventpatternElementTypes.Modulus_2008);
			types.add(EventpatternElementTypes.Equal_2009);
			types.add(EventpatternElementTypes.NotEqual_2010);
			types.add(EventpatternElementTypes.LessThan_2011);
			types.add(EventpatternElementTypes.GreaterThan_2012);
			types.add(EventpatternElementTypes.LessEqual_2013);
			types.add(EventpatternElementTypes.GreaterEqual_2014);
			types.add(EventpatternElementTypes.Every_2015);
			types.add(EventpatternElementTypes.EveryDistinct_2016);
			types.add(EventpatternElementTypes.Repeat_2017);
			types.add(EventpatternElementTypes.Until_2018);
			types.add(EventpatternElementTypes.Range_2019);
			types.add(EventpatternElementTypes.FollowedBy_2020);
			types.add(EventpatternElementTypes.While_2021);
			types.add(EventpatternElementTypes.Max_2022);
			types.add(EventpatternElementTypes.Min_2023);
			types.add(EventpatternElementTypes.Avg_2024);
			types.add(EventpatternElementTypes.Count_2025);
			types.add(EventpatternElementTypes.Sum_2026);
			types.add(EventpatternElementTypes.Event_2027);
			types.add(EventpatternElementTypes.EventProperty_2028);
			types.add(EventpatternElementTypes.Value_2029);
			types.add(EventpatternElementTypes.WithinTimer_2030);
			types.add(EventpatternElementTypes.TimeInterval_2031);
			types.add(EventpatternElementTypes.TimeSchedule_2032);
			types.add(EventpatternElementTypes.Email_2033);
			types.add(EventpatternElementTypes.SlidingEventInterval_2034);
			types.add(EventpatternElementTypes.BatchingEventInterval_2035);
			types.add(EventpatternElementTypes.SlidingTimeInterval_2036);
			types.add(EventpatternElementTypes.BatchingTimeInterval_2037);
			types.add(EventpatternElementTypes.ComplexEvent_2038);
			return types;
		}
		if (editPart instanceof EventEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(EventpatternElementTypes.EventProperty_3001);
			return types;
		}
		if (editPart instanceof EventPropertyEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(EventpatternElementTypes.EventProperty_3002);
			return types;
		}
		if (editPart instanceof ComplexEventEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(EventpatternElementTypes.ComplexEventProperty_3059);
			return types;
		}
		if (editPart instanceof EventProperty2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(EventpatternElementTypes.EventProperty_3002);
			return types;
		}
		if (editPart instanceof EventProperty3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(EventpatternElementTypes.EventProperty_3002);
			return types;
		}
		if (editPart instanceof Event2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(EventpatternElementTypes.EventProperty_3001);
			return types;
		}
		if (editPart instanceof EventProperty4EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(EventpatternElementTypes.EventProperty_3002);
			return types;
		}
		if (editPart instanceof Event3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(EventpatternElementTypes.EventProperty_3001);
			return types;
		}
		if (editPart instanceof EventProperty5EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(EventpatternElementTypes.EventProperty_3002);
			return types;
		}
		if (editPart instanceof WithinTimerWithinTimerWithinTimerElementsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(24);
			types.add(EventpatternElementTypes.And_3003);
			types.add(EventpatternElementTypes.Or_3004);
			types.add(EventpatternElementTypes.Not_3005);
			types.add(EventpatternElementTypes.Addition_3006);
			types.add(EventpatternElementTypes.Subtraction_3007);
			types.add(EventpatternElementTypes.Multiplication_3008);
			types.add(EventpatternElementTypes.Division_3009);
			types.add(EventpatternElementTypes.Modulus_3010);
			types.add(EventpatternElementTypes.Equal_3011);
			types.add(EventpatternElementTypes.NotEqual_3012);
			types.add(EventpatternElementTypes.LessThan_3013);
			types.add(EventpatternElementTypes.GreaterThan_3014);
			types.add(EventpatternElementTypes.LessEqual_3015);
			types.add(EventpatternElementTypes.GreaterEqual_3016);
			types.add(EventpatternElementTypes.Every_3017);
			types.add(EventpatternElementTypes.EveryDistinct_3018);
			types.add(EventpatternElementTypes.Repeat_3019);
			types.add(EventpatternElementTypes.Until_3020);
			types.add(EventpatternElementTypes.Range_3021);
			types.add(EventpatternElementTypes.FollowedBy_3022);
			types.add(EventpatternElementTypes.While_3023);
			types.add(EventpatternElementTypes.Event_3024);
			types.add(EventpatternElementTypes.EventProperty_3025);
			types.add(EventpatternElementTypes.Value_3026);
			return types;
		}
		if (editPart instanceof SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(32);
			types.add(EventpatternElementTypes.And_3027);
			types.add(EventpatternElementTypes.Or_3028);
			types.add(EventpatternElementTypes.Not_3029);
			types.add(EventpatternElementTypes.Addition_3030);
			types.add(EventpatternElementTypes.Subtraction_3031);
			types.add(EventpatternElementTypes.Multiplication_3032);
			types.add(EventpatternElementTypes.Division_3033);
			types.add(EventpatternElementTypes.Modulus_3034);
			types.add(EventpatternElementTypes.Equal_3035);
			types.add(EventpatternElementTypes.NotEqual_3036);
			types.add(EventpatternElementTypes.LessThan_3037);
			types.add(EventpatternElementTypes.GreaterThan_3038);
			types.add(EventpatternElementTypes.LessEqual_3039);
			types.add(EventpatternElementTypes.GreaterEqual_3040);
			types.add(EventpatternElementTypes.Every_3041);
			types.add(EventpatternElementTypes.EveryDistinct_3042);
			types.add(EventpatternElementTypes.Repeat_3043);
			types.add(EventpatternElementTypes.Until_3044);
			types.add(EventpatternElementTypes.Range_3045);
			types.add(EventpatternElementTypes.FollowedBy_3046);
			types.add(EventpatternElementTypes.While_3047);
			types.add(EventpatternElementTypes.Max_3048);
			types.add(EventpatternElementTypes.Min_3049);
			types.add(EventpatternElementTypes.Avg_3050);
			types.add(EventpatternElementTypes.Count_3051);
			types.add(EventpatternElementTypes.Sum_3052);
			types.add(EventpatternElementTypes.Event_3053);
			types.add(EventpatternElementTypes.EventProperty_3054);
			types.add(EventpatternElementTypes.Value_3055);
			types.add(EventpatternElementTypes.WithinTimer_3056);
			types.add(EventpatternElementTypes.TimeInterval_3057);
			types.add(EventpatternElementTypes.TimeSchedule_3058);
			return types;
		}
		if (editPart instanceof WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(24);
			types.add(EventpatternElementTypes.And_3003);
			types.add(EventpatternElementTypes.Or_3004);
			types.add(EventpatternElementTypes.Not_3005);
			types.add(EventpatternElementTypes.Addition_3006);
			types.add(EventpatternElementTypes.Subtraction_3007);
			types.add(EventpatternElementTypes.Multiplication_3008);
			types.add(EventpatternElementTypes.Division_3009);
			types.add(EventpatternElementTypes.Modulus_3010);
			types.add(EventpatternElementTypes.Equal_3011);
			types.add(EventpatternElementTypes.NotEqual_3012);
			types.add(EventpatternElementTypes.LessThan_3013);
			types.add(EventpatternElementTypes.GreaterThan_3014);
			types.add(EventpatternElementTypes.LessEqual_3015);
			types.add(EventpatternElementTypes.GreaterEqual_3016);
			types.add(EventpatternElementTypes.Every_3017);
			types.add(EventpatternElementTypes.EveryDistinct_3018);
			types.add(EventpatternElementTypes.Repeat_3019);
			types.add(EventpatternElementTypes.Until_3020);
			types.add(EventpatternElementTypes.Range_3021);
			types.add(EventpatternElementTypes.FollowedBy_3022);
			types.add(EventpatternElementTypes.While_3023);
			types.add(EventpatternElementTypes.Event_3024);
			types.add(EventpatternElementTypes.EventProperty_3025);
			types.add(EventpatternElementTypes.Value_3026);
			return types;
		}
		if (editPart instanceof BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(32);
			types.add(EventpatternElementTypes.And_3027);
			types.add(EventpatternElementTypes.Or_3028);
			types.add(EventpatternElementTypes.Not_3029);
			types.add(EventpatternElementTypes.Addition_3030);
			types.add(EventpatternElementTypes.Subtraction_3031);
			types.add(EventpatternElementTypes.Multiplication_3032);
			types.add(EventpatternElementTypes.Division_3033);
			types.add(EventpatternElementTypes.Modulus_3034);
			types.add(EventpatternElementTypes.Equal_3035);
			types.add(EventpatternElementTypes.NotEqual_3036);
			types.add(EventpatternElementTypes.LessThan_3037);
			types.add(EventpatternElementTypes.GreaterThan_3038);
			types.add(EventpatternElementTypes.LessEqual_3039);
			types.add(EventpatternElementTypes.GreaterEqual_3040);
			types.add(EventpatternElementTypes.Every_3041);
			types.add(EventpatternElementTypes.EveryDistinct_3042);
			types.add(EventpatternElementTypes.Repeat_3043);
			types.add(EventpatternElementTypes.Until_3044);
			types.add(EventpatternElementTypes.Range_3045);
			types.add(EventpatternElementTypes.FollowedBy_3046);
			types.add(EventpatternElementTypes.While_3047);
			types.add(EventpatternElementTypes.Max_3048);
			types.add(EventpatternElementTypes.Min_3049);
			types.add(EventpatternElementTypes.Avg_3050);
			types.add(EventpatternElementTypes.Count_3051);
			types.add(EventpatternElementTypes.Sum_3052);
			types.add(EventpatternElementTypes.Event_3053);
			types.add(EventpatternElementTypes.EventProperty_3054);
			types.add(EventpatternElementTypes.Value_3055);
			types.add(EventpatternElementTypes.WithinTimer_3056);
			types.add(EventpatternElementTypes.TimeInterval_3057);
			types.add(EventpatternElementTypes.TimeSchedule_3058);
			return types;
		}
		if (editPart instanceof SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(32);
			types.add(EventpatternElementTypes.And_3027);
			types.add(EventpatternElementTypes.Or_3028);
			types.add(EventpatternElementTypes.Not_3029);
			types.add(EventpatternElementTypes.Addition_3030);
			types.add(EventpatternElementTypes.Subtraction_3031);
			types.add(EventpatternElementTypes.Multiplication_3032);
			types.add(EventpatternElementTypes.Division_3033);
			types.add(EventpatternElementTypes.Modulus_3034);
			types.add(EventpatternElementTypes.Equal_3035);
			types.add(EventpatternElementTypes.NotEqual_3036);
			types.add(EventpatternElementTypes.LessThan_3037);
			types.add(EventpatternElementTypes.GreaterThan_3038);
			types.add(EventpatternElementTypes.LessEqual_3039);
			types.add(EventpatternElementTypes.GreaterEqual_3040);
			types.add(EventpatternElementTypes.Every_3041);
			types.add(EventpatternElementTypes.EveryDistinct_3042);
			types.add(EventpatternElementTypes.Repeat_3043);
			types.add(EventpatternElementTypes.Until_3044);
			types.add(EventpatternElementTypes.Range_3045);
			types.add(EventpatternElementTypes.FollowedBy_3046);
			types.add(EventpatternElementTypes.While_3047);
			types.add(EventpatternElementTypes.Max_3048);
			types.add(EventpatternElementTypes.Min_3049);
			types.add(EventpatternElementTypes.Avg_3050);
			types.add(EventpatternElementTypes.Count_3051);
			types.add(EventpatternElementTypes.Sum_3052);
			types.add(EventpatternElementTypes.Event_3053);
			types.add(EventpatternElementTypes.EventProperty_3054);
			types.add(EventpatternElementTypes.Value_3055);
			types.add(EventpatternElementTypes.WithinTimer_3056);
			types.add(EventpatternElementTypes.TimeInterval_3057);
			types.add(EventpatternElementTypes.TimeSchedule_3058);
			return types;
		}
		if (editPart instanceof BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(32);
			types.add(EventpatternElementTypes.And_3027);
			types.add(EventpatternElementTypes.Or_3028);
			types.add(EventpatternElementTypes.Not_3029);
			types.add(EventpatternElementTypes.Addition_3030);
			types.add(EventpatternElementTypes.Subtraction_3031);
			types.add(EventpatternElementTypes.Multiplication_3032);
			types.add(EventpatternElementTypes.Division_3033);
			types.add(EventpatternElementTypes.Modulus_3034);
			types.add(EventpatternElementTypes.Equal_3035);
			types.add(EventpatternElementTypes.NotEqual_3036);
			types.add(EventpatternElementTypes.LessThan_3037);
			types.add(EventpatternElementTypes.GreaterThan_3038);
			types.add(EventpatternElementTypes.LessEqual_3039);
			types.add(EventpatternElementTypes.GreaterEqual_3040);
			types.add(EventpatternElementTypes.Every_3041);
			types.add(EventpatternElementTypes.EveryDistinct_3042);
			types.add(EventpatternElementTypes.Repeat_3043);
			types.add(EventpatternElementTypes.Until_3044);
			types.add(EventpatternElementTypes.Range_3045);
			types.add(EventpatternElementTypes.FollowedBy_3046);
			types.add(EventpatternElementTypes.While_3047);
			types.add(EventpatternElementTypes.Max_3048);
			types.add(EventpatternElementTypes.Min_3049);
			types.add(EventpatternElementTypes.Avg_3050);
			types.add(EventpatternElementTypes.Count_3051);
			types.add(EventpatternElementTypes.Sum_3052);
			types.add(EventpatternElementTypes.Event_3053);
			types.add(EventpatternElementTypes.EventProperty_3054);
			types.add(EventpatternElementTypes.Value_3055);
			types.add(EventpatternElementTypes.WithinTimer_3056);
			types.add(EventpatternElementTypes.TimeInterval_3057);
			types.add(EventpatternElementTypes.TimeSchedule_3058);
			return types;
		}
		 */
		return Collections.EMPTY_LIST;

	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target, IElementType relationshipType) {
		return selectExistingElement(target, getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source, IElementType relationshipType) {
		return selectExistingElement(source, getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				EventpatternDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(shell, labelProvider);
		dialog.setMessage(Messages.EventpatternModelingAssistantProviderMessage);
		dialog.setTitle(Messages.EventpatternModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
