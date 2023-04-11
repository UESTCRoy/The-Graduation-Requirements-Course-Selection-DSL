/*
 * 
 */
package grdsl.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import grdsl.diagram.part.GrdslVisualIDRegistry;

/**
 * @generated
 */
public class GrdslEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (GrdslVisualIDRegistry.getVisualID(view)) {

			case CourseSelectionEditPart.VISUAL_ID:
				return new CourseSelectionEditPart(view);

			case StudentEditPart.VISUAL_ID:
				return new StudentEditPart(view);

			case StudentNameEditPart.VISUAL_ID:
				return new StudentNameEditPart(view);

			case DegreeProgramEditPart.VISUAL_ID:
				return new DegreeProgramEditPart(view);

			case DegreeProgramNameEditPart.VISUAL_ID:
				return new DegreeProgramNameEditPart(view);

			case CourseEditPart.VISUAL_ID:
				return new CourseEditPart(view);

			case CourseNameEditPart.VISUAL_ID:
				return new CourseNameEditPart(view);

			case DepartmentEditPart.VISUAL_ID:
				return new DepartmentEditPart(view);

			case DepartmentNameEditPart.VISUAL_ID:
				return new DepartmentNameEditPart(view);

			case TeacherEditPart.VISUAL_ID:
				return new TeacherEditPart(view);

			case TeacherNameEditPart.VISUAL_ID:
				return new TeacherNameEditPart(view);

			case GraduationRequirementEditPart.VISUAL_ID:
				return new GraduationRequirementEditPart(view);

			case GraduationRequirementNameEditPart.VISUAL_ID:
				return new GraduationRequirementNameEditPart(view);

			case GraduationRequirement2EditPart.VISUAL_ID:
				return new GraduationRequirement2EditPart(view);

			case GraduationRequirementName2EditPart.VISUAL_ID:
				return new GraduationRequirementName2EditPart(view);

			case Course2EditPart.VISUAL_ID:
				return new Course2EditPart(view);

			case CourseName2EditPart.VISUAL_ID:
				return new CourseName2EditPart(view);

			case Teacher2EditPart.VISUAL_ID:
				return new Teacher2EditPart(view);

			case TeacherName2EditPart.VISUAL_ID:
				return new TeacherName2EditPart(view);

			case DegreeProgramDegreeProgramGraduationRequirementsCompartmentEditPart.VISUAL_ID:
				return new DegreeProgramDegreeProgramGraduationRequirementsCompartmentEditPart(view);

			case DepartmentDepartmentCoursesCompartmentEditPart.VISUAL_ID:
				return new DepartmentDepartmentCoursesCompartmentEditPart(view);

			case DepartmentDepartmentTeachersCompartmentEditPart.VISUAL_ID:
				return new DepartmentDepartmentTeachersCompartmentEditPart(view);

			case CoursePrerequisitesEditPart.VISUAL_ID:
				return new CoursePrerequisitesEditPart(view);

			case CoursePrerequisitesExternalLabelEditPart.VISUAL_ID:
				return new CoursePrerequisitesExternalLabelEditPart(view);

			case CourseDepartmentEditPart.VISUAL_ID:
				return new CourseDepartmentEditPart(view);

			case CourseDepartmentExternalLabelEditPart.VISUAL_ID:
				return new CourseDepartmentExternalLabelEditPart(view);

			case StudentDesiredDegreeProgramEditPart.VISUAL_ID:
				return new StudentDesiredDegreeProgramEditPart(view);

			case StudentDesiredDegreeProgramExternalLabelEditPart.VISUAL_ID:
				return new StudentDesiredDegreeProgramExternalLabelEditPart(view);

			case StudentSelectedCoursesEditPart.VISUAL_ID:
				return new StudentSelectedCoursesEditPart(view);

			case StudentSelectedCoursesExternalLabelEditPart.VISUAL_ID:
				return new StudentSelectedCoursesExternalLabelEditPart(view);

			case GraduationRequirementRequiredCoursesEditPart.VISUAL_ID:
				return new GraduationRequirementRequiredCoursesEditPart(view);

			case GraduationRequirementRequiredCoursesExternalLabelEditPart.VISUAL_ID:
				return new GraduationRequirementRequiredCoursesExternalLabelEditPart(view);

			case TeacherCoursesEditPart.VISUAL_ID:
				return new TeacherCoursesEditPart(view);

			case TeacherCoursesExternalLabelEditPart.VISUAL_ID:
				return new TeacherCoursesExternalLabelEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
