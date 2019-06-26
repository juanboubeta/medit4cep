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

import eventpattern.diagram.edit.policies.WithinTimerWithinTimerWithinTimerElementsCompartment2CanonicalEditPolicy;
import eventpattern.diagram.edit.policies.WithinTimerWithinTimerWithinTimerElementsCompartment2ItemSemanticEditPolicy;
import eventpattern.diagram.part.EventpatternVisualIDRegistry;
import eventpattern.diagram.part.Messages;
import eventpattern.diagram.providers.EventpatternElementTypes;

/**
 * @generated
 */
public class WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart extends ShapeCompartmentEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 7011;

	/**
	* @generated
	*/
	public WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	public String getCompartmentName() {
		return Messages.WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart_title;
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
				new WithinTimerWithinTimerWithinTimerElementsCompartment2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(EventpatternVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new WithinTimerWithinTimerWithinTimerElementsCompartment2CanonicalEditPolicy());
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
			if (type == EventpatternElementTypes.And_3003) {
				return this;
			}
			if (type == EventpatternElementTypes.Or_3004) {
				return this;
			}
			if (type == EventpatternElementTypes.Not_3005) {
				return this;
			}
			if (type == EventpatternElementTypes.Addition_3006) {
				return this;
			}
			if (type == EventpatternElementTypes.Subtraction_3007) {
				return this;
			}
			if (type == EventpatternElementTypes.Multiplication_3008) {
				return this;
			}
			if (type == EventpatternElementTypes.Division_3009) {
				return this;
			}
			if (type == EventpatternElementTypes.Modulus_3010) {
				return this;
			}
			if (type == EventpatternElementTypes.Equal_3011) {
				return this;
			}
			if (type == EventpatternElementTypes.NotEqual_3012) {
				return this;
			}
			if (type == EventpatternElementTypes.LessThan_3013) {
				return this;
			}
			if (type == EventpatternElementTypes.GreaterThan_3014) {
				return this;
			}
			if (type == EventpatternElementTypes.LessEqual_3015) {
				return this;
			}
			if (type == EventpatternElementTypes.GreaterEqual_3016) {
				return this;
			}
			if (type == EventpatternElementTypes.Every_3017) {
				return this;
			}
			if (type == EventpatternElementTypes.EveryDistinct_3018) {
				return this;
			}
			if (type == EventpatternElementTypes.Repeat_3019) {
				return this;
			}
			if (type == EventpatternElementTypes.Until_3020) {
				return this;
			}
			if (type == EventpatternElementTypes.Range_3021) {
				return this;
			}
			if (type == EventpatternElementTypes.FollowedBy_3022) {
				return this;
			}
			if (type == EventpatternElementTypes.While_3023) {
				return this;
			}
			if (type == EventpatternElementTypes.Event_3024) {
				return this;
			}
			if (type == EventpatternElementTypes.EventProperty_3025) {
				return this;
			}
			if (type == EventpatternElementTypes.Value_3026) {
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
