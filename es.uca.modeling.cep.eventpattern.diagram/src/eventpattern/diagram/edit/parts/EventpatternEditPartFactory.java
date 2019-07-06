/*
 * 
 */
package eventpattern.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import eventpattern.diagram.part.EventpatternVisualIDRegistry;

/**
 * @generated
 */
public class EventpatternEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (EventpatternVisualIDRegistry.getVisualID(view)) {

			case CEPEventPatternEditPart.VISUAL_ID:
				return new CEPEventPatternEditPart(view);

			case AndEditPart.VISUAL_ID:
				return new AndEditPart(view);

			case OrEditPart.VISUAL_ID:
				return new OrEditPart(view);

			case NotEditPart.VISUAL_ID:
				return new NotEditPart(view);

			case AdditionEditPart.VISUAL_ID:
				return new AdditionEditPart(view);

			case SubtractionEditPart.VISUAL_ID:
				return new SubtractionEditPart(view);

			case MultiplicationEditPart.VISUAL_ID:
				return new MultiplicationEditPart(view);

			case DivisionEditPart.VISUAL_ID:
				return new DivisionEditPart(view);

			case ModulusEditPart.VISUAL_ID:
				return new ModulusEditPart(view);

			case EqualEditPart.VISUAL_ID:
				return new EqualEditPart(view);

			case NotEqualEditPart.VISUAL_ID:
				return new NotEqualEditPart(view);

			case LessThanEditPart.VISUAL_ID:
				return new LessThanEditPart(view);

			case GreaterThanEditPart.VISUAL_ID:
				return new GreaterThanEditPart(view);

			case LessEqualEditPart.VISUAL_ID:
				return new LessEqualEditPart(view);

			case GreaterEqualEditPart.VISUAL_ID:
				return new GreaterEqualEditPart(view);

			case EveryEditPart.VISUAL_ID:
				return new EveryEditPart(view);

			case EveryDistinctEditPart.VISUAL_ID:
				return new EveryDistinctEditPart(view);

			case RepeatEditPart.VISUAL_ID:
				return new RepeatEditPart(view);

			case RepeatCountEditPart.VISUAL_ID:
				return new RepeatCountEditPart(view);

			case UntilEditPart.VISUAL_ID:
				return new UntilEditPart(view);

			case RangeEditPart.VISUAL_ID:
				return new RangeEditPart(view);

			case RangeLowEndpointHighEndpointEditPart.VISUAL_ID:
				return new RangeLowEndpointHighEndpointEditPart(view);

			case FollowedByEditPart.VISUAL_ID:
				return new FollowedByEditPart(view);

			case WhileEditPart.VISUAL_ID:
				return new WhileEditPart(view);

			case MaxEditPart.VISUAL_ID:
				return new MaxEditPart(view);

			case MinEditPart.VISUAL_ID:
				return new MinEditPart(view);

			case AvgEditPart.VISUAL_ID:
				return new AvgEditPart(view);

			case CountEditPart.VISUAL_ID:
				return new CountEditPart(view);

			case SumEditPart.VISUAL_ID:
				return new SumEditPart(view);

			case EventEditPart.VISUAL_ID:
				return new EventEditPart(view);

			case EventTypeNameEditPart.VISUAL_ID:
				return new EventTypeNameEditPart(view);

			case EventPropertyEditPart.VISUAL_ID:
				return new EventPropertyEditPart(view);

			case EventPropertyNameEditPart.VISUAL_ID:
				return new EventPropertyNameEditPart(view);

			case ValueEditPart.VISUAL_ID:
				return new ValueEditPart(view);

			case ValueValueEditPart.VISUAL_ID:
				return new ValueValueEditPart(view);

			case GroupByEditPart.VISUAL_ID:
				return new GroupByEditPart(view);

			case WithinTimerEditPart.VISUAL_ID:
				return new WithinTimerEditPart(view);

			case WithinTimerYearsMonthsWeeksDaysHouEditPart.VISUAL_ID:
				return new WithinTimerYearsMonthsWeeksDaysHouEditPart(view);

