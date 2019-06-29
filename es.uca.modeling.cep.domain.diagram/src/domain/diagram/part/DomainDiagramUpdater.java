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

package domain.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import domain.CEPDomain;
import domain.Event;
import domain.EventProperty;
import domain.diagram.edit.parts.CEPDomainEditPart;
import domain.diagram.edit.parts.EventEditPart;
import domain.diagram.edit.parts.EventEventEventPropertiesCompartmentEditPart;
import domain.diagram.edit.parts.EventProperty2EditPart;
import domain.diagram.edit.parts.EventPropertyEditPart;
import domain.diagram.edit.parts.EventPropertyEventPropertyEventPropertiesCompartment2EditPart;
import domain.diagram.edit.parts.EventPropertyEventPropertyEventPropertiesCompartmentEditPart;

/**
 * @generated
 */
public class DomainDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getSemanticChildren(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case CEPDomainEditPart.VISUAL_ID:
			return getCEPDomain_1000SemanticChildren(view);
		case EventEventEventPropertiesCompartmentEditPart.VISUAL_ID:
			return getEventEventEventPropertiesCompartment_7001SemanticChildren(view);
		case EventPropertyEventPropertyEventPropertiesCompartmentEditPart.VISUAL_ID:
			return getEventPropertyEventPropertyEventPropertiesCompartment_7002SemanticChildren(view);
		case EventPropertyEventPropertyEventPropertiesCompartment2EditPart.VISUAL_ID:
			return getEventPropertyEventPropertyEventPropertiesCompartment_7003SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getCEPDomain_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CEPDomain modelElement = (CEPDomain) view.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEvents().iterator(); it.hasNext();) {
			Event childElement = (Event) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EventEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getEventEventEventPropertiesCompartment_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Event modelElement = (Event) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEventProperties().iterator(); it.hasNext();) {
			EventProperty childElement = (EventProperty) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EventPropertyEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getEventPropertyEventPropertyEventPropertiesCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		EventProperty modelElement = (EventProperty) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEventProperties().iterator(); it.hasNext();) {
			EventProperty childElement = (EventProperty) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EventProperty2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getEventPropertyEventPropertyEventPropertiesCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		EventProperty modelElement = (EventProperty) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEventProperties().iterator(); it.hasNext();) {
			EventProperty childElement = (EventProperty) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EventProperty2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getContainedLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case CEPDomainEditPart.VISUAL_ID:
			return getCEPDomain_1000ContainedLinks(view);
		case EventEditPart.VISUAL_ID:
			return getEvent_2001ContainedLinks(view);
		case EventPropertyEditPart.VISUAL_ID:
			return getEventProperty_3001ContainedLinks(view);
		case EventProperty2EditPart.VISUAL_ID:
			return getEventProperty_3002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getIncomingLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case EventEditPart.VISUAL_ID:
			return getEvent_2001IncomingLinks(view);
		case EventPropertyEditPart.VISUAL_ID:
			return getEventProperty_3001IncomingLinks(view);
		case EventProperty2EditPart.VISUAL_ID:
			return getEventProperty_3002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getOutgoingLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case EventEditPart.VISUAL_ID:
			return getEvent_2001OutgoingLinks(view);
		case EventPropertyEditPart.VISUAL_ID:
			return getEventProperty_3001OutgoingLinks(view);
		case EventProperty2EditPart.VISUAL_ID:
			return getEventProperty_3002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getCEPDomain_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getEvent_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getEventProperty_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getEventProperty_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getEvent_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getEventProperty_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getEventProperty_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getEvent_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getEventProperty_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getEventProperty_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated NOT
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated NOT
		 */
		public List<DomainNodeDescriptor> getSemanticChildren(View view) {
			return DomainDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated NOT
		 */
		public List<DomainLinkDescriptor> getContainedLinks(View view) {
			return DomainDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated NOT
		 */
		public List<DomainLinkDescriptor> getIncomingLinks(View view) {
			return DomainDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated NOT
		 */
		public List<DomainLinkDescriptor> getOutgoingLinks(View view) {
			return DomainDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
