/*
 * 
 */
package eventpattern.diagram.edit.policies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetViewMutabilityCommand;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import eventpattern.EventpatternPackage;
import eventpattern.diagram.edit.parts.Addition3EditPart;
import eventpattern.diagram.edit.parts.And3EditPart;
import eventpattern.diagram.edit.parts.Avg2EditPart;
import eventpattern.diagram.edit.parts.Count2EditPart;
import eventpattern.diagram.edit.parts.Division3EditPart;
import eventpattern.diagram.edit.parts.Equal3EditPart;
import eventpattern.diagram.edit.parts.Event3EditPart;
import eventpattern.diagram.edit.parts.EventProperty5EditPart;
import eventpattern.diagram.edit.parts.Every3EditPart;
import eventpattern.diagram.edit.parts.EveryDistinct3EditPart;
import eventpattern.diagram.edit.parts.FollowedBy3EditPart;
import eventpattern.diagram.edit.parts.GreaterEqual3EditPart;
import eventpattern.diagram.edit.parts.GreaterThan3EditPart;
import eventpattern.diagram.edit.parts.GroupBy2EditPart;
import eventpattern.diagram.edit.parts.LessEqual3EditPart;
import eventpattern.diagram.edit.parts.LessThan3EditPart;
import eventpattern.diagram.edit.parts.Max2EditPart;
import eventpattern.diagram.edit.parts.Min2EditPart;
import eventpattern.diagram.edit.parts.Modulus3EditPart;
import eventpattern.diagram.edit.parts.Multiplication3EditPart;
import eventpattern.diagram.edit.parts.Not3EditPart;
import eventpattern.diagram.edit.parts.NotEqual3EditPart;
import eventpattern.diagram.edit.parts.Or3EditPart;
import eventpattern.diagram.edit.parts.Range3EditPart;
import eventpattern.diagram.edit.parts.Repeat3EditPart;
import eventpattern.diagram.edit.parts.Subtraction3EditPart;
import eventpattern.diagram.edit.parts.Sum2EditPart;
import eventpattern.diagram.edit.parts.TimeInterval2EditPart;
import eventpattern.diagram.edit.parts.TimeSchedule2EditPart;
import eventpattern.diagram.edit.parts.Until3EditPart;
import eventpattern.diagram.edit.parts.Value3EditPart;
import eventpattern.diagram.edit.parts.While3EditPart;
import eventpattern.diagram.edit.parts.WithinTimer2EditPart;
import eventpattern.diagram.part.EventpatternDiagramUpdater;
import eventpattern.diagram.part.EventpatternNodeDescriptor;
import eventpattern.diagram.part.EventpatternVisualIDRegistry;

/**
 * @generated
 */
