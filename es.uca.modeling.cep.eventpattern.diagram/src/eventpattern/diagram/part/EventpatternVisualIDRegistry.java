/*
 * 
 */
package eventpattern.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import eventpattern.CEPEventPattern;
import eventpattern.EventpatternPackage;
import eventpattern.diagram.edit.parts.*;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class EventpatternVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "es.uca.modeling.cep.eventpattern.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (CEPEventPatternEditPart.MODEL_ID.equals(view.getType())) {
				return CEPEventPatternEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return eventpattern.diagram.part.EventpatternVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				EventpatternDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (EventpatternPackage.eINSTANCE.getCEPEventPattern().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((CEPEventPattern) domainElement)) {
			return CEPEventPatternEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = eventpattern.diagram.part.EventpatternVisualIDRegistry.getModelID(containerView);
		if (!CEPEventPatternEditPart.MODEL_ID.equals(containerModelID) && !"pattern".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (CEPEventPatternEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = eventpattern.diagram.part.EventpatternVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CEPEventPatternEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case CEPEventPatternEditPart.VISUAL_ID:
			if (EventpatternPackage.eINSTANCE.getAnd().isSuperTypeOf(domainElement.eClass())) {
				return AndEditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getOr().isSuperTypeOf(domainElement.eClass())) {
				return OrEditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getNot().isSuperTypeOf(domainElement.eClass())) {
				return NotEditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getAddition().isSuperTypeOf(domainElement.eClass())) {
				return AdditionEditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getSubtraction().isSuperTypeOf(domainElement.eClass())) {
				return SubtractionEditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getMultiplication().isSuperTypeOf(domainElement.eClass())) {
				return MultiplicationEditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getDivision().isSuperTypeOf(domainElement.eClass())) {
				return DivisionEditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getModulus().isSuperTypeOf(domainElement.eClass())) {
				return ModulusEditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getEqual().isSuperTypeOf(domainElement.eClass())) {
				return EqualEditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getNotEqual().isSuperTypeOf(domainElement.eClass())) {
				return NotEqualEditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getLessThan().isSuperTypeOf(domainElement.eClass())) {
				return LessThanEditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getGreaterThan().isSuperTypeOf(domainElement.eClass())) {
				return GreaterThanEditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getLessEqual().isSuperTypeOf(domainElement.eClass())) {
				return LessEqualEditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getGreaterEqual().isSuperTypeOf(domainElement.eClass())) {
				return GreaterEqualEditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getEvery().isSuperTypeOf(domainElement.eClass())) {
				return EveryEditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getEveryDistinct().isSuperTypeOf(domainElement.eClass())) {
				return EveryDistinctEditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getRepeat().isSuperTypeOf(domainElement.eClass())) {
				return RepeatEditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getUntil().isSuperTypeOf(domainElement.eClass())) {
				return UntilEditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getRange().isSuperTypeOf(domainElement.eClass())) {
				return RangeEditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getFollowedBy().isSuperTypeOf(domainElement.eClass())) {
				return FollowedByEditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return WhileEditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getMax().isSuperTypeOf(domainElement.eClass())) {
				return MaxEditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getMin().isSuperTypeOf(domainElement.eClass())) {
				return MinEditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getAvg().isSuperTypeOf(domainElement.eClass())) {
				return AvgEditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getCount().isSuperTypeOf(domainElement.eClass())) {
				return CountEditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getSum().isSuperTypeOf(domainElement.eClass())) {
				return SumEditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getEvent().isSuperTypeOf(domainElement.eClass())) {
				return EventEditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getEventProperty().isSuperTypeOf(domainElement.eClass())) {
				return EventPropertyEditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getValue().isSuperTypeOf(domainElement.eClass())) {
				return ValueEditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getWithinTimer().isSuperTypeOf(domainElement.eClass())) {
				return WithinTimerEditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getTimeInterval().isSuperTypeOf(domainElement.eClass())) {
				return TimeIntervalEditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getTimeSchedule().isSuperTypeOf(domainElement.eClass())) {
				return TimeScheduleEditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getEmail().isSuperTypeOf(domainElement.eClass())) {
				return EmailEditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getTwitter().isSuperTypeOf(domainElement.eClass())) {
				return TwitterEditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getSlidingEventInterval().isSuperTypeOf(domainElement.eClass())) {
				return SlidingEventIntervalEditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getBatchingEventInterval().isSuperTypeOf(domainElement.eClass())) {
				return BatchingEventIntervalEditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getSlidingTimeInterval().isSuperTypeOf(domainElement.eClass())) {
				return SlidingTimeIntervalEditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getBatchingTimeInterval().isSuperTypeOf(domainElement.eClass())) {
				return BatchingTimeIntervalEditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getComplexEvent().isSuperTypeOf(domainElement.eClass())) {
				return ComplexEventEditPart.VISUAL_ID;
			}
			break;
		case EventEventEventPropertiesCompartmentEditPart.VISUAL_ID:
			if (EventpatternPackage.eINSTANCE.getEventProperty().isSuperTypeOf(domainElement.eClass())) {
				return EventProperty2EditPart.VISUAL_ID;
			}
			break;
		case EventPropertyEventPropertyEventPropertiesCompartmentEditPart.VISUAL_ID:
			if (EventpatternPackage.eINSTANCE.getEventProperty().isSuperTypeOf(domainElement.eClass())) {
				return EventProperty3EditPart.VISUAL_ID;
			}
			break;
		case EventPropertyEventPropertyEventPropertiesCompartment2EditPart.VISUAL_ID:
			if (EventpatternPackage.eINSTANCE.getEventProperty().isSuperTypeOf(domainElement.eClass())) {
				return EventProperty3EditPart.VISUAL_ID;
			}
			break;
		case EventPropertyEventPropertyEventPropertiesCompartment3EditPart.VISUAL_ID:
			if (EventpatternPackage.eINSTANCE.getEventProperty().isSuperTypeOf(domainElement.eClass())) {
				return EventProperty3EditPart.VISUAL_ID;
			}
			break;
		case WithinTimerWithinTimerWithinTimerElementsCompartmentEditPart.VISUAL_ID:
			if (EventpatternPackage.eINSTANCE.getAnd().isSuperTypeOf(domainElement.eClass())) {
				return And2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getOr().isSuperTypeOf(domainElement.eClass())) {
				return Or2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getNot().isSuperTypeOf(domainElement.eClass())) {
				return Not2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getAddition().isSuperTypeOf(domainElement.eClass())) {
				return Addition2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getSubtraction().isSuperTypeOf(domainElement.eClass())) {
				return Subtraction2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getMultiplication().isSuperTypeOf(domainElement.eClass())) {
				return Multiplication2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getDivision().isSuperTypeOf(domainElement.eClass())) {
				return Division2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getModulus().isSuperTypeOf(domainElement.eClass())) {
				return Modulus2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getEqual().isSuperTypeOf(domainElement.eClass())) {
				return Equal2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getNotEqual().isSuperTypeOf(domainElement.eClass())) {
				return NotEqual2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getLessThan().isSuperTypeOf(domainElement.eClass())) {
				return LessThan2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getGreaterThan().isSuperTypeOf(domainElement.eClass())) {
				return GreaterThan2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getLessEqual().isSuperTypeOf(domainElement.eClass())) {
				return LessEqual2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getGreaterEqual().isSuperTypeOf(domainElement.eClass())) {
				return GreaterEqual2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getEvery().isSuperTypeOf(domainElement.eClass())) {
				return Every2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getEveryDistinct().isSuperTypeOf(domainElement.eClass())) {
				return EveryDistinct2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getRepeat().isSuperTypeOf(domainElement.eClass())) {
				return Repeat2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getUntil().isSuperTypeOf(domainElement.eClass())) {
				return Until2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getRange().isSuperTypeOf(domainElement.eClass())) {
				return Range2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getFollowedBy().isSuperTypeOf(domainElement.eClass())) {
				return FollowedBy2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getEvent().isSuperTypeOf(domainElement.eClass())) {
				return Event2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getEventProperty().isSuperTypeOf(domainElement.eClass())) {
				return EventProperty4EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getValue().isSuperTypeOf(domainElement.eClass())) {
				return Value2EditPart.VISUAL_ID;
			}
			break;
		case EventEventEventPropertiesCompartment2EditPart.VISUAL_ID:
			if (EventpatternPackage.eINSTANCE.getEventProperty().isSuperTypeOf(domainElement.eClass())) {
				return EventProperty2EditPart.VISUAL_ID;
			}
			break;
		case EventPropertyEventPropertyEventPropertiesCompartment4EditPart.VISUAL_ID:
			if (EventpatternPackage.eINSTANCE.getEventProperty().isSuperTypeOf(domainElement.eClass())) {
				return EventProperty3EditPart.VISUAL_ID;
			}
			break;
		case SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID:
			if (EventpatternPackage.eINSTANCE.getAnd().isSuperTypeOf(domainElement.eClass())) {
				return And3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getOr().isSuperTypeOf(domainElement.eClass())) {
				return Or3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getNot().isSuperTypeOf(domainElement.eClass())) {
				return Not3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getAddition().isSuperTypeOf(domainElement.eClass())) {
				return Addition3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getSubtraction().isSuperTypeOf(domainElement.eClass())) {
				return Subtraction3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getMultiplication().isSuperTypeOf(domainElement.eClass())) {
				return Multiplication3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getDivision().isSuperTypeOf(domainElement.eClass())) {
				return Division3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getModulus().isSuperTypeOf(domainElement.eClass())) {
				return Modulus3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getEqual().isSuperTypeOf(domainElement.eClass())) {
				return Equal3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getNotEqual().isSuperTypeOf(domainElement.eClass())) {
				return NotEqual3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getLessThan().isSuperTypeOf(domainElement.eClass())) {
				return LessThan3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getGreaterThan().isSuperTypeOf(domainElement.eClass())) {
				return GreaterThan3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getLessEqual().isSuperTypeOf(domainElement.eClass())) {
				return LessEqual3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getGreaterEqual().isSuperTypeOf(domainElement.eClass())) {
				return GreaterEqual3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getEvery().isSuperTypeOf(domainElement.eClass())) {
				return Every3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getEveryDistinct().isSuperTypeOf(domainElement.eClass())) {
				return EveryDistinct3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getRepeat().isSuperTypeOf(domainElement.eClass())) {
				return Repeat3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getUntil().isSuperTypeOf(domainElement.eClass())) {
				return Until3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getRange().isSuperTypeOf(domainElement.eClass())) {
				return Range3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getFollowedBy().isSuperTypeOf(domainElement.eClass())) {
				return FollowedBy3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getMax().isSuperTypeOf(domainElement.eClass())) {
				return Max2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getMin().isSuperTypeOf(domainElement.eClass())) {
				return Min2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getAvg().isSuperTypeOf(domainElement.eClass())) {
				return Avg2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getCount().isSuperTypeOf(domainElement.eClass())) {
				return Count2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getSum().isSuperTypeOf(domainElement.eClass())) {
				return Sum2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getEvent().isSuperTypeOf(domainElement.eClass())) {
				return Event3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getEventProperty().isSuperTypeOf(domainElement.eClass())) {
				return EventProperty5EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getValue().isSuperTypeOf(domainElement.eClass())) {
				return Value3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getWithinTimer().isSuperTypeOf(domainElement.eClass())) {
				return WithinTimer2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getTimeInterval().isSuperTypeOf(domainElement.eClass())) {
				return TimeInterval2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getTimeSchedule().isSuperTypeOf(domainElement.eClass())) {
				return TimeSchedule2EditPart.VISUAL_ID;
			}
			break;
		case EventEventEventPropertiesCompartment3EditPart.VISUAL_ID:
			if (EventpatternPackage.eINSTANCE.getEventProperty().isSuperTypeOf(domainElement.eClass())) {
				return EventProperty2EditPart.VISUAL_ID;
			}
			break;
		case EventPropertyEventPropertyEventPropertiesCompartment5EditPart.VISUAL_ID:
			if (EventpatternPackage.eINSTANCE.getEventProperty().isSuperTypeOf(domainElement.eClass())) {
				return EventProperty3EditPart.VISUAL_ID;
			}
			break;
		case WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart.VISUAL_ID:
			if (EventpatternPackage.eINSTANCE.getAnd().isSuperTypeOf(domainElement.eClass())) {
				return And2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getOr().isSuperTypeOf(domainElement.eClass())) {
				return Or2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getNot().isSuperTypeOf(domainElement.eClass())) {
				return Not2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getAddition().isSuperTypeOf(domainElement.eClass())) {
				return Addition2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getSubtraction().isSuperTypeOf(domainElement.eClass())) {
				return Subtraction2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getMultiplication().isSuperTypeOf(domainElement.eClass())) {
				return Multiplication2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getDivision().isSuperTypeOf(domainElement.eClass())) {
				return Division2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getModulus().isSuperTypeOf(domainElement.eClass())) {
				return Modulus2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getEqual().isSuperTypeOf(domainElement.eClass())) {
				return Equal2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getNotEqual().isSuperTypeOf(domainElement.eClass())) {
				return NotEqual2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getLessThan().isSuperTypeOf(domainElement.eClass())) {
				return LessThan2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getGreaterThan().isSuperTypeOf(domainElement.eClass())) {
				return GreaterThan2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getLessEqual().isSuperTypeOf(domainElement.eClass())) {
				return LessEqual2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getGreaterEqual().isSuperTypeOf(domainElement.eClass())) {
				return GreaterEqual2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getEvery().isSuperTypeOf(domainElement.eClass())) {
				return Every2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getEveryDistinct().isSuperTypeOf(domainElement.eClass())) {
				return EveryDistinct2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getRepeat().isSuperTypeOf(domainElement.eClass())) {
				return Repeat2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getUntil().isSuperTypeOf(domainElement.eClass())) {
				return Until2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getRange().isSuperTypeOf(domainElement.eClass())) {
				return Range2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getFollowedBy().isSuperTypeOf(domainElement.eClass())) {
				return FollowedBy2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getEvent().isSuperTypeOf(domainElement.eClass())) {
				return Event2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getEventProperty().isSuperTypeOf(domainElement.eClass())) {
				return EventProperty4EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getValue().isSuperTypeOf(domainElement.eClass())) {
				return Value2EditPart.VISUAL_ID;
			}
			break;
		case BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID:
			if (EventpatternPackage.eINSTANCE.getAnd().isSuperTypeOf(domainElement.eClass())) {
				return And3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getOr().isSuperTypeOf(domainElement.eClass())) {
				return Or3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getNot().isSuperTypeOf(domainElement.eClass())) {
				return Not3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getAddition().isSuperTypeOf(domainElement.eClass())) {
				return Addition3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getSubtraction().isSuperTypeOf(domainElement.eClass())) {
				return Subtraction3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getMultiplication().isSuperTypeOf(domainElement.eClass())) {
				return Multiplication3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getDivision().isSuperTypeOf(domainElement.eClass())) {
				return Division3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getModulus().isSuperTypeOf(domainElement.eClass())) {
				return Modulus3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getEqual().isSuperTypeOf(domainElement.eClass())) {
				return Equal3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getNotEqual().isSuperTypeOf(domainElement.eClass())) {
				return NotEqual3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getLessThan().isSuperTypeOf(domainElement.eClass())) {
				return LessThan3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getGreaterThan().isSuperTypeOf(domainElement.eClass())) {
				return GreaterThan3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getLessEqual().isSuperTypeOf(domainElement.eClass())) {
				return LessEqual3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getGreaterEqual().isSuperTypeOf(domainElement.eClass())) {
				return GreaterEqual3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getEvery().isSuperTypeOf(domainElement.eClass())) {
				return Every3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getEveryDistinct().isSuperTypeOf(domainElement.eClass())) {
				return EveryDistinct3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getRepeat().isSuperTypeOf(domainElement.eClass())) {
				return Repeat3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getUntil().isSuperTypeOf(domainElement.eClass())) {
				return Until3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getRange().isSuperTypeOf(domainElement.eClass())) {
				return Range3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getFollowedBy().isSuperTypeOf(domainElement.eClass())) {
				return FollowedBy3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getMax().isSuperTypeOf(domainElement.eClass())) {
				return Max2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getMin().isSuperTypeOf(domainElement.eClass())) {
				return Min2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getAvg().isSuperTypeOf(domainElement.eClass())) {
				return Avg2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getCount().isSuperTypeOf(domainElement.eClass())) {
				return Count2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getSum().isSuperTypeOf(domainElement.eClass())) {
				return Sum2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getEvent().isSuperTypeOf(domainElement.eClass())) {
				return Event3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getEventProperty().isSuperTypeOf(domainElement.eClass())) {
				return EventProperty5EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getValue().isSuperTypeOf(domainElement.eClass())) {
				return Value3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getWithinTimer().isSuperTypeOf(domainElement.eClass())) {
				return WithinTimer2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getTimeInterval().isSuperTypeOf(domainElement.eClass())) {
				return TimeInterval2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getTimeSchedule().isSuperTypeOf(domainElement.eClass())) {
				return TimeSchedule2EditPart.VISUAL_ID;
			}
			break;
		case SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID:
			if (EventpatternPackage.eINSTANCE.getAnd().isSuperTypeOf(domainElement.eClass())) {
				return And3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getOr().isSuperTypeOf(domainElement.eClass())) {
				return Or3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getNot().isSuperTypeOf(domainElement.eClass())) {
				return Not3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getAddition().isSuperTypeOf(domainElement.eClass())) {
				return Addition3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getSubtraction().isSuperTypeOf(domainElement.eClass())) {
				return Subtraction3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getMultiplication().isSuperTypeOf(domainElement.eClass())) {
				return Multiplication3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getDivision().isSuperTypeOf(domainElement.eClass())) {
				return Division3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getModulus().isSuperTypeOf(domainElement.eClass())) {
				return Modulus3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getEqual().isSuperTypeOf(domainElement.eClass())) {
				return Equal3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getNotEqual().isSuperTypeOf(domainElement.eClass())) {
				return NotEqual3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getLessThan().isSuperTypeOf(domainElement.eClass())) {
				return LessThan3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getGreaterThan().isSuperTypeOf(domainElement.eClass())) {
				return GreaterThan3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getLessEqual().isSuperTypeOf(domainElement.eClass())) {
				return LessEqual3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getGreaterEqual().isSuperTypeOf(domainElement.eClass())) {
				return GreaterEqual3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getEvery().isSuperTypeOf(domainElement.eClass())) {
				return Every3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getEveryDistinct().isSuperTypeOf(domainElement.eClass())) {
				return EveryDistinct3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getRepeat().isSuperTypeOf(domainElement.eClass())) {
				return Repeat3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getUntil().isSuperTypeOf(domainElement.eClass())) {
				return Until3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getRange().isSuperTypeOf(domainElement.eClass())) {
				return Range3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getFollowedBy().isSuperTypeOf(domainElement.eClass())) {
				return FollowedBy3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getMax().isSuperTypeOf(domainElement.eClass())) {
				return Max2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getMin().isSuperTypeOf(domainElement.eClass())) {
				return Min2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getAvg().isSuperTypeOf(domainElement.eClass())) {
				return Avg2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getCount().isSuperTypeOf(domainElement.eClass())) {
				return Count2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getSum().isSuperTypeOf(domainElement.eClass())) {
				return Sum2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getEvent().isSuperTypeOf(domainElement.eClass())) {
				return Event3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getEventProperty().isSuperTypeOf(domainElement.eClass())) {
				return EventProperty5EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getValue().isSuperTypeOf(domainElement.eClass())) {
				return Value3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getWithinTimer().isSuperTypeOf(domainElement.eClass())) {
				return WithinTimer2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getTimeInterval().isSuperTypeOf(domainElement.eClass())) {
				return TimeInterval2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getTimeSchedule().isSuperTypeOf(domainElement.eClass())) {
				return TimeSchedule2EditPart.VISUAL_ID;
			}
			break;
		case BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID:
			if (EventpatternPackage.eINSTANCE.getAnd().isSuperTypeOf(domainElement.eClass())) {
				return And3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getOr().isSuperTypeOf(domainElement.eClass())) {
				return Or3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getNot().isSuperTypeOf(domainElement.eClass())) {
				return Not3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getAddition().isSuperTypeOf(domainElement.eClass())) {
				return Addition3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getSubtraction().isSuperTypeOf(domainElement.eClass())) {
				return Subtraction3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getMultiplication().isSuperTypeOf(domainElement.eClass())) {
				return Multiplication3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getDivision().isSuperTypeOf(domainElement.eClass())) {
				return Division3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getModulus().isSuperTypeOf(domainElement.eClass())) {
				return Modulus3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getEqual().isSuperTypeOf(domainElement.eClass())) {
				return Equal3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getNotEqual().isSuperTypeOf(domainElement.eClass())) {
				return NotEqual3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getLessThan().isSuperTypeOf(domainElement.eClass())) {
				return LessThan3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getGreaterThan().isSuperTypeOf(domainElement.eClass())) {
				return GreaterThan3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getLessEqual().isSuperTypeOf(domainElement.eClass())) {
				return LessEqual3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getGreaterEqual().isSuperTypeOf(domainElement.eClass())) {
				return GreaterEqual3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getEvery().isSuperTypeOf(domainElement.eClass())) {
				return Every3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getEveryDistinct().isSuperTypeOf(domainElement.eClass())) {
				return EveryDistinct3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getRepeat().isSuperTypeOf(domainElement.eClass())) {
				return Repeat3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getUntil().isSuperTypeOf(domainElement.eClass())) {
				return Until3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getRange().isSuperTypeOf(domainElement.eClass())) {
				return Range3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getFollowedBy().isSuperTypeOf(domainElement.eClass())) {
				return FollowedBy3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getWhile().isSuperTypeOf(domainElement.eClass())) {
				return While3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getMax().isSuperTypeOf(domainElement.eClass())) {
				return Max2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getMin().isSuperTypeOf(domainElement.eClass())) {
				return Min2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getAvg().isSuperTypeOf(domainElement.eClass())) {
				return Avg2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getCount().isSuperTypeOf(domainElement.eClass())) {
				return Count2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getSum().isSuperTypeOf(domainElement.eClass())) {
				return Sum2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getEvent().isSuperTypeOf(domainElement.eClass())) {
				return Event3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getEventProperty().isSuperTypeOf(domainElement.eClass())) {
				return EventProperty5EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getValue().isSuperTypeOf(domainElement.eClass())) {
				return Value3EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getWithinTimer().isSuperTypeOf(domainElement.eClass())) {
				return WithinTimer2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getTimeInterval().isSuperTypeOf(domainElement.eClass())) {
				return TimeInterval2EditPart.VISUAL_ID;
			}
			if (EventpatternPackage.eINSTANCE.getTimeSchedule().isSuperTypeOf(domainElement.eClass())) {
				return TimeSchedule2EditPart.VISUAL_ID;
			}
			break;
		case ComplexEventComplexEventComplexEventPropertiesCompartmentEditPart.VISUAL_ID:
			if (EventpatternPackage.eINSTANCE.getComplexEventProperty().isSuperTypeOf(domainElement.eClass())) {
				return ComplexEventPropertyEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = eventpattern.diagram.part.EventpatternVisualIDRegistry.getModelID(containerView);
		if (!CEPEventPatternEditPart.MODEL_ID.equals(containerModelID) && !"pattern".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (CEPEventPatternEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = eventpattern.diagram.part.EventpatternVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CEPEventPatternEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case CEPEventPatternEditPart.VISUAL_ID:
			if (AndEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OrEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NotEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SubtractionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiplicationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DivisionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ModulusEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EqualEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NotEqualEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LessThanEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GreaterThanEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LessEqualEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GreaterEqualEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EveryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EveryDistinctEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepeatEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UntilEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RangeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FollowedByEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhileEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MaxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MinEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AvgEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CountEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SumEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventPropertyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WithinTimerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TimeIntervalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TimeScheduleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EmailEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TwitterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SlidingEventIntervalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BatchingEventIntervalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SlidingTimeIntervalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BatchingTimeIntervalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComplexEventEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepeatEditPart.VISUAL_ID:
			if (RepeatCountEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RangeEditPart.VISUAL_ID:
			if (RangeLowEndpointHighEndpointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventEditPart.VISUAL_ID:
			if (EventTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventEventEventPropertiesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventPropertyEditPart.VISUAL_ID:
			if (EventPropertyNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventPropertyEventPropertyEventPropertiesCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ValueEditPart.VISUAL_ID:
			if (ValueValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WithinTimerEditPart.VISUAL_ID:
			if (WithinTimerYearsMonthsWeeksDaysHouEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WithinTimerWithinTimerWithinTimerElementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TimeIntervalEditPart.VISUAL_ID:
			if (TimeIntervalYearsMonthsWeeksDaysHouEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TimeScheduleEditPart.VISUAL_ID:
			if (TimeScheduleDayOfWeekDayOfMonthMontEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EmailEditPart.VISUAL_ID:
			if (EmailDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SlidingEventIntervalEditPart.VISUAL_ID:
			if (SlidingEventIntervalSizeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BatchingEventIntervalEditPart.VISUAL_ID:
			if (BatchingEventIntervalSizeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SlidingTimeIntervalEditPart.VISUAL_ID:
			if (SlidingTimeIntervalYearsMonthsWeeksDaysHouEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BatchingTimeIntervalEditPart.VISUAL_ID:
			if (BatchingTimeIntervalYearsMonthsWeeksDaysHouEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComplexEventEditPart.VISUAL_ID:
			if (ComplexEventTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComplexEventComplexEventComplexEventPropertiesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventProperty2EditPart.VISUAL_ID:
			if (EventPropertyName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventPropertyEventPropertyEventPropertiesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventProperty3EditPart.VISUAL_ID:
			if (EventPropertyName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventPropertyEventPropertyEventPropertiesCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Repeat2EditPart.VISUAL_ID:
			if (RepeatCount2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Range2EditPart.VISUAL_ID:
			if (RangeLowEndpointHighEndpoint2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Event2EditPart.VISUAL_ID:
			if (EventTypeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventEventEventPropertiesCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventProperty4EditPart.VISUAL_ID:
			if (EventPropertyName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventPropertyEventPropertyEventPropertiesCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Value2EditPart.VISUAL_ID:
			if (ValueValue2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Repeat3EditPart.VISUAL_ID:
			if (RepeatCount3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Range3EditPart.VISUAL_ID:
			if (RangeLowEndpointHighEndpoint3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Event3EditPart.VISUAL_ID:
			if (EventTypeName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventEventEventPropertiesCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventProperty5EditPart.VISUAL_ID:
			if (EventPropertyName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventPropertyEventPropertyEventPropertiesCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Value3EditPart.VISUAL_ID:
			if (ValueValue3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WithinTimer2EditPart.VISUAL_ID:
			if (WithinTimerYearsMonthsWeeksDaysHou2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TimeInterval2EditPart.VISUAL_ID:
			if (TimeIntervalYearsMonthsWeeksDaysHou2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TimeSchedule2EditPart.VISUAL_ID:
			if (TimeScheduleDayOfWeekDayOfMonthMont2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComplexEventPropertyEditPart.VISUAL_ID:
			if (ComplexEventPropertyNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventEventEventPropertiesCompartmentEditPart.VISUAL_ID:
			if (EventProperty2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventPropertyEventPropertyEventPropertiesCompartmentEditPart.VISUAL_ID:
			if (EventProperty3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventPropertyEventPropertyEventPropertiesCompartment2EditPart.VISUAL_ID:
			if (EventProperty3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventPropertyEventPropertyEventPropertiesCompartment3EditPart.VISUAL_ID:
			if (EventProperty3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WithinTimerWithinTimerWithinTimerElementsCompartmentEditPart.VISUAL_ID:
			if (And2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Or2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Not2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Addition2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Subtraction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Multiplication2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Division2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Modulus2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Equal2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NotEqual2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LessThan2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GreaterThan2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LessEqual2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GreaterEqual2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Every2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EveryDistinct2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Repeat2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Until2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Range2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FollowedBy2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Event2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventProperty4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Value2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventEventEventPropertiesCompartment2EditPart.VISUAL_ID:
			if (EventProperty2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventPropertyEventPropertyEventPropertiesCompartment4EditPart.VISUAL_ID:
			if (EventProperty3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID:
			if (And3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Or3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Not3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Addition3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Subtraction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Multiplication3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Division3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Modulus3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Equal3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NotEqual3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LessThan3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GreaterThan3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LessEqual3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GreaterEqual3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Every3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EveryDistinct3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Repeat3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Until3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Range3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FollowedBy3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Max2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Min2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Avg2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Count2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sum2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Event3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventProperty5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Value3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WithinTimer2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TimeInterval2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TimeSchedule2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventEventEventPropertiesCompartment3EditPart.VISUAL_ID:
			if (EventProperty2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventPropertyEventPropertyEventPropertiesCompartment5EditPart.VISUAL_ID:
			if (EventProperty3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart.VISUAL_ID:
			if (And2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Or2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Not2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Addition2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Subtraction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Multiplication2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Division2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Modulus2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Equal2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NotEqual2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LessThan2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GreaterThan2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LessEqual2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GreaterEqual2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Every2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EveryDistinct2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Repeat2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Until2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Range2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FollowedBy2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Event2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventProperty4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Value2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID:
			if (And3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Or3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Not3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Addition3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Subtraction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Multiplication3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Division3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Modulus3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Equal3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NotEqual3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LessThan3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GreaterThan3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LessEqual3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GreaterEqual3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Every3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EveryDistinct3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Repeat3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Until3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Range3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FollowedBy3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Max2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Min2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Avg2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Count2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sum2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Event3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventProperty5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Value3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WithinTimer2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TimeInterval2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TimeSchedule2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID:
			if (And3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Or3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Not3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Addition3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Subtraction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Multiplication3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Division3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Modulus3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Equal3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NotEqual3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LessThan3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GreaterThan3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LessEqual3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GreaterEqual3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Every3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EveryDistinct3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Repeat3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Until3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Range3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FollowedBy3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Max2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Min2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Avg2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Count2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sum2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Event3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventProperty5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Value3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WithinTimer2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TimeInterval2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TimeSchedule2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID:
			if (And3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Or3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Not3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Addition3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Subtraction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Multiplication3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Division3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Modulus3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Equal3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NotEqual3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LessThan3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GreaterThan3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LessEqual3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GreaterEqual3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Every3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EveryDistinct3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Repeat3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Until3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Range3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FollowedBy3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (While3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Max2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Min2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Avg2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Count2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Sum2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Event3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventProperty5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Value3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WithinTimer2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TimeInterval2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TimeSchedule2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComplexEventComplexEventComplexEventPropertiesCompartmentEditPart.VISUAL_ID:
			if (ComplexEventPropertyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LinkEditPart.VISUAL_ID:
			if (LinkOrderEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (EventpatternPackage.eINSTANCE.getLink().isSuperTypeOf(domainElement.eClass())) {
			return LinkEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(CEPEventPattern element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case EventEventEventPropertiesCompartmentEditPart.VISUAL_ID:
		case EventPropertyEventPropertyEventPropertiesCompartmentEditPart.VISUAL_ID:
		case EventPropertyEventPropertyEventPropertiesCompartment2EditPart.VISUAL_ID:
		case EventPropertyEventPropertyEventPropertiesCompartment3EditPart.VISUAL_ID:
		case WithinTimerWithinTimerWithinTimerElementsCompartmentEditPart.VISUAL_ID:
		case EventEventEventPropertiesCompartment2EditPart.VISUAL_ID:
		case EventPropertyEventPropertyEventPropertiesCompartment4EditPart.VISUAL_ID:
		case SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID:
		case EventEventEventPropertiesCompartment3EditPart.VISUAL_ID:
		case EventPropertyEventPropertyEventPropertiesCompartment5EditPart.VISUAL_ID:
		case WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart.VISUAL_ID:
		case BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID:
		case SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID:
		case BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID:
		case ComplexEventComplexEventComplexEventPropertiesCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case CEPEventPatternEditPart.VISUAL_ID:
			return false;
		case AndEditPart.VISUAL_ID:
		case OrEditPart.VISUAL_ID:
		case NotEditPart.VISUAL_ID:
		case AdditionEditPart.VISUAL_ID:
		case SubtractionEditPart.VISUAL_ID:
		case MultiplicationEditPart.VISUAL_ID:
		case DivisionEditPart.VISUAL_ID:
		case ModulusEditPart.VISUAL_ID:
		case EqualEditPart.VISUAL_ID:
		case NotEqualEditPart.VISUAL_ID:
		case LessThanEditPart.VISUAL_ID:
		case GreaterThanEditPart.VISUAL_ID:
		case LessEqualEditPart.VISUAL_ID:
		case GreaterEqualEditPart.VISUAL_ID:
		case EveryEditPart.VISUAL_ID:
		case EveryDistinctEditPart.VISUAL_ID:
		case RepeatEditPart.VISUAL_ID:
		case UntilEditPart.VISUAL_ID:
		case RangeEditPart.VISUAL_ID:
		case FollowedByEditPart.VISUAL_ID:
		case WhileEditPart.VISUAL_ID:
		case MaxEditPart.VISUAL_ID:
		case MinEditPart.VISUAL_ID:
		case AvgEditPart.VISUAL_ID:
		case CountEditPart.VISUAL_ID:
		case SumEditPart.VISUAL_ID:
		case ValueEditPart.VISUAL_ID:
		case TimeIntervalEditPart.VISUAL_ID:
		case TimeScheduleEditPart.VISUAL_ID:
		case EmailEditPart.VISUAL_ID:
		case TwitterEditPart.VISUAL_ID:
		case And2EditPart.VISUAL_ID:
		case Or2EditPart.VISUAL_ID:
		case Not2EditPart.VISUAL_ID:
		case Addition2EditPart.VISUAL_ID:
		case Subtraction2EditPart.VISUAL_ID:
		case Multiplication2EditPart.VISUAL_ID:
		case Division2EditPart.VISUAL_ID:
		case Modulus2EditPart.VISUAL_ID:
		case Equal2EditPart.VISUAL_ID:
		case NotEqual2EditPart.VISUAL_ID:
		case LessThan2EditPart.VISUAL_ID:
		case GreaterThan2EditPart.VISUAL_ID:
		case LessEqual2EditPart.VISUAL_ID:
		case GreaterEqual2EditPart.VISUAL_ID:
		case Every2EditPart.VISUAL_ID:
		case EveryDistinct2EditPart.VISUAL_ID:
		case Repeat2EditPart.VISUAL_ID:
		case Until2EditPart.VISUAL_ID:
		case Range2EditPart.VISUAL_ID:
		case FollowedBy2EditPart.VISUAL_ID:
		case While2EditPart.VISUAL_ID:
		case Value2EditPart.VISUAL_ID:
		case And3EditPart.VISUAL_ID:
		case Or3EditPart.VISUAL_ID:
		case Not3EditPart.VISUAL_ID:
		case Addition3EditPart.VISUAL_ID:
		case Subtraction3EditPart.VISUAL_ID:
		case Multiplication3EditPart.VISUAL_ID:
		case Division3EditPart.VISUAL_ID:
		case Modulus3EditPart.VISUAL_ID:
		case Equal3EditPart.VISUAL_ID:
		case NotEqual3EditPart.VISUAL_ID:
		case LessThan3EditPart.VISUAL_ID:
		case GreaterThan3EditPart.VISUAL_ID:
		case LessEqual3EditPart.VISUAL_ID:
		case GreaterEqual3EditPart.VISUAL_ID:
		case Every3EditPart.VISUAL_ID:
		case EveryDistinct3EditPart.VISUAL_ID:
		case Repeat3EditPart.VISUAL_ID:
		case Until3EditPart.VISUAL_ID:
		case Range3EditPart.VISUAL_ID:
		case FollowedBy3EditPart.VISUAL_ID:
		case While3EditPart.VISUAL_ID:
		case Max2EditPart.VISUAL_ID:
		case Min2EditPart.VISUAL_ID:
		case Avg2EditPart.VISUAL_ID:
		case Count2EditPart.VISUAL_ID:
		case Sum2EditPart.VISUAL_ID:
		case Value3EditPart.VISUAL_ID:
		case TimeInterval2EditPart.VISUAL_ID:
		case TimeSchedule2EditPart.VISUAL_ID:
		case ComplexEventPropertyEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return eventpattern.diagram.part.EventpatternVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return eventpattern.diagram.part.EventpatternVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return eventpattern.diagram.part.EventpatternVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return eventpattern.diagram.part.EventpatternVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return eventpattern.diagram.part.EventpatternVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return eventpattern.diagram.part.EventpatternVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
