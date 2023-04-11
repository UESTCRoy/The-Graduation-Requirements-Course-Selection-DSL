/*
* 
*/
package grdsl.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import grdsl.diagram.providers.GrdslElementTypes;

/**
 * @generated
 */
public class StudentSelectedCoursesItemSemanticEditPolicy extends GrdslBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public StudentSelectedCoursesItemSemanticEditPolicy() {
		super(GrdslElementTypes.StudentSelectedCourses_4004);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
