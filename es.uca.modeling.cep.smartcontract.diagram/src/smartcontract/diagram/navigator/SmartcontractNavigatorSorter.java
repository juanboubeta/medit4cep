/*
* 
*/
package smartcontract.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import smartcontract.diagram.part.SmartcontractVisualIDRegistry;

/**
 * @generated
 */
public class SmartcontractNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7012;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7011;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof SmartcontractNavigatorItem) {
			SmartcontractNavigatorItem item = (SmartcontractNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return SmartcontractVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
