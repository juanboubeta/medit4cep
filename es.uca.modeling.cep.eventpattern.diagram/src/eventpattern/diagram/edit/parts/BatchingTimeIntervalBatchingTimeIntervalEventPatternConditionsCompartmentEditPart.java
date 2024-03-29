/*
 * 
 */
package eventpattern.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeConnectionRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

import eventpattern.diagram.edit.policies.BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentCanonicalEditPolicy;
import eventpattern.diagram.edit.policies.BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentItemSemanticEditPolicy;
import eventpattern.diagram.part.EventpatternVisualIDRegistry;
import eventpattern.diagram.part.Messages;
import eventpattern.diagram.providers.EventpatternElementTypes;

/**
 * @generated
 */
public class BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart
		extends ShapeCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 7014;

	/**
	 * @generated
	 */
	public BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	public String getCompartmentName() {
		return Messages.BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart_title;
	}

	/**
	 * @generated
	 */
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super.createFigure();
		result.setTitleVisibility(false);
		return result;
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, new ResizableCompartmentEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(EventpatternVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentCanonicalEditPolicy());
	}

	/**
	 * @generated
	 */
	protected void setRatio(Double ratio) {
		if (getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}

	/**
	* @generated
	*/
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == EventpatternElementTypes.And_3027) {
				return this;
			}
			if (type == EventpatternElementTypes.Or_3028) {
				return this;
			}
			if (type == EventpatternElementTypes.Not_3029) {
				return this;
			}
			if (type == EventpatternElementTypes.Addition_3030) {
				return this;
			}
			if (type == EventpatternElementTypes.Subtraction_3031) {
				return this;
			}
			if (type == EventpatternElementTypes.Multiplication_3032) {
				return this;
			}
			if (type == EventpatternElementTypes.Division_3033) {
				return this;
			}
			if (type == EventpatternElementTypes.Modulus_3034) {
				return this;
			}
			if (type == EventpatternElementTypes.Equal_3035) {
				return this;
			}
			if (type == EventpatternElementTypes.NotEqual_3036) {
				return this;
			}
			if (type == EventpatternElementTypes.LessThan_3037) {
				return this;
			}
			if (type == EventpatternElementTypes.GreaterThan_3038) {
				return this;
			}
			if (type == EventpatternElementTypes.LessEqual_3039) {
				return this;
			}
			if (type == EventpatternElementTypes.GreaterEqual_3040) {
				return this;
			}
			if (type == EventpatternElementTypes.Every_3041) {
				return this;
			}
			if (type == EventpatternElementTypes.EveryDistinct_3042) {
				return this;
			}
			if (type == EventpatternElementTypes.Repeat_3043) {
				return this;
			}
			if (type == EventpatternElementTypes.Until_3044) {
				return this;
			}
			if (type == EventpatternElementTypes.Range_3045) {
				return this;
			}
			if (type == EventpatternElementTypes.FollowedBy_3046) {
				return this;
			}
			if (type == EventpatternElementTypes.While_3047) {
				return this;
			}
			if (type == EventpatternElementTypes.Max_3048) {
				return this;
			}
			if (type == EventpatternElementTypes.Min_3049) {
				return this;
			}
			if (type == EventpatternElementTypes.Avg_3050) {
				return this;
			}
			if (type == EventpatternElementTypes.Count_3051) {
				return this;
			}
			if (type == EventpatternElementTypes.Sum_3052) {
				return this;
			}
			if (type == EventpatternElementTypes.Event_3053) {
				return this;
			}
			if (type == EventpatternElementTypes.EventProperty_3054) {
				return this;
			}
			if (type == EventpatternElementTypes.Value_3055) {
				return this;
			}
			if (type == EventpatternElementTypes.GroupBy_3060) {
				return this;
			}
			if (type == EventpatternElementTypes.WithinTimer_3056) {
				return this;
			}
			if (type == EventpatternElementTypes.TimeInterval_3057) {
				return this;
			}
			if (type == EventpatternElementTypes.TimeSchedule_3058) {
				return this;
			}
			return getParent().getTargetEditPart(request);
		}
		if (request instanceof CreateUnspecifiedTypeConnectionRequest) {
			if (RequestConstants.REQ_CONNECTION_END.equals(request.getType())) {
				for (Object type : ((CreateUnspecifiedTypeConnectionRequest) request).getElementTypes()) {
					if (type instanceof IElementType) {
						IElementType elementType = (IElementType) type;
						if (elementType.equals(EventpatternElementTypes.Link_4001))
							return super.getTargetEditPart(request);
					}
				}
			}
			return getParent().getTargetEditPart(request);
		}
		return super.getTargetEditPart(request);
	}

}
