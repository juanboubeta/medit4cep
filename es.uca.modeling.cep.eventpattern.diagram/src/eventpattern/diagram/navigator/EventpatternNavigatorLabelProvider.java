/*
 * 
 */
package eventpattern.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import eventpattern.CEPEventPattern;
import eventpattern.Email;
import eventpattern.Twitter;
import eventpattern.diagram.edit.parts.*;
import eventpattern.diagram.part.EventpatternDiagramEditorPlugin;
import eventpattern.diagram.part.EventpatternVisualIDRegistry;
import eventpattern.diagram.providers.EventpatternElementTypes;
import eventpattern.diagram.providers.EventpatternParserProvider;

/**
 * @generated
 */
public class EventpatternNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		EventpatternDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		EventpatternDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof EventpatternNavigatorItem
				&& !isOwnView(((EventpatternNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof EventpatternNavigatorGroup) {
			EventpatternNavigatorGroup group = (EventpatternNavigatorGroup) element;
			return EventpatternDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof EventpatternNavigatorItem) {
			EventpatternNavigatorItem navigatorItem = (EventpatternNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (EventpatternVisualIDRegistry.getVisualID(view)) {
		case CEPEventPatternEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?www.uca.es/modeling/cep/eventpattern?CEPEventPattern", //$NON-NLS-1$
					EventpatternElementTypes.CEPEventPattern_1000);
		case AndEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/eventpattern?And", //$NON-NLS-1$
					EventpatternElementTypes.And_2001);
		case OrEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/eventpattern?Or", //$NON-NLS-1$
					EventpatternElementTypes.Or_2002);
		case NotEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/eventpattern?Not", //$NON-NLS-1$
					EventpatternElementTypes.Not_2003);
		case AdditionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/eventpattern?Addition", //$NON-NLS-1$
					EventpatternElementTypes.Addition_2004);
		case SubtractionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/eventpattern?Subtraction", //$NON-NLS-1$
					EventpatternElementTypes.Subtraction_2005);
		case MultiplicationEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/eventpattern?Multiplication", //$NON-NLS-1$
					EventpatternElementTypes.Multiplication_2006);
		case DivisionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/eventpattern?Division", //$NON-NLS-1$
					EventpatternElementTypes.Division_2007);
		case ModulusEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/eventpattern?Modulus", //$NON-NLS-1$
					EventpatternElementTypes.Modulus_2008);
		case EqualEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/eventpattern?Equal", //$NON-NLS-1$
					EventpatternElementTypes.Equal_2009);
		case NotEqualEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/eventpattern?NotEqual", //$NON-NLS-1$
					EventpatternElementTypes.NotEqual_2010);
		case LessThanEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/eventpattern?LessThan", //$NON-NLS-1$
					EventpatternElementTypes.LessThan_2011);
		case GreaterThanEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/eventpattern?GreaterThan", //$NON-NLS-1$
					EventpatternElementTypes.GreaterThan_2012);
		case LessEqualEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/eventpattern?LessEqual", //$NON-NLS-1$
					EventpatternElementTypes.LessEqual_2013);
		case GreaterEqualEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/eventpattern?GreaterEqual", //$NON-NLS-1$
					EventpatternElementTypes.GreaterEqual_2014);
		case EveryEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/eventpattern?Every", //$NON-NLS-1$
					EventpatternElementTypes.Every_2015);
		case EveryDistinctEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/eventpattern?EveryDistinct", //$NON-NLS-1$
					EventpatternElementTypes.EveryDistinct_2016);
		case RepeatEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/eventpattern?Repeat", //$NON-NLS-1$
					EventpatternElementTypes.Repeat_2017);
		case UntilEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/eventpattern?Until", //$NON-NLS-1$
					EventpatternElementTypes.Until_2018);
		case RangeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/eventpattern?Range", //$NON-NLS-1$
					EventpatternElementTypes.Range_2019);
		case FollowedByEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/eventpattern?FollowedBy", //$NON-NLS-1$
					EventpatternElementTypes.FollowedBy_2020);
		case WhileEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/eventpattern?While", //$NON-NLS-1$
					EventpatternElementTypes.While_2021);
		case MaxEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/eventpattern?Max", //$NON-NLS-1$
					EventpatternElementTypes.Max_2022);
		case MinEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/eventpattern?Min", //$NON-NLS-1$
					EventpatternElementTypes.Min_2023);
		case AvgEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/eventpattern?Avg", //$NON-NLS-1$
					EventpatternElementTypes.Avg_2024);
		case CountEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/eventpattern?Count", //$NON-NLS-1$
					EventpatternElementTypes.Count_2025);
		case SumEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/eventpattern?Sum", //$NON-NLS-1$
					EventpatternElementTypes.Sum_2026);
		case EventEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/eventpattern?Event", //$NON-NLS-1$
					EventpatternElementTypes.Event_2027);
		case EventPropertyEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/eventpattern?EventProperty", //$NON-NLS-1$
					EventpatternElementTypes.EventProperty_2028);
		case ValueEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/eventpattern?Value", //$NON-NLS-1$
					EventpatternElementTypes.Value_2029);
		case WithinTimerEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/eventpattern?WithinTimer", //$NON-NLS-1$
					EventpatternElementTypes.WithinTimer_2030);
		case TimeIntervalEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/eventpattern?TimeInterval", //$NON-NLS-1$
					EventpatternElementTypes.TimeInterval_2031);
		case TimeScheduleEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/eventpattern?TimeSchedule", //$NON-NLS-1$
					EventpatternElementTypes.TimeSchedule_2032);
		case EmailEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/eventpattern?Email", //$NON-NLS-1$
					EventpatternElementTypes.Email_2033);
		case SlidingEventIntervalEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/eventpattern?SlidingEventInterval", //$NON-NLS-1$
					EventpatternElementTypes.SlidingEventInterval_2034);
		case BatchingEventIntervalEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/eventpattern?BatchingEventInterval", //$NON-NLS-1$
					EventpatternElementTypes.BatchingEventInterval_2035);
		case SlidingTimeIntervalEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/eventpattern?SlidingTimeInterval", //$NON-NLS-1$
					EventpatternElementTypes.SlidingTimeInterval_2036);
		case BatchingTimeIntervalEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/eventpattern?BatchingTimeInterval", //$NON-NLS-1$
					EventpatternElementTypes.BatchingTimeInterval_2037);
		case ComplexEventEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/eventpattern?ComplexEvent", //$NON-NLS-1$
					EventpatternElementTypes.ComplexEvent_2038);
		case TwitterEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/eventpattern?Twitter", //$NON-NLS-1$
					EventpatternElementTypes.Twitter_2039);
		case EventProperty2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?EventProperty", //$NON-NLS-1$
					EventpatternElementTypes.EventProperty_3001);
		case EventProperty3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?EventProperty", //$NON-NLS-1$
					EventpatternElementTypes.EventProperty_3002);
		case And2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?And", //$NON-NLS-1$
					EventpatternElementTypes.And_3003);
		case Or2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?Or", EventpatternElementTypes.Or_3004); //$NON-NLS-1$
		case Not2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?Not", //$NON-NLS-1$
					EventpatternElementTypes.Not_3005);
		case Addition2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?Addition", //$NON-NLS-1$
					EventpatternElementTypes.Addition_3006);
		case Subtraction2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?Subtraction", //$NON-NLS-1$
					EventpatternElementTypes.Subtraction_3007);
		case Multiplication2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?Multiplication", //$NON-NLS-1$
					EventpatternElementTypes.Multiplication_3008);
		case Division2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?Division", //$NON-NLS-1$
					EventpatternElementTypes.Division_3009);
		case Modulus2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?Modulus", //$NON-NLS-1$
					EventpatternElementTypes.Modulus_3010);
		case Equal2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?Equal", //$NON-NLS-1$
					EventpatternElementTypes.Equal_3011);
		case NotEqual2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?NotEqual", //$NON-NLS-1$
					EventpatternElementTypes.NotEqual_3012);
		case LessThan2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?LessThan", //$NON-NLS-1$
					EventpatternElementTypes.LessThan_3013);
		case GreaterThan2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?GreaterThan", //$NON-NLS-1$
					EventpatternElementTypes.GreaterThan_3014);
		case LessEqual2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?LessEqual", //$NON-NLS-1$
					EventpatternElementTypes.LessEqual_3015);
		case GreaterEqual2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?GreaterEqual", //$NON-NLS-1$
					EventpatternElementTypes.GreaterEqual_3016);
		case Every2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?Every", //$NON-NLS-1$
					EventpatternElementTypes.Every_3017);
		case EveryDistinct2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?EveryDistinct", //$NON-NLS-1$
					EventpatternElementTypes.EveryDistinct_3018);
		case Repeat2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?Repeat", //$NON-NLS-1$
					EventpatternElementTypes.Repeat_3019);
		case Until2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?Until", //$NON-NLS-1$
					EventpatternElementTypes.Until_3020);
		case Range2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?Range", //$NON-NLS-1$
					EventpatternElementTypes.Range_3021);
		case FollowedBy2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?FollowedBy", //$NON-NLS-1$
					EventpatternElementTypes.FollowedBy_3022);
		case While2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?While", //$NON-NLS-1$
					EventpatternElementTypes.While_3023);
		case Event2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?Event", //$NON-NLS-1$
					EventpatternElementTypes.Event_3024);
		case EventProperty4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?EventProperty", //$NON-NLS-1$
					EventpatternElementTypes.EventProperty_3025);
		case Value2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?Value", //$NON-NLS-1$
					EventpatternElementTypes.Value_3026);
		case And3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?And", //$NON-NLS-1$
					EventpatternElementTypes.And_3027);
		case Or3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?Or", EventpatternElementTypes.Or_3028); //$NON-NLS-1$
		case Not3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?Not", //$NON-NLS-1$
					EventpatternElementTypes.Not_3029);
		case Addition3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?Addition", //$NON-NLS-1$
					EventpatternElementTypes.Addition_3030);
		case Subtraction3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?Subtraction", //$NON-NLS-1$
					EventpatternElementTypes.Subtraction_3031);
		case Multiplication3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?Multiplication", //$NON-NLS-1$
					EventpatternElementTypes.Multiplication_3032);
		case Division3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?Division", //$NON-NLS-1$
					EventpatternElementTypes.Division_3033);
		case Modulus3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?Modulus", //$NON-NLS-1$
					EventpatternElementTypes.Modulus_3034);
		case Equal3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?Equal", //$NON-NLS-1$
					EventpatternElementTypes.Equal_3035);
		case NotEqual3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?NotEqual", //$NON-NLS-1$
					EventpatternElementTypes.NotEqual_3036);
		case LessThan3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?LessThan", //$NON-NLS-1$
					EventpatternElementTypes.LessThan_3037);
		case GreaterThan3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?GreaterThan", //$NON-NLS-1$
					EventpatternElementTypes.GreaterThan_3038);
		case LessEqual3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?LessEqual", //$NON-NLS-1$
					EventpatternElementTypes.LessEqual_3039);
		case GreaterEqual3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?GreaterEqual", //$NON-NLS-1$
					EventpatternElementTypes.GreaterEqual_3040);
		case Every3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?Every", //$NON-NLS-1$
					EventpatternElementTypes.Every_3041);
		case EveryDistinct3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?EveryDistinct", //$NON-NLS-1$
					EventpatternElementTypes.EveryDistinct_3042);
		case Repeat3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?Repeat", //$NON-NLS-1$
					EventpatternElementTypes.Repeat_3043);
		case Until3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?Until", //$NON-NLS-1$
					EventpatternElementTypes.Until_3044);
		case Range3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?Range", //$NON-NLS-1$
					EventpatternElementTypes.Range_3045);
		case FollowedBy3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?FollowedBy", //$NON-NLS-1$
					EventpatternElementTypes.FollowedBy_3046);
		case While3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?While", //$NON-NLS-1$
					EventpatternElementTypes.While_3047);
		case Max2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?Max", //$NON-NLS-1$
					EventpatternElementTypes.Max_3048);
		case Min2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?Min", //$NON-NLS-1$
					EventpatternElementTypes.Min_3049);
		case Avg2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?Avg", //$NON-NLS-1$
					EventpatternElementTypes.Avg_3050);
		case Count2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?Count", //$NON-NLS-1$
					EventpatternElementTypes.Count_3051);
		case Sum2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?Sum", //$NON-NLS-1$
					EventpatternElementTypes.Sum_3052);
		case Event3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?Event", //$NON-NLS-1$
					EventpatternElementTypes.Event_3053);
		case EventProperty5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?EventProperty", //$NON-NLS-1$
					EventpatternElementTypes.EventProperty_3054);
		case Value3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?Value", //$NON-NLS-1$
					EventpatternElementTypes.Value_3055);
		case WithinTimer2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?WithinTimer", //$NON-NLS-1$
					EventpatternElementTypes.WithinTimer_3056);
		case TimeInterval2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?TimeInterval", //$NON-NLS-1$
					EventpatternElementTypes.TimeInterval_3057);
		case TimeSchedule2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?TimeSchedule", //$NON-NLS-1$
					EventpatternElementTypes.TimeSchedule_3058);
		case ComplexEventPropertyEditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/eventpattern?ComplexEventProperty", //$NON-NLS-1$
					EventpatternElementTypes.ComplexEventProperty_3059);
		case LinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?www.uca.es/modeling/cep/eventpattern?Link", //$NON-NLS-1$
					EventpatternElementTypes.Link_4001);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = EventpatternDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && EventpatternElementTypes.isKnownElementType(elementType)) {
			image = EventpatternElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof EventpatternNavigatorGroup) {
			EventpatternNavigatorGroup group = (EventpatternNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof EventpatternNavigatorItem) {
			EventpatternNavigatorItem navigatorItem = (EventpatternNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (EventpatternVisualIDRegistry.getVisualID(view)) {
		case CEPEventPatternEditPart.VISUAL_ID:
			return getCEPEventPattern_1000Text(view);
		case AndEditPart.VISUAL_ID:
			return getAnd_2001Text(view);
		case OrEditPart.VISUAL_ID:
			return getOr_2002Text(view);
		case NotEditPart.VISUAL_ID:
			return getNot_2003Text(view);
		case AdditionEditPart.VISUAL_ID:
			return getAddition_2004Text(view);
		case SubtractionEditPart.VISUAL_ID:
			return getSubtraction_2005Text(view);
		case MultiplicationEditPart.VISUAL_ID:
			return getMultiplication_2006Text(view);
		case DivisionEditPart.VISUAL_ID:
			return getDivision_2007Text(view);
		case ModulusEditPart.VISUAL_ID:
			return getModulus_2008Text(view);
		case EqualEditPart.VISUAL_ID:
			return getEqual_2009Text(view);
		case NotEqualEditPart.VISUAL_ID:
			return getNotEqual_2010Text(view);
		case LessThanEditPart.VISUAL_ID:
			return getLessThan_2011Text(view);
		case GreaterThanEditPart.VISUAL_ID:
			return getGreaterThan_2012Text(view);
		case LessEqualEditPart.VISUAL_ID:
			return getLessEqual_2013Text(view);
		case GreaterEqualEditPart.VISUAL_ID:
			return getGreaterEqual_2014Text(view);
		case EveryEditPart.VISUAL_ID:
			return getEvery_2015Text(view);
		case EveryDistinctEditPart.VISUAL_ID:
			return getEveryDistinct_2016Text(view);
		case RepeatEditPart.VISUAL_ID:
			return getRepeat_2017Text(view);
		case UntilEditPart.VISUAL_ID:
			return getUntil_2018Text(view);
		case RangeEditPart.VISUAL_ID:
			return getRange_2019Text(view);
		case FollowedByEditPart.VISUAL_ID:
			return getFollowedBy_2020Text(view);
		case WhileEditPart.VISUAL_ID:
			return getWhile_2021Text(view);
		case MaxEditPart.VISUAL_ID:
			return getMax_2022Text(view);
		case MinEditPart.VISUAL_ID:
			return getMin_2023Text(view);
		case AvgEditPart.VISUAL_ID:
			return getAvg_2024Text(view);
		case CountEditPart.VISUAL_ID:
			return getCount_2025Text(view);
		case SumEditPart.VISUAL_ID:
			return getSum_2026Text(view);
		case EventEditPart.VISUAL_ID:
			return getEvent_2027Text(view);
		case EventPropertyEditPart.VISUAL_ID:
			return getEventProperty_2028Text(view);
		case ValueEditPart.VISUAL_ID:
			return getValue_2029Text(view);
		case WithinTimerEditPart.VISUAL_ID:
			return getWithinTimer_2030Text(view);
		case TimeIntervalEditPart.VISUAL_ID:
			return getTimeInterval_2031Text(view);
		case TimeScheduleEditPart.VISUAL_ID:
			return getTimeSchedule_2032Text(view);
		case EmailEditPart.VISUAL_ID:
			return getEmail_2033Text(view);
		case SlidingEventIntervalEditPart.VISUAL_ID:
			return getSlidingEventInterval_2034Text(view);
		case BatchingEventIntervalEditPart.VISUAL_ID:
			return getBatchingEventInterval_2035Text(view);
		case SlidingTimeIntervalEditPart.VISUAL_ID:
			return getSlidingTimeInterval_2036Text(view);
		case BatchingTimeIntervalEditPart.VISUAL_ID:
			return getBatchingTimeInterval_2037Text(view);
		case ComplexEventEditPart.VISUAL_ID:
			return getComplexEvent_2038Text(view);
		case TwitterEditPart.VISUAL_ID:
			return getTwitter_2039Text(view);
		case EventProperty2EditPart.VISUAL_ID:
			return getEventProperty_3001Text(view);
		case EventProperty3EditPart.VISUAL_ID:
			return getEventProperty_3002Text(view);
		case And2EditPart.VISUAL_ID:
			return getAnd_3003Text(view);
		case Or2EditPart.VISUAL_ID:
			return getOr_3004Text(view);
		case Not2EditPart.VISUAL_ID:
			return getNot_3005Text(view);
		case Addition2EditPart.VISUAL_ID:
			return getAddition_3006Text(view);
		case Subtraction2EditPart.VISUAL_ID:
			return getSubtraction_3007Text(view);
		case Multiplication2EditPart.VISUAL_ID:
			return getMultiplication_3008Text(view);
		case Division2EditPart.VISUAL_ID:
			return getDivision_3009Text(view);
		case Modulus2EditPart.VISUAL_ID:
			return getModulus_3010Text(view);
		case Equal2EditPart.VISUAL_ID:
			return getEqual_3011Text(view);
		case NotEqual2EditPart.VISUAL_ID:
			return getNotEqual_3012Text(view);
		case LessThan2EditPart.VISUAL_ID:
			return getLessThan_3013Text(view);
		case GreaterThan2EditPart.VISUAL_ID:
			return getGreaterThan_3014Text(view);
		case LessEqual2EditPart.VISUAL_ID:
			return getLessEqual_3015Text(view);
		case GreaterEqual2EditPart.VISUAL_ID:
			return getGreaterEqual_3016Text(view);
		case Every2EditPart.VISUAL_ID:
			return getEvery_3017Text(view);
		case EveryDistinct2EditPart.VISUAL_ID:
			return getEveryDistinct_3018Text(view);
		case Repeat2EditPart.VISUAL_ID:
			return getRepeat_3019Text(view);
		case Until2EditPart.VISUAL_ID:
			return getUntil_3020Text(view);
		case Range2EditPart.VISUAL_ID:
			return getRange_3021Text(view);
		case FollowedBy2EditPart.VISUAL_ID:
			return getFollowedBy_3022Text(view);
		case While2EditPart.VISUAL_ID:
			return getWhile_3023Text(view);
		case Event2EditPart.VISUAL_ID:
			return getEvent_3024Text(view);
		case EventProperty4EditPart.VISUAL_ID:
			return getEventProperty_3025Text(view);
		case Value2EditPart.VISUAL_ID:
			return getValue_3026Text(view);
		case And3EditPart.VISUAL_ID:
			return getAnd_3027Text(view);
		case Or3EditPart.VISUAL_ID:
			return getOr_3028Text(view);
		case Not3EditPart.VISUAL_ID:
			return getNot_3029Text(view);
		case Addition3EditPart.VISUAL_ID:
			return getAddition_3030Text(view);
		case Subtraction3EditPart.VISUAL_ID:
			return getSubtraction_3031Text(view);
		case Multiplication3EditPart.VISUAL_ID:
			return getMultiplication_3032Text(view);
		case Division3EditPart.VISUAL_ID:
			return getDivision_3033Text(view);
		case Modulus3EditPart.VISUAL_ID:
			return getModulus_3034Text(view);
		case Equal3EditPart.VISUAL_ID:
			return getEqual_3035Text(view);
		case NotEqual3EditPart.VISUAL_ID:
			return getNotEqual_3036Text(view);
		case LessThan3EditPart.VISUAL_ID:
			return getLessThan_3037Text(view);
		case GreaterThan3EditPart.VISUAL_ID:
			return getGreaterThan_3038Text(view);
		case LessEqual3EditPart.VISUAL_ID:
			return getLessEqual_3039Text(view);
		case GreaterEqual3EditPart.VISUAL_ID:
			return getGreaterEqual_3040Text(view);
		case Every3EditPart.VISUAL_ID:
			return getEvery_3041Text(view);
		case EveryDistinct3EditPart.VISUAL_ID:
			return getEveryDistinct_3042Text(view);
		case Repeat3EditPart.VISUAL_ID:
			return getRepeat_3043Text(view);
		case Until3EditPart.VISUAL_ID:
			return getUntil_3044Text(view);
		case Range3EditPart.VISUAL_ID:
			return getRange_3045Text(view);
		case FollowedBy3EditPart.VISUAL_ID:
			return getFollowedBy_3046Text(view);
		case While3EditPart.VISUAL_ID:
			return getWhile_3047Text(view);
		case Max2EditPart.VISUAL_ID:
			return getMax_3048Text(view);
		case Min2EditPart.VISUAL_ID:
			return getMin_3049Text(view);
		case Avg2EditPart.VISUAL_ID:
			return getAvg_3050Text(view);
		case Count2EditPart.VISUAL_ID:
			return getCount_3051Text(view);
		case Sum2EditPart.VISUAL_ID:
			return getSum_3052Text(view);
		case Event3EditPart.VISUAL_ID:
			return getEvent_3053Text(view);
		case EventProperty5EditPart.VISUAL_ID:
			return getEventProperty_3054Text(view);
		case Value3EditPart.VISUAL_ID:
			return getValue_3055Text(view);
		case WithinTimer2EditPart.VISUAL_ID:
			return getWithinTimer_3056Text(view);
		case TimeInterval2EditPart.VISUAL_ID:
			return getTimeInterval_3057Text(view);
		case TimeSchedule2EditPart.VISUAL_ID:
			return getTimeSchedule_3058Text(view);
		case ComplexEventPropertyEditPart.VISUAL_ID:
			return getComplexEventProperty_3059Text(view);
		case LinkEditPart.VISUAL_ID:
			return getLink_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getCEPEventPattern_1000Text(View view) {
		CEPEventPattern domainModelElement = (CEPEventPattern) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getPatternName();
		} else {
			EventpatternDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAnd_2001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOr_2002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getNot_2003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAddition_2004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSubtraction_2005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMultiplication_2006Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDivision_2007Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getModulus_2008Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEqual_2009Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getNotEqual_2010Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getLessThan_2011Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getGreaterThan_2012Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getLessEqual_2013Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getGreaterEqual_2014Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEvery_2015Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEveryDistinct_2016Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRepeat_2017Text(View view) {
		IParser parser = EventpatternParserProvider.getParser(EventpatternElementTypes.Repeat_2017,
				view.getElement() != null ? view.getElement() : view,
				EventpatternVisualIDRegistry.getType(RepeatCountEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EventpatternDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUntil_2018Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRange_2019Text(View view) {
		IParser parser = EventpatternParserProvider.getParser(EventpatternElementTypes.Range_2019,
				view.getElement() != null ? view.getElement() : view,
				EventpatternVisualIDRegistry.getType(RangeLowEndpointHighEndpointEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EventpatternDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFollowedBy_2020Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getWhile_2021Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMax_2022Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMin_2023Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAvg_2024Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCount_2025Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSum_2026Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEvent_2027Text(View view) {
		IParser parser = EventpatternParserProvider.getParser(EventpatternElementTypes.Event_2027,
				view.getElement() != null ? view.getElement() : view,
				EventpatternVisualIDRegistry.getType(EventTypeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EventpatternDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEventProperty_2028Text(View view) {
		IParser parser = EventpatternParserProvider.getParser(EventpatternElementTypes.EventProperty_2028,
				view.getElement() != null ? view.getElement() : view,
				EventpatternVisualIDRegistry.getType(EventPropertyNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EventpatternDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValue_2029Text(View view) {
		IParser parser = EventpatternParserProvider.getParser(EventpatternElementTypes.Value_2029,
				view.getElement() != null ? view.getElement() : view,
				EventpatternVisualIDRegistry.getType(ValueValueEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EventpatternDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWithinTimer_2030Text(View view) {
		IParser parser = EventpatternParserProvider.getParser(EventpatternElementTypes.WithinTimer_2030,
				view.getElement() != null ? view.getElement() : view,
				EventpatternVisualIDRegistry.getType(WithinTimerYearsMonthsWeeksDaysHouEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EventpatternDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5056); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTimeInterval_2031Text(View view) {
		IParser parser = EventpatternParserProvider.getParser(EventpatternElementTypes.TimeInterval_2031,
				view.getElement() != null ? view.getElement() : view,
				EventpatternVisualIDRegistry.getType(TimeIntervalYearsMonthsWeeksDaysHouEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EventpatternDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5057); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTimeSchedule_2032Text(View view) {
		IParser parser = EventpatternParserProvider.getParser(EventpatternElementTypes.TimeSchedule_2032,
				view.getElement() != null ? view.getElement() : view,
				EventpatternVisualIDRegistry.getType(TimeScheduleDayOfWeekDayOfMonthMontEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EventpatternDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5058); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEmail_2033Text(View view) {
		IParser parser = EventpatternParserProvider.getParser(EventpatternElementTypes.Email_2033,
				view.getElement() != null ? view.getElement() : view,
				EventpatternVisualIDRegistry.getType(EmailDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EventpatternDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5098); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSlidingEventInterval_2034Text(View view) {
		IParser parser = EventpatternParserProvider.getParser(EventpatternElementTypes.SlidingEventInterval_2034,
				view.getElement() != null ? view.getElement() : view,
				EventpatternVisualIDRegistry.getType(SlidingEventIntervalSizeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EventpatternDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5092); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBatchingEventInterval_2035Text(View view) {
		IParser parser = EventpatternParserProvider.getParser(EventpatternElementTypes.BatchingEventInterval_2035,
				view.getElement() != null ? view.getElement() : view,
				EventpatternVisualIDRegistry.getType(BatchingEventIntervalSizeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EventpatternDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5093); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSlidingTimeInterval_2036Text(View view) {
		IParser parser = EventpatternParserProvider.getParser(EventpatternElementTypes.SlidingTimeInterval_2036,
				view.getElement() != null ? view.getElement() : view,
				EventpatternVisualIDRegistry.getType(SlidingTimeIntervalYearsMonthsWeeksDaysHouEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EventpatternDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5094); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBatchingTimeInterval_2037Text(View view) {
		IParser parser = EventpatternParserProvider.getParser(EventpatternElementTypes.BatchingTimeInterval_2037,
				view.getElement() != null ? view.getElement() : view,
				EventpatternVisualIDRegistry.getType(BatchingTimeIntervalYearsMonthsWeeksDaysHouEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EventpatternDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5095); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComplexEvent_2038Text(View view) {
		IParser parser = EventpatternParserProvider.getParser(EventpatternElementTypes.ComplexEvent_2038,
				view.getElement() != null ? view.getElement() : view,
				EventpatternVisualIDRegistry.getType(ComplexEventTypeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EventpatternDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5097); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTwitter_2039Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEventProperty_3001Text(View view) {
		IParser parser = EventpatternParserProvider.getParser(EventpatternElementTypes.EventProperty_3001,
				view.getElement() != null ? view.getElement() : view,
				EventpatternVisualIDRegistry.getType(EventPropertyName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EventpatternDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEventProperty_3002Text(View view) {
		IParser parser = EventpatternParserProvider.getParser(EventpatternElementTypes.EventProperty_3002,
				view.getElement() != null ? view.getElement() : view,
				EventpatternVisualIDRegistry.getType(EventPropertyName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EventpatternDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAnd_3003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOr_3004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getNot_3005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAddition_3006Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSubtraction_3007Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMultiplication_3008Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDivision_3009Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getModulus_3010Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEqual_3011Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getNotEqual_3012Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getLessThan_3013Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getGreaterThan_3014Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getLessEqual_3015Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getGreaterEqual_3016Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEvery_3017Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEveryDistinct_3018Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRepeat_3019Text(View view) {
		IParser parser = EventpatternParserProvider.getParser(EventpatternElementTypes.Repeat_3019,
				view.getElement() != null ? view.getElement() : view,
				EventpatternVisualIDRegistry.getType(RepeatCount2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EventpatternDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5048); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUntil_3020Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRange_3021Text(View view) {
		IParser parser = EventpatternParserProvider.getParser(EventpatternElementTypes.Range_3021,
				view.getElement() != null ? view.getElement() : view,
				EventpatternVisualIDRegistry.getType(RangeLowEndpointHighEndpoint2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EventpatternDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5050); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFollowedBy_3022Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getWhile_3023Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEvent_3024Text(View view) {
		IParser parser = EventpatternParserProvider.getParser(EventpatternElementTypes.Event_3024,
				view.getElement() != null ? view.getElement() : view,
				EventpatternVisualIDRegistry.getType(EventTypeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EventpatternDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5053); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEventProperty_3025Text(View view) {
		IParser parser = EventpatternParserProvider.getParser(EventpatternElementTypes.EventProperty_3025,
				view.getElement() != null ? view.getElement() : view,
				EventpatternVisualIDRegistry.getType(EventPropertyName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EventpatternDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5054); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValue_3026Text(View view) {
		IParser parser = EventpatternParserProvider.getParser(EventpatternElementTypes.Value_3026,
				view.getElement() != null ? view.getElement() : view,
				EventpatternVisualIDRegistry.getType(ValueValue2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EventpatternDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5055); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAnd_3027Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOr_3028Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getNot_3029Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAddition_3030Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSubtraction_3031Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMultiplication_3032Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDivision_3033Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getModulus_3034Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEqual_3035Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getNotEqual_3036Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getLessThan_3037Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getGreaterThan_3038Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getLessEqual_3039Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getGreaterEqual_3040Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEvery_3041Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEveryDistinct_3042Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRepeat_3043Text(View view) {
		IParser parser = EventpatternParserProvider.getParser(EventpatternElementTypes.Repeat_3043,
				view.getElement() != null ? view.getElement() : view,
				EventpatternVisualIDRegistry.getType(RepeatCount3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EventpatternDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5076); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUntil_3044Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRange_3045Text(View view) {
		IParser parser = EventpatternParserProvider.getParser(EventpatternElementTypes.Range_3045,
				view.getElement() != null ? view.getElement() : view,
				EventpatternVisualIDRegistry.getType(RangeLowEndpointHighEndpoint3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EventpatternDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5078); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFollowedBy_3046Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getWhile_3047Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMax_3048Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMin_3049Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAvg_3050Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCount_3051Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSum_3052Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEvent_3053Text(View view) {
		IParser parser = EventpatternParserProvider.getParser(EventpatternElementTypes.Event_3053,
				view.getElement() != null ? view.getElement() : view,
				EventpatternVisualIDRegistry.getType(EventTypeName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EventpatternDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5086); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEventProperty_3054Text(View view) {
		IParser parser = EventpatternParserProvider.getParser(EventpatternElementTypes.EventProperty_3054,
				view.getElement() != null ? view.getElement() : view,
				EventpatternVisualIDRegistry.getType(EventPropertyName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EventpatternDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5087); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getValue_3055Text(View view) {
		IParser parser = EventpatternParserProvider.getParser(EventpatternElementTypes.Value_3055,
				view.getElement() != null ? view.getElement() : view,
				EventpatternVisualIDRegistry.getType(ValueValue3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EventpatternDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5088); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWithinTimer_3056Text(View view) {
		IParser parser = EventpatternParserProvider.getParser(EventpatternElementTypes.WithinTimer_3056,
				view.getElement() != null ? view.getElement() : view,
				EventpatternVisualIDRegistry.getType(WithinTimerYearsMonthsWeeksDaysHou2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EventpatternDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5089); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTimeInterval_3057Text(View view) {
		IParser parser = EventpatternParserProvider.getParser(EventpatternElementTypes.TimeInterval_3057,
				view.getElement() != null ? view.getElement() : view,
				EventpatternVisualIDRegistry.getType(TimeIntervalYearsMonthsWeeksDaysHou2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EventpatternDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5090); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTimeSchedule_3058Text(View view) {
		IParser parser = EventpatternParserProvider.getParser(EventpatternElementTypes.TimeSchedule_3058,
				view.getElement() != null ? view.getElement() : view,
				EventpatternVisualIDRegistry.getType(TimeScheduleDayOfWeekDayOfMonthMont2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EventpatternDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5091); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComplexEventProperty_3059Text(View view) {
		IParser parser = EventpatternParserProvider.getParser(EventpatternElementTypes.ComplexEventProperty_3059,
				view.getElement() != null ? view.getElement() : view,
				EventpatternVisualIDRegistry.getType(ComplexEventPropertyNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EventpatternDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5096); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLink_4001Text(View view) {
		IParser parser = EventpatternParserProvider.getParser(EventpatternElementTypes.Link_4001,
				view.getElement() != null ? view.getElement() : view,
				EventpatternVisualIDRegistry.getType(LinkOrderEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EventpatternDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return CEPEventPatternEditPart.MODEL_ID.equals(EventpatternVisualIDRegistry.getModelID(view));
	}

}
