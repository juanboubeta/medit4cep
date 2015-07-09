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
public class EventpatternModelingAssistantProvider extends
		ModelingAssistantProvider {

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
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof AndEditPart) {
			return ((AndEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof OrEditPart) {
			return ((OrEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof NotEditPart) {
			return ((NotEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof AdditionEditPart) {
			return ((AdditionEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SubtractionEditPart) {
			return ((SubtractionEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof MultiplicationEditPart) {
			return ((MultiplicationEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof DivisionEditPart) {
			return ((DivisionEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ModulusEditPart) {
			return ((ModulusEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof EqualEditPart) {
			return ((EqualEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof NotEqualEditPart) {
			return ((NotEqualEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof LessThanEditPart) {
			return ((LessThanEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof GreaterThanEditPart) {
			return ((GreaterThanEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof LessEqualEditPart) {
			return ((LessEqualEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof GreaterEqualEditPart) {
			return ((GreaterEqualEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof EveryEditPart) {
			return ((EveryEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof EveryDistinctEditPart) {
			return ((EveryDistinctEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof RepeatEditPart) {
			return ((RepeatEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof UntilEditPart) {
			return ((UntilEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof RangeEditPart) {
			return ((RangeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof FollowedByEditPart) {
			return ((FollowedByEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof WhileEditPart) {
			return ((WhileEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof MaxEditPart) {
			return ((MaxEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof MinEditPart) {
			return ((MinEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof AvgEditPart) {
			return ((AvgEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CountEditPart) {
			return ((CountEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SumEditPart) {
			return ((SumEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof EventEditPart) {
			return ((EventEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof EventPropertyEditPart) {
			return ((EventPropertyEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ValueEditPart) {
			return ((ValueEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof WithinTimerEditPart) {
			return ((WithinTimerEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof TimeIntervalEditPart) {
			return ((TimeIntervalEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof TimeScheduleEditPart) {
			return ((TimeScheduleEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ComplexEventEditPart) {
			return ((ComplexEventEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof EventProperty2EditPart) {
			return ((EventProperty2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof EventProperty3EditPart) {
			return ((EventProperty3EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof And2EditPart) {
			return ((And2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Or2EditPart) {
			return ((Or2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Not2EditPart) {
			return ((Not2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Addition2EditPart) {
			return ((Addition2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Subtraction2EditPart) {
			return ((Subtraction2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Multiplication2EditPart) {
			return ((Multiplication2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Division2EditPart) {
			return ((Division2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Modulus2EditPart) {
			return ((Modulus2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Equal2EditPart) {
			return ((Equal2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof NotEqual2EditPart) {
			return ((NotEqual2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof LessThan2EditPart) {
			return ((LessThan2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof GreaterThan2EditPart) {
			return ((GreaterThan2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof LessEqual2EditPart) {
			return ((LessEqual2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof GreaterEqual2EditPart) {
			return ((GreaterEqual2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Every2EditPart) {
			return ((Every2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof EveryDistinct2EditPart) {
			return ((EveryDistinct2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Repeat2EditPart) {
			return ((Repeat2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Until2EditPart) {
			return ((Until2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Range2EditPart) {
			return ((Range2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof FollowedBy2EditPart) {
			return ((FollowedBy2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof While2EditPart) {
			return ((While2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Event2EditPart) {
			return ((Event2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof EventProperty4EditPart) {
			return ((EventProperty4EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Value2EditPart) {
			return ((Value2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof And3EditPart) {
			return ((And3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Or3EditPart) {
			return ((Or3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Not3EditPart) {
			return ((Not3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Addition3EditPart) {
			return ((Addition3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Subtraction3EditPart) {
			return ((Subtraction3EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Multiplication3EditPart) {
			return ((Multiplication3EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Division3EditPart) {
			return ((Division3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Modulus3EditPart) {
			return ((Modulus3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Equal3EditPart) {
			return ((Equal3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof NotEqual3EditPart) {
			return ((NotEqual3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof LessThan3EditPart) {
			return ((LessThan3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof GreaterThan3EditPart) {
			return ((GreaterThan3EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof LessEqual3EditPart) {
			return ((LessEqual3EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof GreaterEqual3EditPart) {
			return ((GreaterEqual3EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Every3EditPart) {
			return ((Every3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof EveryDistinct3EditPart) {
			return ((EveryDistinct3EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Repeat3EditPart) {
			return ((Repeat3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Until3EditPart) {
			return ((Until3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Range3EditPart) {
			return ((Range3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof FollowedBy3EditPart) {
			return ((FollowedBy3EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof While3EditPart) {
			return ((While3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Max2EditPart) {
			return ((Max2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Min2EditPart) {
			return ((Min2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Avg2EditPart) {
			return ((Avg2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Count2EditPart) {
			return ((Count2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Sum2EditPart) {
			return ((Sum2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Event3EditPart) {
			return ((Event3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof EventProperty5EditPart) {
			return ((EventProperty5EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Value3EditPart) {
			return ((Value3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof WithinTimer2EditPart) {
			return ((WithinTimer2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof TimeInterval2EditPart) {
			return ((TimeInterval2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof TimeSchedule2EditPart) {
			return ((TimeSchedule2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof AndEditPart) {
			return ((AndEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof OrEditPart) {
			return ((OrEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof NotEditPart) {
			return ((NotEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AdditionEditPart) {
			return ((AdditionEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof SubtractionEditPart) {
			return ((SubtractionEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof MultiplicationEditPart) {
			return ((MultiplicationEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof DivisionEditPart) {
			return ((DivisionEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ModulusEditPart) {
			return ((ModulusEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof EqualEditPart) {
			return ((EqualEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof NotEqualEditPart) {
			return ((NotEqualEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof LessThanEditPart) {
			return ((LessThanEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof GreaterThanEditPart) {
			return ((GreaterThanEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof LessEqualEditPart) {
			return ((LessEqualEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof GreaterEqualEditPart) {
			return ((GreaterEqualEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof EveryEditPart) {
			return ((EveryEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof EveryDistinctEditPart) {
			return ((EveryDistinctEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof RepeatEditPart) {
			return ((RepeatEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof UntilEditPart) {
			return ((UntilEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof RangeEditPart) {
			return ((RangeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof FollowedByEditPart) {
			return ((FollowedByEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof WhileEditPart) {
			return ((WhileEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof MaxEditPart) {
			return ((MaxEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof MinEditPart) {
			return ((MinEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AvgEditPart) {
			return ((AvgEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CountEditPart) {
			return ((CountEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof SumEditPart) {
			return ((SumEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof EmailEditPart) {
			return ((EmailEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof TwitterEditPart) {
			return ((TwitterEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof And2EditPart) {
			return ((And2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Or2EditPart) {
			return ((Or2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Not2EditPart) {
			return ((Not2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Addition2EditPart) {
			return ((Addition2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Subtraction2EditPart) {
			return ((Subtraction2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Multiplication2EditPart) {
			return ((Multiplication2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Division2EditPart) {
			return ((Division2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Modulus2EditPart) {
			return ((Modulus2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Equal2EditPart) {
			return ((Equal2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof NotEqual2EditPart) {
			return ((NotEqual2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof LessThan2EditPart) {
			return ((LessThan2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof GreaterThan2EditPart) {
			return ((GreaterThan2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof LessEqual2EditPart) {
			return ((LessEqual2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof GreaterEqual2EditPart) {
			return ((GreaterEqual2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Every2EditPart) {
			return ((Every2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof EveryDistinct2EditPart) {
			return ((EveryDistinct2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Repeat2EditPart) {
			return ((Repeat2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Until2EditPart) {
			return ((Until2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Range2EditPart) {
			return ((Range2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof FollowedBy2EditPart) {
			return ((FollowedBy2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof While2EditPart) {
			return ((While2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof And3EditPart) {
			return ((And3EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Or3EditPart) {
			return ((Or3EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Not3EditPart) {
			return ((Not3EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Addition3EditPart) {
			return ((Addition3EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Subtraction3EditPart) {
			return ((Subtraction3EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Multiplication3EditPart) {
			return ((Multiplication3EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Division3EditPart) {
			return ((Division3EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Modulus3EditPart) {
			return ((Modulus3EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Equal3EditPart) {
			return ((Equal3EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof NotEqual3EditPart) {
			return ((NotEqual3EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof LessThan3EditPart) {
			return ((LessThan3EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof GreaterThan3EditPart) {
			return ((GreaterThan3EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof LessEqual3EditPart) {
			return ((LessEqual3EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof GreaterEqual3EditPart) {
			return ((GreaterEqual3EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Every3EditPart) {
			return ((Every3EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof EveryDistinct3EditPart) {
			return ((EveryDistinct3EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Repeat3EditPart) {
			return ((Repeat3EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Until3EditPart) {
			return ((Until3EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Range3EditPart) {
			return ((Range3EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof FollowedBy3EditPart) {
			return ((FollowedBy3EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof While3EditPart) {
			return ((While3EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Max2EditPart) {
			return ((Max2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Min2EditPart) {
			return ((Min2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Avg2EditPart) {
			return ((Avg2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Count2EditPart) {
			return ((Count2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Sum2EditPart) {
			return ((Sum2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ComplexEventPropertyEditPart) {
			return ((ComplexEventPropertyEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof AndEditPart) {
			return ((AndEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof OrEditPart) {
			return ((OrEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof NotEditPart) {
			return ((NotEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof AdditionEditPart) {
			return ((AdditionEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SubtractionEditPart) {
			return ((SubtractionEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof MultiplicationEditPart) {
			return ((MultiplicationEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof DivisionEditPart) {
			return ((DivisionEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ModulusEditPart) {
			return ((ModulusEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof EqualEditPart) {
			return ((EqualEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof NotEqualEditPart) {
			return ((NotEqualEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof LessThanEditPart) {
			return ((LessThanEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof GreaterThanEditPart) {
			return ((GreaterThanEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof LessEqualEditPart) {
			return ((LessEqualEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof GreaterEqualEditPart) {
			return ((GreaterEqualEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof EveryEditPart) {
			return ((EveryEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof EveryDistinctEditPart) {
			return ((EveryDistinctEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof RepeatEditPart) {
			return ((RepeatEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof UntilEditPart) {
			return ((UntilEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof RangeEditPart) {
			return ((RangeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof FollowedByEditPart) {
			return ((FollowedByEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof WhileEditPart) {
			return ((WhileEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof MaxEditPart) {
			return ((MaxEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof MinEditPart) {
			return ((MinEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof AvgEditPart) {
			return ((AvgEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CountEditPart) {
			return ((CountEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SumEditPart) {
			return ((SumEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof EventEditPart) {
			return ((EventEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof EventPropertyEditPart) {
			return ((EventPropertyEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ValueEditPart) {
			return ((ValueEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof WithinTimerEditPart) {
			return ((WithinTimerEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof TimeIntervalEditPart) {
			return ((TimeIntervalEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof TimeScheduleEditPart) {
			return ((TimeScheduleEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ComplexEventEditPart) {
			return ((ComplexEventEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof EventProperty2EditPart) {
			return ((EventProperty2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof EventProperty3EditPart) {
			return ((EventProperty3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof And2EditPart) {
			return ((And2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Or2EditPart) {
			return ((Or2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Not2EditPart) {
			return ((Not2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Addition2EditPart) {
			return ((Addition2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Subtraction2EditPart) {
			return ((Subtraction2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Multiplication2EditPart) {
			return ((Multiplication2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Division2EditPart) {
			return ((Division2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Modulus2EditPart) {
			return ((Modulus2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Equal2EditPart) {
			return ((Equal2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof NotEqual2EditPart) {
			return ((NotEqual2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof LessThan2EditPart) {
			return ((LessThan2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof GreaterThan2EditPart) {
			return ((GreaterThan2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof LessEqual2EditPart) {
			return ((LessEqual2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof GreaterEqual2EditPart) {
			return ((GreaterEqual2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Every2EditPart) {
			return ((Every2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof EveryDistinct2EditPart) {
			return ((EveryDistinct2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Repeat2EditPart) {
			return ((Repeat2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Until2EditPart) {
			return ((Until2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Range2EditPart) {
			return ((Range2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof FollowedBy2EditPart) {
			return ((FollowedBy2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof While2EditPart) {
			return ((While2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Event2EditPart) {
			return ((Event2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof EventProperty4EditPart) {
			return ((EventProperty4EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Value2EditPart) {
			return ((Value2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof And3EditPart) {
			return ((And3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Or3EditPart) {
			return ((Or3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Not3EditPart) {
			return ((Not3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Addition3EditPart) {
			return ((Addition3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Subtraction3EditPart) {
			return ((Subtraction3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Multiplication3EditPart) {
			return ((Multiplication3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Division3EditPart) {
			return ((Division3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Modulus3EditPart) {
			return ((Modulus3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Equal3EditPart) {
			return ((Equal3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof NotEqual3EditPart) {
			return ((NotEqual3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof LessThan3EditPart) {
			return ((LessThan3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof GreaterThan3EditPart) {
			return ((GreaterThan3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof LessEqual3EditPart) {
			return ((LessEqual3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof GreaterEqual3EditPart) {
			return ((GreaterEqual3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Every3EditPart) {
			return ((Every3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof EveryDistinct3EditPart) {
			return ((EveryDistinct3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Repeat3EditPart) {
			return ((Repeat3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Until3EditPart) {
			return ((Until3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Range3EditPart) {
			return ((Range3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof FollowedBy3EditPart) {
			return ((FollowedBy3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof While3EditPart) {
			return ((While3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Max2EditPart) {
			return ((Max2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Min2EditPart) {
			return ((Min2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Avg2EditPart) {
			return ((Avg2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Count2EditPart) {
			return ((Count2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Sum2EditPart) {
			return ((Sum2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Event3EditPart) {
			return ((Event3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof EventProperty5EditPart) {
			return ((EventProperty5EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Value3EditPart) {
			return ((Value3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof WithinTimer2EditPart) {
			return ((WithinTimer2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof TimeInterval2EditPart) {
			return ((TimeInterval2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof TimeSchedule2EditPart) {
			return ((TimeSchedule2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof AndEditPart) {
			return ((AndEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof OrEditPart) {
			return ((OrEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof NotEditPart) {
			return ((NotEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AdditionEditPart) {
			return ((AdditionEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof SubtractionEditPart) {
			return ((SubtractionEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof MultiplicationEditPart) {
			return ((MultiplicationEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof DivisionEditPart) {
			return ((DivisionEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ModulusEditPart) {
			return ((ModulusEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof EqualEditPart) {
			return ((EqualEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof NotEqualEditPart) {
			return ((NotEqualEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof LessThanEditPart) {
			return ((LessThanEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof GreaterThanEditPart) {
			return ((GreaterThanEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof LessEqualEditPart) {
			return ((LessEqualEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof GreaterEqualEditPart) {
			return ((GreaterEqualEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof EveryEditPart) {
			return ((EveryEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof EveryDistinctEditPart) {
			return ((EveryDistinctEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof RepeatEditPart) {
			return ((RepeatEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof UntilEditPart) {
			return ((UntilEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof RangeEditPart) {
			return ((RangeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof FollowedByEditPart) {
			return ((FollowedByEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof WhileEditPart) {
			return ((WhileEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof MaxEditPart) {
			return ((MaxEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof MinEditPart) {
			return ((MinEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AvgEditPart) {
			return ((AvgEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CountEditPart) {
			return ((CountEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof SumEditPart) {
			return ((SumEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof EmailEditPart) {
			return ((EmailEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof TwitterEditPart) {
			return ((TwitterEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof And2EditPart) {
			return ((And2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Or2EditPart) {
			return ((Or2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Not2EditPart) {
			return ((Not2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Addition2EditPart) {
			return ((Addition2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Subtraction2EditPart) {
			return ((Subtraction2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Multiplication2EditPart) {
			return ((Multiplication2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Division2EditPart) {
			return ((Division2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Modulus2EditPart) {
			return ((Modulus2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Equal2EditPart) {
			return ((Equal2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof NotEqual2EditPart) {
			return ((NotEqual2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof LessThan2EditPart) {
			return ((LessThan2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof GreaterThan2EditPart) {
			return ((GreaterThan2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof LessEqual2EditPart) {
			return ((LessEqual2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof GreaterEqual2EditPart) {
			return ((GreaterEqual2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Every2EditPart) {
			return ((Every2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof EveryDistinct2EditPart) {
			return ((EveryDistinct2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Repeat2EditPart) {
			return ((Repeat2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Until2EditPart) {
			return ((Until2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Range2EditPart) {
			return ((Range2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof FollowedBy2EditPart) {
			return ((FollowedBy2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof While2EditPart) {
			return ((While2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof And3EditPart) {
			return ((And3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Or3EditPart) {
			return ((Or3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Not3EditPart) {
			return ((Not3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Addition3EditPart) {
			return ((Addition3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Subtraction3EditPart) {
			return ((Subtraction3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Multiplication3EditPart) {
			return ((Multiplication3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Division3EditPart) {
			return ((Division3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Modulus3EditPart) {
			return ((Modulus3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Equal3EditPart) {
			return ((Equal3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof NotEqual3EditPart) {
			return ((NotEqual3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof LessThan3EditPart) {
			return ((LessThan3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof GreaterThan3EditPart) {
			return ((GreaterThan3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof LessEqual3EditPart) {
			return ((LessEqual3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof GreaterEqual3EditPart) {
			return ((GreaterEqual3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Every3EditPart) {
			return ((Every3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof EveryDistinct3EditPart) {
			return ((EveryDistinct3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Repeat3EditPart) {
			return ((Repeat3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Until3EditPart) {
			return ((Until3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Range3EditPart) {
			return ((Range3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof FollowedBy3EditPart) {
			return ((FollowedBy3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof While3EditPart) {
			return ((While3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Max2EditPart) {
			return ((Max2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Min2EditPart) {
			return ((Min2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Avg2EditPart) {
			return ((Avg2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Count2EditPart) {
			return ((Count2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Sum2EditPart) {
			return ((Sum2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ComplexEventPropertyEditPart) {
			return ((ComplexEventPropertyEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof AndEditPart) {
			return ((AndEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof OrEditPart) {
			return ((OrEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof NotEditPart) {
			return ((NotEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof AdditionEditPart) {
			return ((AdditionEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SubtractionEditPart) {
			return ((SubtractionEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof MultiplicationEditPart) {
			return ((MultiplicationEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof DivisionEditPart) {
			return ((DivisionEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ModulusEditPart) {
			return ((ModulusEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof EqualEditPart) {
			return ((EqualEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof NotEqualEditPart) {
			return ((NotEqualEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof LessThanEditPart) {
			return ((LessThanEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof GreaterThanEditPart) {
			return ((GreaterThanEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof LessEqualEditPart) {
			return ((LessEqualEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof GreaterEqualEditPart) {
			return ((GreaterEqualEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof EveryEditPart) {
			return ((EveryEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof EveryDistinctEditPart) {
			return ((EveryDistinctEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof RepeatEditPart) {
			return ((RepeatEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof UntilEditPart) {
			return ((UntilEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof RangeEditPart) {
			return ((RangeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof FollowedByEditPart) {
			return ((FollowedByEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof WhileEditPart) {
			return ((WhileEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof MaxEditPart) {
			return ((MaxEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof MinEditPart) {
			return ((MinEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof AvgEditPart) {
			return ((AvgEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CountEditPart) {
			return ((CountEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SumEditPart) {
			return ((SumEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof EventEditPart) {
			return ((EventEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof EventPropertyEditPart) {
			return ((EventPropertyEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ValueEditPart) {
			return ((ValueEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof WithinTimerEditPart) {
			return ((WithinTimerEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof TimeIntervalEditPart) {
			return ((TimeIntervalEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof TimeScheduleEditPart) {
			return ((TimeScheduleEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ComplexEventEditPart) {
			return ((ComplexEventEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof EventProperty2EditPart) {
			return ((EventProperty2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof EventProperty3EditPart) {
			return ((EventProperty3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof And2EditPart) {
			return ((And2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Or2EditPart) {
			return ((Or2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Not2EditPart) {
			return ((Not2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Addition2EditPart) {
			return ((Addition2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Subtraction2EditPart) {
			return ((Subtraction2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Multiplication2EditPart) {
			return ((Multiplication2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Division2EditPart) {
			return ((Division2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Modulus2EditPart) {
			return ((Modulus2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Equal2EditPart) {
			return ((Equal2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof NotEqual2EditPart) {
			return ((NotEqual2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof LessThan2EditPart) {
			return ((LessThan2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof GreaterThan2EditPart) {
			return ((GreaterThan2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof LessEqual2EditPart) {
			return ((LessEqual2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof GreaterEqual2EditPart) {
			return ((GreaterEqual2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Every2EditPart) {
			return ((Every2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof EveryDistinct2EditPart) {
			return ((EveryDistinct2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Repeat2EditPart) {
			return ((Repeat2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Until2EditPart) {
			return ((Until2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Range2EditPart) {
			return ((Range2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof FollowedBy2EditPart) {
			return ((FollowedBy2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof While2EditPart) {
			return ((While2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Event2EditPart) {
			return ((Event2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof EventProperty4EditPart) {
			return ((EventProperty4EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Value2EditPart) {
			return ((Value2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof And3EditPart) {
			return ((And3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Or3EditPart) {
			return ((Or3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Not3EditPart) {
			return ((Not3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Addition3EditPart) {
			return ((Addition3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Subtraction3EditPart) {
			return ((Subtraction3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Multiplication3EditPart) {
			return ((Multiplication3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Division3EditPart) {
			return ((Division3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Modulus3EditPart) {
			return ((Modulus3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Equal3EditPart) {
			return ((Equal3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof NotEqual3EditPart) {
			return ((NotEqual3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof LessThan3EditPart) {
			return ((LessThan3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof GreaterThan3EditPart) {
			return ((GreaterThan3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof LessEqual3EditPart) {
			return ((LessEqual3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof GreaterEqual3EditPart) {
			return ((GreaterEqual3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Every3EditPart) {
			return ((Every3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof EveryDistinct3EditPart) {
			return ((EveryDistinct3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Repeat3EditPart) {
			return ((Repeat3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Until3EditPart) {
			return ((Until3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Range3EditPart) {
			return ((Range3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof FollowedBy3EditPart) {
			return ((FollowedBy3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof While3EditPart) {
			return ((While3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Max2EditPart) {
			return ((Max2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Min2EditPart) {
			return ((Min2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Avg2EditPart) {
			return ((Avg2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Count2EditPart) {
			return ((Count2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Sum2EditPart) {
			return ((Sum2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Event3EditPart) {
			return ((Event3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof EventProperty5EditPart) {
			return ((EventProperty5EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Value3EditPart) {
			return ((Value3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof WithinTimer2EditPart) {
			return ((WithinTimer2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof TimeInterval2EditPart) {
			return ((TimeInterval2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof TimeSchedule2EditPart) {
			return ((TimeSchedule2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
				.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				EventpatternDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
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