public class SlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartmentCanonicalEditPolicy
		extends CanonicalEditPolicy {

	/**
	 * @generated
	 */
	protected void refreshOnActivate() {
		// Need to activate editpart children before invoking the canonical refresh for EditParts to add event listeners
		List<?> c = getHost().getChildren();
		for (int i = 0; i < c.size(); i++) {
			((EditPart) c.get(i)).activate();
		}
		super.refreshOnActivate();
	}

	/**
	 * @generated
	 */
	protected EStructuralFeature getFeatureToSynchronize() {
		return EventpatternPackage.eINSTANCE.getDataWindow_EventPatternConditions();
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		LinkedList<EObject> result = new LinkedList<EObject>();
		List<EventpatternNodeDescriptor> childDescriptors = EventpatternDiagramUpdater
				.getSlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartment_7013SemanticChildren(
						viewObject);
		for (EventpatternNodeDescriptor d : childDescriptors) {
			result.add(d.getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection<EObject> semanticChildren, final View view) {
		return isMyDiagramElement(view) && !semanticChildren.contains(view.getElement());
	}

	/**
	 * @generated
	 */
	private boolean isMyDiagramElement(View view) {
		int visualID = EventpatternVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case And3EditPart.VISUAL_ID:
		case Or3EditPart.VISUAL_ID:
		case Not3EditPart.VISUAL_ID:
		case Addition3EditPart.VISUAL_ID:
		case Subtraction3EditPart.VISUAL_ID:
		case Multiplication3EditPart.VISUAL_ID:
		case Division3EditPart.VISUAL_ID:
		case Modulus3EditPart.VISUAL_ID:
		case Equal3EditPart.VISUAL_ID:
		case NotEqual3EditPart.VISUAL_ID:
		case LessThan3EditPart.VISUAL_ID:
		case GreaterThan3EditPart.VISUAL_ID:
		case LessEqual3EditPart.VISUAL_ID:
		case GreaterEqual3EditPart.VISUAL_ID:
		case Every3EditPart.VISUAL_ID:
		case EveryDistinct3EditPart.VISUAL_ID:
		case Repeat3EditPart.VISUAL_ID:
		case Until3EditPart.VISUAL_ID:
		case Range3EditPart.VISUAL_ID:
		case FollowedBy3EditPart.VISUAL_ID:
		case While3EditPart.VISUAL_ID:
		case Max2EditPart.VISUAL_ID:
		case Min2EditPart.VISUAL_ID:
		case Avg2EditPart.VISUAL_ID:
		case Count2EditPart.VISUAL_ID:
		case Sum2EditPart.VISUAL_ID:
		case Event3EditPart.VISUAL_ID:
		case EventProperty5EditPart.VISUAL_ID:
		case Value3EditPart.VISUAL_ID:
		case GroupBy2EditPart.VISUAL_ID:
		case WithinTimer2EditPart.VISUAL_ID:
		case TimeInterval2EditPart.VISUAL_ID:
		case TimeSchedule2EditPart.VISUAL_ID:
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void refreshSemantic() {
		if (resolveSemanticElement() == null) {
			return;
		}
		LinkedList<IAdaptable> createdViews = new LinkedList<IAdaptable>();
		List<EventpatternNodeDescriptor> childDescriptors = EventpatternDiagramUpdater
				.getSlidingTimeIntervalSlidingTimeIntervalEventPatternConditionsCompartment_7013SemanticChildren(
						(View) getHost().getModel());
		LinkedList<View> orphaned = new LinkedList<View>();
		// we care to check only views we recognize as ours
		LinkedList<View> knownViewChildren = new LinkedList<View>();
		for (View v : getViewChildren()) {
			if (isMyDiagramElement(v)) {
				knownViewChildren.add(v);
			}
		}
		// alternative to #cleanCanonicalSemanticChildren(getViewChildren(), semanticChildren)
		//
		// iteration happens over list of desired semantic elements, trying to find best matching View, while original CEP
		// iterates views, potentially losing view (size/bounds) information - i.e. if there are few views to reference same EObject, only last one 
		// to answer isOrphaned == true will be used for the domain element representation, see #cleanCanonicalSemanticChildren()
		for (Iterator<EventpatternNodeDescriptor> descriptorsIterator = childDescriptors.iterator(); descriptorsIterator
				.hasNext();) {
			EventpatternNodeDescriptor next = descriptorsIterator.next();
			String hint = EventpatternVisualIDRegistry.getType(next.getVisualID());
			LinkedList<View> perfectMatch = new LinkedList<View>(); // both semanticElement and hint match that of NodeDescriptor
			for (View childView : getViewChildren()) {
				EObject semanticElement = childView.getElement();
				if (next.getModelElement().equals(semanticElement)) {
					if (hint.equals(childView.getType())) {
						perfectMatch.add(childView);
						// actually, can stop iteration over view children here, but
						// may want to use not the first view but last one as a 'real' match (the way original CEP does
						// with its trick with viewToSemanticMap inside #cleanCanonicalSemanticChildren
					}
				}
			}
			if (perfectMatch.size() > 0) {
				descriptorsIterator.remove(); // precise match found no need to create anything for the NodeDescriptor
				// use only one view (first or last?), keep rest as orphaned for further consideration
				knownViewChildren.remove(perfectMatch.getFirst());
			}
		}
		// those left in knownViewChildren are subject to removal - they are our diagram elements we didn't find match to,
		// or those we have potential matches to, and thus need to be recreated, preserving size/location information.
		orphaned.addAll(knownViewChildren);
		//
		ArrayList<CreateViewRequest.ViewDescriptor> viewDescriptors = new ArrayList<CreateViewRequest.ViewDescriptor>(
				childDescriptors.size());
		for (EventpatternNodeDescriptor next : childDescriptors) {
			String hint = EventpatternVisualIDRegistry.getType(next.getVisualID());
			IAdaptable elementAdapter = new CanonicalElementAdapter(next.getModelElement(), hint);
			CreateViewRequest.ViewDescriptor descriptor = new CreateViewRequest.ViewDescriptor(elementAdapter,
					Node.class, hint, ViewUtil.APPEND, false, host().getDiagramPreferencesHint());
			viewDescriptors.add(descriptor);
		}

		boolean changed = deleteViews(orphaned.iterator());
		//
		CreateViewRequest request = getCreateViewRequest(viewDescriptors);
		Command cmd = getCreateViewCommand(request);
		if (cmd != null && cmd.canExecute()) {
			SetViewMutabilityCommand.makeMutable(new EObjectAdapter(host().getNotationView())).execute();
			executeCommand(cmd);
			@SuppressWarnings("unchecked")

			List<IAdaptable> nl = (List<IAdaptable>) request.getNewObject();
			createdViews.addAll(nl);
		}
		if (changed || createdViews.size() > 0) {
			postProcessRefreshSemantic(createdViews);
		}
		if (createdViews.size() > 1) {
			// perform a layout of the container
			DeferredLayoutCommand layoutCmd = new DeferredLayoutCommand(host().getEditingDomain(), createdViews,
					host());
			executeCommand(new ICommandProxy(layoutCmd));
		}

		makeViewsImmutable(createdViews);
	}
}
