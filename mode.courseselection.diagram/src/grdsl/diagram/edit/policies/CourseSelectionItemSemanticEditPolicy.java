/*
* 
*/
package grdsl.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import grdsl.diagram.edit.commands.CourseCreateCommand;
import grdsl.diagram.edit.commands.DegreeProgramCreateCommand;
import grdsl.diagram.edit.commands.DepartmentCreateCommand;
import grdsl.diagram.edit.commands.GraduationRequirementCreateCommand;
import grdsl.diagram.edit.commands.StudentCreateCommand;
import grdsl.diagram.edit.commands.TeacherCreateCommand;
import grdsl.diagram.providers.GrdslElementTypes;

/**
 * @generated
 */
public class CourseSelectionItemSemanticEditPolicy extends GrdslBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CourseSelectionItemSemanticEditPolicy() {
		super(GrdslElementTypes.CourseSelection_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (GrdslElementTypes.Student_2001 == req.getElementType()) {
			return getGEFWrapper(new StudentCreateCommand(req));
		}
		if (GrdslElementTypes.DegreeProgram_2002 == req.getElementType()) {
			return getGEFWrapper(new DegreeProgramCreateCommand(req));
		}
		if (GrdslElementTypes.Course_2003 == req.getElementType()) {
			return getGEFWrapper(new CourseCreateCommand(req));
		}
		if (GrdslElementTypes.Department_2004 == req.getElementType()) {
			return getGEFWrapper(new DepartmentCreateCommand(req));
		}
		if (GrdslElementTypes.Teacher_2005 == req.getElementType()) {
			return getGEFWrapper(new TeacherCreateCommand(req));
		}
		if (GrdslElementTypes.GraduationRequirement_2006 == req.getElementType()) {
			return getGEFWrapper(new GraduationRequirementCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
