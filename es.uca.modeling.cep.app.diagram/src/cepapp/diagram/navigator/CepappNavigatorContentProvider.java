/*
* 
*/
package cepapp.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import cepapp.diagram.edit.parts.CEPAppEditPart;
import cepapp.diagram.edit.parts.ComplexEventComplexEventComplexEventPropertiesCompartmentEditPart;
import cepapp.diagram.edit.parts.ComplexEventEditPart;
import cepapp.diagram.edit.parts.ComplexEventProperty2EditPart;
import cepapp.diagram.edit.parts.ComplexEventPropertyComplexEventPropertyComplexEventPropertiesCompartment2EditPart;
import cepapp.diagram.edit.parts.ComplexEventPropertyComplexEventPropertyComplexEventPropertiesCompartmentEditPart;
import cepapp.diagram.edit.parts.ComplexEventPropertyEditPart;
import cepapp.diagram.edit.parts.EventEditPart;
import cepapp.diagram.edit.parts.EventEventEventPropertiesCompartmentEditPart;
import cepapp.diagram.edit.parts.EventProperty2EditPart;
import cepapp.diagram.edit.parts.EventPropertyEditPart;
import cepapp.diagram.edit.parts.EventPropertyEventPropertyEventPropertiesCompartment2EditPart;
import cepapp.diagram.edit.parts.EventPropertyEventPropertyEventPropertiesCompartmentEditPart;
import cepapp.diagram.edit.parts.InMemoryInputEditPart;
import cepapp.diagram.edit.parts.InMemoryOutputEditPart;
import cepapp.diagram.edit.parts.InputFileEditPart;
import cepapp.diagram.edit.parts.LinkEditPart;
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
import cepapp.diagram.part.CepappVisualIDRegistry;
import cepapp.diagram.part.Messages;

/**
 * @generated
 */
