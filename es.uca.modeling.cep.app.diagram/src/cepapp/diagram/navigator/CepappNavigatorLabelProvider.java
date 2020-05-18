/*
* 
*/
package cepapp.diagram.navigator;

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

import cepapp.CEPApp;
import cepapp.InMemoryInput;
import cepapp.InMemoryOutput;
import cepapp.InputFile;
import cepapp.Link;
import cepapp.OutputFile;
import cepapp.SinkEmail;
import cepapp.SinkHttp;
import cepapp.SinkMongoDB;
import cepapp.SinkMqtt;
import cepapp.SinkRDBMS;
import cepapp.SourceEmail;
import cepapp.SourceHttp;
import cepapp.SourceMqtt;
import cepapp.Twitter;
import cepapp.diagram.edit.parts.CEPAppEditPart;
import cepapp.diagram.edit.parts.ComplexEventEditPart;
import cepapp.diagram.edit.parts.ComplexEventProperty2EditPart;
import cepapp.diagram.edit.parts.ComplexEventPropertyEditPart;
import cepapp.diagram.edit.parts.ComplexEventPropertyName2EditPart;
import cepapp.diagram.edit.parts.ComplexEventPropertyNameEditPart;
import cepapp.diagram.edit.parts.ComplexEventTypeNameEditPart;
import cepapp.diagram.edit.parts.EventEditPart;
import cepapp.diagram.edit.parts.EventProperty2EditPart;
import cepapp.diagram.edit.parts.EventPropertyEditPart;
import cepapp.diagram.edit.parts.EventPropertyName2EditPart;
import cepapp.diagram.edit.parts.EventPropertyNameEditPart;
import cepapp.diagram.edit.parts.EventTypeNameEditPart;
import cepapp.diagram.edit.parts.InMemoryInputEditPart;
import cepapp.diagram.edit.parts.InMemoryOutputEditPart;
import cepapp.diagram.edit.parts.InputFileEditPart;
import cepapp.diagram.edit.parts.LinkEditPart;
import cepapp.diagram.edit.parts.LinkOrderEditPart;
import cepapp.diagram.edit.parts.OutputFileEditPart;
import cepapp.diagram.edit.parts.SinkEmailEditPart;
import cepapp.diagram.edit.parts.SinkHttpEditPart;
import cepapp.diagram.edit.parts.SinkMongoDBEditPart;
import cepapp.diagram.edit.parts.SinkMqttEditPart;
import cepapp.diagram.edit.parts.SinkRDBMSEditPart;
import cepapp.diagram.edit.parts.SourceEmailEditPart;
import cepapp.diagram.edit.parts.SourceHttpEditPart;
import cepapp.diagram.edit.parts.SourceMqttEditPart;
import cepapp.diagram.edit.parts.TwitterEditPart;
import cepapp.diagram.part.CepappDiagramEditorPlugin;
import cepapp.diagram.part.CepappVisualIDRegistry;
import cepapp.diagram.providers.CepappElementTypes;
import cepapp.diagram.providers.CepappParserProvider;

/**
 * @generated
 */
