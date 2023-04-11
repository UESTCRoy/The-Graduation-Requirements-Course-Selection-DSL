/*
* 
*/
package grdsl.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import grdsl.diagram.part.GrdslVisualIDRegistry;

/**
 * @generated
 */
public class GrdslNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7005;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7004;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof GrdslNavigatorItem) {
			GrdslNavigatorItem item = (GrdslNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return GrdslVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
