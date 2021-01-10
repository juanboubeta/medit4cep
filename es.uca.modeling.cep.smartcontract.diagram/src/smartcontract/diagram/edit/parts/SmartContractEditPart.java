/*
 * 
 */
package smartcontract.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
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
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.graphics.Color;

import smartcontract.diagram.edit.policies.OpenDiagramEditPolicy;
import smartcontract.diagram.edit.policies.SmartContractItemSemanticEditPolicy;
import smartcontract.diagram.part.SmartcontractVisualIDRegistry;
import smartcontract.diagram.providers.SmartcontractElementTypes;

/**
 * @generated
 */
public class SmartContractEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2003;

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
	public SmartContractEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(SmartcontractVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new SmartContractItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDiagramEditPolicy()); // XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	* @generated
	*/
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
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
		return primaryShape = new SmartContractFigure();
	}

	/**
	* @generated
	*/
	public SmartContractFigure getPrimaryShape() {
		return (SmartContractFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof SmartContractTypeNameEditPart) {
			((SmartContractTypeNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureSmartContractLabelFigure());
			return true;
		}
		if (childEditPart instanceof SmartContractSmartContractSmartContractPropertiesCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getSmartContractSmartContractPropertiesCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(
					((SmartContractSmartContractSmartContractPropertiesCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof SmartContractSmartContractConstructorParametersContractCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getSmartContractConstructorParametersContractCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((SmartContractSmartContractConstructorParametersContractCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof SmartContractTypeNameEditPart) {
			return true;
		}
		if (childEditPart instanceof SmartContractSmartContractSmartContractPropertiesCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getSmartContractSmartContractPropertiesCompartmentFigure();
			pane.remove(
					((SmartContractSmartContractSmartContractPropertiesCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof SmartContractSmartContractConstructorParametersContractCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getSmartContractConstructorParametersContractCompartmentFigure();
			pane.remove(((SmartContractSmartContractConstructorParametersContractCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	* @generated
	*/
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	* @generated
	*/
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof SmartContractSmartContractSmartContractPropertiesCompartmentEditPart) {
			return getPrimaryShape().getSmartContractSmartContractPropertiesCompartmentFigure();
		}
		if (editPart instanceof SmartContractSmartContractConstructorParametersContractCompartmentEditPart) {
			return getPrimaryShape().getSmartContractConstructorParametersContractCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	* @generated
	*/
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
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
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
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
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(SmartcontractVisualIDRegistry.getType(SmartContractTypeNameEditPart.VISUAL_ID));
	}

	/**
	* @generated
	*/
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == SmartcontractElementTypes.ContractFunction_3009) {
				return getChildBySemanticHint(SmartcontractVisualIDRegistry
						.getType(SmartContractSmartContractSmartContractPropertiesCompartmentEditPart.VISUAL_ID));
			}
			if (type == SmartcontractElementTypes.ConstructorParameter_3012) {
				return getChildBySemanticHint(SmartcontractVisualIDRegistry
						.getType(SmartContractSmartContractConstructorParametersContractCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	* @generated
	*/
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations().equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class SmartContractFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureSmartContractLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fSmartContractSmartContractPropertiesCompartmentFigure;

		/**
		* @generated
		*/
		private RectangleFigure fSmartContractConstructorParametersContractCompartmentFigure;

		/**
			 * @generated
			 */
		public SmartContractFigure() {
			this.setForegroundColor(THIS_FORE);
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureSmartContractLabelFigure = new WrappingLabel();

			fFigureSmartContractLabelFigure.setText("SmartContract");
			fFigureSmartContractLabelFigure
					.setMaximumSize(new Dimension(getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureSmartContractLabelFigure);

			fSmartContractSmartContractPropertiesCompartmentFigure = new RectangleFigure();

			fSmartContractSmartContractPropertiesCompartmentFigure.setOutline(false);

			this.add(fSmartContractSmartContractPropertiesCompartmentFigure);

			fSmartContractConstructorParametersContractCompartmentFigure = new RectangleFigure();

			fSmartContractConstructorParametersContractCompartmentFigure.setOutline(false);

			this.add(fSmartContractConstructorParametersContractCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSmartContractLabelFigure() {
			return fFigureSmartContractLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getSmartContractSmartContractPropertiesCompartmentFigure() {
			return fSmartContractSmartContractPropertiesCompartmentFigure;
		}

		/**
		* @generated
		*/
		public RectangleFigure getSmartContractConstructorParametersContractCompartmentFigure() {
			return fSmartContractConstructorParametersContractCompartmentFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 110, 110, 110);

}
