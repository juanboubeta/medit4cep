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

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import eventpattern.Action;
import eventpattern.Addition;
import eventpattern.And;
import eventpattern.Avg;
import eventpattern.BatchingEventInterval;
import eventpattern.BatchingTimeInterval;
import eventpattern.CEPEventPattern;
import eventpattern.ComplexEvent;
import eventpattern.ComplexEventProperty;
import eventpattern.ContractFunction;
import eventpattern.Count;
import eventpattern.Division;
import eventpattern.Email;
import eventpattern.Equal;
import eventpattern.Event;
import eventpattern.EventPatternCondition;
import eventpattern.EventPatternElement;
import eventpattern.EventProperty;
import eventpattern.EventpatternPackage;
import eventpattern.Every;
import eventpattern.EveryDistinct;
import eventpattern.FollowedBy;
import eventpattern.GreaterEqual;
import eventpattern.GreaterThan;
import eventpattern.GroupBy;
import eventpattern.InputParameter;
import eventpattern.LessEqual;
import eventpattern.LessThan;
import eventpattern.Link;
import eventpattern.Max;
import eventpattern.Min;
import eventpattern.Modulus;
import eventpattern.Multiplication;
import eventpattern.Not;
import eventpattern.NotEqual;
import eventpattern.Operand;
import eventpattern.Operator;
import eventpattern.Or;
import eventpattern.OutputParameter;
import eventpattern.Range;
import eventpattern.Repeat;
import eventpattern.SlidingEventInterval;
import eventpattern.SlidingTimeInterval;
import eventpattern.SmartContract;
import eventpattern.Subtraction;
import eventpattern.Sum;
import eventpattern.TimeInterval;
import eventpattern.TimeSchedule;
import eventpattern.Twitter;
import eventpattern.Until;
import eventpattern.Value;
import eventpattern.While;
import eventpattern.WithinTimer;
import eventpattern.WithinTimerElement;
import eventpattern.diagram.edit.parts.*;
import eventpattern.diagram.providers.EventpatternElementTypes;

/**
 * @generated
 */
