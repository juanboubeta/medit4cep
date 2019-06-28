/*
 * 
 */
package eventpattern.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import eventpattern.diagram.edit.commands.AdditionCreateCommand;
import eventpattern.diagram.edit.commands.AndCreateCommand;
import eventpattern.diagram.edit.commands.AvgCreateCommand;
import eventpattern.diagram.edit.commands.BatchingEventIntervalCreateCommand;
import eventpattern.diagram.edit.commands.BatchingTimeIntervalCreateCommand;
import eventpattern.diagram.edit.commands.ComplexEventCreateCommand;
import eventpattern.diagram.edit.commands.CountCreateCommand;
import eventpattern.diagram.edit.commands.DivisionCreateCommand;
import eventpattern.diagram.edit.commands.EmailCreateCommand;
import eventpattern.diagram.edit.commands.EqualCreateCommand;
import eventpattern.diagram.edit.commands.EventCreateCommand;
import eventpattern.diagram.edit.commands.EventPropertyCreateCommand;
import eventpattern.diagram.edit.commands.EveryCreateCommand;
import eventpattern.diagram.edit.commands.EveryDistinctCreateCommand;
import eventpattern.diagram.edit.commands.FollowedByCreateCommand;
import eventpattern.diagram.edit.commands.GreaterEqualCreateCommand;
import eventpattern.diagram.edit.commands.GreaterThanCreateCommand;
import eventpattern.diagram.edit.commands.GroupByCreateCommand;
import eventpattern.diagram.edit.commands.LessEqualCreateCommand;
import eventpattern.diagram.edit.commands.LessThanCreateCommand;
import eventpattern.diagram.edit.commands.MaxCreateCommand;
import eventpattern.diagram.edit.commands.MinCreateCommand;
import eventpattern.diagram.edit.commands.ModulusCreateCommand;
import eventpattern.diagram.edit.commands.MultiplicationCreateCommand;
import eventpattern.diagram.edit.commands.NotCreateCommand;
import eventpattern.diagram.edit.commands.NotEqualCreateCommand;
import eventpattern.diagram.edit.commands.OrCreateCommand;
import eventpattern.diagram.edit.commands.RangeCreateCommand;
import eventpattern.diagram.edit.commands.RepeatCreateCommand;
import eventpattern.diagram.edit.commands.SlidingEventIntervalCreateCommand;
import eventpattern.diagram.edit.commands.SlidingTimeIntervalCreateCommand;
import eventpattern.diagram.edit.commands.SubtractionCreateCommand;
import eventpattern.diagram.edit.commands.SumCreateCommand;
import eventpattern.diagram.edit.commands.TimeIntervalCreateCommand;
import eventpattern.diagram.edit.commands.TimeScheduleCreateCommand;
import eventpattern.diagram.edit.commands.TwitterCreateCommand;
import eventpattern.diagram.edit.commands.UntilCreateCommand;
import eventpattern.diagram.edit.commands.ValueCreateCommand;
import eventpattern.diagram.edit.commands.WhileCreateCommand;
import eventpattern.diagram.edit.commands.WithinTimerCreateCommand;
import eventpattern.diagram.providers.EventpatternElementTypes;

/**
 * @generated
 */