			case TimeIntervalEditPart.VISUAL_ID:
				return new TimeIntervalEditPart(view);

			case TimeIntervalYearsMonthsWeeksDaysHouEditPart.VISUAL_ID:
				return new TimeIntervalYearsMonthsWeeksDaysHouEditPart(view);

			case TimeScheduleEditPart.VISUAL_ID:
				return new TimeScheduleEditPart(view);

			case TimeScheduleDayOfWeekDayOfMonthMontEditPart.VISUAL_ID:
				return new TimeScheduleDayOfWeekDayOfMonthMontEditPart(view);

			case EmailEditPart.VISUAL_ID:
				return new EmailEditPart(view);

			case EmailDescriptionEditPart.VISUAL_ID:
				return new EmailDescriptionEditPart(view);

			case TwitterEditPart.VISUAL_ID:
				return new TwitterEditPart(view);

			case SlidingEventIntervalEditPart.VISUAL_ID:
				return new SlidingEventIntervalEditPart(view);

			case SlidingEventIntervalSizeEditPart.VISUAL_ID:
				return new SlidingEventIntervalSizeEditPart(view);

			case BatchingEventIntervalEditPart.VISUAL_ID:
				return new BatchingEventIntervalEditPart(view);

			case BatchingEventIntervalSizeEditPart.VISUAL_ID:
				return new BatchingEventIntervalSizeEditPart(view);

			case SlidingTimeIntervalEditPart.VISUAL_ID:
				return new SlidingTimeIntervalEditPart(view);

			case SlidingTimeIntervalYearsMonthsWeeksDaysHouEditPart.VISUAL_ID:
				return new SlidingTimeIntervalYearsMonthsWeeksDaysHouEditPart(view);

			case BatchingTimeIntervalEditPart.VISUAL_ID:
				return new BatchingTimeIntervalEditPart(view);

			case BatchingTimeIntervalYearsMonthsWeeksDaysHouEditPart.VISUAL_ID:
				return new BatchingTimeIntervalYearsMonthsWeeksDaysHouEditPart(view);

			case ComplexEventEditPart.VISUAL_ID:
				return new ComplexEventEditPart(view);

			case ComplexEventTypeNameEditPart.VISUAL_ID:
				return new ComplexEventTypeNameEditPart(view);

			case EventProperty2EditPart.VISUAL_ID:
				return new EventProperty2EditPart(view);

			case EventPropertyName2EditPart.VISUAL_ID:
				return new EventPropertyName2EditPart(view);

			case EventProperty3EditPart.VISUAL_ID:
				return new EventProperty3EditPart(view);

			case EventPropertyName3EditPart.VISUAL_ID:
				return new EventPropertyName3EditPart(view);

			case And2EditPart.VISUAL_ID:
				return new And2EditPart(view);

			case Or2EditPart.VISUAL_ID:
				return new Or2EditPart(view);

			case Not2EditPart.VISUAL_ID:
				return new Not2EditPart(view);

			case Addition2EditPart.VISUAL_ID:
				return new Addition2EditPart(view);

			case Subtraction2EditPart.VISUAL_ID:
				return new Subtraction2EditPart(view);

			case Multiplication2EditPart.VISUAL_ID:
				return new Multiplication2EditPart(view);

			case Division2EditPart.VISUAL_ID:
				return new Division2EditPart(view);

			case Modulus2EditPart.VISUAL_ID:
				return new Modulus2EditPart(view);

			case Equal2EditPart.VISUAL_ID:
				return new Equal2EditPart(view);

			case NotEqual2EditPart.VISUAL_ID:
				return new NotEqual2EditPart(view);

			case LessThan2EditPart.VISUAL_ID:
				return new LessThan2EditPart(view);

			case GreaterThan2EditPart.VISUAL_ID:
				return new GreaterThan2EditPart(view);

			case LessEqual2EditPart.VISUAL_ID:
				return new LessEqual2EditPart(view);

			case GreaterEqual2EditPart.VISUAL_ID:
				return new GreaterEqual2EditPart(view);

			case Every2EditPart.VISUAL_ID:
				return new Every2EditPart(view);