public class CepappNavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public CepappNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<CepappNavigatorItem> result = new ArrayList<CepappNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(selectViewsByType(topViews, CEPAppEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof CepappNavigatorGroup) {
			CepappNavigatorGroup group = (CepappNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof CepappNavigatorItem) {
			CepappNavigatorItem navigatorItem = (CepappNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		* Due to plugin.xml restrictions this code will be called only for views representing
		* shortcuts to this diagram elements created on other diagrams. 
		*/
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement).getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (CepappVisualIDRegistry.getVisualID(view)) {

		case CEPAppEditPart.VISUAL_ID: {
			LinkedList<CepappAbstractNavigatorItem> result = new LinkedList<CepappAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			CepappNavigatorGroup links = new CepappNavigatorGroup(Messages.NavigatorGroupName_CEPApp_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(SinkMongoDBEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(InMemoryInputEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(SourceEmailEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(InputFileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(SourceHttpEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(SourceMqttEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(InMemoryOutputEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(SinkEmailEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(OutputFileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(SinkHttpEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(SinkMqttEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(EventEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(ComplexEventEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case InputFileEditPart.VISUAL_ID: {
			LinkedList<CepappAbstractNavigatorItem> result = new LinkedList<CepappAbstractNavigatorItem>();
			Node sv = (Node) view;
			CepappNavigatorGroup outgoinglinks = new CepappNavigatorGroup(
					Messages.NavigatorGroupName_InputFile_2001_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SourceHttpEditPart.VISUAL_ID: {
			LinkedList<CepappAbstractNavigatorItem> result = new LinkedList<CepappAbstractNavigatorItem>();
			Node sv = (Node) view;
			CepappNavigatorGroup outgoinglinks = new CepappNavigatorGroup(
					Messages.NavigatorGroupName_SourceHttp_2003_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SourceMqttEditPart.VISUAL_ID: {
			LinkedList<CepappAbstractNavigatorItem> result = new LinkedList<CepappAbstractNavigatorItem>();
			Node sv = (Node) view;
			CepappNavigatorGroup outgoinglinks = new CepappNavigatorGroup(
					Messages.NavigatorGroupName_SourceMqtt_2004_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case OutputFileEditPart.VISUAL_ID: {
			LinkedList<CepappAbstractNavigatorItem> result = new LinkedList<CepappAbstractNavigatorItem>();
			Node sv = (Node) view;
			CepappNavigatorGroup incominglinks = new CepappNavigatorGroup(
					Messages.NavigatorGroupName_OutputFile_2005_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case SinkHttpEditPart.VISUAL_ID: {
			LinkedList<CepappAbstractNavigatorItem> result = new LinkedList<CepappAbstractNavigatorItem>();
			Node sv = (Node) view;
			CepappNavigatorGroup incominglinks = new CepappNavigatorGroup(
					Messages.NavigatorGroupName_SinkHttp_2007_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case SinkMqttEditPart.VISUAL_ID: {
			LinkedList<CepappAbstractNavigatorItem> result = new LinkedList<CepappAbstractNavigatorItem>();
			Node sv = (Node) view;
			CepappNavigatorGroup incominglinks = new CepappNavigatorGroup(
					Messages.NavigatorGroupName_SinkMqtt_2008_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case EventEditPart.VISUAL_ID: {
			LinkedList<CepappAbstractNavigatorItem> result = new LinkedList<CepappAbstractNavigatorItem>();
			Node sv = (Node) view;
			CepappNavigatorGroup incominglinks = new CepappNavigatorGroup(
					Messages.NavigatorGroupName_Event_2009_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(EventEventEventPropertiesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CepappVisualIDRegistry.getType(EventPropertyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ComplexEventEditPart.VISUAL_ID: {
			LinkedList<CepappAbstractNavigatorItem> result = new LinkedList<CepappAbstractNavigatorItem>();
			Node sv = (Node) view;
			CepappNavigatorGroup outgoinglinks = new CepappNavigatorGroup(
					Messages.NavigatorGroupName_ComplexEvent_2010_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), CepappVisualIDRegistry
					.getType(ComplexEventComplexEventComplexEventPropertiesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CepappVisualIDRegistry.getType(ComplexEventPropertyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SinkMongoDBEditPart.VISUAL_ID: {
			LinkedList<CepappAbstractNavigatorItem> result = new LinkedList<CepappAbstractNavigatorItem>();
			Node sv = (Node) view;
			CepappNavigatorGroup incominglinks = new CepappNavigatorGroup(
					Messages.NavigatorGroupName_SinkMongoDB_2019_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case InMemoryInputEditPart.VISUAL_ID: {
			LinkedList<CepappAbstractNavigatorItem> result = new LinkedList<CepappAbstractNavigatorItem>();
			Node sv = (Node) view;
			CepappNavigatorGroup outgoinglinks = new CepappNavigatorGroup(
					Messages.NavigatorGroupName_InMemoryInput_2021_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SourceEmailEditPart.VISUAL_ID: {
			LinkedList<CepappAbstractNavigatorItem> result = new LinkedList<CepappAbstractNavigatorItem>();
			Node sv = (Node) view;
			CepappNavigatorGroup outgoinglinks = new CepappNavigatorGroup(
					Messages.NavigatorGroupName_SourceEmail_2022_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case InMemoryOutputEditPart.VISUAL_ID: {
			LinkedList<CepappAbstractNavigatorItem> result = new LinkedList<CepappAbstractNavigatorItem>();
			Node sv = (Node) view;
			CepappNavigatorGroup incominglinks = new CepappNavigatorGroup(
					Messages.NavigatorGroupName_InMemoryOutput_2023_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case SinkEmailEditPart.VISUAL_ID: {
			LinkedList<CepappAbstractNavigatorItem> result = new LinkedList<CepappAbstractNavigatorItem>();
			Node sv = (Node) view;
			CepappNavigatorGroup incominglinks = new CepappNavigatorGroup(
					Messages.NavigatorGroupName_SinkEmail_2024_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case EventPropertyEditPart.VISUAL_ID: {
			LinkedList<CepappAbstractNavigatorItem> result = new LinkedList<CepappAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), CepappVisualIDRegistry
					.getType(EventPropertyEventPropertyEventPropertiesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CepappVisualIDRegistry.getType(EventProperty2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case EventProperty2EditPart.VISUAL_ID: {
			LinkedList<CepappAbstractNavigatorItem> result = new LinkedList<CepappAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), CepappVisualIDRegistry
					.getType(EventPropertyEventPropertyEventPropertiesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CepappVisualIDRegistry.getType(EventProperty2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case ComplexEventPropertyEditPart.VISUAL_ID: {
			LinkedList<CepappAbstractNavigatorItem> result = new LinkedList<CepappAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), CepappVisualIDRegistry.getType(
					ComplexEventPropertyComplexEventPropertyComplexEventPropertiesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CepappVisualIDRegistry.getType(ComplexEventProperty2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case ComplexEventProperty2EditPart.VISUAL_ID: {
			LinkedList<CepappAbstractNavigatorItem> result = new LinkedList<CepappAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), CepappVisualIDRegistry.getType(
					ComplexEventPropertyComplexEventPropertyComplexEventPropertiesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					CepappVisualIDRegistry.getType(ComplexEventProperty2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case LinkEditPart.VISUAL_ID: {
			LinkedList<CepappAbstractNavigatorItem> result = new LinkedList<CepappAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			CepappNavigatorGroup target = new CepappNavigatorGroup(Messages.NavigatorGroupName_Link_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CepappNavigatorGroup source = new CepappNavigatorGroup(Messages.NavigatorGroupName_Link_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(SinkMongoDBEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(InMemoryOutputEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(SinkEmailEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(OutputFileEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(SinkHttpEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(SinkMqttEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(EventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(InMemoryInputEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(SourceEmailEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(InputFileEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(SourceHttpEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(SourceMqttEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					CepappVisualIDRegistry.getType(ComplexEventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return CEPAppEditPart.MODEL_ID.equals(CepappVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<CepappNavigatorItem> createNavigatorItems(Collection<View> views, Object parent,
			boolean isLeafs) {
		ArrayList<CepappNavigatorItem> result = new ArrayList<CepappNavigatorItem>(views.size());
		for (View nextView : views) {
			result.add(new CepappNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<CepappNavigatorItem> getForeignShortcuts(Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView) && nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof CepappAbstractNavigatorItem) {
			CepappAbstractNavigatorItem abstractNavigatorItem = (CepappAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