public class CEPEventPatternItemSemanticEditPolicy extends EventpatternBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CEPEventPatternItemSemanticEditPolicy() {
		super(EventpatternElementTypes.CEPEventPattern_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EventpatternElementTypes.And_2001 == req.getElementType()) {
			return getGEFWrapper(new AndCreateCommand(req));
		}
		if (EventpatternElementTypes.Or_2002 == req.getElementType()) {
			return getGEFWrapper(new OrCreateCommand(req));
		}
		if (EventpatternElementTypes.Not_2003 == req.getElementType()) {
			return getGEFWrapper(new NotCreateCommand(req));
		}
		if (EventpatternElementTypes.Addition_2004 == req.getElementType()) {
			return getGEFWrapper(new AdditionCreateCommand(req));
		}
		if (EventpatternElementTypes.Subtraction_2005 == req.getElementType()) {
			return getGEFWrapper(new SubtractionCreateCommand(req));
		}
		if (EventpatternElementTypes.Multiplication_2006 == req.getElementType()) {
			return getGEFWrapper(new MultiplicationCreateCommand(req));
		}
		if (EventpatternElementTypes.Division_2007 == req.getElementType()) {
			return getGEFWrapper(new DivisionCreateCommand(req));
		}
		if (EventpatternElementTypes.Modulus_2008 == req.getElementType()) {
			return getGEFWrapper(new ModulusCreateCommand(req));
		}
		if (EventpatternElementTypes.Equal_2009 == req.getElementType()) {
			return getGEFWrapper(new EqualCreateCommand(req));
		}
		if (EventpatternElementTypes.NotEqual_2010 == req.getElementType()) {
			return getGEFWrapper(new NotEqualCreateCommand(req));
		}
		if (EventpatternElementTypes.LessThan_2011 == req.getElementType()) {
			return getGEFWrapper(new LessThanCreateCommand(req));
		}
		if (EventpatternElementTypes.GreaterThan_2012 == req.getElementType()) {
			return getGEFWrapper(new GreaterThanCreateCommand(req));
		}
		if (EventpatternElementTypes.LessEqual_2013 == req.getElementType()) {
			return getGEFWrapper(new LessEqualCreateCommand(req));
		}
		if (EventpatternElementTypes.GreaterEqual_2014 == req.getElementType()) {
			return getGEFWrapper(new GreaterEqualCreateCommand(req));
		}
		if (EventpatternElementTypes.Every_2015 == req.getElementType()) {
			return getGEFWrapper(new EveryCreateCommand(req));
		}
		if (EventpatternElementTypes.EveryDistinct_2016 == req.getElementType()) {
			return getGEFWrapper(new EveryDistinctCreateCommand(req));
		}
		if (EventpatternElementTypes.Repeat_2017 == req.getElementType()) {
			return getGEFWrapper(new RepeatCreateCommand(req));
		}
		if (EventpatternElementTypes.Until_2018 == req.getElementType()) {
			return getGEFWrapper(new UntilCreateCommand(req));
		}
		if (EventpatternElementTypes.Range_2019 == req.getElementType()) {
			return getGEFWrapper(new RangeCreateCommand(req));
		}
		if (EventpatternElementTypes.FollowedBy_2020 == req.getElementType()) {
			return getGEFWrapper(new FollowedByCreateCommand(req));
		}
		if (EventpatternElementTypes.While_2021 == req.getElementType()) {
			return getGEFWrapper(new WhileCreateCommand(req));
		}
		if (EventpatternElementTypes.Max_2022 == req.getElementType()) {
			return getGEFWrapper(new MaxCreateCommand(req));
		}
		if (EventpatternElementTypes.Min_2023 == req.getElementType()) {
			return getGEFWrapper(new MinCreateCommand(req));
		}
		if (EventpatternElementTypes.Avg_2024 == req.getElementType()) {
			return getGEFWrapper(new AvgCreateCommand(req));
		}
		if (EventpatternElementTypes.Count_2025 == req.getElementType()) {
			return getGEFWrapper(new CountCreateCommand(req));
		}
		if (EventpatternElementTypes.Sum_2026 == req.getElementType()) {
			return getGEFWrapper(new SumCreateCommand(req));
		}
		if (EventpatternElementTypes.Event_2027 == req.getElementType()) {
			return getGEFWrapper(new EventCreateCommand(req));
		}
		if (EventpatternElementTypes.EventProperty_2028 == req.getElementType()) {
			return getGEFWrapper(new EventPropertyCreateCommand(req));
		}
		if (EventpatternElementTypes.Value_2029 == req.getElementType()) {
			return getGEFWrapper(new ValueCreateCommand(req));
		}
		if (EventpatternElementTypes.GroupBy_2040 == req.getElementType()) {
			return getGEFWrapper(new GroupByCreateCommand(req));
		}
		if (EventpatternElementTypes.WithinTimer_2030 == req.getElementType()) {
			return getGEFWrapper(new WithinTimerCreateCommand(req));
		}
		if (EventpatternElementTypes.TimeInterval_2031 == req.getElementType()) {
			return getGEFWrapper(new TimeIntervalCreateCommand(req));
		}
		if (EventpatternElementTypes.TimeSchedule_2032 == req.getElementType()) {
			return getGEFWrapper(new TimeScheduleCreateCommand(req));
		}
		if (EventpatternElementTypes.Email_2033 == req.getElementType()) {
			return getGEFWrapper(new EmailCreateCommand(req));
		}
		if (EventpatternElementTypes.Twitter_2039 == req.getElementType()) {
			return getGEFWrapper(new TwitterCreateCommand(req));
		}
		if (EventpatternElementTypes.SlidingEventInterval_2034 == req.getElementType()) {
			return getGEFWrapper(new SlidingEventIntervalCreateCommand(req));
		}
		if (EventpatternElementTypes.BatchingEventInterval_2035 == req.getElementType()) {
			return getGEFWrapper(new BatchingEventIntervalCreateCommand(req));
		}
		if (EventpatternElementTypes.SlidingTimeInterval_2036 == req.getElementType()) {
			return getGEFWrapper(new SlidingTimeIntervalCreateCommand(req));
		}
		if (EventpatternElementTypes.BatchingTimeInterval_2037 == req.getElementType()) {
			return getGEFWrapper(new BatchingTimeIntervalCreateCommand(req));
		}
		if (EventpatternElementTypes.ComplexEvent_2038 == req.getElementType()) {
			return getGEFWrapper(new ComplexEventCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