public class EventpatternDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternNodeDescriptor> getSemanticChildren(View view) {
		switch (EventpatternVisualIDRegistry.getVisualID(view)) {
		case CEPEventPatternEditPart.VISUAL_ID:
			return getCEPEventPattern_1000SemanticChildren(view);
		case EventEventEventPropertiesCompartmentEditPart.VISUAL_ID:
			return getEventEventEventPropertiesCompartment_7001SemanticChildren(view);
		case EventPropertyEventPropertyEventPropertiesCompartmentEditPart.VISUAL_ID:
			return getEventPropertyEventPropertyEventPropertiesCompartment_7002SemanticChildren(view);
		case EventPropertyEventPropertyEventPropertiesCompartment2EditPart.VISUAL_ID:
			return getEventPropertyEventPropertyEventPropertiesCompartment_7003SemanticChildren(view);
		case EventPropertyEventPropertyEventPropertiesCompartment3EditPart.VISUAL_ID:
			return getEventPropertyEventPropertyEventPropertiesCompartment_7004SemanticChildren(view);
		case WithinTimerWithinTimerWithinTimerElementsCompartmentEditPart.VISUAL_ID:
			return getWithinTimerWithinTimerWithinTimerElementsCompartment_7005SemanticChildren(view);
		case EventEventEventPropertiesCompartment2EditPart.VISUAL_ID:
			return getEventEventEventPropertiesCompartment_7006SemanticChildren(view);
		case EventPropertyEventPropertyEventPropertiesCompartment4EditPart.VISUAL_ID:
			return getEventPropertyEventPropertyEventPropertiesCompartment_7007SemanticChildren(view);
		case SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID:
			return getSlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartment_7008SemanticChildren(
					view);
		case EventEventEventPropertiesCompartment3EditPart.VISUAL_ID:
			return getEventEventEventPropertiesCompartment_7009SemanticChildren(view);
		case EventPropertyEventPropertyEventPropertiesCompartment5EditPart.VISUAL_ID:
			return getEventPropertyEventPropertyEventPropertiesCompartment_7010SemanticChildren(view);
		case WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart.VISUAL_ID:
			return getWithinTimerWithinTimerWithinTimerElementsCompartment_7011SemanticChildren(view);
		case BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID:
			return getBatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartment_7012SemanticChildren(
					view);
		case SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID:
			return getSlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartment_7013SemanticChildren(
					view);
		case BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID:
			return getBatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartment_7014SemanticChildren(
					view);
		case ComplexEventComplexEventComplexEventPropertiesCompartmentEditPart.VISUAL_ID:
			return getComplexEventComplexEventComplexEventPropertiesCompartment_7015SemanticChildren(view);
		case SmartContractSmartContractSmartContractPropertiesCompartmentEditPart.VISUAL_ID:
			return getSmartContractSmartContractSmartContractPropertiesCompartment_7016SemanticChildren(view);
		case ContractFunctionContractFunctionInputParametersFunctionCompartmentEditPart.VISUAL_ID:
			return getContractFunctionContractFunctionInputParametersFunctionCompartment_7017SemanticChildren(view);
		case ContractFunctionContractFunctionOutputParametersFunctionCompartmentEditPart.VISUAL_ID:
			return getContractFunctionContractFunctionOutputParametersFunctionCompartment_7018SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternNodeDescriptor> getCEPEventPattern_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CEPEventPattern modelElement = (CEPEventPattern) view.getElement();
		LinkedList<EventpatternNodeDescriptor> result = new LinkedList<EventpatternNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEventPatternElements().iterator(); it.hasNext();) {
			EventPatternElement childElement = (EventPatternElement) it.next();
			int visualID = EventpatternVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AndEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OrEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NotEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdditionEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SubtractionEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiplicationEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DivisionEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ModulusEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EqualEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NotEqualEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LessThanEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GreaterThanEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LessEqualEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GreaterEqualEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EveryEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EveryDistinctEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RepeatEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UntilEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RangeEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FollowedByEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WhileEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MaxEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MinEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AvgEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CountEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SumEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EventEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EventPropertyEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ValueEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupByEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WithinTimerEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TimeIntervalEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TimeScheduleEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SlidingEventIntervalEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BatchingEventIntervalEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SlidingTimeIntervalEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BatchingTimeIntervalEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getActions().iterator(); it.hasNext();) {
			Action childElement = (Action) it.next();
			int visualID = EventpatternVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EmailEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TwitterEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			ComplexEvent childElement = modelElement.getComplexEvent();
			int visualID = EventpatternVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ComplexEventEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getSmartContracts().iterator(); it.hasNext();) {
			SmartContract childElement = (SmartContract) it.next();
			int visualID = EventpatternVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SmartContractEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternNodeDescriptor> getEventEventEventPropertiesCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Event modelElement = (Event) containerView.getElement();
		LinkedList<EventpatternNodeDescriptor> result = new LinkedList<EventpatternNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEventProperties().iterator(); it.hasNext();) {
			EventProperty childElement = (EventProperty) it.next();
			int visualID = EventpatternVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EventProperty2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternNodeDescriptor> getEventPropertyEventPropertyEventPropertiesCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		EventProperty modelElement = (EventProperty) containerView.getElement();
		LinkedList<EventpatternNodeDescriptor> result = new LinkedList<EventpatternNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEventProperties().iterator(); it.hasNext();) {
			EventProperty childElement = (EventProperty) it.next();
			int visualID = EventpatternVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EventProperty3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternNodeDescriptor> getEventPropertyEventPropertyEventPropertiesCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		EventProperty modelElement = (EventProperty) containerView.getElement();
		LinkedList<EventpatternNodeDescriptor> result = new LinkedList<EventpatternNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEventProperties().iterator(); it.hasNext();) {
			EventProperty childElement = (EventProperty) it.next();
			int visualID = EventpatternVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EventProperty3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternNodeDescriptor> getEventPropertyEventPropertyEventPropertiesCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		EventProperty modelElement = (EventProperty) containerView.getElement();
		LinkedList<EventpatternNodeDescriptor> result = new LinkedList<EventpatternNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEventProperties().iterator(); it.hasNext();) {
			EventProperty childElement = (EventProperty) it.next();
			int visualID = EventpatternVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EventProperty3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternNodeDescriptor> getWithinTimerWithinTimerWithinTimerElementsCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		WithinTimer modelElement = (WithinTimer) containerView.getElement();
		LinkedList<EventpatternNodeDescriptor> result = new LinkedList<EventpatternNodeDescriptor>();
		for (Iterator<?> it = modelElement.getWithinTimerElements().iterator(); it.hasNext();) {
			WithinTimerElement childElement = (WithinTimerElement) it.next();
			int visualID = EventpatternVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == And2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Or2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Not2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Addition2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Subtraction2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Multiplication2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Division2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Modulus2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Equal2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NotEqual2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LessThan2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GreaterThan2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LessEqual2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GreaterEqual2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Every2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EveryDistinct2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Repeat2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Until2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Range2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FollowedBy2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Event2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EventProperty4EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Value2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternNodeDescriptor> getEventEventEventPropertiesCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Event modelElement = (Event) containerView.getElement();
		LinkedList<EventpatternNodeDescriptor> result = new LinkedList<EventpatternNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEventProperties().iterator(); it.hasNext();) {
			EventProperty childElement = (EventProperty) it.next();
			int visualID = EventpatternVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EventProperty2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternNodeDescriptor> getEventPropertyEventPropertyEventPropertiesCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		EventProperty modelElement = (EventProperty) containerView.getElement();
		LinkedList<EventpatternNodeDescriptor> result = new LinkedList<EventpatternNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEventProperties().iterator(); it.hasNext();) {
			EventProperty childElement = (EventProperty) it.next();
			int visualID = EventpatternVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EventProperty3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternNodeDescriptor> getSlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartment_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SlidingEventInterval modelElement = (SlidingEventInterval) containerView.getElement();
		LinkedList<EventpatternNodeDescriptor> result = new LinkedList<EventpatternNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEventPatternConditions().iterator(); it.hasNext();) {
			EventPatternCondition childElement = (EventPatternCondition) it.next();
			int visualID = EventpatternVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == And3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Or3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Not3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Addition3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Subtraction3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Multiplication3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Division3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Modulus3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Equal3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NotEqual3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LessThan3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GreaterThan3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LessEqual3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GreaterEqual3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Every3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EveryDistinct3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Repeat3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Until3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Range3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FollowedBy3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Max2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Min2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Avg2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Count2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Sum2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Event3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EventProperty5EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Value3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupBy2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WithinTimer2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TimeInterval2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TimeSchedule2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternNodeDescriptor> getEventEventEventPropertiesCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Event modelElement = (Event) containerView.getElement();
		LinkedList<EventpatternNodeDescriptor> result = new LinkedList<EventpatternNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEventProperties().iterator(); it.hasNext();) {
			EventProperty childElement = (EventProperty) it.next();
			int visualID = EventpatternVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EventProperty2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternNodeDescriptor> getEventPropertyEventPropertyEventPropertiesCompartment_7010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		EventProperty modelElement = (EventProperty) containerView.getElement();
		LinkedList<EventpatternNodeDescriptor> result = new LinkedList<EventpatternNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEventProperties().iterator(); it.hasNext();) {
			EventProperty childElement = (EventProperty) it.next();
			int visualID = EventpatternVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EventProperty3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternNodeDescriptor> getWithinTimerWithinTimerWithinTimerElementsCompartment_7011SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		WithinTimer modelElement = (WithinTimer) containerView.getElement();
		LinkedList<EventpatternNodeDescriptor> result = new LinkedList<EventpatternNodeDescriptor>();
		for (Iterator<?> it = modelElement.getWithinTimerElements().iterator(); it.hasNext();) {
			WithinTimerElement childElement = (WithinTimerElement) it.next();
			int visualID = EventpatternVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == And2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Or2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Not2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Addition2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Subtraction2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Multiplication2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Division2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Modulus2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Equal2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NotEqual2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LessThan2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GreaterThan2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LessEqual2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GreaterEqual2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Every2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EveryDistinct2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Repeat2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Until2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Range2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FollowedBy2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Event2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EventProperty4EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Value2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternNodeDescriptor> getBatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartment_7012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		BatchingEventInterval modelElement = (BatchingEventInterval) containerView.getElement();
		LinkedList<EventpatternNodeDescriptor> result = new LinkedList<EventpatternNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEventPatternConditions().iterator(); it.hasNext();) {
			EventPatternCondition childElement = (EventPatternCondition) it.next();
			int visualID = EventpatternVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == And3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Or3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Not3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Addition3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Subtraction3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Multiplication3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Division3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Modulus3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Equal3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NotEqual3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LessThan3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GreaterThan3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LessEqual3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GreaterEqual3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Every3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EveryDistinct3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Repeat3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Until3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Range3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FollowedBy3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Max2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Min2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Avg2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Count2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Sum2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Event3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EventProperty5EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Value3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupBy2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WithinTimer2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TimeInterval2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TimeSchedule2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternNodeDescriptor> getSlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartment_7013SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SlidingTimeInterval modelElement = (SlidingTimeInterval) containerView.getElement();
		LinkedList<EventpatternNodeDescriptor> result = new LinkedList<EventpatternNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEventPatternConditions().iterator(); it.hasNext();) {
			EventPatternCondition childElement = (EventPatternCondition) it.next();
			int visualID = EventpatternVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == And3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Or3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Not3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Addition3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Subtraction3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Multiplication3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Division3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Modulus3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Equal3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NotEqual3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LessThan3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GreaterThan3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LessEqual3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GreaterEqual3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Every3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EveryDistinct3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Repeat3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Until3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Range3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FollowedBy3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Max2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Min2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Avg2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Count2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Sum2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Event3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EventProperty5EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Value3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupBy2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WithinTimer2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TimeInterval2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TimeSchedule2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternNodeDescriptor> getBatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartment_7014SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		BatchingTimeInterval modelElement = (BatchingTimeInterval) containerView.getElement();
		LinkedList<EventpatternNodeDescriptor> result = new LinkedList<EventpatternNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEventPatternConditions().iterator(); it.hasNext();) {
			EventPatternCondition childElement = (EventPatternCondition) it.next();
			int visualID = EventpatternVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == And3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Or3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Not3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Addition3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Subtraction3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Multiplication3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Division3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Modulus3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Equal3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NotEqual3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LessThan3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GreaterThan3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LessEqual3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GreaterEqual3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Every3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EveryDistinct3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Repeat3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Until3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Range3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FollowedBy3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == While3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Max2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Min2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Avg2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Count2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Sum2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Event3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EventProperty5EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Value3EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupBy2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WithinTimer2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TimeInterval2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TimeSchedule2EditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternNodeDescriptor> getComplexEventComplexEventComplexEventPropertiesCompartment_7015SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ComplexEvent modelElement = (ComplexEvent) containerView.getElement();
		LinkedList<EventpatternNodeDescriptor> result = new LinkedList<EventpatternNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComplexEventProperties().iterator(); it.hasNext();) {
			ComplexEventProperty childElement = (ComplexEventProperty) it.next();
			int visualID = EventpatternVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ComplexEventPropertyEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<EventpatternNodeDescriptor> getSmartContractSmartContractSmartContractPropertiesCompartment_7016SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SmartContract modelElement = (SmartContract) containerView.getElement();
		LinkedList<EventpatternNodeDescriptor> result = new LinkedList<EventpatternNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSmartContractProperties().iterator(); it.hasNext();) {
			ContractFunction childElement = (ContractFunction) it.next();
			int visualID = EventpatternVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ContractFunctionEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<EventpatternNodeDescriptor> getContractFunctionContractFunctionInputParametersFunctionCompartment_7017SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ContractFunction modelElement = (ContractFunction) containerView.getElement();
		LinkedList<EventpatternNodeDescriptor> result = new LinkedList<EventpatternNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputParametersFunction().iterator(); it.hasNext();) {
			InputParameter childElement = (InputParameter) it.next();
			int visualID = EventpatternVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputParameterEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<EventpatternNodeDescriptor> getContractFunctionContractFunctionOutputParametersFunctionCompartment_7018SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ContractFunction modelElement = (ContractFunction) containerView.getElement();
		LinkedList<EventpatternNodeDescriptor> result = new LinkedList<EventpatternNodeDescriptor>();
		{
			OutputParameter childElement = modelElement.getOutputParametersFunction();
			int visualID = EventpatternVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OutputParameterEditPart.VISUAL_ID) {
				result.add(new EventpatternNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getContainedLinks(View view) {
		switch (EventpatternVisualIDRegistry.getVisualID(view)) {
		case CEPEventPatternEditPart.VISUAL_ID:
			return getCEPEventPattern_1000ContainedLinks(view);
		case AndEditPart.VISUAL_ID:
			return getAnd_2001ContainedLinks(view);
		case OrEditPart.VISUAL_ID:
			return getOr_2002ContainedLinks(view);
		case NotEditPart.VISUAL_ID:
			return getNot_2003ContainedLinks(view);
		case AdditionEditPart.VISUAL_ID:
			return getAddition_2004ContainedLinks(view);
		case SubtractionEditPart.VISUAL_ID:
			return getSubtraction_2005ContainedLinks(view);
		case MultiplicationEditPart.VISUAL_ID:
			return getMultiplication_2006ContainedLinks(view);
		case DivisionEditPart.VISUAL_ID:
			return getDivision_2007ContainedLinks(view);
		case ModulusEditPart.VISUAL_ID:
			return getModulus_2008ContainedLinks(view);
		case EqualEditPart.VISUAL_ID:
			return getEqual_2009ContainedLinks(view);
		case NotEqualEditPart.VISUAL_ID:
			return getNotEqual_2010ContainedLinks(view);
		case LessThanEditPart.VISUAL_ID:
			return getLessThan_2011ContainedLinks(view);
		case GreaterThanEditPart.VISUAL_ID:
			return getGreaterThan_2012ContainedLinks(view);
		case LessEqualEditPart.VISUAL_ID:
			return getLessEqual_2013ContainedLinks(view);
		case GreaterEqualEditPart.VISUAL_ID:
			return getGreaterEqual_2014ContainedLinks(view);
		case EveryEditPart.VISUAL_ID:
			return getEvery_2015ContainedLinks(view);
		case EveryDistinctEditPart.VISUAL_ID:
			return getEveryDistinct_2016ContainedLinks(view);
		case RepeatEditPart.VISUAL_ID:
			return getRepeat_2017ContainedLinks(view);
		case UntilEditPart.VISUAL_ID:
			return getUntil_2018ContainedLinks(view);
		case RangeEditPart.VISUAL_ID:
			return getRange_2019ContainedLinks(view);
		case FollowedByEditPart.VISUAL_ID:
			return getFollowedBy_2020ContainedLinks(view);
		case WhileEditPart.VISUAL_ID:
			return getWhile_2021ContainedLinks(view);
		case MaxEditPart.VISUAL_ID:
			return getMax_2022ContainedLinks(view);
		case MinEditPart.VISUAL_ID:
			return getMin_2023ContainedLinks(view);
		case AvgEditPart.VISUAL_ID:
			return getAvg_2024ContainedLinks(view);
		case CountEditPart.VISUAL_ID:
			return getCount_2025ContainedLinks(view);
		case SumEditPart.VISUAL_ID:
			return getSum_2026ContainedLinks(view);
		case EventEditPart.VISUAL_ID:
			return getEvent_2027ContainedLinks(view);
		case EventPropertyEditPart.VISUAL_ID:
			return getEventProperty_2028ContainedLinks(view);
		case ValueEditPart.VISUAL_ID:
			return getValue_2029ContainedLinks(view);
		case GroupByEditPart.VISUAL_ID:
			return getGroupBy_2040ContainedLinks(view);
		case WithinTimerEditPart.VISUAL_ID:
			return getWithinTimer_2030ContainedLinks(view);
		case TimeIntervalEditPart.VISUAL_ID:
			return getTimeInterval_2031ContainedLinks(view);
		case TimeScheduleEditPart.VISUAL_ID:
			return getTimeSchedule_2032ContainedLinks(view);
		case EmailEditPart.VISUAL_ID:
			return getEmail_2033ContainedLinks(view);
		case TwitterEditPart.VISUAL_ID:
			return getTwitter_2039ContainedLinks(view);
		case SlidingEventIntervalEditPart.VISUAL_ID:
			return getSlidingEventInterval_2034ContainedLinks(view);
		case BatchingEventIntervalEditPart.VISUAL_ID:
			return getBatchingEventInterval_2035ContainedLinks(view);
		case SlidingTimeIntervalEditPart.VISUAL_ID:
			return getSlidingTimeInterval_2036ContainedLinks(view);
		case BatchingTimeIntervalEditPart.VISUAL_ID:
			return getBatchingTimeInterval_2037ContainedLinks(view);
		case ComplexEventEditPart.VISUAL_ID:
			return getComplexEvent_2038ContainedLinks(view);
		case SmartContractEditPart.VISUAL_ID:
			return getSmartContract_2041ContainedLinks(view);
		case EventProperty2EditPart.VISUAL_ID:
			return getEventProperty_3001ContainedLinks(view);
		case EventProperty3EditPart.VISUAL_ID:
			return getEventProperty_3002ContainedLinks(view);
		case And2EditPart.VISUAL_ID:
			return getAnd_3003ContainedLinks(view);
		case Or2EditPart.VISUAL_ID:
			return getOr_3004ContainedLinks(view);
		case Not2EditPart.VISUAL_ID:
			return getNot_3005ContainedLinks(view);
		case Addition2EditPart.VISUAL_ID:
			return getAddition_3006ContainedLinks(view);
		case Subtraction2EditPart.VISUAL_ID:
			return getSubtraction_3007ContainedLinks(view);
		case Multiplication2EditPart.VISUAL_ID:
			return getMultiplication_3008ContainedLinks(view);
		case Division2EditPart.VISUAL_ID:
			return getDivision_3009ContainedLinks(view);
		case Modulus2EditPart.VISUAL_ID:
			return getModulus_3010ContainedLinks(view);
		case Equal2EditPart.VISUAL_ID:
			return getEqual_3011ContainedLinks(view);
		case NotEqual2EditPart.VISUAL_ID:
			return getNotEqual_3012ContainedLinks(view);
		case LessThan2EditPart.VISUAL_ID:
			return getLessThan_3013ContainedLinks(view);
		case GreaterThan2EditPart.VISUAL_ID:
			return getGreaterThan_3014ContainedLinks(view);
		case LessEqual2EditPart.VISUAL_ID:
			return getLessEqual_3015ContainedLinks(view);
		case GreaterEqual2EditPart.VISUAL_ID:
			return getGreaterEqual_3016ContainedLinks(view);
		case Every2EditPart.VISUAL_ID:
			return getEvery_3017ContainedLinks(view);
		case EveryDistinct2EditPart.VISUAL_ID:
			return getEveryDistinct_3018ContainedLinks(view);
		case Repeat2EditPart.VISUAL_ID:
			return getRepeat_3019ContainedLinks(view);
		case Until2EditPart.VISUAL_ID:
			return getUntil_3020ContainedLinks(view);
		case Range2EditPart.VISUAL_ID:
			return getRange_3021ContainedLinks(view);
		case FollowedBy2EditPart.VISUAL_ID:
			return getFollowedBy_3022ContainedLinks(view);
		case While2EditPart.VISUAL_ID:
			return getWhile_3023ContainedLinks(view);
		case Event2EditPart.VISUAL_ID:
			return getEvent_3024ContainedLinks(view);
		case EventProperty4EditPart.VISUAL_ID:
			return getEventProperty_3025ContainedLinks(view);
		case Value2EditPart.VISUAL_ID:
			return getValue_3026ContainedLinks(view);
		case And3EditPart.VISUAL_ID:
			return getAnd_3027ContainedLinks(view);
		case Or3EditPart.VISUAL_ID:
			return getOr_3028ContainedLinks(view);
		case Not3EditPart.VISUAL_ID:
			return getNot_3029ContainedLinks(view);
		case Addition3EditPart.VISUAL_ID:
			return getAddition_3030ContainedLinks(view);
		case Subtraction3EditPart.VISUAL_ID:
			return getSubtraction_3031ContainedLinks(view);
		case Multiplication3EditPart.VISUAL_ID:
			return getMultiplication_3032ContainedLinks(view);
		case Division3EditPart.VISUAL_ID:
			return getDivision_3033ContainedLinks(view);
		case Modulus3EditPart.VISUAL_ID:
			return getModulus_3034ContainedLinks(view);
		case Equal3EditPart.VISUAL_ID:
			return getEqual_3035ContainedLinks(view);
		case NotEqual3EditPart.VISUAL_ID:
			return getNotEqual_3036ContainedLinks(view);
		case LessThan3EditPart.VISUAL_ID:
			return getLessThan_3037ContainedLinks(view);
		case GreaterThan3EditPart.VISUAL_ID:
			return getGreaterThan_3038ContainedLinks(view);
		case LessEqual3EditPart.VISUAL_ID:
			return getLessEqual_3039ContainedLinks(view);
		case GreaterEqual3EditPart.VISUAL_ID:
			return getGreaterEqual_3040ContainedLinks(view);
		case Every3EditPart.VISUAL_ID:
			return getEvery_3041ContainedLinks(view);
		case EveryDistinct3EditPart.VISUAL_ID:
			return getEveryDistinct_3042ContainedLinks(view);
		case Repeat3EditPart.VISUAL_ID:
			return getRepeat_3043ContainedLinks(view);
		case Until3EditPart.VISUAL_ID:
			return getUntil_3044ContainedLinks(view);
		case Range3EditPart.VISUAL_ID:
			return getRange_3045ContainedLinks(view);
		case FollowedBy3EditPart.VISUAL_ID:
			return getFollowedBy_3046ContainedLinks(view);
		case While3EditPart.VISUAL_ID:
			return getWhile_3047ContainedLinks(view);
		case Max2EditPart.VISUAL_ID:
			return getMax_3048ContainedLinks(view);
		case Min2EditPart.VISUAL_ID:
			return getMin_3049ContainedLinks(view);
		case Avg2EditPart.VISUAL_ID:
			return getAvg_3050ContainedLinks(view);
		case Count2EditPart.VISUAL_ID:
			return getCount_3051ContainedLinks(view);
		case Sum2EditPart.VISUAL_ID:
			return getSum_3052ContainedLinks(view);
		case Event3EditPart.VISUAL_ID:
			return getEvent_3053ContainedLinks(view);
		case EventProperty5EditPart.VISUAL_ID:
			return getEventProperty_3054ContainedLinks(view);
		case Value3EditPart.VISUAL_ID:
			return getValue_3055ContainedLinks(view);
		case GroupBy2EditPart.VISUAL_ID:
			return getGroupBy_3060ContainedLinks(view);
		case WithinTimer2EditPart.VISUAL_ID:
			return getWithinTimer_3056ContainedLinks(view);
		case TimeInterval2EditPart.VISUAL_ID:
			return getTimeInterval_3057ContainedLinks(view);
		case TimeSchedule2EditPart.VISUAL_ID:
			return getTimeSchedule_3058ContainedLinks(view);
		case ComplexEventPropertyEditPart.VISUAL_ID:
			return getComplexEventProperty_3059ContainedLinks(view);
		case ContractFunctionEditPart.VISUAL_ID:
			return getContractFunction_3061ContainedLinks(view);
		case InputParameterEditPart.VISUAL_ID:
			return getInputParameter_3062ContainedLinks(view);
		case OutputParameterEditPart.VISUAL_ID:
			return getOutputParameter_3063ContainedLinks(view);
		case LinkEditPart.VISUAL_ID:
			return getLink_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getIncomingLinks(View view) {
		switch (EventpatternVisualIDRegistry.getVisualID(view)) {
		case AndEditPart.VISUAL_ID:
			return getAnd_2001IncomingLinks(view);
		case OrEditPart.VISUAL_ID:
			return getOr_2002IncomingLinks(view);
		case NotEditPart.VISUAL_ID:
			return getNot_2003IncomingLinks(view);
		case AdditionEditPart.VISUAL_ID:
			return getAddition_2004IncomingLinks(view);
		case SubtractionEditPart.VISUAL_ID:
			return getSubtraction_2005IncomingLinks(view);
		case MultiplicationEditPart.VISUAL_ID:
			return getMultiplication_2006IncomingLinks(view);
		case DivisionEditPart.VISUAL_ID:
			return getDivision_2007IncomingLinks(view);
		case ModulusEditPart.VISUAL_ID:
			return getModulus_2008IncomingLinks(view);
		case EqualEditPart.VISUAL_ID:
			return getEqual_2009IncomingLinks(view);
		case NotEqualEditPart.VISUAL_ID:
			return getNotEqual_2010IncomingLinks(view);
		case LessThanEditPart.VISUAL_ID:
			return getLessThan_2011IncomingLinks(view);
		case GreaterThanEditPart.VISUAL_ID:
			return getGreaterThan_2012IncomingLinks(view);
		case LessEqualEditPart.VISUAL_ID:
			return getLessEqual_2013IncomingLinks(view);
		case GreaterEqualEditPart.VISUAL_ID:
			return getGreaterEqual_2014IncomingLinks(view);
		case EveryEditPart.VISUAL_ID:
			return getEvery_2015IncomingLinks(view);
		case EveryDistinctEditPart.VISUAL_ID:
			return getEveryDistinct_2016IncomingLinks(view);
		case RepeatEditPart.VISUAL_ID:
			return getRepeat_2017IncomingLinks(view);
		case UntilEditPart.VISUAL_ID:
			return getUntil_2018IncomingLinks(view);
		case RangeEditPart.VISUAL_ID:
			return getRange_2019IncomingLinks(view);
		case FollowedByEditPart.VISUAL_ID:
			return getFollowedBy_2020IncomingLinks(view);
		case WhileEditPart.VISUAL_ID:
			return getWhile_2021IncomingLinks(view);
		case MaxEditPart.VISUAL_ID:
			return getMax_2022IncomingLinks(view);
		case MinEditPart.VISUAL_ID:
			return getMin_2023IncomingLinks(view);
		case AvgEditPart.VISUAL_ID:
			return getAvg_2024IncomingLinks(view);
		case CountEditPart.VISUAL_ID:
			return getCount_2025IncomingLinks(view);
		case SumEditPart.VISUAL_ID:
			return getSum_2026IncomingLinks(view);
		case EventEditPart.VISUAL_ID:
			return getEvent_2027IncomingLinks(view);
		case EventPropertyEditPart.VISUAL_ID:
			return getEventProperty_2028IncomingLinks(view);
		case ValueEditPart.VISUAL_ID:
			return getValue_2029IncomingLinks(view);
		case GroupByEditPart.VISUAL_ID:
			return getGroupBy_2040IncomingLinks(view);
		case WithinTimerEditPart.VISUAL_ID:
			return getWithinTimer_2030IncomingLinks(view);
		case TimeIntervalEditPart.VISUAL_ID:
			return getTimeInterval_2031IncomingLinks(view);
		case TimeScheduleEditPart.VISUAL_ID:
			return getTimeSchedule_2032IncomingLinks(view);
		case EmailEditPart.VISUAL_ID:
			return getEmail_2033IncomingLinks(view);
		case TwitterEditPart.VISUAL_ID:
			return getTwitter_2039IncomingLinks(view);
		case SlidingEventIntervalEditPart.VISUAL_ID:
			return getSlidingEventInterval_2034IncomingLinks(view);
		case BatchingEventIntervalEditPart.VISUAL_ID:
			return getBatchingEventInterval_2035IncomingLinks(view);
		case SlidingTimeIntervalEditPart.VISUAL_ID:
			return getSlidingTimeInterval_2036IncomingLinks(view);
		case BatchingTimeIntervalEditPart.VISUAL_ID:
			return getBatchingTimeInterval_2037IncomingLinks(view);
		case ComplexEventEditPart.VISUAL_ID:
			return getComplexEvent_2038IncomingLinks(view);
		case SmartContractEditPart.VISUAL_ID:
			return getSmartContract_2041IncomingLinks(view);
		case EventProperty2EditPart.VISUAL_ID:
			return getEventProperty_3001IncomingLinks(view);
		case EventProperty3EditPart.VISUAL_ID:
			return getEventProperty_3002IncomingLinks(view);
		case And2EditPart.VISUAL_ID:
			return getAnd_3003IncomingLinks(view);
		case Or2EditPart.VISUAL_ID:
			return getOr_3004IncomingLinks(view);
		case Not2EditPart.VISUAL_ID:
			return getNot_3005IncomingLinks(view);
		case Addition2EditPart.VISUAL_ID:
			return getAddition_3006IncomingLinks(view);
		case Subtraction2EditPart.VISUAL_ID:
			return getSubtraction_3007IncomingLinks(view);
		case Multiplication2EditPart.VISUAL_ID:
			return getMultiplication_3008IncomingLinks(view);
		case Division2EditPart.VISUAL_ID:
			return getDivision_3009IncomingLinks(view);
		case Modulus2EditPart.VISUAL_ID:
			return getModulus_3010IncomingLinks(view);
		case Equal2EditPart.VISUAL_ID:
			return getEqual_3011IncomingLinks(view);
		case NotEqual2EditPart.VISUAL_ID:
			return getNotEqual_3012IncomingLinks(view);
		case LessThan2EditPart.VISUAL_ID:
			return getLessThan_3013IncomingLinks(view);
		case GreaterThan2EditPart.VISUAL_ID:
			return getGreaterThan_3014IncomingLinks(view);
		case LessEqual2EditPart.VISUAL_ID:
			return getLessEqual_3015IncomingLinks(view);
		case GreaterEqual2EditPart.VISUAL_ID:
			return getGreaterEqual_3016IncomingLinks(view);
		case Every2EditPart.VISUAL_ID:
			return getEvery_3017IncomingLinks(view);
		case EveryDistinct2EditPart.VISUAL_ID:
			return getEveryDistinct_3018IncomingLinks(view);
		case Repeat2EditPart.VISUAL_ID:
			return getRepeat_3019IncomingLinks(view);
		case Until2EditPart.VISUAL_ID:
			return getUntil_3020IncomingLinks(view);
		case Range2EditPart.VISUAL_ID:
			return getRange_3021IncomingLinks(view);
		case FollowedBy2EditPart.VISUAL_ID:
			return getFollowedBy_3022IncomingLinks(view);
		case While2EditPart.VISUAL_ID:
			return getWhile_3023IncomingLinks(view);
		case Event2EditPart.VISUAL_ID:
			return getEvent_3024IncomingLinks(view);
		case EventProperty4EditPart.VISUAL_ID:
			return getEventProperty_3025IncomingLinks(view);
		case Value2EditPart.VISUAL_ID:
			return getValue_3026IncomingLinks(view);
		case And3EditPart.VISUAL_ID:
			return getAnd_3027IncomingLinks(view);
		case Or3EditPart.VISUAL_ID:
			return getOr_3028IncomingLinks(view);
		case Not3EditPart.VISUAL_ID:
			return getNot_3029IncomingLinks(view);
		case Addition3EditPart.VISUAL_ID:
			return getAddition_3030IncomingLinks(view);
		case Subtraction3EditPart.VISUAL_ID:
			return getSubtraction_3031IncomingLinks(view);
		case Multiplication3EditPart.VISUAL_ID:
			return getMultiplication_3032IncomingLinks(view);
		case Division3EditPart.VISUAL_ID:
			return getDivision_3033IncomingLinks(view);
		case Modulus3EditPart.VISUAL_ID:
			return getModulus_3034IncomingLinks(view);
		case Equal3EditPart.VISUAL_ID:
			return getEqual_3035IncomingLinks(view);
		case NotEqual3EditPart.VISUAL_ID:
			return getNotEqual_3036IncomingLinks(view);
		case LessThan3EditPart.VISUAL_ID:
			return getLessThan_3037IncomingLinks(view);
		case GreaterThan3EditPart.VISUAL_ID:
			return getGreaterThan_3038IncomingLinks(view);
		case LessEqual3EditPart.VISUAL_ID:
			return getLessEqual_3039IncomingLinks(view);
		case GreaterEqual3EditPart.VISUAL_ID:
			return getGreaterEqual_3040IncomingLinks(view);
		case Every3EditPart.VISUAL_ID:
			return getEvery_3041IncomingLinks(view);
		case EveryDistinct3EditPart.VISUAL_ID:
			return getEveryDistinct_3042IncomingLinks(view);
		case Repeat3EditPart.VISUAL_ID:
			return getRepeat_3043IncomingLinks(view);
		case Until3EditPart.VISUAL_ID:
			return getUntil_3044IncomingLinks(view);
		case Range3EditPart.VISUAL_ID:
			return getRange_3045IncomingLinks(view);
		case FollowedBy3EditPart.VISUAL_ID:
			return getFollowedBy_3046IncomingLinks(view);
		case While3EditPart.VISUAL_ID:
			return getWhile_3047IncomingLinks(view);
		case Max2EditPart.VISUAL_ID:
			return getMax_3048IncomingLinks(view);
		case Min2EditPart.VISUAL_ID:
			return getMin_3049IncomingLinks(view);
		case Avg2EditPart.VISUAL_ID:
			return getAvg_3050IncomingLinks(view);
		case Count2EditPart.VISUAL_ID:
			return getCount_3051IncomingLinks(view);
		case Sum2EditPart.VISUAL_ID:
			return getSum_3052IncomingLinks(view);
		case Event3EditPart.VISUAL_ID:
			return getEvent_3053IncomingLinks(view);
		case EventProperty5EditPart.VISUAL_ID:
			return getEventProperty_3054IncomingLinks(view);
		case Value3EditPart.VISUAL_ID:
			return getValue_3055IncomingLinks(view);
		case GroupBy2EditPart.VISUAL_ID:
			return getGroupBy_3060IncomingLinks(view);
		case WithinTimer2EditPart.VISUAL_ID:
			return getWithinTimer_3056IncomingLinks(view);
		case TimeInterval2EditPart.VISUAL_ID:
			return getTimeInterval_3057IncomingLinks(view);
		case TimeSchedule2EditPart.VISUAL_ID:
			return getTimeSchedule_3058IncomingLinks(view);
		case ComplexEventPropertyEditPart.VISUAL_ID:
			return getComplexEventProperty_3059IncomingLinks(view);
		case ContractFunctionEditPart.VISUAL_ID:
			return getContractFunction_3061IncomingLinks(view);
		case InputParameterEditPart.VISUAL_ID:
			return getInputParameter_3062IncomingLinks(view);
		case OutputParameterEditPart.VISUAL_ID:
			return getOutputParameter_3063IncomingLinks(view);
		case LinkEditPart.VISUAL_ID:
			return getLink_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getOutgoingLinks(View view) {
		switch (EventpatternVisualIDRegistry.getVisualID(view)) {
		case AndEditPart.VISUAL_ID:
			return getAnd_2001OutgoingLinks(view);
		case OrEditPart.VISUAL_ID:
			return getOr_2002OutgoingLinks(view);
		case NotEditPart.VISUAL_ID:
			return getNot_2003OutgoingLinks(view);
		case AdditionEditPart.VISUAL_ID:
			return getAddition_2004OutgoingLinks(view);
		case SubtractionEditPart.VISUAL_ID:
			return getSubtraction_2005OutgoingLinks(view);
		case MultiplicationEditPart.VISUAL_ID:
			return getMultiplication_2006OutgoingLinks(view);
		case DivisionEditPart.VISUAL_ID:
			return getDivision_2007OutgoingLinks(view);
		case ModulusEditPart.VISUAL_ID:
			return getModulus_2008OutgoingLinks(view);
		case EqualEditPart.VISUAL_ID:
			return getEqual_2009OutgoingLinks(view);
		case NotEqualEditPart.VISUAL_ID:
			return getNotEqual_2010OutgoingLinks(view);
		case LessThanEditPart.VISUAL_ID:
			return getLessThan_2011OutgoingLinks(view);
		case GreaterThanEditPart.VISUAL_ID:
			return getGreaterThan_2012OutgoingLinks(view);
		case LessEqualEditPart.VISUAL_ID:
			return getLessEqual_2013OutgoingLinks(view);
		case GreaterEqualEditPart.VISUAL_ID:
			return getGreaterEqual_2014OutgoingLinks(view);
		case EveryEditPart.VISUAL_ID:
			return getEvery_2015OutgoingLinks(view);
		case EveryDistinctEditPart.VISUAL_ID:
			return getEveryDistinct_2016OutgoingLinks(view);
		case RepeatEditPart.VISUAL_ID:
			return getRepeat_2017OutgoingLinks(view);
		case UntilEditPart.VISUAL_ID:
			return getUntil_2018OutgoingLinks(view);
		case RangeEditPart.VISUAL_ID:
			return getRange_2019OutgoingLinks(view);
		case FollowedByEditPart.VISUAL_ID:
			return getFollowedBy_2020OutgoingLinks(view);
		case WhileEditPart.VISUAL_ID:
			return getWhile_2021OutgoingLinks(view);
		case MaxEditPart.VISUAL_ID:
			return getMax_2022OutgoingLinks(view);
		case MinEditPart.VISUAL_ID:
			return getMin_2023OutgoingLinks(view);
		case AvgEditPart.VISUAL_ID:
			return getAvg_2024OutgoingLinks(view);
		case CountEditPart.VISUAL_ID:
			return getCount_2025OutgoingLinks(view);
		case SumEditPart.VISUAL_ID:
			return getSum_2026OutgoingLinks(view);
		case EventEditPart.VISUAL_ID:
			return getEvent_2027OutgoingLinks(view);
		case EventPropertyEditPart.VISUAL_ID:
			return getEventProperty_2028OutgoingLinks(view);
		case ValueEditPart.VISUAL_ID:
			return getValue_2029OutgoingLinks(view);
		case GroupByEditPart.VISUAL_ID:
			return getGroupBy_2040OutgoingLinks(view);
		case WithinTimerEditPart.VISUAL_ID:
			return getWithinTimer_2030OutgoingLinks(view);
		case TimeIntervalEditPart.VISUAL_ID:
			return getTimeInterval_2031OutgoingLinks(view);
		case TimeScheduleEditPart.VISUAL_ID:
			return getTimeSchedule_2032OutgoingLinks(view);
		case EmailEditPart.VISUAL_ID:
			return getEmail_2033OutgoingLinks(view);
		case TwitterEditPart.VISUAL_ID:
			return getTwitter_2039OutgoingLinks(view);
		case SlidingEventIntervalEditPart.VISUAL_ID:
			return getSlidingEventInterval_2034OutgoingLinks(view);
		case BatchingEventIntervalEditPart.VISUAL_ID:
			return getBatchingEventInterval_2035OutgoingLinks(view);
		case SlidingTimeIntervalEditPart.VISUAL_ID:
			return getSlidingTimeInterval_2036OutgoingLinks(view);
		case BatchingTimeIntervalEditPart.VISUAL_ID:
			return getBatchingTimeInterval_2037OutgoingLinks(view);
		case ComplexEventEditPart.VISUAL_ID:
			return getComplexEvent_2038OutgoingLinks(view);
		case SmartContractEditPart.VISUAL_ID:
			return getSmartContract_2041OutgoingLinks(view);
		case EventProperty2EditPart.VISUAL_ID:
			return getEventProperty_3001OutgoingLinks(view);
		case EventProperty3EditPart.VISUAL_ID:
			return getEventProperty_3002OutgoingLinks(view);
		case And2EditPart.VISUAL_ID:
			return getAnd_3003OutgoingLinks(view);
		case Or2EditPart.VISUAL_ID:
			return getOr_3004OutgoingLinks(view);
		case Not2EditPart.VISUAL_ID:
			return getNot_3005OutgoingLinks(view);
		case Addition2EditPart.VISUAL_ID:
			return getAddition_3006OutgoingLinks(view);
		case Subtraction2EditPart.VISUAL_ID:
			return getSubtraction_3007OutgoingLinks(view);
		case Multiplication2EditPart.VISUAL_ID:
			return getMultiplication_3008OutgoingLinks(view);
		case Division2EditPart.VISUAL_ID:
			return getDivision_3009OutgoingLinks(view);
		case Modulus2EditPart.VISUAL_ID:
			return getModulus_3010OutgoingLinks(view);
		case Equal2EditPart.VISUAL_ID:
			return getEqual_3011OutgoingLinks(view);
		case NotEqual2EditPart.VISUAL_ID:
			return getNotEqual_3012OutgoingLinks(view);
		case LessThan2EditPart.VISUAL_ID:
			return getLessThan_3013OutgoingLinks(view);
		case GreaterThan2EditPart.VISUAL_ID:
			return getGreaterThan_3014OutgoingLinks(view);
		case LessEqual2EditPart.VISUAL_ID:
			return getLessEqual_3015OutgoingLinks(view);
		case GreaterEqual2EditPart.VISUAL_ID:
			return getGreaterEqual_3016OutgoingLinks(view);
		case Every2EditPart.VISUAL_ID:
			return getEvery_3017OutgoingLinks(view);
		case EveryDistinct2EditPart.VISUAL_ID:
			return getEveryDistinct_3018OutgoingLinks(view);
		case Repeat2EditPart.VISUAL_ID:
			return getRepeat_3019OutgoingLinks(view);
		case Until2EditPart.VISUAL_ID:
			return getUntil_3020OutgoingLinks(view);
		case Range2EditPart.VISUAL_ID:
			return getRange_3021OutgoingLinks(view);
		case FollowedBy2EditPart.VISUAL_ID:
			return getFollowedBy_3022OutgoingLinks(view);
		case While2EditPart.VISUAL_ID:
			return getWhile_3023OutgoingLinks(view);
		case Event2EditPart.VISUAL_ID:
			return getEvent_3024OutgoingLinks(view);
		case EventProperty4EditPart.VISUAL_ID:
			return getEventProperty_3025OutgoingLinks(view);
		case Value2EditPart.VISUAL_ID:
			return getValue_3026OutgoingLinks(view);
		case And3EditPart.VISUAL_ID:
			return getAnd_3027OutgoingLinks(view);
		case Or3EditPart.VISUAL_ID:
			return getOr_3028OutgoingLinks(view);
		case Not3EditPart.VISUAL_ID:
			return getNot_3029OutgoingLinks(view);
		case Addition3EditPart.VISUAL_ID:
			return getAddition_3030OutgoingLinks(view);
		case Subtraction3EditPart.VISUAL_ID:
			return getSubtraction_3031OutgoingLinks(view);
		case Multiplication3EditPart.VISUAL_ID:
			return getMultiplication_3032OutgoingLinks(view);
		case Division3EditPart.VISUAL_ID:
			return getDivision_3033OutgoingLinks(view);
		case Modulus3EditPart.VISUAL_ID:
			return getModulus_3034OutgoingLinks(view);
		case Equal3EditPart.VISUAL_ID:
			return getEqual_3035OutgoingLinks(view);
		case NotEqual3EditPart.VISUAL_ID:
			return getNotEqual_3036OutgoingLinks(view);
		case LessThan3EditPart.VISUAL_ID:
			return getLessThan_3037OutgoingLinks(view);
		case GreaterThan3EditPart.VISUAL_ID:
			return getGreaterThan_3038OutgoingLinks(view);
		case LessEqual3EditPart.VISUAL_ID:
			return getLessEqual_3039OutgoingLinks(view);
		case GreaterEqual3EditPart.VISUAL_ID:
			return getGreaterEqual_3040OutgoingLinks(view);
		case Every3EditPart.VISUAL_ID:
			return getEvery_3041OutgoingLinks(view);
		case EveryDistinct3EditPart.VISUAL_ID:
			return getEveryDistinct_3042OutgoingLinks(view);
		case Repeat3EditPart.VISUAL_ID:
			return getRepeat_3043OutgoingLinks(view);
		case Until3EditPart.VISUAL_ID:
			return getUntil_3044OutgoingLinks(view);
		case Range3EditPart.VISUAL_ID:
			return getRange_3045OutgoingLinks(view);
		case FollowedBy3EditPart.VISUAL_ID:
			return getFollowedBy_3046OutgoingLinks(view);
		case While3EditPart.VISUAL_ID:
			return getWhile_3047OutgoingLinks(view);
		case Max2EditPart.VISUAL_ID:
			return getMax_3048OutgoingLinks(view);
		case Min2EditPart.VISUAL_ID:
			return getMin_3049OutgoingLinks(view);
		case Avg2EditPart.VISUAL_ID:
			return getAvg_3050OutgoingLinks(view);
		case Count2EditPart.VISUAL_ID:
			return getCount_3051OutgoingLinks(view);
		case Sum2EditPart.VISUAL_ID:
			return getSum_3052OutgoingLinks(view);
		case Event3EditPart.VISUAL_ID:
			return getEvent_3053OutgoingLinks(view);
		case EventProperty5EditPart.VISUAL_ID:
			return getEventProperty_3054OutgoingLinks(view);
		case Value3EditPart.VISUAL_ID:
			return getValue_3055OutgoingLinks(view);
		case GroupBy2EditPart.VISUAL_ID:
			return getGroupBy_3060OutgoingLinks(view);
		case WithinTimer2EditPart.VISUAL_ID:
			return getWithinTimer_3056OutgoingLinks(view);
		case TimeInterval2EditPart.VISUAL_ID:
			return getTimeInterval_3057OutgoingLinks(view);
		case TimeSchedule2EditPart.VISUAL_ID:
			return getTimeSchedule_3058OutgoingLinks(view);
		case ComplexEventPropertyEditPart.VISUAL_ID:
			return getComplexEventProperty_3059OutgoingLinks(view);
		case ContractFunctionEditPart.VISUAL_ID:
			return getContractFunction_3061OutgoingLinks(view);
		case InputParameterEditPart.VISUAL_ID:
			return getInputParameter_3062OutgoingLinks(view);
		case OutputParameterEditPart.VISUAL_ID:
			return getOutputParameter_3063OutgoingLinks(view);
		case LinkEditPart.VISUAL_ID:
			return getLink_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getCEPEventPattern_1000ContainedLinks(View view) {
		CEPEventPattern modelElement = (CEPEventPattern) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getAnd_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getOr_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getNot_2003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getAddition_2004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getSubtraction_2005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getMultiplication_2006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getDivision_2007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getModulus_2008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEqual_2009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getNotEqual_2010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getLessThan_2011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getGreaterThan_2012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getLessEqual_2013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getGreaterEqual_2014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEvery_2015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEveryDistinct_2016ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getRepeat_2017ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getUntil_2018ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getRange_2019ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getFollowedBy_2020ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getWhile_2021ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getMax_2022ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getMin_2023ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getAvg_2024ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getCount_2025ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getSum_2026ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEvent_2027ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEventProperty_2028ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getValue_2029ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<EventpatternLinkDescriptor> getGroupBy_2040ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getWithinTimer_2030ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getTimeInterval_2031ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getTimeSchedule_2032ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEmail_2033ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getTwitter_2039ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getSlidingEventInterval_2034ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getBatchingEventInterval_2035ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getSlidingTimeInterval_2036ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getBatchingTimeInterval_2037ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getComplexEvent_2038ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<EventpatternLinkDescriptor> getSmartContract_2041ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEventProperty_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEventProperty_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getAnd_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getOr_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getNot_3005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getAddition_3006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getSubtraction_3007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getMultiplication_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getDivision_3009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getModulus_3010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEqual_3011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getNotEqual_3012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getLessThan_3013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getGreaterThan_3014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getLessEqual_3015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getGreaterEqual_3016ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEvery_3017ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEveryDistinct_3018ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getRepeat_3019ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getUntil_3020ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getRange_3021ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getFollowedBy_3022ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getWhile_3023ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEvent_3024ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEventProperty_3025ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getValue_3026ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getAnd_3027ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getOr_3028ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getNot_3029ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getAddition_3030ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getSubtraction_3031ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getMultiplication_3032ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getDivision_3033ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getModulus_3034ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEqual_3035ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getNotEqual_3036ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getLessThan_3037ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getGreaterThan_3038ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getLessEqual_3039ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getGreaterEqual_3040ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEvery_3041ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEveryDistinct_3042ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getRepeat_3043ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getUntil_3044ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getRange_3045ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getFollowedBy_3046ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getWhile_3047ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getMax_3048ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getMin_3049ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getAvg_3050ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getCount_3051ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getSum_3052ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEvent_3053ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEventProperty_3054ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getValue_3055ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<EventpatternLinkDescriptor> getGroupBy_3060ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getWithinTimer_3056ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getTimeInterval_3057ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getTimeSchedule_3058ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getComplexEventProperty_3059ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<EventpatternLinkDescriptor> getContractFunction_3061ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<EventpatternLinkDescriptor> getInputParameter_3062ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<EventpatternLinkDescriptor> getOutputParameter_3063ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getLink_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getAnd_2001IncomingLinks(View view) {
		And modelElement = (And) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getOr_2002IncomingLinks(View view) {
		Or modelElement = (Or) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getNot_2003IncomingLinks(View view) {
		Not modelElement = (Not) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getAddition_2004IncomingLinks(View view) {
		Addition modelElement = (Addition) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getSubtraction_2005IncomingLinks(View view) {
		Subtraction modelElement = (Subtraction) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getMultiplication_2006IncomingLinks(View view) {
		Multiplication modelElement = (Multiplication) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getDivision_2007IncomingLinks(View view) {
		Division modelElement = (Division) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getModulus_2008IncomingLinks(View view) {
		Modulus modelElement = (Modulus) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEqual_2009IncomingLinks(View view) {
		Equal modelElement = (Equal) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getNotEqual_2010IncomingLinks(View view) {
		NotEqual modelElement = (NotEqual) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getLessThan_2011IncomingLinks(View view) {
		LessThan modelElement = (LessThan) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getGreaterThan_2012IncomingLinks(View view) {
		GreaterThan modelElement = (GreaterThan) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getLessEqual_2013IncomingLinks(View view) {
		LessEqual modelElement = (LessEqual) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getGreaterEqual_2014IncomingLinks(View view) {
		GreaterEqual modelElement = (GreaterEqual) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEvery_2015IncomingLinks(View view) {
		Every modelElement = (Every) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEveryDistinct_2016IncomingLinks(View view) {
		EveryDistinct modelElement = (EveryDistinct) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getRepeat_2017IncomingLinks(View view) {
		Repeat modelElement = (Repeat) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getUntil_2018IncomingLinks(View view) {
		Until modelElement = (Until) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getRange_2019IncomingLinks(View view) {
		Range modelElement = (Range) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getFollowedBy_2020IncomingLinks(View view) {
		FollowedBy modelElement = (FollowedBy) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getWhile_2021IncomingLinks(View view) {
		While modelElement = (While) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getMax_2022IncomingLinks(View view) {
		Max modelElement = (Max) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getMin_2023IncomingLinks(View view) {
		Min modelElement = (Min) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getAvg_2024IncomingLinks(View view) {
		Avg modelElement = (Avg) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getCount_2025IncomingLinks(View view) {
		Count modelElement = (Count) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getSum_2026IncomingLinks(View view) {
		Sum modelElement = (Sum) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEvent_2027IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEventProperty_2028IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getValue_2029IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<EventpatternLinkDescriptor> getGroupBy_2040IncomingLinks(View view) {
		GroupBy modelElement = (GroupBy) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getWithinTimer_2030IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getTimeInterval_2031IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getTimeSchedule_2032IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEmail_2033IncomingLinks(View view) {
		Email modelElement = (Email) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getTwitter_2039IncomingLinks(View view) {
		Twitter modelElement = (Twitter) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getSlidingEventInterval_2034IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getBatchingEventInterval_2035IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getSlidingTimeInterval_2036IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getBatchingTimeInterval_2037IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getComplexEvent_2038IncomingLinks(View view) {
		ComplexEvent modelElement = (ComplexEvent) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<EventpatternLinkDescriptor> getSmartContract_2041IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEventProperty_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEventProperty_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getAnd_3003IncomingLinks(View view) {
		And modelElement = (And) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getOr_3004IncomingLinks(View view) {
		Or modelElement = (Or) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getNot_3005IncomingLinks(View view) {
		Not modelElement = (Not) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getAddition_3006IncomingLinks(View view) {
		Addition modelElement = (Addition) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getSubtraction_3007IncomingLinks(View view) {
		Subtraction modelElement = (Subtraction) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getMultiplication_3008IncomingLinks(View view) {
		Multiplication modelElement = (Multiplication) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getDivision_3009IncomingLinks(View view) {
		Division modelElement = (Division) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getModulus_3010IncomingLinks(View view) {
		Modulus modelElement = (Modulus) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEqual_3011IncomingLinks(View view) {
		Equal modelElement = (Equal) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getNotEqual_3012IncomingLinks(View view) {
		NotEqual modelElement = (NotEqual) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getLessThan_3013IncomingLinks(View view) {
		LessThan modelElement = (LessThan) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getGreaterThan_3014IncomingLinks(View view) {
		GreaterThan modelElement = (GreaterThan) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getLessEqual_3015IncomingLinks(View view) {
		LessEqual modelElement = (LessEqual) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getGreaterEqual_3016IncomingLinks(View view) {
		GreaterEqual modelElement = (GreaterEqual) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEvery_3017IncomingLinks(View view) {
		Every modelElement = (Every) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEveryDistinct_3018IncomingLinks(View view) {
		EveryDistinct modelElement = (EveryDistinct) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getRepeat_3019IncomingLinks(View view) {
		Repeat modelElement = (Repeat) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getUntil_3020IncomingLinks(View view) {
		Until modelElement = (Until) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getRange_3021IncomingLinks(View view) {
		Range modelElement = (Range) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getFollowedBy_3022IncomingLinks(View view) {
		FollowedBy modelElement = (FollowedBy) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getWhile_3023IncomingLinks(View view) {
		While modelElement = (While) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEvent_3024IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEventProperty_3025IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getValue_3026IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getAnd_3027IncomingLinks(View view) {
		And modelElement = (And) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getOr_3028IncomingLinks(View view) {
		Or modelElement = (Or) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getNot_3029IncomingLinks(View view) {
		Not modelElement = (Not) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getAddition_3030IncomingLinks(View view) {
		Addition modelElement = (Addition) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getSubtraction_3031IncomingLinks(View view) {
		Subtraction modelElement = (Subtraction) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getMultiplication_3032IncomingLinks(View view) {
		Multiplication modelElement = (Multiplication) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getDivision_3033IncomingLinks(View view) {
		Division modelElement = (Division) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getModulus_3034IncomingLinks(View view) {
		Modulus modelElement = (Modulus) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEqual_3035IncomingLinks(View view) {
		Equal modelElement = (Equal) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getNotEqual_3036IncomingLinks(View view) {
		NotEqual modelElement = (NotEqual) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getLessThan_3037IncomingLinks(View view) {
		LessThan modelElement = (LessThan) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getGreaterThan_3038IncomingLinks(View view) {
		GreaterThan modelElement = (GreaterThan) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getLessEqual_3039IncomingLinks(View view) {
		LessEqual modelElement = (LessEqual) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getGreaterEqual_3040IncomingLinks(View view) {
		GreaterEqual modelElement = (GreaterEqual) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEvery_3041IncomingLinks(View view) {
		Every modelElement = (Every) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEveryDistinct_3042IncomingLinks(View view) {
		EveryDistinct modelElement = (EveryDistinct) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getRepeat_3043IncomingLinks(View view) {
		Repeat modelElement = (Repeat) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getUntil_3044IncomingLinks(View view) {
		Until modelElement = (Until) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getRange_3045IncomingLinks(View view) {
		Range modelElement = (Range) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getFollowedBy_3046IncomingLinks(View view) {
		FollowedBy modelElement = (FollowedBy) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getWhile_3047IncomingLinks(View view) {
		While modelElement = (While) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getMax_3048IncomingLinks(View view) {
		Max modelElement = (Max) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getMin_3049IncomingLinks(View view) {
		Min modelElement = (Min) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getAvg_3050IncomingLinks(View view) {
		Avg modelElement = (Avg) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getCount_3051IncomingLinks(View view) {
		Count modelElement = (Count) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getSum_3052IncomingLinks(View view) {
		Sum modelElement = (Sum) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEvent_3053IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEventProperty_3054IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getValue_3055IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<EventpatternLinkDescriptor> getGroupBy_3060IncomingLinks(View view) {
		GroupBy modelElement = (GroupBy) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getWithinTimer_3056IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getTimeInterval_3057IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getTimeSchedule_3058IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getComplexEventProperty_3059IncomingLinks(View view) {
		ComplexEventProperty modelElement = (ComplexEventProperty) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<EventpatternLinkDescriptor> getContractFunction_3061IncomingLinks(View view) {
		ContractFunction modelElement = (ContractFunction) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<EventpatternLinkDescriptor> getInputParameter_3062IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<EventpatternLinkDescriptor> getOutputParameter_3063IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getLink_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getAnd_2001OutgoingLinks(View view) {
		And modelElement = (And) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getOr_2002OutgoingLinks(View view) {
		Or modelElement = (Or) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getNot_2003OutgoingLinks(View view) {
		Not modelElement = (Not) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getAddition_2004OutgoingLinks(View view) {
		Addition modelElement = (Addition) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getSubtraction_2005OutgoingLinks(View view) {
		Subtraction modelElement = (Subtraction) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getMultiplication_2006OutgoingLinks(View view) {
		Multiplication modelElement = (Multiplication) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getDivision_2007OutgoingLinks(View view) {
		Division modelElement = (Division) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getModulus_2008OutgoingLinks(View view) {
		Modulus modelElement = (Modulus) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEqual_2009OutgoingLinks(View view) {
		Equal modelElement = (Equal) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getNotEqual_2010OutgoingLinks(View view) {
		NotEqual modelElement = (NotEqual) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getLessThan_2011OutgoingLinks(View view) {
		LessThan modelElement = (LessThan) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getGreaterThan_2012OutgoingLinks(View view) {
		GreaterThan modelElement = (GreaterThan) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getLessEqual_2013OutgoingLinks(View view) {
		LessEqual modelElement = (LessEqual) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getGreaterEqual_2014OutgoingLinks(View view) {
		GreaterEqual modelElement = (GreaterEqual) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEvery_2015OutgoingLinks(View view) {
		Every modelElement = (Every) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEveryDistinct_2016OutgoingLinks(View view) {
		EveryDistinct modelElement = (EveryDistinct) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getRepeat_2017OutgoingLinks(View view) {
		Repeat modelElement = (Repeat) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getUntil_2018OutgoingLinks(View view) {
		Until modelElement = (Until) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getRange_2019OutgoingLinks(View view) {
		Range modelElement = (Range) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getFollowedBy_2020OutgoingLinks(View view) {
		FollowedBy modelElement = (FollowedBy) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getWhile_2021OutgoingLinks(View view) {
		While modelElement = (While) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getMax_2022OutgoingLinks(View view) {
		Max modelElement = (Max) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getMin_2023OutgoingLinks(View view) {
		Min modelElement = (Min) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getAvg_2024OutgoingLinks(View view) {
		Avg modelElement = (Avg) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getCount_2025OutgoingLinks(View view) {
		Count modelElement = (Count) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getSum_2026OutgoingLinks(View view) {
		Sum modelElement = (Sum) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEvent_2027OutgoingLinks(View view) {
		Event modelElement = (Event) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEventProperty_2028OutgoingLinks(View view) {
		EventProperty modelElement = (EventProperty) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getValue_2029OutgoingLinks(View view) {
		Value modelElement = (Value) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<EventpatternLinkDescriptor> getGroupBy_2040OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getWithinTimer_2030OutgoingLinks(View view) {
		WithinTimer modelElement = (WithinTimer) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getTimeInterval_2031OutgoingLinks(View view) {
		TimeInterval modelElement = (TimeInterval) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getTimeSchedule_2032OutgoingLinks(View view) {
		TimeSchedule modelElement = (TimeSchedule) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEmail_2033OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getTwitter_2039OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getSlidingEventInterval_2034OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getBatchingEventInterval_2035OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getSlidingTimeInterval_2036OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getBatchingTimeInterval_2037OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getComplexEvent_2038OutgoingLinks(View view) {
		ComplexEvent modelElement = (ComplexEvent) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<EventpatternLinkDescriptor> getSmartContract_2041OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEventProperty_3001OutgoingLinks(View view) {
		EventProperty modelElement = (EventProperty) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEventProperty_3002OutgoingLinks(View view) {
		EventProperty modelElement = (EventProperty) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getAnd_3003OutgoingLinks(View view) {
		And modelElement = (And) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getOr_3004OutgoingLinks(View view) {
		Or modelElement = (Or) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getNot_3005OutgoingLinks(View view) {
		Not modelElement = (Not) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getAddition_3006OutgoingLinks(View view) {
		Addition modelElement = (Addition) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getSubtraction_3007OutgoingLinks(View view) {
		Subtraction modelElement = (Subtraction) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getMultiplication_3008OutgoingLinks(View view) {
		Multiplication modelElement = (Multiplication) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getDivision_3009OutgoingLinks(View view) {
		Division modelElement = (Division) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getModulus_3010OutgoingLinks(View view) {
		Modulus modelElement = (Modulus) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEqual_3011OutgoingLinks(View view) {
		Equal modelElement = (Equal) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getNotEqual_3012OutgoingLinks(View view) {
		NotEqual modelElement = (NotEqual) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getLessThan_3013OutgoingLinks(View view) {
		LessThan modelElement = (LessThan) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getGreaterThan_3014OutgoingLinks(View view) {
		GreaterThan modelElement = (GreaterThan) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getLessEqual_3015OutgoingLinks(View view) {
		LessEqual modelElement = (LessEqual) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getGreaterEqual_3016OutgoingLinks(View view) {
		GreaterEqual modelElement = (GreaterEqual) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEvery_3017OutgoingLinks(View view) {
		Every modelElement = (Every) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEveryDistinct_3018OutgoingLinks(View view) {
		EveryDistinct modelElement = (EveryDistinct) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getRepeat_3019OutgoingLinks(View view) {
		Repeat modelElement = (Repeat) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getUntil_3020OutgoingLinks(View view) {
		Until modelElement = (Until) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getRange_3021OutgoingLinks(View view) {
		Range modelElement = (Range) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getFollowedBy_3022OutgoingLinks(View view) {
		FollowedBy modelElement = (FollowedBy) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getWhile_3023OutgoingLinks(View view) {
		While modelElement = (While) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEvent_3024OutgoingLinks(View view) {
		Event modelElement = (Event) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEventProperty_3025OutgoingLinks(View view) {
		EventProperty modelElement = (EventProperty) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getValue_3026OutgoingLinks(View view) {
		Value modelElement = (Value) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getAnd_3027OutgoingLinks(View view) {
		And modelElement = (And) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getOr_3028OutgoingLinks(View view) {
		Or modelElement = (Or) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getNot_3029OutgoingLinks(View view) {
		Not modelElement = (Not) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getAddition_3030OutgoingLinks(View view) {
		Addition modelElement = (Addition) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getSubtraction_3031OutgoingLinks(View view) {
		Subtraction modelElement = (Subtraction) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getMultiplication_3032OutgoingLinks(View view) {
		Multiplication modelElement = (Multiplication) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getDivision_3033OutgoingLinks(View view) {
		Division modelElement = (Division) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getModulus_3034OutgoingLinks(View view) {
		Modulus modelElement = (Modulus) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEqual_3035OutgoingLinks(View view) {
		Equal modelElement = (Equal) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getNotEqual_3036OutgoingLinks(View view) {
		NotEqual modelElement = (NotEqual) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getLessThan_3037OutgoingLinks(View view) {
		LessThan modelElement = (LessThan) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getGreaterThan_3038OutgoingLinks(View view) {
		GreaterThan modelElement = (GreaterThan) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getLessEqual_3039OutgoingLinks(View view) {
		LessEqual modelElement = (LessEqual) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getGreaterEqual_3040OutgoingLinks(View view) {
		GreaterEqual modelElement = (GreaterEqual) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEvery_3041OutgoingLinks(View view) {
		Every modelElement = (Every) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEveryDistinct_3042OutgoingLinks(View view) {
		EveryDistinct modelElement = (EveryDistinct) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getRepeat_3043OutgoingLinks(View view) {
		Repeat modelElement = (Repeat) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getUntil_3044OutgoingLinks(View view) {
		Until modelElement = (Until) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getRange_3045OutgoingLinks(View view) {
		Range modelElement = (Range) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getFollowedBy_3046OutgoingLinks(View view) {
		FollowedBy modelElement = (FollowedBy) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getWhile_3047OutgoingLinks(View view) {
		While modelElement = (While) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getMax_3048OutgoingLinks(View view) {
		Max modelElement = (Max) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getMin_3049OutgoingLinks(View view) {
		Min modelElement = (Min) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getAvg_3050OutgoingLinks(View view) {
		Avg modelElement = (Avg) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getCount_3051OutgoingLinks(View view) {
		Count modelElement = (Count) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getSum_3052OutgoingLinks(View view) {
		Sum modelElement = (Sum) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEvent_3053OutgoingLinks(View view) {
		Event modelElement = (Event) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getEventProperty_3054OutgoingLinks(View view) {
		EventProperty modelElement = (EventProperty) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getValue_3055OutgoingLinks(View view) {
		Value modelElement = (Value) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<EventpatternLinkDescriptor> getGroupBy_3060OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getWithinTimer_3056OutgoingLinks(View view) {
		WithinTimer modelElement = (WithinTimer) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getTimeInterval_3057OutgoingLinks(View view) {
		TimeInterval modelElement = (TimeInterval) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getTimeSchedule_3058OutgoingLinks(View view) {
		TimeSchedule modelElement = (TimeSchedule) view.getElement();
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getComplexEventProperty_3059OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<EventpatternLinkDescriptor> getContractFunction_3061OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<EventpatternLinkDescriptor> getInputParameter_3062OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<EventpatternLinkDescriptor> getOutputParameter_3063OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventpatternLinkDescriptor> getLink_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<EventpatternLinkDescriptor> getContainedTypeModelFacetLinks_Link_4001(
			CEPEventPattern container) {
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Link) {
				continue;
			}
			Link link = (Link) linkObject;
			if (LinkEditPart.VISUAL_ID != EventpatternVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Operator dst = link.getOperator();
			Operand src = link.getOperand();
			result.add(new EventpatternLinkDescriptor(src, dst, link, EventpatternElementTypes.Link_4001,
					LinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EventpatternLinkDescriptor> getIncomingTypeModelFacetLinks_Link_4001(Operator target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != EventpatternPackage.eINSTANCE.getLink_Operator()
					|| false == setting.getEObject() instanceof Link) {
				continue;
			}
			Link link = (Link) setting.getEObject();
			if (LinkEditPart.VISUAL_ID != EventpatternVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Operand src = link.getOperand();
			result.add(new EventpatternLinkDescriptor(src, target, link, EventpatternElementTypes.Link_4001,
					LinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EventpatternLinkDescriptor> getOutgoingTypeModelFacetLinks_Link_4001(Operand source) {
		CEPEventPattern container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof CEPEventPattern) {
				container = (CEPEventPattern) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<EventpatternLinkDescriptor> result = new LinkedList<EventpatternLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Link) {
				continue;
			}
			Link link = (Link) linkObject;
			if (LinkEditPart.VISUAL_ID != EventpatternVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Operator dst = link.getOperator();
			Operand src = link.getOperand();
			if (src != source) {
				continue;
			}
			result.add(new EventpatternLinkDescriptor(src, dst, link, EventpatternElementTypes.Link_4001,
					LinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated NOT
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * Override annotation has been removed.
		 * @generated NOT
		 */
		public List<EventpatternNodeDescriptor> getSemanticChildren(View view) {
			return EventpatternDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * Override annotation has been removed.
		 * @generated NOT
		 */
		public List<EventpatternLinkDescriptor> getContainedLinks(View view) {
			return EventpatternDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * Override annotation has been removed.
		 * @generated NOT
		 */
		public List<EventpatternLinkDescriptor> getIncomingLinks(View view) {
			return EventpatternDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * Override annotation has been removed.
		 * @generated NOT
		 */
		public List<EventpatternLinkDescriptor> getOutgoingLinks(View view) {
			return EventpatternDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
