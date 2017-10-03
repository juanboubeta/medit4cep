/*
 * 
 */
package eventpattern.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import eventpattern.diagram.edit.parts.Addition2EditPart;
import eventpattern.diagram.edit.parts.Addition3EditPart;
import eventpattern.diagram.edit.parts.AdditionEditPart;
import eventpattern.diagram.edit.parts.And2EditPart;
import eventpattern.diagram.edit.parts.And3EditPart;
import eventpattern.diagram.edit.parts.AndEditPart;
import eventpattern.diagram.edit.parts.Avg2EditPart;
import eventpattern.diagram.edit.parts.AvgEditPart;
import eventpattern.diagram.edit.parts.ComplexEventEditPart;
import eventpattern.diagram.edit.parts.ComplexEventPropertyEditPart;
import eventpattern.diagram.edit.parts.Count2EditPart;
import eventpattern.diagram.edit.parts.CountEditPart;
import eventpattern.diagram.edit.parts.Division2EditPart;
import eventpattern.diagram.edit.parts.Division3EditPart;
import eventpattern.diagram.edit.parts.DivisionEditPart;
import eventpattern.diagram.edit.parts.EmailEditPart;
import eventpattern.diagram.edit.parts.Equal2EditPart;
import eventpattern.diagram.edit.parts.Equal3EditPart;
import eventpattern.diagram.edit.parts.EqualEditPart;
import eventpattern.diagram.edit.parts.Every2EditPart;
import eventpattern.diagram.edit.parts.Every3EditPart;
import eventpattern.diagram.edit.parts.EveryDistinct2EditPart;
import eventpattern.diagram.edit.parts.EveryDistinct3EditPart;
import eventpattern.diagram.edit.parts.EveryDistinctEditPart;
import eventpattern.diagram.edit.parts.EveryEditPart;
import eventpattern.diagram.edit.parts.FollowedBy2EditPart;
import eventpattern.diagram.edit.parts.FollowedBy3EditPart;
import eventpattern.diagram.edit.parts.FollowedByEditPart;
import eventpattern.diagram.edit.parts.GreaterEqual2EditPart;
import eventpattern.diagram.edit.parts.GreaterEqual3EditPart;
import eventpattern.diagram.edit.parts.GreaterEqualEditPart;
import eventpattern.diagram.edit.parts.GreaterThan2EditPart;
import eventpattern.diagram.edit.parts.GreaterThan3EditPart;
import eventpattern.diagram.edit.parts.GreaterThanEditPart;
import eventpattern.diagram.edit.parts.GroupBy2EditPart;
import eventpattern.diagram.edit.parts.GroupByEditPart;
import eventpattern.diagram.edit.parts.LessEqual2EditPart;
import eventpattern.diagram.edit.parts.LessEqual3EditPart;
import eventpattern.diagram.edit.parts.LessEqualEditPart;
import eventpattern.diagram.edit.parts.LessThan2EditPart;
import eventpattern.diagram.edit.parts.LessThan3EditPart;
import eventpattern.diagram.edit.parts.LessThanEditPart;
import eventpattern.diagram.edit.parts.Max2EditPart;
import eventpattern.diagram.edit.parts.MaxEditPart;
import eventpattern.diagram.edit.parts.Min2EditPart;
import eventpattern.diagram.edit.parts.MinEditPart;
import eventpattern.diagram.edit.parts.Modulus2EditPart;
import eventpattern.diagram.edit.parts.Modulus3EditPart;
import eventpattern.diagram.edit.parts.ModulusEditPart;
import eventpattern.diagram.edit.parts.Multiplication2EditPart;
import eventpattern.diagram.edit.parts.Multiplication3EditPart;
import eventpattern.diagram.edit.parts.MultiplicationEditPart;
import eventpattern.diagram.edit.parts.Not2EditPart;
import eventpattern.diagram.edit.parts.Not3EditPart;
import eventpattern.diagram.edit.parts.NotEditPart;
import eventpattern.diagram.edit.parts.NotEqual2EditPart;
import eventpattern.diagram.edit.parts.NotEqual3EditPart;
import eventpattern.diagram.edit.parts.NotEqualEditPart;
import eventpattern.diagram.edit.parts.Or2EditPart;
import eventpattern.diagram.edit.parts.Or3EditPart;
import eventpattern.diagram.edit.parts.OrEditPart;
import eventpattern.diagram.edit.parts.Range2EditPart;
import eventpattern.diagram.edit.parts.Range3EditPart;
import eventpattern.diagram.edit.parts.RangeEditPart;
import eventpattern.diagram.edit.parts.Repeat2EditPart;
import eventpattern.diagram.edit.parts.Repeat3EditPart;
import eventpattern.diagram.edit.parts.RepeatEditPart;
import eventpattern.diagram.edit.parts.Subtraction2EditPart;
import eventpattern.diagram.edit.parts.Subtraction3EditPart;
import eventpattern.diagram.edit.parts.SubtractionEditPart;
import eventpattern.diagram.edit.parts.Sum2EditPart;
import eventpattern.diagram.edit.parts.SumEditPart;
import eventpattern.diagram.edit.parts.TwitterEditPart;
import eventpattern.diagram.edit.parts.Until2EditPart;
import eventpattern.diagram.edit.parts.Until3EditPart;
import eventpattern.diagram.edit.parts.UntilEditPart;
import eventpattern.diagram.edit.parts.While2EditPart;
import eventpattern.diagram.edit.parts.While3EditPart;
import eventpattern.diagram.edit.parts.WhileEditPart;
import eventpattern.diagram.edit.parts.WithinTimerEditPart;
import eventpattern.diagram.providers.EventpatternElementTypes;
import eventpattern.diagram.providers.EventpatternModelingAssistantProvider;