			case EveryDistinct2EditPart.VISUAL_ID:
				return new EveryDistinct2EditPart(view);

			case Repeat2EditPart.VISUAL_ID:
				return new Repeat2EditPart(view);

			case RepeatCount2EditPart.VISUAL_ID:
				return new RepeatCount2EditPart(view);

			case Until2EditPart.VISUAL_ID:
				return new Until2EditPart(view);

			case Range2EditPart.VISUAL_ID:
				return new Range2EditPart(view);

			case RangeLowEndpointHighEndpoint2EditPart.VISUAL_ID:
				return new RangeLowEndpointHighEndpoint2EditPart(view);

			case FollowedBy2EditPart.VISUAL_ID:
				return new FollowedBy2EditPart(view);

			case While2EditPart.VISUAL_ID:
				return new While2EditPart(view);

			case Event2EditPart.VISUAL_ID:
				return new Event2EditPart(view);

			case EventTypeName2EditPart.VISUAL_ID:
				return new EventTypeName2EditPart(view);

			case EventProperty4EditPart.VISUAL_ID:
				return new EventProperty4EditPart(view);

			case EventPropertyName4EditPart.VISUAL_ID:
				return new EventPropertyName4EditPart(view);

			case Value2EditPart.VISUAL_ID:
				return new Value2EditPart(view);

			case ValueValue2EditPart.VISUAL_ID:
				return new ValueValue2EditPart(view);

			case And3EditPart.VISUAL_ID:
				return new And3EditPart(view);

			case Or3EditPart.VISUAL_ID:
				return new Or3EditPart(view);

			case Not3EditPart.VISUAL_ID:
				return new Not3EditPart(view);

			case Addition3EditPart.VISUAL_ID:
				return new Addition3EditPart(view);

			case Subtraction3EditPart.VISUAL_ID:
				return new Subtraction3EditPart(view);

			case Multiplication3EditPart.VISUAL_ID:
				return new Multiplication3EditPart(view);

			case Division3EditPart.VISUAL_ID:
				return new Division3EditPart(view);

			case Modulus3EditPart.VISUAL_ID:
				return new Modulus3EditPart(view);

			case Equal3EditPart.VISUAL_ID:
				return new Equal3EditPart(view);

			case NotEqual3EditPart.VISUAL_ID:
				return new NotEqual3EditPart(view);

			case LessThan3EditPart.VISUAL_ID:
				return new LessThan3EditPart(view);

			case GreaterThan3EditPart.VISUAL_ID:
				return new GreaterThan3EditPart(view);

			case LessEqual3EditPart.VISUAL_ID:
				return new LessEqual3EditPart(view);

			case GreaterEqual3EditPart.VISUAL_ID:
				return new GreaterEqual3EditPart(view);

			case Every3EditPart.VISUAL_ID:
				return new Every3EditPart(view);

			case EveryDistinct3EditPart.VISUAL_ID:
				return new EveryDistinct3EditPart(view);

			case Repeat3EditPart.VISUAL_ID:
				return new Repeat3EditPart(view);

			case RepeatCount3EditPart.VISUAL_ID:
				return new RepeatCount3EditPart(view);

			case Until3EditPart.VISUAL_ID:
				return new Until3EditPart(view);

			case Range3EditPart.VISUAL_ID:
				return new Range3EditPart(view);

			case RangeLowEndpointHighEndpoint3EditPart.VISUAL_ID:
				return new RangeLowEndpointHighEndpoint3EditPart(view);

			case FollowedBy3EditPart.VISUAL_ID:
				return new FollowedBy3EditPart(view);

			case While3EditPart.VISUAL_ID:
				return new While3EditPart(view);

			case Max2EditPart.VISUAL_ID:
				return new Max2EditPart(view);

			case Min2EditPart.VISUAL_ID:
				return new Min2EditPart(view);

			case Avg2EditPart.VISUAL_ID:
				return new Avg2EditPart(view);

			case Count2EditPart.VISUAL_ID:
				return new Count2EditPart(view);

			case Sum2EditPart.VISUAL_ID:
				return new Sum2EditPart(view);

