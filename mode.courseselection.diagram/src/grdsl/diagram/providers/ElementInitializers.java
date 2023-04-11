/*
 * 
 */
package grdsl.diagram.providers;

import grdsl.diagram.part.GrdslDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = GrdslDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			GrdslDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
