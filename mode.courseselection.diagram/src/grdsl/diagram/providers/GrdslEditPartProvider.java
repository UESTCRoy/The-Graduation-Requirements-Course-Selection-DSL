/*
 * 
 */
package grdsl.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import grdsl.diagram.edit.parts.CourseSelectionEditPart;
import grdsl.diagram.edit.parts.GrdslEditPartFactory;
import grdsl.diagram.part.GrdslVisualIDRegistry;

/**
 * @generated
 */
public class GrdslEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public GrdslEditPartProvider() {
		super(new GrdslEditPartFactory(), GrdslVisualIDRegistry.TYPED_INSTANCE, CourseSelectionEditPart.MODEL_ID);
	}

}