/**
 * @generated
 */
public class EventpatternModelingAssistantProviderOfWithinTimerEditPart extends EventpatternModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((WithinTimerEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(WithinTimerEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(EventpatternElementTypes.Link_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((WithinTimerEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(WithinTimerEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof AndEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof OrEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof NotEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof AdditionEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof SubtractionEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof MultiplicationEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DivisionEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof ModulusEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof EqualEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof NotEqualEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof LessThanEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof GreaterThanEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof LessEqualEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof GreaterEqualEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof EveryEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof EveryDistinctEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof RepeatEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof UntilEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof RangeEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof FollowedByEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof WhileEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof MaxEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof MinEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof AvgEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof CountEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof SumEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof GroupByEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof EmailEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof TwitterEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof ComplexEventEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof And2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Or2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Not2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Addition2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Subtraction2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Multiplication2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Division2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Modulus2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Equal2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof NotEqual2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof LessThan2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof GreaterThan2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof LessEqual2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof GreaterEqual2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Every2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof EveryDistinct2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Repeat2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Until2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Range2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof FollowedBy2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof While2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof And3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Or3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Not3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Addition3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Subtraction3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Multiplication3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Division3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Modulus3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Equal3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof NotEqual3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof LessThan3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof GreaterThan3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof LessEqual3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof GreaterEqual3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Every3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof EveryDistinct3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Repeat3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Until3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Range3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof FollowedBy3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof While3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Max2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Min2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Avg2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Count2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Sum2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof GroupBy2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof ComplexEventPropertyEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((WithinTimerEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(WithinTimerEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == EventpatternElementTypes.Link_4001) {
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
			types.add(EventpatternElementTypes.GroupBy_2040);
			types.add(EventpatternElementTypes.Email_2033);
			types.add(EventpatternElementTypes.Twitter_2039);
			types.add(EventpatternElementTypes.ComplexEvent_2038);
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
			types.add(EventpatternElementTypes.GroupBy_3060);
			types.add(EventpatternElementTypes.ComplexEventProperty_3059);
		}
		return types;
	}

}
