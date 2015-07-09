/*
 * 
 */
package eventpattern.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.lite.svg.SVGFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import eventpattern.diagram.edit.policies.EmailItemSemanticEditPolicy;
import eventpattern.diagram.part.EventpatternVisualIDRegistry;
import eventpattern.diagram.providers.EventpatternElementTypes;

/**
 * @generated
 */
public class EmailEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2033;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public EmailEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new EmailItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new EmailFigure();
	}

	/**
	 * @generated
	 */
	public EmailFigure getPrimaryShape() {
		return (EmailFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(30, 30);
		return result;
	}

	/**
	 * @generated
	 */
	public EditPolicy getPrimaryDragEditPolicy() {
		EditPolicy result = super.getPrimaryDragEditPolicy();
		if (result instanceof ResizableEditPolicy) {
			ResizableEditPolicy ep = (ResizableEditPolicy) result;
			ep.setResizeDirections(PositionConstants.NONE);
		}
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(EventpatternElementTypes.Link_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
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
			types.add(EventpatternElementTypes.Event_2027);
			types.add(EventpatternElementTypes.EventProperty_2028);
			types.add(EventpatternElementTypes.Value_2029);
			types.add(EventpatternElementTypes.WithinTimer_2030);
			types.add(EventpatternElementTypes.TimeInterval_2031);
			types.add(EventpatternElementTypes.TimeSchedule_2032);
			types.add(EventpatternElementTypes.ComplexEvent_2038);
			types.add(EventpatternElementTypes.EventProperty_3001);
			types.add(EventpatternElementTypes.EventProperty_3002);
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
			types.add(EventpatternElementTypes.Event_3024);
			types.add(EventpatternElementTypes.EventProperty_3025);
			types.add(EventpatternElementTypes.Value_3026);
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
			types.add(EventpatternElementTypes.Event_3053);
			types.add(EventpatternElementTypes.EventProperty_3054);
			types.add(EventpatternElementTypes.Value_3055);
			types.add(EventpatternElementTypes.WithinTimer_3056);
			types.add(EventpatternElementTypes.TimeInterval_3057);
			types.add(EventpatternElementTypes.TimeSchedule_3058);
		}
		return types;
	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations()
						.equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class EmailFigure extends SVGFigure {

		/**
		 * @generated
		 */
		public EmailFigure() {
			this.setURI("platform:/plugin/es.uca.modeling.cep.eventpattern.figures/svg/Email.svg");
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(30),
					getMapMode().DPtoLP(30)));
		}

	}

	// Open the properties view, when the user has double-clicked on the node.
	public void performRequest(Request req) {

		if (req.getType() == REQ_OPEN) {
			mouseDoubleClick();
		} else {
			super.performRequest(req);
		}
	}

	protected void mouseDoubleClick() {
		IWorkbenchPage page = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage();

		if (page != null) {
			try {
				page.showView("org.eclipse.ui.views.PropertySheet");
			} catch (PartInitException e) {
				e.printStackTrace();
			}
		}
	}
}
