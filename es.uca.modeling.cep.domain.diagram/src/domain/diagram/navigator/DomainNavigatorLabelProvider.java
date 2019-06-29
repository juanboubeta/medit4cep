/*
 * 
 */
package domain.diagram.navigator;

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

import domain.CEPDomain;
import domain.diagram.edit.parts.CEPDomainEditPart;
import domain.diagram.edit.parts.EventEditPart;
import domain.diagram.edit.parts.EventProperty2EditPart;
import domain.diagram.edit.parts.EventPropertyEditPart;
import domain.diagram.edit.parts.EventPropertyName2EditPart;
import domain.diagram.edit.parts.EventPropertyNameEditPart;
import domain.diagram.edit.parts.EventPropertyNameType2EditPart;
import domain.diagram.edit.parts.EventPropertyNameTypeEditPart;
import domain.diagram.edit.parts.EventTypeNameEditPart;
import domain.diagram.part.DomainDiagramEditorPlugin;
import domain.diagram.part.DomainVisualIDRegistry;
import domain.diagram.providers.DomainElementTypes;
import domain.diagram.providers.DomainParserProvider;

/**
 * @generated
 */
public class DomainNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		DomainDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		DomainDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof DomainNavigatorItem && !isOwnView(((DomainNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof DomainNavigatorGroup) {
			DomainNavigatorGroup group = (DomainNavigatorGroup) element;
			return DomainDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof DomainNavigatorItem) {
			DomainNavigatorItem navigatorItem = (DomainNavigatorItem) element;
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
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case CEPDomainEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?www.uca.es/modeling/cep/domain?CEPDomain", //$NON-NLS-1$
					DomainElementTypes.CEPDomain_1000);
		case EventEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/domain?Event", //$NON-NLS-1$
					DomainElementTypes.Event_2001);
		case EventPropertyEditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/domain?EventProperty", //$NON-NLS-1$
					DomainElementTypes.EventProperty_3001);
		case EventProperty2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/domain?EventProperty", //$NON-NLS-1$
					DomainElementTypes.EventProperty_3002);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = DomainDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && DomainElementTypes.isKnownElementType(elementType)) {
			image = DomainElementTypes.getImage(elementType);
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
		if (element instanceof DomainNavigatorGroup) {
			DomainNavigatorGroup group = (DomainNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof DomainNavigatorItem) {
			DomainNavigatorItem navigatorItem = (DomainNavigatorItem) element;
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
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case CEPDomainEditPart.VISUAL_ID:
			return getCEPDomain_1000Text(view);
		case EventEditPart.VISUAL_ID:
			return getEvent_2001Text(view);
		case EventPropertyEditPart.VISUAL_ID:
			return getEventProperty_3001Text(view);
		case EventProperty2EditPart.VISUAL_ID:
			return getEventProperty_3002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getCEPDomain_1000Text(View view) {
		CEPDomain domainModelElement = (CEPDomain) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getDomainName();
		} else {
			DomainDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEvent_2001Text(View view) {
		IParser parser = DomainParserProvider.getParser(DomainElementTypes.Event_2001,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(EventTypeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEventProperty_3001Text(View view) {
		IParser parser = DomainParserProvider.getParser(DomainElementTypes.EventProperty_3001,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(EventPropertyNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEventProperty_3002Text(View view) {
		IParser parser = DomainParserProvider.getParser(DomainElementTypes.EventProperty_3002,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(EventPropertyName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
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
		return CEPDomainEditPart.MODEL_ID.equals(DomainVisualIDRegistry.getModelID(view));
	}

}
