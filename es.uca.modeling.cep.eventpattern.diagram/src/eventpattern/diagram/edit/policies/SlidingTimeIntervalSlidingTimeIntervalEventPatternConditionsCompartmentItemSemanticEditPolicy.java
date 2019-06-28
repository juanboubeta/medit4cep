/*
 * 
 */
package eventpattern.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import eventpattern.diagram.edit.commands.Addition3CreateCommand;
import eventpattern.diagram.edit.commands.And3CreateCommand;
import eventpattern.diagram.edit.commands.Avg2CreateCommand;
import eventpattern.diagram.edit.commands.Count2CreateCommand;
import eventpattern.diagram.edit.commands.Division3CreateCommand;
import eventpattern.diagram.edit.commands.Equal3CreateCommand;
import eventpattern.diagram.edit.commands.Event3CreateCommand;
import eventpattern.diagram.edit.commands.EventProperty5CreateCommand;
import eventpattern.diagram.edit.commands.Every3CreateCommand;
import eventpattern.diagram.edit.commands.EveryDistinct3CreateCommand;
import eventpattern.diagram.edit.commands.FollowedBy3CreateCommand;
import eventpattern.diagram.edit.commands.GreaterEqual3CreateCommand;
import eventpattern.diagram.edit.commands.GreaterThan3CreateCommand;
import eventpattern.diagram.edit.commands.GroupBy2CreateCommand;
import eventpattern.diagram.edit.commands.LessEqual3CreateCommand;
import eventpattern.diagram.edit.commands.LessThan3CreateCommand;
import eventpattern.diagram.edit.commands.Max2CreateCommand;
import eventpattern.diagram.edit.commands.Min2CreateCommand;
import eventpattern.diagram.edit.commands.Modulus3CreateCommand;
import eventpattern.diagram.edit.commands.Multiplication3CreateCommand;
import eventpattern.diagram.edit.commands.Not3CreateCommand;
import eventpattern.diagram.edit.commands.NotEqual3CreateCommand;
import eventpattern.diagram.edit.commands.Or3CreateCommand;
import eventpattern.diagram.edit.commands.Range3CreateCommand;
import eventpattern.diagram.edit.commands.Repeat3CreateCommand;
import eventpattern.diagram.edit.commands.Subtraction3CreateCommand;
import eventpattern.diagram.edit.commands.Sum2CreateCommand;
import eventpattern.diagram.edit.commands.TimeInterval2CreateCommand;
import eventpattern.diagram.edit.commands.TimeSchedule2CreateCommand;
import eventpattern.diagram.edit.commands.Until3CreateCommand;
import eventpattern.diagram.edit.commands.Value3CreateCommand;
import eventpattern.diagram.edit.commands.While3CreateCommand;
import eventpattern.diagram.edit.commands.WithinTimer2CreateCommand;
import eventpattern.diagram.providers.EventpatternElementTypes;

/**
 * @generated
 */
