/*
* 
*/
package grdsl.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import grdsl.diagram.edit.commands.Teacher2CreateCommand;
import grdsl.diagram.providers.GrdslElementTypes;

/**
 * @generated
 */
public class DepartmentDepartmentTeachersCompartmentItemSemanticEditPolicy extends GrdslBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public DepartmentDepartmentTeachersCompartmentItemSemanticEditPolicy() {
		super(GrdslElementTypes.Department_2004);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (GrdslElementTypes.Teacher_3003 == req.getElementType()) {
			return getGEFWrapper(new Teacher2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