			case Event3EditPart.VISUAL_ID:
				return new Event3EditPart(view);

			case EventTypeName3EditPart.VISUAL_ID:
				return new EventTypeName3EditPart(view);

			case EventProperty5EditPart.VISUAL_ID:
				return new EventProperty5EditPart(view);

			case EventPropertyName5EditPart.VISUAL_ID:
				return new EventPropertyName5EditPart(view);

			case Value3EditPart.VISUAL_ID:
				return new Value3EditPart(view);

			case ValueValue3EditPart.VISUAL_ID:
				return new ValueValue3EditPart(view);

			case GroupBy2EditPart.VISUAL_ID:
				return new GroupBy2EditPart(view);

			case WithinTimer2EditPart.VISUAL_ID:
				return new WithinTimer2EditPart(view);

			case WithinTimerYearsMonthsWeeksDaysHou2EditPart.VISUAL_ID:
				return new WithinTimerYearsMonthsWeeksDaysHou2EditPart(view);

			case TimeInterval2EditPart.VISUAL_ID:
				return new TimeInterval2EditPart(view);

			case TimeIntervalYearsMonthsWeeksDaysHou2EditPart.VISUAL_ID:
				return new TimeIntervalYearsMonthsWeeksDaysHou2EditPart(view);

			case TimeSchedule2EditPart.VISUAL_ID:
				return new TimeSchedule2EditPart(view);

			case TimeScheduleDayOfWeekDayOfMonthMont2EditPart.VISUAL_ID:
				return new TimeScheduleDayOfWeekDayOfMonthMont2EditPart(view);

			case ComplexEventPropertyEditPart.VISUAL_ID:
				return new ComplexEventPropertyEditPart(view);

			case ComplexEventPropertyNameEditPart.VISUAL_ID:
				return new ComplexEventPropertyNameEditPart(view);

			case EventEventEventPropertiesCompartmentEditPart.VISUAL_ID:
				return new EventEventEventPropertiesCompartmentEditPart(view);

			case EventPropertyEventPropertyEventPropertiesCompartmentEditPart.VISUAL_ID:
				return new EventPropertyEventPropertyEventPropertiesCompartmentEditPart(view);

			case EventPropertyEventPropertyEventPropertiesCompartment2EditPart.VISUAL_ID:
				return new EventPropertyEventPropertyEventPropertiesCompartment2EditPart(view);

			case EventPropertyEventPropertyEventPropertiesCompartment3EditPart.VISUAL_ID:
				return new EventPropertyEventPropertyEventPropertiesCompartment3EditPart(view);

			case WithinTimerWithinTimerWithinTimerElementsCompartmentEditPart.VISUAL_ID:
				return new WithinTimerWithinTimerWithinTimerElementsCompartmentEditPart(view);

			case EventEventEventPropertiesCompartment2EditPart.VISUAL_ID:
				return new EventEventEventPropertiesCompartment2EditPart(view);

			case EventPropertyEventPropertyEventPropertiesCompartment4EditPart.VISUAL_ID:
				return new EventPropertyEventPropertyEventPropertiesCompartment4EditPart(view);

			case SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID:
				return new SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart(view);

			case EventEventEventPropertiesCompartment3EditPart.VISUAL_ID:
				return new EventEventEventPropertiesCompartment3EditPart(view);

			case EventPropertyEventPropertyEventPropertiesCompartment5EditPart.VISUAL_ID:
				return new EventPropertyEventPropertyEventPropertiesCompartment5EditPart(view);

			case WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart.VISUAL_ID:
				return new WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart(view);

			case BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID:
				return new BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart(view);

			case SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID:
				return new SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart(view);

			case BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID:
				return new BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart(view);

			case ComplexEventComplexEventComplexEventPropertiesCompartmentEditPart.VISUAL_ID:
				return new ComplexEventComplexEventComplexEventPropertiesCompartmentEditPart(view);

			case LinkEditPart.VISUAL_ID:
				return new LinkEditPart(view);

			case LinkOrderEditPart.VISUAL_ID:
				return new LinkOrderEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
