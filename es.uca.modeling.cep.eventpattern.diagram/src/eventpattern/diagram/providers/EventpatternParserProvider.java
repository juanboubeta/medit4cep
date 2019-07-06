/*
 * 
 */
package eventpattern.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import eventpattern.EventpatternPackage;
import eventpattern.diagram.edit.parts.*;
import eventpattern.diagram.edit.parts.AdditionName2EditPart;
import eventpattern.diagram.edit.parts.AdditionName3EditPart;
import eventpattern.diagram.edit.parts.AdditionNameEditPart;
import eventpattern.diagram.edit.parts.AndName2EditPart;
import eventpattern.diagram.edit.parts.AndName3EditPart;
import eventpattern.diagram.edit.parts.AndNameEditPart;
import eventpattern.diagram.edit.parts.AvgName2EditPart;
import eventpattern.diagram.edit.parts.AvgNameEditPart;
import eventpattern.diagram.edit.parts.BatchingEventIntervalSizeEditPart;
import eventpattern.diagram.edit.parts.BatchingTimeIntervalYearsMonthsWeeksDaysHouEditPart;
import eventpattern.diagram.edit.parts.ComplexEventPropertyNameEditPart;
import eventpattern.diagram.edit.parts.ComplexEventTypeNameEditPart;
import eventpattern.diagram.edit.parts.CountName2EditPart;
import eventpattern.diagram.edit.parts.CountNameEditPart;
import eventpattern.diagram.edit.parts.DivisionName2EditPart;
import eventpattern.diagram.edit.parts.DivisionName3EditPart;
import eventpattern.diagram.edit.parts.DivisionNameEditPart;
import eventpattern.diagram.edit.parts.EmailNameEditPart;
import eventpattern.diagram.edit.parts.EqualName2EditPart;
import eventpattern.diagram.edit.parts.EqualName3EditPart;
import eventpattern.diagram.edit.parts.EqualNameEditPart;
import eventpattern.diagram.edit.parts.EventPropertyName2EditPart;
import eventpattern.diagram.edit.parts.EventPropertyName3EditPart;
import eventpattern.diagram.edit.parts.EventPropertyName4EditPart;
import eventpattern.diagram.edit.parts.EventPropertyName5EditPart;
import eventpattern.diagram.edit.parts.EventPropertyNameEditPart;
import eventpattern.diagram.edit.parts.EventTypeName2EditPart;
import eventpattern.diagram.edit.parts.EventTypeName3EditPart;
import eventpattern.diagram.edit.parts.EventTypeNameEditPart;
import eventpattern.diagram.edit.parts.EveryDistinctName2EditPart;
import eventpattern.diagram.edit.parts.EveryDistinctName3EditPart;
import eventpattern.diagram.edit.parts.EveryDistinctNameEditPart;
import eventpattern.diagram.edit.parts.EveryName2EditPart;
import eventpattern.diagram.edit.parts.EveryName3EditPart;
import eventpattern.diagram.edit.parts.EveryNameEditPart;
import eventpattern.diagram.edit.parts.FollowedByName2EditPart;
import eventpattern.diagram.edit.parts.FollowedByName3EditPart;
import eventpattern.diagram.edit.parts.FollowedByNameEditPart;
import eventpattern.diagram.edit.parts.GreaterEqualName2EditPart;
import eventpattern.diagram.edit.parts.GreaterEqualName3EditPart;
import eventpattern.diagram.edit.parts.GreaterEqualNameEditPart;
import eventpattern.diagram.edit.parts.GreaterThanName2EditPart;
import eventpattern.diagram.edit.parts.GreaterThanName3EditPart;
import eventpattern.diagram.edit.parts.GreaterThanNameEditPart;
import eventpattern.diagram.edit.parts.LessEqualName2EditPart;
import eventpattern.diagram.edit.parts.LessEqualName3EditPart;
import eventpattern.diagram.edit.parts.LessEqualNameEditPart;
import eventpattern.diagram.edit.parts.LessThanName2EditPart;
import eventpattern.diagram.edit.parts.LessThanName3EditPart;
import eventpattern.diagram.edit.parts.LessThanNameEditPart;
import eventpattern.diagram.edit.parts.LinkOrderEditPart;
import eventpattern.diagram.edit.parts.MaxName2EditPart;
import eventpattern.diagram.edit.parts.MaxNameEditPart;
import eventpattern.diagram.edit.parts.MinName2EditPart;
import eventpattern.diagram.edit.parts.MinNameEditPart;
import eventpattern.diagram.edit.parts.ModulusName2EditPart;
import eventpattern.diagram.edit.parts.ModulusName3EditPart;
import eventpattern.diagram.edit.parts.ModulusNameEditPart;
import eventpattern.diagram.edit.parts.MultiplicationName2EditPart;
import eventpattern.diagram.edit.parts.MultiplicationName3EditPart;
import eventpattern.diagram.edit.parts.MultiplicationNameEditPart;
import eventpattern.diagram.edit.parts.NotEqualName2EditPart;
import eventpattern.diagram.edit.parts.NotEqualName3EditPart;
import eventpattern.diagram.edit.parts.NotEqualNameEditPart;
import eventpattern.diagram.edit.parts.NotName2EditPart;
import eventpattern.diagram.edit.parts.NotName3EditPart;
import eventpattern.diagram.edit.parts.NotNameEditPart;
import eventpattern.diagram.edit.parts.OrName2EditPart;
import eventpattern.diagram.edit.parts.OrName3EditPart;
import eventpattern.diagram.edit.parts.OrNameEditPart;
import eventpattern.diagram.edit.parts.RangeLowEndpointHighEndpoint2EditPart;
import eventpattern.diagram.edit.parts.RangeLowEndpointHighEndpoint3EditPart;
import eventpattern.diagram.edit.parts.RangeLowEndpointHighEndpointEditPart;
import eventpattern.diagram.edit.parts.RepeatCount2EditPart;
import eventpattern.diagram.edit.parts.RepeatCount3EditPart;
import eventpattern.diagram.edit.parts.RepeatCountEditPart;
import eventpattern.diagram.edit.parts.SlidingEventIntervalSizeEditPart;
import eventpattern.diagram.edit.parts.SlidingTimeIntervalYearsMonthsWeeksDaysHouEditPart;
import eventpattern.diagram.edit.parts.SubtractionName2EditPart;
import eventpattern.diagram.edit.parts.SubtractionName3EditPart;
import eventpattern.diagram.edit.parts.SubtractionNameEditPart;
import eventpattern.diagram.edit.parts.SumName2EditPart;
import eventpattern.diagram.edit.parts.SumNameEditPart;
import eventpattern.diagram.edit.parts.TimeIntervalYearsMonthsWeeksDaysHou2EditPart;
import eventpattern.diagram.edit.parts.TimeIntervalYearsMonthsWeeksDaysHouEditPart;
import eventpattern.diagram.edit.parts.TimeScheduleDayOfWeekDayOfMonthMont2EditPart;
import eventpattern.diagram.edit.parts.TimeScheduleDayOfWeekDayOfMonthMontEditPart;
import eventpattern.diagram.edit.parts.UntilName2EditPart;
import eventpattern.diagram.edit.parts.UntilName3EditPart;
import eventpattern.diagram.edit.parts.UntilNameEditPart;
import eventpattern.diagram.edit.parts.ValueValue2EditPart;
import eventpattern.diagram.edit.parts.ValueValue3EditPart;
import eventpattern.diagram.edit.parts.ValueValueEditPart;
import eventpattern.diagram.edit.parts.WhileName2EditPart;
import eventpattern.diagram.edit.parts.WhileName3EditPart;
import eventpattern.diagram.edit.parts.WhileNameEditPart;
import eventpattern.diagram.edit.parts.WithinTimerYearsMonthsWeeksDaysHou2EditPart;
import eventpattern.diagram.edit.parts.WithinTimerYearsMonthsWeeksDaysHouEditPart;
import eventpattern.diagram.parsers.MessageFormatParser;
import eventpattern.diagram.part.EventpatternVisualIDRegistry;

