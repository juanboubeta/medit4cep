/*
* 
*/
package cepapp.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import cepapp.diagram.part.CepappVisualIDRegistry;

/**
 * @generated
 */
public class CepappNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7008;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7007;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof CepappNavigatorItem) {
			CepappNavigatorItem item = (CepappNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return CepappVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