public class CepappNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		CepappDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		CepappDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof CepappNavigatorItem && !isOwnView(((CepappNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof CepappNavigatorGroup) {
			CepappNavigatorGroup group = (CepappNavigatorGroup) element;
			return CepappDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof CepappNavigatorItem) {
			CepappNavigatorItem navigatorItem = (CepappNavigatorItem) element;
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
		switch (CepappVisualIDRegistry.getVisualID(view)) {
		case CEPAppEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?www.uca.es/modeling/cep/cepapp?CEPApp", CepappElementTypes.CEPApp_1000); //$NON-NLS-1$
		case InputFileEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/cepapp?InputFile", //$NON-NLS-1$
					CepappElementTypes.InputFile_2001);
		case SourceHttpEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/cepapp?SourceHttp", //$NON-NLS-1$
					CepappElementTypes.SourceHttp_2003);
		case SourceMqttEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/cepapp?SourceMqtt", //$NON-NLS-1$
					CepappElementTypes.SourceMqtt_2004);
		case OutputFileEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/cepapp?OutputFile", //$NON-NLS-1$
					CepappElementTypes.OutputFile_2005);
		case SinkHttpEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/cepapp?SinkHttp", //$NON-NLS-1$
					CepappElementTypes.SinkHttp_2007);
		case SinkMqttEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/cepapp?SinkMqtt", //$NON-NLS-1$
					CepappElementTypes.SinkMqtt_2008);
		case EventEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/cepapp?Event", //$NON-NLS-1$
					CepappElementTypes.Event_2009);
		case ComplexEventEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/cepapp?ComplexEvent", //$NON-NLS-1$
					CepappElementTypes.ComplexEvent_2010);
		case SinkMongoDBEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/cepapp?SinkMongoDB", //$NON-NLS-1$
					CepappElementTypes.SinkMongoDB_2019);
		case InMemoryInputEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/cepapp?InMemoryInput", //$NON-NLS-1$
					CepappElementTypes.InMemoryInput_2021);
		case SourceEmailEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/cepapp?SourceEmail", //$NON-NLS-1$
					CepappElementTypes.SourceEmail_2022);
		case InMemoryOutputEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/cepapp?InMemoryOutput", //$NON-NLS-1$
					CepappElementTypes.InMemoryOutput_2023);
		case SinkEmailEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?www.uca.es/modeling/cep/cepapp?SinkEmail", //$NON-NLS-1$
					CepappElementTypes.SinkEmail_2024);
		case EventPropertyEditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/cepapp?EventProperty", //$NON-NLS-1$
					CepappElementTypes.EventProperty_3001);
		case EventProperty2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/cepapp?EventProperty", //$NON-NLS-1$
					CepappElementTypes.EventProperty_3002);
		case ComplexEventPropertyEditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/cepapp?ComplexEventProperty", //$NON-NLS-1$
					CepappElementTypes.ComplexEventProperty_3003);
		case ComplexEventProperty2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?www.uca.es/modeling/cep/cepapp?ComplexEventProperty", //$NON-NLS-1$
					CepappElementTypes.ComplexEventProperty_3004);
		case LinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?www.uca.es/modeling/cep/cepapp?Link", CepappElementTypes.Link_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = CepappDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && CepappElementTypes.isKnownElementType(elementType)) {
			image = CepappElementTypes.getImage(elementType);
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
		if (element instanceof CepappNavigatorGroup) {
			CepappNavigatorGroup group = (CepappNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof CepappNavigatorItem) {
			CepappNavigatorItem navigatorItem = (CepappNavigatorItem) element;
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
		switch (CepappVisualIDRegistry.getVisualID(view)) {
		case CEPAppEditPart.VISUAL_ID:
			return getCEPApp_1000Text(view);
		case InputFileEditPart.VISUAL_ID:
			return getInputFile_2001Text(view);
		case SourceHttpEditPart.VISUAL_ID:
			return getSourceHttp_2003Text(view);
		case SourceMqttEditPart.VISUAL_ID:
			return getSourceMqtt_2004Text(view);
		case OutputFileEditPart.VISUAL_ID:
			return getOutputFile_2005Text(view);
		case SinkHttpEditPart.VISUAL_ID:
			return getSinkHttp_2007Text(view);
		case SinkMqttEditPart.VISUAL_ID:
			return getSinkMqtt_2008Text(view);
		case EventEditPart.VISUAL_ID:
			return getEvent_2009Text(view);
		case ComplexEventEditPart.VISUAL_ID:
			return getComplexEvent_2010Text(view);
		case SinkMongoDBEditPart.VISUAL_ID:
			return getSinkMongoDB_2019Text(view);
		case InMemoryInputEditPart.VISUAL_ID:
			return getInMemoryInput_2021Text(view);
		case SourceEmailEditPart.VISUAL_ID:
			return getSourceEmail_2022Text(view);
		case InMemoryOutputEditPart.VISUAL_ID:
			return getInMemoryOutput_2023Text(view);
		case SinkEmailEditPart.VISUAL_ID:
			return getSinkEmail_2024Text(view);
		case EventPropertyEditPart.VISUAL_ID:
			return getEventProperty_3001Text(view);
		case EventProperty2EditPart.VISUAL_ID:
			return getEventProperty_3002Text(view);
		case ComplexEventPropertyEditPart.VISUAL_ID:
			return getComplexEventProperty_3003Text(view);
		case ComplexEventProperty2EditPart.VISUAL_ID:
			return getComplexEventProperty_3004Text(view);
		case LinkEditPart.VISUAL_ID:
			return getLink_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getCEPApp_1000Text(View view) {
		CEPApp domainModelElement = (CEPApp) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			CepappDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInputFile_2001Text(View view) {
		InputFile domainModelElement = (InputFile) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getMappingType());
		} else {
			CepappDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSourceHttp_2003Text(View view) {
		SourceHttp domainModelElement = (SourceHttp) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getMappingType());
		} else {
			CepappDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSourceMqtt_2004Text(View view) {
		SourceMqtt domainModelElement = (SourceMqtt) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getUsername();
		} else {
			CepappDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOutputFile_2005Text(View view) {
		OutputFile domainModelElement = (OutputFile) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getMappingType());
		} else {
			CepappDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSinkHttp_2007Text(View view) {
		SinkHttp domainModelElement = (SinkHttp) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getBasic_auth_username();
		} else {
			CepappDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSinkMqtt_2008Text(View view) {
		SinkMqtt domainModelElement = (SinkMqtt) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getUsername();
		} else {
			CepappDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEvent_2009Text(View view) {
		IParser parser = CepappParserProvider.getParser(CepappElementTypes.Event_2009,
				view.getElement() != null ? view.getElement() : view,
				CepappVisualIDRegistry.getType(EventTypeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CepappDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getComplexEvent_2010Text(View view) {
		IParser parser = CepappParserProvider.getParser(CepappElementTypes.ComplexEvent_2010,
				view.getElement() != null ? view.getElement() : view,
				CepappVisualIDRegistry.getType(ComplexEventTypeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CepappDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSinkMongoDB_2019Text(View view) {
		SinkMongoDB domainModelElement = (SinkMongoDB) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getCollectionName();
		} else {
			CepappDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInMemoryInput_2021Text(View view) {
		InMemoryInput domainModelElement = (InMemoryInput) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getMappingType());
		} else {
			CepappDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSourceEmail_2022Text(View view) {
		SourceEmail domainModelElement = (SourceEmail) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getUsername();
		} else {
			CepappDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInMemoryOutput_2023Text(View view) {
		InMemoryOutput domainModelElement = (InMemoryOutput) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getMappingType());
		} else {
			CepappDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSinkEmail_2024Text(View view) {
		SinkEmail domainModelElement = (SinkEmail) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getUsername();
		} else {
			CepappDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEventProperty_3001Text(View view) {
		IParser parser = CepappParserProvider.getParser(CepappElementTypes.EventProperty_3001,
				view.getElement() != null ? view.getElement() : view,
				CepappVisualIDRegistry.getType(EventPropertyNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CepappDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEventProperty_3002Text(View view) {
		IParser parser = CepappParserProvider.getParser(CepappElementTypes.EventProperty_3002,
				view.getElement() != null ? view.getElement() : view,
				CepappVisualIDRegistry.getType(EventPropertyName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CepappDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getComplexEventProperty_3003Text(View view) {
		IParser parser = CepappParserProvider.getParser(CepappElementTypes.ComplexEventProperty_3003,
				view.getElement() != null ? view.getElement() : view,
				CepappVisualIDRegistry.getType(ComplexEventPropertyNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CepappDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getComplexEventProperty_3004Text(View view) {
		IParser parser = CepappParserProvider.getParser(CepappElementTypes.ComplexEventProperty_3004,
				view.getElement() != null ? view.getElement() : view,
				CepappVisualIDRegistry.getType(ComplexEventPropertyName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CepappDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLink_4001Text(View view) {
		Link domainModelElement = (Link) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getOrder());
		} else {
			CepappDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4001); //$NON-NLS-1$
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
		return CEPAppEditPart.MODEL_ID.equals(CepappVisualIDRegistry.getModelID(view));
	}

}
