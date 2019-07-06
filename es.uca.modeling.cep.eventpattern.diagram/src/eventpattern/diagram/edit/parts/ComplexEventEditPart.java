/*******************************************************************************
 * Copyright (c) 2011, 2015 Juan Boubeta-Puig
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Juan Boubeta-Puig - modifications marked as @generated NOT
 ******************************************************************************/

package eventpattern.diagram.edit.parts;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
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
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import eventpattern.diagram.status.EventPatternsStatus;
import eventpattern.diagram.edit.policies.ComplexEventItemSemanticEditPolicy;
import eventpattern.diagram.edit.policies.OpenDiagramEditPolicy;
import eventpattern.diagram.part.EventpatternDiagramEditor;
import eventpattern.diagram.part.EventpatternVisualIDRegistry;
import eventpattern.diagram.providers.EventpatternElementTypes;

/**
 * @generated
 */
public class ComplexEventEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2038;

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
	public ComplexEventEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(EventpatternVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ComplexEventItemSemanticEditPolicy());
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
		return primaryShape = new ComplexEventFigure();
	}

	/**
	 * @generated
	 */
	public ComplexEventFigure getPrimaryShape() {
		return (ComplexEventFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ComplexEventTypeNameEditPart) {
			((ComplexEventTypeNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureComplexEventLabelFigure());
			return true;
		}
		if (childEditPart instanceof ComplexEventComplexEventComplexEventPropertiesCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getComplexEventComplexEventPropertiesCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ComplexEventComplexEventComplexEventPropertiesCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ComplexEventTypeNameEditPart) {
			return true;
		}
		if (childEditPart instanceof ComplexEventComplexEventComplexEventPropertiesCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getComplexEventComplexEventPropertiesCompartmentFigure();
			pane.remove(
					((ComplexEventComplexEventComplexEventPropertiesCompartmentEditPart) childEditPart).getFigure());
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
		if (editPart instanceof ComplexEventComplexEventComplexEventPropertiesCompartmentEditPart) {
			return getPrimaryShape().getComplexEventComplexEventPropertiesCompartmentFigure();
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
		return getChildBySemanticHint(EventpatternVisualIDRegistry.getType(ComplexEventTypeNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == EventpatternElementTypes.ComplexEventProperty_3059) {
				return getChildBySemanticHint(EventpatternVisualIDRegistry
						.getType(ComplexEventComplexEventComplexEventPropertiesCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * This method will show the icon image when the attribute imagePath of 
	 * a ComplexEvent node is changed.
	 * @generated NOT
	 */
	protected void handleNotificationEvent(Notification event) {

		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations().equals(event.getFeature())) {
			handleMajorSemanticChange();

		} else {

			if (event.getFeature() instanceof EAttribute) {
				EAttribute eAttribute = (EAttribute) event.getFeature();

				// imagePath has been modified
				if (eAttribute.getName().equalsIgnoreCase("imagePath")) {
					ComplexEventFigure figure = (ComplexEventFigure) this.getPrimaryShape();

					Image image;
					String elementName = event.getNewStringValue();

					if (elementName != null && !elementName.equals("") && new File(elementName).exists()) {
						try {
							File file = new File(elementName);
							URL url = file.toURI().toURL();
							image = ImageDescriptor.createFromURL(url).createImage();
						} catch (MalformedURLException e) {
							e.printStackTrace();
							image = null;
						}

						Image scaledImage;

						scaledImage = new Image(Display.getDefault(), image.getImageData().scaledTo(20, 20));

						figure.getFigureComplexEventLabelFigure().setIcon(scaledImage);

						EventpatternDiagramEditor editor = (EventpatternDiagramEditor) PlatformUI.getWorkbench()
								.getActiveWorkbenchWindow().getActivePage().getActiveEditor();
						// editor.getTitle() returns xxx.pattern_diagram
						String activePatternName = editor.getTitle().replace(".pattern_diagram", "");

						EventPatternsStatus.getComplexEventChanges().put(activePatternName, true);
					}
				} else if (eAttribute.getName().equalsIgnoreCase("typeName")) {

					EventpatternDiagramEditor editor = (EventpatternDiagramEditor) PlatformUI.getWorkbench()
							.getActiveWorkbenchWindow().getActivePage().getActiveEditor();
					// editor.getTitle() returns xxx.pattern_diagram
					String activePatternName = editor.getTitle().replace(".pattern_diagram", "");

					EventPatternsStatus.getComplexEventChanges().put(activePatternName, true);
				}
			}

			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class ComplexEventFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureComplexEventLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fComplexEventComplexEventPropertiesCompartmentFigure;

		/**
		 * @generated
		 */
		public ComplexEventFigure() {
			this.setForegroundColor(THIS_FORE);
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureComplexEventLabelFigure = new WrappingLabel();

			fFigureComplexEventLabelFigure.setText("ComplexEvent");
			fFigureComplexEventLabelFigure
					.setMaximumSize(new Dimension(getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureComplexEventLabelFigure);

			fComplexEventComplexEventPropertiesCompartmentFigure = new RectangleFigure();

			fComplexEventComplexEventPropertiesCompartmentFigure.setOutline(false);

			this.add(fComplexEventComplexEventPropertiesCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureComplexEventLabelFigure() {
			return fFigureComplexEventLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getComplexEventComplexEventPropertiesCompartmentFigure() {
			return fComplexEventComplexEventPropertiesCompartmentFigure;
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
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();

		if (page != null) {
			try {
				page.showView("org.eclipse.ui.views.PropertySheet");
			} catch (PartInitException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 110, 110, 110);

}
