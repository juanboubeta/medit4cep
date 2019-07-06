/*
 * 
 */
package eventpattern.diagram.navigator;

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

import eventpattern.diagram.edit.parts.*;
import eventpattern.diagram.part.EventpatternVisualIDRegistry;
import eventpattern.diagram.part.Messages;

/**
 * @generated
 */
public class EventpatternNavigatorContentProvider implements ICommonContentProvider {

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
	public EventpatternNavigatorContentProvider() {
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
			ArrayList<EventpatternNavigatorItem> result = new ArrayList<EventpatternNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(
					createNavigatorItems(selectViewsByType(topViews, CEPEventPatternEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof EventpatternNavigatorGroup) {
			EventpatternNavigatorGroup group = (EventpatternNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof EventpatternNavigatorItem) {
			EventpatternNavigatorItem navigatorItem = (EventpatternNavigatorItem) parentElement;
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
		switch (EventpatternVisualIDRegistry.getVisualID(view)) {

		case CEPEventPatternEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			EventpatternNavigatorGroup links = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_CEPEventPattern_1000_links, "icons/linksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(AndEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(OrEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(NotEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(AdditionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(SubtractionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(MultiplicationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(DivisionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(ModulusEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(EqualEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(NotEqualEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LessThanEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(GreaterThanEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LessEqualEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(GreaterEqualEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(EveryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(EveryDistinctEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(RepeatEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(UntilEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(RangeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(FollowedByEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(WhileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(MaxEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(MinEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(AvgEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(CountEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(SumEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(EventEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(EventPropertyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(ValueEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(GroupByEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(WithinTimerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(TimeIntervalEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(TimeScheduleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(EmailEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(TwitterEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(SlidingEventIntervalEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(BatchingEventIntervalEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(SlidingTimeIntervalEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(BatchingTimeIntervalEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(ComplexEventEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(SmartContractEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case AndEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_And_2001_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_And_2001_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case OrEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Or_2002_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Or_2002_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case NotEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Not_2003_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Not_2003_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case AdditionEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Addition_2004_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Addition_2004_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SubtractionEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Subtraction_2005_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Subtraction_2005_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case MultiplicationEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Multiplication_2006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Multiplication_2006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DivisionEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Division_2007_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Division_2007_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ModulusEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Modulus_2008_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Modulus_2008_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case EqualEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Equal_2009_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Equal_2009_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case NotEqualEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_NotEqual_2010_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_NotEqual_2010_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case LessThanEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_LessThan_2011_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_LessThan_2011_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case GreaterThanEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_GreaterThan_2012_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_GreaterThan_2012_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case LessEqualEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_LessEqual_2013_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_LessEqual_2013_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case GreaterEqualEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_GreaterEqual_2014_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_GreaterEqual_2014_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case EveryEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Every_2015_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Every_2015_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case EveryDistinctEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_EveryDistinct_2016_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_EveryDistinct_2016_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RepeatEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Repeat_2017_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Repeat_2017_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case UntilEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Until_2018_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Until_2018_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RangeEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Range_2019_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Range_2019_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case FollowedByEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_FollowedBy_2020_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_FollowedBy_2020_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case WhileEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_While_2021_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_While_2021_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case MaxEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Max_2022_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Max_2022_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case MinEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Min_2023_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Min_2023_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case AvgEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Avg_2024_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Avg_2024_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CountEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Count_2025_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Count_2025_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case SumEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Sum_2026_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Sum_2026_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case EventEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Event_2027_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(EventEventEventPropertiesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(EventProperty2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case EventPropertyEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_EventProperty_2028_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(EventPropertyEventPropertyEventPropertiesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(EventProperty3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ValueEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Value_2029_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case WithinTimerEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_WithinTimer_2030_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(And2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Or2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Not2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Addition2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Subtraction2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Multiplication2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Division2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Modulus2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Equal2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(NotEqual2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(LessThan2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(GreaterThan2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(LessEqual2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(GreaterEqual2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Every2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(EveryDistinct2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Repeat2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Until2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Range2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(FollowedBy2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Event2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(EventProperty4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Value2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TimeIntervalEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_TimeInterval_2031_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TimeScheduleEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_TimeSchedule_2032_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case EmailEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Email_2033_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case SlidingEventIntervalEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(And3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Or3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Not3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Addition3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Subtraction3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Multiplication3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Division3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Modulus3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Equal3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(NotEqual3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(LessThan3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(GreaterThan3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(LessEqual3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(GreaterEqual3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Every3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(EveryDistinct3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Repeat3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Until3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Range3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(FollowedBy3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Max2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Min2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Avg2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Count2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Sum2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Event3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(EventProperty5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Value3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(GroupBy2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(WithinTimer2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(TimeInterval2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingEventIntervalSlidingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(TimeSchedule2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case BatchingEventIntervalEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(And3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Or3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Not3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Addition3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Subtraction3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Multiplication3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Division3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Modulus3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Equal3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(NotEqual3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(LessThan3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(GreaterThan3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(LessEqual3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(GreaterEqual3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Every3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(EveryDistinct3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Repeat3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Until3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Range3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(FollowedBy3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Max2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Min2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Avg2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Count2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Sum2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Event3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(EventProperty5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Value3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(GroupBy2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(WithinTimer2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(TimeInterval2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingEventIntervalBatchingEventIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(TimeSchedule2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case SlidingTimeIntervalEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(And3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Or3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Not3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Addition3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Subtraction3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Multiplication3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Division3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Modulus3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Equal3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(NotEqual3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(LessThan3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(GreaterThan3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(LessEqual3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(GreaterEqual3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Every3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(EveryDistinct3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Repeat3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Until3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Range3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(FollowedBy3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Max2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Min2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Avg2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Count2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Sum2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Event3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(EventProperty5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Value3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(GroupBy2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(WithinTimer2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(TimeInterval2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(TimeSchedule2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case BatchingTimeIntervalEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(And3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Or3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Not3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Addition3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Subtraction3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Multiplication3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Division3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Modulus3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Equal3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(NotEqual3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(LessThan3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(GreaterThan3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(LessEqual3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(GreaterEqual3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Every3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(EveryDistinct3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Repeat3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Until3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Range3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(FollowedBy3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Max2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Min2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Avg2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Count2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Sum2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Event3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(EventProperty5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Value3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(GroupBy2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(WithinTimer2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(TimeInterval2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry.getType(
					BatchingTimeIntervalBatchingTimeIntervalEventPatternConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(TimeSchedule2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case ComplexEventEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_ComplexEvent_2038_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_ComplexEvent_2038_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(ComplexEventComplexEventComplexEventPropertiesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(ComplexEventPropertyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TwitterEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Twitter_2039_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case GroupByEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_GroupBy_2040_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case SmartContractEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_SmartContract_2041_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(SmartContractSmartContractSmartContractPropertiesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(ContractFunctionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case EventProperty2EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_EventProperty_3001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(EventPropertyEventPropertyEventPropertiesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(EventProperty3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case EventProperty3EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_EventProperty_3002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(EventPropertyEventPropertyEventPropertiesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(EventProperty3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case And2EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_And_3003_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_And_3003_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Or2EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Or_3004_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Or_3004_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Not2EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Not_3005_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Not_3005_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Addition2EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Addition_3006_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Addition_3006_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Subtraction2EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Subtraction_3007_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Subtraction_3007_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Multiplication2EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Multiplication_3008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Multiplication_3008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Division2EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Division_3009_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Division_3009_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Modulus2EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Modulus_3010_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Modulus_3010_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Equal2EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Equal_3011_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Equal_3011_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case NotEqual2EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_NotEqual_3012_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_NotEqual_3012_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case LessThan2EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_LessThan_3013_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_LessThan_3013_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case GreaterThan2EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_GreaterThan_3014_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_GreaterThan_3014_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case LessEqual2EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_LessEqual_3015_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_LessEqual_3015_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case GreaterEqual2EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_GreaterEqual_3016_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_GreaterEqual_3016_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Every2EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Every_3017_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Every_3017_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case EveryDistinct2EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_EveryDistinct_3018_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_EveryDistinct_3018_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Repeat2EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Repeat_3019_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Repeat_3019_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Until2EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Until_3020_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Until_3020_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Range2EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Range_3021_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Range_3021_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case FollowedBy2EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_FollowedBy_3022_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_FollowedBy_3022_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case While2EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_While_3023_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_While_3023_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Event2EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Event_3024_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(EventEventEventPropertiesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(EventProperty2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case EventProperty4EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_EventProperty_3025_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(EventPropertyEventPropertyEventPropertiesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(EventProperty3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Value2EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Value_3026_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case And3EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_And_3027_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_And_3027_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Or3EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Or_3028_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Or_3028_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Not3EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Not_3029_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Not_3029_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Addition3EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Addition_3030_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Addition_3030_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Subtraction3EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Subtraction_3031_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Subtraction_3031_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Multiplication3EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Multiplication_3032_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Multiplication_3032_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Division3EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Division_3033_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Division_3033_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Modulus3EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Modulus_3034_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Modulus_3034_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Equal3EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Equal_3035_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Equal_3035_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case NotEqual3EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_NotEqual_3036_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_NotEqual_3036_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case LessThan3EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_LessThan_3037_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_LessThan_3037_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case GreaterThan3EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_GreaterThan_3038_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_GreaterThan_3038_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case LessEqual3EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_LessEqual_3039_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_LessEqual_3039_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case GreaterEqual3EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_GreaterEqual_3040_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_GreaterEqual_3040_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Every3EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Every_3041_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Every_3041_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case EveryDistinct3EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_EveryDistinct_3042_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_EveryDistinct_3042_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Repeat3EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Repeat_3043_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Repeat_3043_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Until3EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Until_3044_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Until_3044_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Range3EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Range_3045_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Range_3045_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case FollowedBy3EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_FollowedBy_3046_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_FollowedBy_3046_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case While3EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_While_3047_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_While_3047_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Max2EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Max_3048_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Max_3048_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Min2EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Min_3049_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Min_3049_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Avg2EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Avg_3050_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Avg_3050_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Count2EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Count_3051_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Count_3051_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Sum2EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Sum_3052_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Sum_3052_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Event3EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Event_3053_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(EventEventEventPropertiesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(EventProperty2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case EventProperty5EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_EventProperty_3054_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(EventPropertyEventPropertyEventPropertiesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(EventProperty3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Value3EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Value_3055_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case WithinTimer2EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_WithinTimer_3056_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(And2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Or2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Not2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Addition2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Subtraction2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Multiplication2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Division2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Modulus2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Equal2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(NotEqual2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(LessThan2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(GreaterThan2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(LessEqual2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(GreaterEqual2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Every2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(EveryDistinct2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Repeat2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Until2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Range2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(FollowedBy2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Event2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(EventProperty4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(Value2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TimeInterval2EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_TimeInterval_3057_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TimeSchedule2EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup outgoinglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_TimeSchedule_3058_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ComplexEventPropertyEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_ComplexEventProperty_3059_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case GroupBy2EditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			EventpatternNavigatorGroup incominglinks = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_GroupBy_3060_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ContractFunctionEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(ContractFunctionContractFunctionInputParametersFunctionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(InputParameterEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), EventpatternVisualIDRegistry
					.getType(ContractFunctionContractFunctionOutputParametersFunctionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EventpatternVisualIDRegistry.getType(OutputParameterEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case LinkEditPart.VISUAL_ID: {
			LinkedList<EventpatternAbstractNavigatorItem> result = new LinkedList<EventpatternAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EventpatternNavigatorGroup target = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Link_4001_target, "icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EventpatternNavigatorGroup source = new EventpatternNavigatorGroup(
					Messages.NavigatorGroupName_Link_4001_source, "icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(AndEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(OrEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(NotEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(AdditionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(SubtractionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(MultiplicationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(DivisionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(ModulusEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(EqualEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(NotEqualEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LessThanEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(GreaterThanEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LessEqualEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(GreaterEqualEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(EveryEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(EveryDistinctEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(RepeatEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(UntilEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(RangeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(FollowedByEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(WhileEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(MaxEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(MinEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(AvgEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(CountEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(SumEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(GroupByEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(EmailEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(TwitterEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(ComplexEventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(SmartContractEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(And2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Or2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Not2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Addition2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Subtraction2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Multiplication2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Division2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Modulus2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Equal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(NotEqual2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LessThan2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(GreaterThan2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LessEqual2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(GreaterEqual2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Every2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(EveryDistinct2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Repeat2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Until2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Range2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(FollowedBy2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(And3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Or3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Not3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Addition3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Subtraction3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Multiplication3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Division3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Modulus3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Equal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(NotEqual3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LessThan3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(GreaterThan3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LessEqual3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(GreaterEqual3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Every3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(EveryDistinct3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Repeat3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Until3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Range3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(FollowedBy3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Max2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Min2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Avg2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Count2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Sum2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(GroupBy2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(ComplexEventPropertyEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(AndEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(OrEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(NotEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(AdditionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(SubtractionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(MultiplicationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(DivisionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(ModulusEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(EqualEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(NotEqualEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LessThanEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(GreaterThanEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LessEqualEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(GreaterEqualEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(EveryEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(EveryDistinctEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(RepeatEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(UntilEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(RangeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(FollowedByEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(WhileEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(MaxEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(MinEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(AvgEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(CountEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(SumEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(EventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(EventPropertyEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(ValueEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(WithinTimerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(TimeIntervalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(TimeScheduleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(ComplexEventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(EventProperty2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(EventProperty3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(And2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Or2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Not2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Addition2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Subtraction2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Multiplication2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Division2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Modulus2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Equal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(NotEqual2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LessThan2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(GreaterThan2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LessEqual2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(GreaterEqual2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Every2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(EveryDistinct2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Repeat2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Until2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Range2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(FollowedBy2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(While2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Event2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(EventProperty4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Value2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(And3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Or3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Not3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Addition3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Subtraction3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Multiplication3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Division3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Modulus3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Equal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(NotEqual3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LessThan3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(GreaterThan3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(LessEqual3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(GreaterEqual3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Every3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(EveryDistinct3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Repeat3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Until3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Range3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(FollowedBy3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(While3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Max2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Min2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Avg2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Count2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Sum2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Event3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(EventProperty5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(Value3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(WithinTimer2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(TimeInterval2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EventpatternVisualIDRegistry.getType(TimeSchedule2EditPart.VISUAL_ID));
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
		return CEPEventPatternEditPart.MODEL_ID.equals(EventpatternVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<EventpatternNavigatorItem> createNavigatorItems(Collection<View> views, Object parent,
			boolean isLeafs) {
		ArrayList<EventpatternNavigatorItem> result = new ArrayList<EventpatternNavigatorItem>(views.size());
		for (View nextView : views) {
			result.add(new EventpatternNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<EventpatternNavigatorItem> getForeignShortcuts(Diagram diagram, Object parent) {
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
		if (element instanceof EventpatternAbstractNavigatorItem) {
			EventpatternAbstractNavigatorItem abstractNavigatorItem = (EventpatternAbstractNavigatorItem) element;
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
