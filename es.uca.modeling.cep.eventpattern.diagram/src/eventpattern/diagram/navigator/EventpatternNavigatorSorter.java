/*
 * 
 */
package eventpattern.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import eventpattern.diagram.part.EventpatternVisualIDRegistry;

/**
 * @generated
 */
public class EventpatternNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7020;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 7019;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof EventpatternNavigatorItem) {
			EventpatternNavigatorItem item = (EventpatternNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return EventpatternVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
