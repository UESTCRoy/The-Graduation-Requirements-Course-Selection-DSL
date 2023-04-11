/*
* 
*/
package grdsl.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import grdsl.diagram.edit.commands.Course2CreateCommand;
import grdsl.diagram.providers.GrdslElementTypes;

/**
 * @generated
 */
public class DepartmentDepartmentCoursesCompartmentItemSemanticEditPolicy extends GrdslBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public DepartmentDepartmentCoursesCompartmentItemSemanticEditPolicy() {
		super(GrdslElementTypes.Department_2004);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (GrdslElementTypes.Course_3002 == req.getElementType()) {
			return getGEFWrapper(new Course2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
