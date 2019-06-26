/*
* 
*/
package smartcontract.diagram.navigator;

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

import smartcontract.SmartContracts;
import smartcontract.diagram.edit.parts.ContractFunctionEditPart;
import smartcontract.diagram.edit.parts.ContractFunctionNameEditPart;
import smartcontract.diagram.edit.parts.InputParameterEditPart;
import smartcontract.diagram.edit.parts.InputParameterNameEditPart;
import smartcontract.diagram.edit.parts.OutputParameterEditPart;
import smartcontract.diagram.edit.parts.OutputParameterNameEditPart;
import smartcontract.diagram.edit.parts.SmartContractEditPart;
import smartcontract.diagram.edit.parts.SmartContractTypeNameEditPart;
import smartcontract.diagram.edit.parts.SmartContractsEditPart;
import smartcontract.diagram.part.SmartcontractDiagramEditorPlugin;
import smartcontract.diagram.part.SmartcontractVisualIDRegistry;
import smartcontract.diagram.providers.SmartcontractElementTypes;
import smartcontract.diagram.providers.SmartcontractParserProvider;

/**
 * @generated
 */
public class SmartcontractNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		SmartcontractDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		SmartcontractDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof SmartcontractNavigatorItem
				&& !isOwnView(((SmartcontractNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof SmartcontractNavigatorGroup) {
			SmartcontractNavigatorGroup group = (SmartcontractNavigatorGroup) element;
			return SmartcontractDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof SmartcontractNavigatorItem) {
			SmartcontractNavigatorItem navigatorItem = (SmartcontractNavigatorItem) element;
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
		switch (SmartcontractVisualIDRegistry.getVisualID(view)) {
		case SmartContractsEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?www.uca.es/modeling/smartcontract?SmartContracts", //$NON-NLS-1$
					SmartcontractElementTypes.SmartContracts_1000);
		case SmartContractEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/smartcontract?SmartContract", //$NON-NLS-1$
					SmartcontractElementTypes.SmartContract_2002);
		case ContractFunctionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/smartcontract?ContractFunction", //$NON-NLS-1$
					SmartcontractElementTypes.ContractFunction_3003);
		case OutputParameterEditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/smartcontract?OutputParameter", //$NON-NLS-1$
					SmartcontractElementTypes.OutputParameter_3007);
		case InputParameterEditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/smartcontract?InputParameter", //$NON-NLS-1$
					SmartcontractElementTypes.InputParameter_3008);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = SmartcontractDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && SmartcontractElementTypes.isKnownElementType(elementType)) {
			image = SmartcontractElementTypes.getImage(elementType);
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
		if (element instanceof SmartcontractNavigatorGroup) {
			SmartcontractNavigatorGroup group = (SmartcontractNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof SmartcontractNavigatorItem) {
			SmartcontractNavigatorItem navigatorItem = (SmartcontractNavigatorItem) element;
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
		switch (SmartcontractVisualIDRegistry.getVisualID(view)) {
		case SmartContractsEditPart.VISUAL_ID:
			return getSmartContracts_1000Text(view);
		case SmartContractEditPart.VISUAL_ID:
			return getSmartContract_2002Text(view);
		case ContractFunctionEditPart.VISUAL_ID:
			return getContractFunction_3003Text(view);
		case OutputParameterEditPart.VISUAL_ID:
			return getOutputParameter_3007Text(view);
		case InputParameterEditPart.VISUAL_ID:
			return getInputParameter_3008Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getSmartContracts_1000Text(View view) {
		SmartContracts domainModelElement = (SmartContracts) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			SmartcontractDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSmartContract_2002Text(View view) {
		IParser parser = SmartcontractParserProvider.getParser(SmartcontractElementTypes.SmartContract_2002,
				view.getElement() != null ? view.getElement() : view,
				SmartcontractVisualIDRegistry.getType(SmartContractTypeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SmartcontractDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getContractFunction_3003Text(View view) {
		IParser parser = SmartcontractParserProvider.getParser(SmartcontractElementTypes.ContractFunction_3003,
				view.getElement() != null ? view.getElement() : view,
				SmartcontractVisualIDRegistry.getType(ContractFunctionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SmartcontractDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOutputParameter_3007Text(View view) {
		IParser parser = SmartcontractParserProvider.getParser(SmartcontractElementTypes.OutputParameter_3007,
				view.getElement() != null ? view.getElement() : view,
				SmartcontractVisualIDRegistry.getType(OutputParameterNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SmartcontractDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInputParameter_3008Text(View view) {
		IParser parser = SmartcontractParserProvider.getParser(SmartcontractElementTypes.InputParameter_3008,
				view.getElement() != null ? view.getElement() : view,
				SmartcontractVisualIDRegistry.getType(InputParameterNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SmartcontractDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5010); //$NON-NLS-1$
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
		return SmartContractsEditPart.MODEL_ID.equals(SmartcontractVisualIDRegistry.getModelID(view));
	}

}