public class SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentItemSemanticEditPolicy
		extends EventpatternBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentItemSemanticEditPolicy() {
		super(EventpatternElementTypes.SlidingTimeInterval_2036);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EventpatternElementTypes.And_3027 == req.getElementType()) {
			return getGEFWrapper(new And3CreateCommand(req));
		}
		if (EventpatternElementTypes.Or_3028 == req.getElementType()) {
			return getGEFWrapper(new Or3CreateCommand(req));
		}
		if (EventpatternElementTypes.Not_3029 == req.getElementType()) {
			return getGEFWrapper(new Not3CreateCommand(req));
		}
		if (EventpatternElementTypes.Addition_3030 == req.getElementType()) {
			return getGEFWrapper(new Addition3CreateCommand(req));
		}
		if (EventpatternElementTypes.Subtraction_3031 == req.getElementType()) {
			return getGEFWrapper(new Subtraction3CreateCommand(req));
		}
		if (EventpatternElementTypes.Multiplication_3032 == req.getElementType()) {
			return getGEFWrapper(new Multiplication3CreateCommand(req));
		}
		if (EventpatternElementTypes.Division_3033 == req.getElementType()) {
			return getGEFWrapper(new Division3CreateCommand(req));
		}
		if (EventpatternElementTypes.Modulus_3034 == req.getElementType()) {
			return getGEFWrapper(new Modulus3CreateCommand(req));
		}
		if (EventpatternElementTypes.Equal_3035 == req.getElementType()) {
			return getGEFWrapper(new Equal3CreateCommand(req));
		}
		if (EventpatternElementTypes.NotEqual_3036 == req.getElementType()) {
			return getGEFWrapper(new NotEqual3CreateCommand(req));
		}
		if (EventpatternElementTypes.LessThan_3037 == req.getElementType()) {
			return getGEFWrapper(new LessThan3CreateCommand(req));
		}
		if (EventpatternElementTypes.GreaterThan_3038 == req.getElementType()) {
			return getGEFWrapper(new GreaterThan3CreateCommand(req));
		}
		if (EventpatternElementTypes.LessEqual_3039 == req.getElementType()) {
			return getGEFWrapper(new LessEqual3CreateCommand(req));
		}
		if (EventpatternElementTypes.GreaterEqual_3040 == req.getElementType()) {
			return getGEFWrapper(new GreaterEqual3CreateCommand(req));
		}
		if (EventpatternElementTypes.Every_3041 == req.getElementType()) {
			return getGEFWrapper(new Every3CreateCommand(req));
		}
		if (EventpatternElementTypes.EveryDistinct_3042 == req.getElementType()) {
			return getGEFWrapper(new EveryDistinct3CreateCommand(req));
		}
		if (EventpatternElementTypes.Repeat_3043 == req.getElementType()) {
			return getGEFWrapper(new Repeat3CreateCommand(req));
		}
		if (EventpatternElementTypes.Until_3044 == req.getElementType()) {
			return getGEFWrapper(new Until3CreateCommand(req));
		}
		if (EventpatternElementTypes.Range_3045 == req.getElementType()) {
			return getGEFWrapper(new Range3CreateCommand(req));
		}
		if (EventpatternElementTypes.FollowedBy_3046 == req.getElementType()) {
			return getGEFWrapper(new FollowedBy3CreateCommand(req));
		}
		if (EventpatternElementTypes.While_3047 == req.getElementType()) {
			return getGEFWrapper(new While3CreateCommand(req));
		}
		if (EventpatternElementTypes.Max_3048 == req.getElementType()) {
			return getGEFWrapper(new Max2CreateCommand(req));
		}
		if (EventpatternElementTypes.Min_3049 == req.getElementType()) {
			return getGEFWrapper(new Min2CreateCommand(req));
		}
		if (EventpatternElementTypes.Avg_3050 == req.getElementType()) {
			return getGEFWrapper(new Avg2CreateCommand(req));
		}
		if (EventpatternElementTypes.Count_3051 == req.getElementType()) {
			return getGEFWrapper(new Count2CreateCommand(req));
		}
		if (EventpatternElementTypes.Sum_3052 == req.getElementType()) {
			return getGEFWrapper(new Sum2CreateCommand(req));
		}
		if (EventpatternElementTypes.Event_3053 == req.getElementType()) {
			return getGEFWrapper(new Event3CreateCommand(req));
		}
		if (EventpatternElementTypes.EventProperty_3054 == req.getElementType()) {
			return getGEFWrapper(new EventProperty5CreateCommand(req));
		}
		if (EventpatternElementTypes.Value_3055 == req.getElementType()) {
			return getGEFWrapper(new Value3CreateCommand(req));
		}
		if (EventpatternElementTypes.GroupBy_3060 == req.getElementType()) {
			return getGEFWrapper(new GroupBy2CreateCommand(req));
		}
		if (EventpatternElementTypes.WithinTimer_3056 == req.getElementType()) {
			return getGEFWrapper(new WithinTimer2CreateCommand(req));
		}
		if (EventpatternElementTypes.TimeInterval_3057 == req.getElementType()) {
			return getGEFWrapper(new TimeInterval2CreateCommand(req));
		}
		if (EventpatternElementTypes.TimeSchedule_3058 == req.getElementType()) {
			return getGEFWrapper(new TimeSchedule2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