/**
 * @generated
 */
public class EventpatternParserProvider extends AbstractProvider implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser repeatCount_5017Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatCount_5017Parser() {
		if (repeatCount_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { EventpatternPackage.eINSTANCE.getRepeat_Count() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0, number}"); //$NON-NLS-1$
			parser.setEditPattern("{0, number}"); //$NON-NLS-1$
			repeatCount_5017Parser = parser;
		}
		return repeatCount_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser rangeLowEndpointHighEndpoint_5019Parser;

	/**
	 * @generated
	 */
	private IParser getRangeLowEndpointHighEndpoint_5019Parser() {
		if (rangeLowEndpointHighEndpoint_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { EventpatternPackage.eINSTANCE.getRange_LowEndpoint(),
					EventpatternPackage.eINSTANCE.getRange_HighEndpoint() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("[{0, number}:{1, number}]"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			rangeLowEndpointHighEndpoint_5019Parser = parser;
		}
		return rangeLowEndpointHighEndpoint_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser eventTypeName_5029Parser;

	/**
	 * @generated
	 */
	private IParser getEventTypeName_5029Parser() {
		if (eventTypeName_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { EventpatternPackage.eINSTANCE.getEvent_TypeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eventTypeName_5029Parser = parser;
		}
		return eventTypeName_5029Parser;
	}

	/**
	 * @generated
	 */
	private IParser eventPropertyName_5030Parser;

	/**
	 * @generated
	 */
	private IParser getEventPropertyName_5030Parser() {
		if (eventPropertyName_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { EventpatternPackage.eINSTANCE.getEventProperty_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eventPropertyName_5030Parser = parser;
		}
		return eventPropertyName_5030Parser;
	}

	/**
	 * @generated
	 */
	private IParser valueValue_5031Parser;

	/**
	 * @generated
	 */
	private IParser getValueValue_5031Parser() {
		if (valueValue_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { EventpatternPackage.eINSTANCE.getValue_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			valueValue_5031Parser = parser;
		}
		return valueValue_5031Parser;
	}

	/**
	 * @generated
	 */
	private IParser withinTimerYearsMonthsWeeksDaysHoursMinutesSecondsMilliseconds_5056Parser;

	/**
	 * @generated
	 */
	private IParser getWithinTimerYearsMonthsWeeksDaysHoursMinutesSecondsMilliseconds_5056Parser() {
		if (withinTimerYearsMonthsWeeksDaysHoursMinutesSecondsMilliseconds_5056Parser == null) {
			EAttribute[] features = new EAttribute[] { EventpatternPackage.eINSTANCE.getWithinTimer_Years(),
					EventpatternPackage.eINSTANCE.getWithinTimer_Months(),
					EventpatternPackage.eINSTANCE.getWithinTimer_Weeks(),
					EventpatternPackage.eINSTANCE.getWithinTimer_Days(),
					EventpatternPackage.eINSTANCE.getWithinTimer_Hours(),
					EventpatternPackage.eINSTANCE.getWithinTimer_Minutes(),
					EventpatternPackage.eINSTANCE.getWithinTimer_Seconds(),
					EventpatternPackage.eINSTANCE.getWithinTimer_Milliseconds() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern(
					"Within Timer: {0,choice,0#|0<{0,number}y }{1,choice,0#|0<{1,number}m }{2,choice,0#|0<{2,number}w }{3,choice,0#|0<{3,number}d }{4,choice,0#|0<{4,number}h }{5,choice,0#|0<{5,number}min }{6,choice,0#|0<{6,number}s }{7,choice,0#|0<{7,number}ms}"); //$NON-NLS-1$
			parser.setEditorPattern(
					"Within Timer: {0,choice,0#|0<{0,number}y }{1,choice,0#|0<{1,number}m }{2,choice,0#|0<{2,number}w }{3,choice,0#|0<{3,number}d }{4,choice,0#|0<{4,number}h }{5,choice,0#|0<{5,number}min }{6,choice,0#|0<{6,number}s }{7,choice,0#|0<{7,number}ms}"); //$NON-NLS-1$
			parser.setEditPattern(
					"Within Timer: {0,choice,0#|0<{0,number}y }{1,choice,0#|0<{1,number}m }{2,choice,0#|0<{2,number}w }{3,choice,0#|0<{3,number}d }{4,choice,0#|0<{4,number}h }{5,choice,0#|0<{5,number}min }{6,choice,0#|0<{6,number}s }{7,choice,0#|0<{7,number}ms}"); //$NON-NLS-1$
			withinTimerYearsMonthsWeeksDaysHoursMinutesSecondsMilliseconds_5056Parser = parser;
		}
		return withinTimerYearsMonthsWeeksDaysHoursMinutesSecondsMilliseconds_5056Parser;
	}

	/**
	 * @generated
	 */
	private IParser timeIntervalYearsMonthsWeeksDaysHoursMinutesSecondsMilliseconds_5057Parser;

	/**
	 * @generated
	 */
	private IParser getTimeIntervalYearsMonthsWeeksDaysHoursMinutesSecondsMilliseconds_5057Parser() {
		if (timeIntervalYearsMonthsWeeksDaysHoursMinutesSecondsMilliseconds_5057Parser == null) {
			EAttribute[] features = new EAttribute[] { EventpatternPackage.eINSTANCE.getTimeInterval_Years(),
					EventpatternPackage.eINSTANCE.getTimeInterval_Months(),
					EventpatternPackage.eINSTANCE.getTimeInterval_Weeks(),
					EventpatternPackage.eINSTANCE.getTimeInterval_Days(),
					EventpatternPackage.eINSTANCE.getTimeInterval_Hours(),
					EventpatternPackage.eINSTANCE.getTimeInterval_Minutes(),
					EventpatternPackage.eINSTANCE.getTimeInterval_Seconds(),
					EventpatternPackage.eINSTANCE.getTimeInterval_Milliseconds() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern(
					" {0,choice,0#|0<{0,number}y }{1,choice,0#|0<{1,number}m }{2,choice,0#|0<{2,number}w }{3,choice,0#|0<{3,number}d }{4,choice,0#|0<{4,number}h }{5,choice,0#|0<{5,number}min }{6,choice,0#|0<{6,number}s }{7,choice,0#|0<{7,number}ms} "); //$NON-NLS-1$
			parser.setEditorPattern(
					" {0,choice,0#|0<{0,number}y }{1,choice,0#|0<{1,number}m }{2,choice,0#|0<{2,number}w }{3,choice,0#|0<{3,number}d }{4,choice,0#|0<{4,number}h }{5,choice,0#|0<{5,number}min }{6,choice,0#|0<{6,number}s }{7,choice,0#|0<{7,number}ms} "); //$NON-NLS-1$
			parser.setEditPattern(
					" {0,choice,0#|0<{0,number}y }{1,choice,0#|0<{1,number}m }{2,choice,0#|0<{2,number}w }{3,choice,0#|0<{3,number}d }{4,choice,0#|0<{4,number}h }{5,choice,0#|0<{5,number}min }{6,choice,0#|0<{6,number}s }{7,choice,0#|0<{7,number}ms} "); //$NON-NLS-1$
			timeIntervalYearsMonthsWeeksDaysHoursMinutesSecondsMilliseconds_5057Parser = parser;
		}
		return timeIntervalYearsMonthsWeeksDaysHoursMinutesSecondsMilliseconds_5057Parser;
	}

	/**
	 * @generated
	 */
	private IParser timeScheduleDayOfWeekDayOfMonthMonthHourMinuteSecond_5058Parser;

	/**
	 * @generated
	 */
	private IParser getTimeScheduleDayOfWeekDayOfMonthMonthHourMinuteSecond_5058Parser() {
		if (timeScheduleDayOfWeekDayOfMonthMonthHourMinuteSecond_5058Parser == null) {
			EAttribute[] features = new EAttribute[] { EventpatternPackage.eINSTANCE.getTimeSchedule_DayOfWeek(),
					EventpatternPackage.eINSTANCE.getTimeSchedule_DayOfMonth(),
					EventpatternPackage.eINSTANCE.getTimeSchedule_Month(),
					EventpatternPackage.eINSTANCE.getTimeSchedule_Hour(),
					EventpatternPackage.eINSTANCE.getTimeSchedule_Minute(),
					EventpatternPackage.eINSTANCE.getTimeSchedule_Second() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern(
					" {0,choice,-1#|0#Sun, |1#Mon, |2#Tue, |3#Wed, |4#Thu, |5#Fri, |6#Sat, }{1,choice,-1#|0<{1,number} }{2,choice,-1#|1#Jan |2#Feb |3#Mar |4#Apr |5#May |6#Jun |7#Jul |8#Aug |9#Sep |10#Oct |11#Nov |12#Dec }{3,choice,-1# hh:|-1< {3,number}:}{4,choice,-1#mm:|-1<{4,number}:}{5,choice,-1#ss|-1<{5,number}} "); //$NON-NLS-1$
			parser.setEditorPattern(
					" {0,choice,-1#|0#Sun, |1#Mon, |2#Tue, |3#Wed, |4#Thu, |5#Fri, |6#Sat, }{1,choice,-1#|0<{1,number} }{2,choice,-1#|1#Jan |2#Feb |3#Mar |4#Apr |5#May |6#Jun |7#Jul |8#Aug |9#Sep |10#Oct |11#Nov |12#Dec }{3,choice,-1# hh:|-1< {3,number}:}{4,choice,-1#mm:|-1<{4,number}:}{5,choice,-1#ss|-1<{5,number}} "); //$NON-NLS-1$
			parser.setEditPattern(
					" {0,choice,-1#|0#Sun, |1#Mon, |2#Tue, |3#Wed, |4#Thu, |5#Fri, |6#Sat, }{1,choice,-1#|0<{1,number} }{2,choice,-1#|1#Jan |2#Feb |3#Mar |4#Apr |5#May |6#Jun |7#Jul |8#Aug |9#Sep |10#Oct |11#Nov |12#Dec }{3,choice,-1# hh:|-1< {3,number}:}{4,choice,-1#mm:|-1<{4,number}:}{5,choice,-1#ss|-1<{5,number}} "); //$NON-NLS-1$
			timeScheduleDayOfWeekDayOfMonthMonthHourMinuteSecond_5058Parser = parser;
		}
		return timeScheduleDayOfWeekDayOfMonthMonthHourMinuteSecond_5058Parser;
	}

	/**
	* @generated
	*/
	private IParser emailDescription_5098Parser;

	/**
	* @generated
	*/
	private IParser getEmailDescription_5098Parser() {
		if (emailDescription_5098Parser == null) {
			EAttribute[] features = new EAttribute[] { EventpatternPackage.eINSTANCE.getEmail_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			emailDescription_5098Parser = parser;
		}
		return emailDescription_5098Parser;
	}

	/**
	 * @generated
	 */
	private IParser slidingEventIntervalSize_5092Parser;

	/**
	 * @generated
	 */
	private IParser getSlidingEventIntervalSize_5092Parser() {
		if (slidingEventIntervalSize_5092Parser == null) {
			EAttribute[] features = new EAttribute[] { EventpatternPackage.eINSTANCE.getSlidingEventInterval_Size() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Sliding Event Interval: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0, number}"); //$NON-NLS-1$
			parser.setEditPattern("{0, number}"); //$NON-NLS-1$
			slidingEventIntervalSize_5092Parser = parser;
		}
		return slidingEventIntervalSize_5092Parser;
	}

	/**
	 * @generated
	 */
	private IParser batchingEventIntervalSize_5093Parser;

	/**
	 * @generated
	 */
	private IParser getBatchingEventIntervalSize_5093Parser() {
		if (batchingEventIntervalSize_5093Parser == null) {
			EAttribute[] features = new EAttribute[] { EventpatternPackage.eINSTANCE.getBatchingEventInterval_Size() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Batching Event Interval: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0, number}"); //$NON-NLS-1$
			parser.setEditPattern("{0, number}"); //$NON-NLS-1$
			batchingEventIntervalSize_5093Parser = parser;
		}
		return batchingEventIntervalSize_5093Parser;
	}

	/**
	 * @generated
	 */
	private IParser slidingTimeIntervalYearsMonthsWeeksDaysHoursMinutesSecondsMilliseconds_5094Parser;

	/**
	 * @generated
	 */
	private IParser getSlidingTimeIntervalYearsMonthsWeeksDaysHoursMinutesSecondsMilliseconds_5094Parser() {
		if (slidingTimeIntervalYearsMonthsWeeksDaysHoursMinutesSecondsMilliseconds_5094Parser == null) {
			EAttribute[] features = new EAttribute[] { EventpatternPackage.eINSTANCE.getSlidingTimeInterval_Years(),
					EventpatternPackage.eINSTANCE.getSlidingTimeInterval_Months(),
					EventpatternPackage.eINSTANCE.getSlidingTimeInterval_Weeks(),
					EventpatternPackage.eINSTANCE.getSlidingTimeInterval_Days(),
					EventpatternPackage.eINSTANCE.getSlidingTimeInterval_Hours(),
					EventpatternPackage.eINSTANCE.getSlidingTimeInterval_Minutes(),
					EventpatternPackage.eINSTANCE.getSlidingTimeInterval_Seconds(),
					EventpatternPackage.eINSTANCE.getSlidingTimeInterval_Milliseconds() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern(
					"Sliding Time Interval: {0,choice,0#|0<{0,number}y }{1,choice,0#|0<{1,number}m }{2,choice,0#|0<{2,number}w }{3,choice,0#|0<{3,number}d }{4,choice,0#|0<{4,number}h }{5,choice,0#|0<{5,number}min }{6,choice,0#|0<{6,number}s }{7,choice,0#|0<{7,number}ms}"); //$NON-NLS-1$
			parser.setEditorPattern(
					"Sliding Time Interval: {0,choice,0#|0<{0,number}y }{1,choice,0#|0<{1,number}m }{2,choice,0#|0<{2,number}w }{3,choice,0#|0<{3,number}d }{4,choice,0#|0<{4,number}h }{5,choice,0#|0<{5,number}min }{6,choice,0#|0<{6,number}s }{7,choice,0#|0<{7,number}ms}"); //$NON-NLS-1$
			parser.setEditPattern(
					"Sliding Time Interval: {0,choice,0#|0<{0,number}y }{1,choice,0#|0<{1,number}m }{2,choice,0#|0<{2,number}w }{3,choice,0#|0<{3,number}d }{4,choice,0#|0<{4,number}h }{5,choice,0#|0<{5,number}min }{6,choice,0#|0<{6,number}s }{7,choice,0#|0<{7,number}ms}"); //$NON-NLS-1$
			slidingTimeIntervalYearsMonthsWeeksDaysHoursMinutesSecondsMilliseconds_5094Parser = parser;
		}
		return slidingTimeIntervalYearsMonthsWeeksDaysHoursMinutesSecondsMilliseconds_5094Parser;
	}

	/**
	 * @generated
	 */
	private IParser batchingTimeIntervalYearsMonthsWeeksDaysHoursMinutesSecondsMilliseconds_5095Parser;

	/**
	 * @generated
	 */
	private IParser getBatchingTimeIntervalYearsMonthsWeeksDaysHoursMinutesSecondsMilliseconds_5095Parser() {
		if (batchingTimeIntervalYearsMonthsWeeksDaysHoursMinutesSecondsMilliseconds_5095Parser == null) {
			EAttribute[] features = new EAttribute[] { EventpatternPackage.eINSTANCE.getBatchingTimeInterval_Years(),
					EventpatternPackage.eINSTANCE.getBatchingTimeInterval_Months(),
					EventpatternPackage.eINSTANCE.getBatchingTimeInterval_Weeks(),
					EventpatternPackage.eINSTANCE.getBatchingTimeInterval_Days(),
					EventpatternPackage.eINSTANCE.getBatchingTimeInterval_Hours(),
					EventpatternPackage.eINSTANCE.getBatchingTimeInterval_Minutes(),
					EventpatternPackage.eINSTANCE.getBatchingTimeInterval_Seconds(),
					EventpatternPackage.eINSTANCE.getBatchingTimeInterval_Milliseconds() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern(
					"Batching Time Interval: {0,choice,0#|0<{0,number}y }{1,choice,0#|0<{1,number}m }{2,choice,0#|0<{2,number}w }{3,choice,0#|0<{3,number}d }{4,choice,0#|0<{4,number}h }{5,choice,0#|0<{5,number}min }{6,choice,0#|0<{6,number}s }{7,choice,0#|0<{7,number}ms}"); //$NON-NLS-1$
			parser.setEditorPattern(
					"Batching Time Interval: {0,choice,0#|0<{0,number}y }{1,choice,0#|0<{1,number}m }{2,choice,0#|0<{2,number}w }{3,choice,0#|0<{3,number}d }{4,choice,0#|0<{4,number}h }{5,choice,0#|0<{5,number}min }{6,choice,0#|0<{6,number}s }{7,choice,0#|0<{7,number}ms}"); //$NON-NLS-1$
			parser.setEditPattern(
					"Batching Time Interval: {0,choice,0#|0<{0,number}y }{1,choice,0#|0<{1,number}m }{2,choice,0#|0<{2,number}w }{3,choice,0#|0<{3,number}d }{4,choice,0#|0<{4,number}h }{5,choice,0#|0<{5,number}min }{6,choice,0#|0<{6,number}s }{7,choice,0#|0<{7,number}ms}"); //$NON-NLS-1$
			batchingTimeIntervalYearsMonthsWeeksDaysHoursMinutesSecondsMilliseconds_5095Parser = parser;
		}
		return batchingTimeIntervalYearsMonthsWeeksDaysHoursMinutesSecondsMilliseconds_5095Parser;
	}

	/**
	 * @generated
	 */
	private IParser complexEventTypeName_5097Parser;

	/**
	 * @generated
	 */
	private IParser getComplexEventTypeName_5097Parser() {
		if (complexEventTypeName_5097Parser == null) {
			EAttribute[] features = new EAttribute[] { EventpatternPackage.eINSTANCE.getComplexEvent_TypeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("New Complex Event: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("New Complex Event: {0}"); //$NON-NLS-1$
			parser.setEditPattern("New Complex Event: {0}"); //$NON-NLS-1$
			complexEventTypeName_5097Parser = parser;
		}
		return complexEventTypeName_5097Parser;
	}

	/**
	 * @generated
	 */
	private IParser eventPropertyName_5028Parser;

	/**
	 * @generated
	 */
	private IParser getEventPropertyName_5028Parser() {
		if (eventPropertyName_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { EventpatternPackage.eINSTANCE.getEventProperty_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eventPropertyName_5028Parser = parser;
		}
		return eventPropertyName_5028Parser;
	}

	/**
	 * @generated
	 */
	private IParser eventPropertyName_5027Parser;

	/**
	 * @generated
	 */
	private IParser getEventPropertyName_5027Parser() {
		if (eventPropertyName_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { EventpatternPackage.eINSTANCE.getEventProperty_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eventPropertyName_5027Parser = parser;
		}
		return eventPropertyName_5027Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatCount_5048Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatCount_5048Parser() {
		if (repeatCount_5048Parser == null) {
			EAttribute[] features = new EAttribute[] { EventpatternPackage.eINSTANCE.getRepeat_Count() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0, number}"); //$NON-NLS-1$
			parser.setEditPattern("{0, number}"); //$NON-NLS-1$
			repeatCount_5048Parser = parser;
		}
		return repeatCount_5048Parser;
	}

	/**
	 * @generated
	 */
	private IParser rangeLowEndpointHighEndpoint_5050Parser;

	/**
	 * @generated
	 */
	private IParser getRangeLowEndpointHighEndpoint_5050Parser() {
		if (rangeLowEndpointHighEndpoint_5050Parser == null) {
			EAttribute[] features = new EAttribute[] { EventpatternPackage.eINSTANCE.getRange_LowEndpoint(),
					EventpatternPackage.eINSTANCE.getRange_HighEndpoint() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("[{0, number}:{1, number}]"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			rangeLowEndpointHighEndpoint_5050Parser = parser;
		}
		return rangeLowEndpointHighEndpoint_5050Parser;
	}

	/**
	 * @generated
	 */
	private IParser eventTypeName_5053Parser;

	/**
	 * @generated
	 */
	private IParser getEventTypeName_5053Parser() {
		if (eventTypeName_5053Parser == null) {
			EAttribute[] features = new EAttribute[] { EventpatternPackage.eINSTANCE.getEvent_TypeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eventTypeName_5053Parser = parser;
		}
		return eventTypeName_5053Parser;
	}

	/**
	 * @generated
	 */
	private IParser eventPropertyName_5054Parser;

	/**
	 * @generated
	 */
	private IParser getEventPropertyName_5054Parser() {
		if (eventPropertyName_5054Parser == null) {
			EAttribute[] features = new EAttribute[] { EventpatternPackage.eINSTANCE.getEventProperty_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eventPropertyName_5054Parser = parser;
		}
		return eventPropertyName_5054Parser;
	}

	/**
	 * @generated
	 */
	private IParser valueValue_5055Parser;

	/**
	 * @generated
	 */
	private IParser getValueValue_5055Parser() {
		if (valueValue_5055Parser == null) {
			EAttribute[] features = new EAttribute[] { EventpatternPackage.eINSTANCE.getValue_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			valueValue_5055Parser = parser;
		}
		return valueValue_5055Parser;
	}

	/**
	 * @generated
	 */
	private IParser repeatCount_5076Parser;

	/**
	 * @generated
	 */
	private IParser getRepeatCount_5076Parser() {
		if (repeatCount_5076Parser == null) {
			EAttribute[] features = new EAttribute[] { EventpatternPackage.eINSTANCE.getRepeat_Count() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0, number}"); //$NON-NLS-1$
			parser.setEditPattern("{0, number}"); //$NON-NLS-1$
			repeatCount_5076Parser = parser;
		}
		return repeatCount_5076Parser;
	}

	/**
	 * @generated
	 */
	private IParser rangeLowEndpointHighEndpoint_5078Parser;

	/**
	 * @generated
	 */
	private IParser getRangeLowEndpointHighEndpoint_5078Parser() {
		if (rangeLowEndpointHighEndpoint_5078Parser == null) {
			EAttribute[] features = new EAttribute[] { EventpatternPackage.eINSTANCE.getRange_LowEndpoint(),
					EventpatternPackage.eINSTANCE.getRange_HighEndpoint() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("[{0, number}:{1, number}]"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			rangeLowEndpointHighEndpoint_5078Parser = parser;
		}
		return rangeLowEndpointHighEndpoint_5078Parser;
	}

	/**
	 * @generated
	 */
	private IParser eventTypeName_5086Parser;

	/**
	 * @generated
	 */
	private IParser getEventTypeName_5086Parser() {
		if (eventTypeName_5086Parser == null) {
			EAttribute[] features = new EAttribute[] { EventpatternPackage.eINSTANCE.getEvent_TypeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eventTypeName_5086Parser = parser;
		}
		return eventTypeName_5086Parser;
	}

	/**
	 * @generated
	 */
	private IParser eventPropertyName_5087Parser;

	/**
	 * @generated
	 */
	private IParser getEventPropertyName_5087Parser() {
		if (eventPropertyName_5087Parser == null) {
			EAttribute[] features = new EAttribute[] { EventpatternPackage.eINSTANCE.getEventProperty_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eventPropertyName_5087Parser = parser;
		}
		return eventPropertyName_5087Parser;
	}

	/**
	 * @generated
	 */
	private IParser valueValue_5088Parser;

	/**
	 * @generated
	 */
	private IParser getValueValue_5088Parser() {
		if (valueValue_5088Parser == null) {
			EAttribute[] features = new EAttribute[] { EventpatternPackage.eINSTANCE.getValue_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			valueValue_5088Parser = parser;
		}
		return valueValue_5088Parser;
	}

	/**
	 * @generated
	 */
	private IParser withinTimerYearsMonthsWeeksDaysHoursMinutesSecondsMilliseconds_5089Parser;

	/**
	 * @generated
	 */
	private IParser getWithinTimerYearsMonthsWeeksDaysHoursMinutesSecondsMilliseconds_5089Parser() {
		if (withinTimerYearsMonthsWeeksDaysHoursMinutesSecondsMilliseconds_5089Parser == null) {
			EAttribute[] features = new EAttribute[] { EventpatternPackage.eINSTANCE.getWithinTimer_Years(),
					EventpatternPackage.eINSTANCE.getWithinTimer_Months(),
					EventpatternPackage.eINSTANCE.getWithinTimer_Weeks(),
					EventpatternPackage.eINSTANCE.getWithinTimer_Days(),
					EventpatternPackage.eINSTANCE.getWithinTimer_Hours(),
					EventpatternPackage.eINSTANCE.getWithinTimer_Minutes(),
					EventpatternPackage.eINSTANCE.getWithinTimer_Seconds(),
					EventpatternPackage.eINSTANCE.getWithinTimer_Milliseconds() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern(
					"Within Timer: {0,choice,0#|0<{0,number}y }{1,choice,0#|0<{1,number}m }{2,choice,0#|0<{2,number}w }{3,choice,0#|0<{3,number}d }{4,choice,0#|0<{4,number}h }{5,choice,0#|0<{5,number}min }{6,choice,0#|0<{6,number}s }{7,choice,0#|0<{7,number}ms}"); //$NON-NLS-1$
			parser.setEditorPattern(
					"Within Timer: {0,choice,0#|0<{0,number}y }{1,choice,0#|0<{1,number}m }{2,choice,0#|0<{2,number}w }{3,choice,0#|0<{3,number}d }{4,choice,0#|0<{4,number}h }{5,choice,0#|0<{5,number}min }{6,choice,0#|0<{6,number}s }{7,choice,0#|0<{7,number}ms}"); //$NON-NLS-1$
			parser.setEditPattern(
					"Within Timer: {0,choice,0#|0<{0,number}y }{1,choice,0#|0<{1,number}m }{2,choice,0#|0<{2,number}w }{3,choice,0#|0<{3,number}d }{4,choice,0#|0<{4,number}h }{5,choice,0#|0<{5,number}min }{6,choice,0#|0<{6,number}s }{7,choice,0#|0<{7,number}ms}"); //$NON-NLS-1$
			withinTimerYearsMonthsWeeksDaysHoursMinutesSecondsMilliseconds_5089Parser = parser;
		}
		return withinTimerYearsMonthsWeeksDaysHoursMinutesSecondsMilliseconds_5089Parser;
	}

	/**
	 * @generated
	 */
	private IParser timeIntervalYearsMonthsWeeksDaysHoursMinutesSecondsMilliseconds_5090Parser;

	/**
	 * @generated
	 */
	private IParser getTimeIntervalYearsMonthsWeeksDaysHoursMinutesSecondsMilliseconds_5090Parser() {
		if (timeIntervalYearsMonthsWeeksDaysHoursMinutesSecondsMilliseconds_5090Parser == null) {
			EAttribute[] features = new EAttribute[] { EventpatternPackage.eINSTANCE.getTimeInterval_Years(),
					EventpatternPackage.eINSTANCE.getTimeInterval_Months(),
					EventpatternPackage.eINSTANCE.getTimeInterval_Weeks(),
					EventpatternPackage.eINSTANCE.getTimeInterval_Days(),
					EventpatternPackage.eINSTANCE.getTimeInterval_Hours(),
					EventpatternPackage.eINSTANCE.getTimeInterval_Minutes(),
					EventpatternPackage.eINSTANCE.getTimeInterval_Seconds(),
					EventpatternPackage.eINSTANCE.getTimeInterval_Milliseconds() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern(
					" {0,choice,0#|0<{0,number}y }{1,choice,0#|0<{1,number}m }{2,choice,0#|0<{2,number}w }{3,choice,0#|0<{3,number}d }{4,choice,0#|0<{4,number}h }{5,choice,0#|0<{5,number}min }{6,choice,0#|0<{6,number}s }{7,choice,0#|0<{7,number}ms} "); //$NON-NLS-1$
			parser.setEditorPattern(
					" {0,choice,0#|0<{0,number}y }{1,choice,0#|0<{1,number}m }{2,choice,0#|0<{2,number}w }{3,choice,0#|0<{3,number}d }{4,choice,0#|0<{4,number}h }{5,choice,0#|0<{5,number}min }{6,choice,0#|0<{6,number}s }{7,choice,0#|0<{7,number}ms} "); //$NON-NLS-1$
			parser.setEditPattern(
					" {0,choice,0#|0<{0,number}y }{1,choice,0#|0<{1,number}m }{2,choice,0#|0<{2,number}w }{3,choice,0#|0<{3,number}d }{4,choice,0#|0<{4,number}h }{5,choice,0#|0<{5,number}min }{6,choice,0#|0<{6,number}s }{7,choice,0#|0<{7,number}ms} "); //$NON-NLS-1$
			timeIntervalYearsMonthsWeeksDaysHoursMinutesSecondsMilliseconds_5090Parser = parser;
		}
		return timeIntervalYearsMonthsWeeksDaysHoursMinutesSecondsMilliseconds_5090Parser;
	}

	/**
	 * @generated
	 */
	private IParser timeScheduleDayOfWeekDayOfMonthMonthHourMinuteSecond_5091Parser;

	/**
	 * @generated
	 */
	private IParser getTimeScheduleDayOfWeekDayOfMonthMonthHourMinuteSecond_5091Parser() {
		if (timeScheduleDayOfWeekDayOfMonthMonthHourMinuteSecond_5091Parser == null) {
			EAttribute[] features = new EAttribute[] { EventpatternPackage.eINSTANCE.getTimeSchedule_DayOfWeek(),
					EventpatternPackage.eINSTANCE.getTimeSchedule_DayOfMonth(),
					EventpatternPackage.eINSTANCE.getTimeSchedule_Month(),
					EventpatternPackage.eINSTANCE.getTimeSchedule_Hour(),
					EventpatternPackage.eINSTANCE.getTimeSchedule_Minute(),
					EventpatternPackage.eINSTANCE.getTimeSchedule_Second() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern(
					" {0,choice,-1#|0#Sun, |1#Mon, |2#Tue, |3#Wed, |4#Thu, |5#Fri, |6#Sat, }{1,choice,-1#|0<{1,number} }{2,choice,-1#|1#Jan |2#Feb |3#Mar |4#Apr |5#May |6#Jun |7#Jul |8#Aug |9#Sep |10#Oct |11#Nov |12#Dec }{3,choice,-1# hh:|-1< {3,number}:}{4,choice,-1#mm:|-1<{4,number}:}{5,choice,-1#ss|-1<{5,number}} "); //$NON-NLS-1$
			parser.setEditorPattern(
					" {0,choice,-1#|0#Sun, |1#Mon, |2#Tue, |3#Wed, |4#Thu, |5#Fri, |6#Sat, }{1,choice,-1#|0<{1,number} }{2,choice,-1#|1#Jan |2#Feb |3#Mar |4#Apr |5#May |6#Jun |7#Jul |8#Aug |9#Sep |10#Oct |11#Nov |12#Dec }{3,choice,-1# hh:|-1< {3,number}:}{4,choice,-1#mm:|-1<{4,number}:}{5,choice,-1#ss|-1<{5,number}} "); //$NON-NLS-1$
			parser.setEditPattern(
					" {0,choice,-1#|0#Sun, |1#Mon, |2#Tue, |3#Wed, |4#Thu, |5#Fri, |6#Sat, }{1,choice,-1#|0<{1,number} }{2,choice,-1#|1#Jan |2#Feb |3#Mar |4#Apr |5#May |6#Jun |7#Jul |8#Aug |9#Sep |10#Oct |11#Nov |12#Dec }{3,choice,-1# hh:|-1< {3,number}:}{4,choice,-1#mm:|-1<{4,number}:}{5,choice,-1#ss|-1<{5,number}} "); //$NON-NLS-1$
			timeScheduleDayOfWeekDayOfMonthMonthHourMinuteSecond_5091Parser = parser;
		}
		return timeScheduleDayOfWeekDayOfMonthMonthHourMinuteSecond_5091Parser;
	}

	/**
	 * @generated
	 */
	private IParser complexEventPropertyName_5096Parser;

	/**
	 * @generated
	 */
	private IParser getComplexEventPropertyName_5096Parser() {
		if (complexEventPropertyName_5096Parser == null) {
			EAttribute[] features = new EAttribute[] { EventpatternPackage.eINSTANCE.getComplexEventProperty_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			complexEventPropertyName_5096Parser = parser;
		}
		return complexEventPropertyName_5096Parser;
	}

	/**
	 * @generated
	 */
	private IParser linkOrder_6001Parser;

	/**
	 * @generated
	 */
	private IParser getLinkOrder_6001Parser() {
		if (linkOrder_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { EventpatternPackage.eINSTANCE.getLink_Order() };
			MessageFormatParser parser = new MessageFormatParser(features);
			linkOrder_6001Parser = parser;
		}
		return linkOrder_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case RepeatCountEditPart.VISUAL_ID:
			return getRepeatCount_5017Parser();
		case RangeLowEndpointHighEndpointEditPart.VISUAL_ID:
			return getRangeLowEndpointHighEndpoint_5019Parser();
		case EventTypeNameEditPart.VISUAL_ID:
			return getEventTypeName_5029Parser();
		case EventPropertyNameEditPart.VISUAL_ID:
			return getEventPropertyName_5030Parser();
		case ValueValueEditPart.VISUAL_ID:
			return getValueValue_5031Parser();
		case WithinTimerYearsMonthsWeeksDaysHouEditPart.VISUAL_ID:
			return getWithinTimerYearsMonthsWeeksDaysHoursMinutesSecondsMilliseconds_5056Parser();
		case TimeIntervalYearsMonthsWeeksDaysHouEditPart.VISUAL_ID:
			return getTimeIntervalYearsMonthsWeeksDaysHoursMinutesSecondsMilliseconds_5057Parser();
		case TimeScheduleDayOfWeekDayOfMonthMontEditPart.VISUAL_ID:
			return getTimeScheduleDayOfWeekDayOfMonthMonthHourMinuteSecond_5058Parser();
		case EmailDescriptionEditPart.VISUAL_ID:
			return getEmailDescription_5098Parser();
		case SlidingEventIntervalSizeEditPart.VISUAL_ID:
			return getSlidingEventIntervalSize_5092Parser();
		case BatchingEventIntervalSizeEditPart.VISUAL_ID:
			return getBatchingEventIntervalSize_5093Parser();
		case SlidingTimeIntervalYearsMonthsWeeksDaysHouEditPart.VISUAL_ID:
			return getSlidingTimeIntervalYearsMonthsWeeksDaysHoursMinutesSecondsMilliseconds_5094Parser();
		case BatchingTimeIntervalYearsMonthsWeeksDaysHouEditPart.VISUAL_ID:
			return getBatchingTimeIntervalYearsMonthsWeeksDaysHoursMinutesSecondsMilliseconds_5095Parser();
		case ComplexEventTypeNameEditPart.VISUAL_ID:
			return getComplexEventTypeName_5097Parser();
		case EventPropertyName2EditPart.VISUAL_ID:
			return getEventPropertyName_5028Parser();
		case EventPropertyName3EditPart.VISUAL_ID:
			return getEventPropertyName_5027Parser();
		case RepeatCount2EditPart.VISUAL_ID:
			return getRepeatCount_5048Parser();
		case RangeLowEndpointHighEndpoint2EditPart.VISUAL_ID:
			return getRangeLowEndpointHighEndpoint_5050Parser();
		case EventTypeName2EditPart.VISUAL_ID:
			return getEventTypeName_5053Parser();
		case EventPropertyName4EditPart.VISUAL_ID:
			return getEventPropertyName_5054Parser();
		case ValueValue2EditPart.VISUAL_ID:
			return getValueValue_5055Parser();
		case RepeatCount3EditPart.VISUAL_ID:
			return getRepeatCount_5076Parser();
		case RangeLowEndpointHighEndpoint3EditPart.VISUAL_ID:
			return getRangeLowEndpointHighEndpoint_5078Parser();
		case EventTypeName3EditPart.VISUAL_ID:
			return getEventTypeName_5086Parser();
		case EventPropertyName5EditPart.VISUAL_ID:
			return getEventPropertyName_5087Parser();
		case ValueValue3EditPart.VISUAL_ID:
			return getValueValue_5088Parser();
		case WithinTimerYearsMonthsWeeksDaysHou2EditPart.VISUAL_ID:
			return getWithinTimerYearsMonthsWeeksDaysHoursMinutesSecondsMilliseconds_5089Parser();
		case TimeIntervalYearsMonthsWeeksDaysHou2EditPart.VISUAL_ID:
			return getTimeIntervalYearsMonthsWeeksDaysHoursMinutesSecondsMilliseconds_5090Parser();
		case TimeScheduleDayOfWeekDayOfMonthMont2EditPart.VISUAL_ID:
			return getTimeScheduleDayOfWeekDayOfMonthMonthHourMinuteSecond_5091Parser();
		case ComplexEventPropertyNameEditPart.VISUAL_ID:
			return getComplexEventPropertyName_5096Parser();
		case LinkOrderEditPart.VISUAL_ID:
			return getLinkOrder_6001Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(EventpatternVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(EventpatternVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (EventpatternElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
