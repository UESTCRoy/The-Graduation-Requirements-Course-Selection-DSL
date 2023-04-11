/*
* 
*/
package grdsl.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import grdsl.diagram.edit.commands.CourseDepartmentCreateCommand;
import grdsl.diagram.edit.commands.CourseDepartmentReorientCommand;
import grdsl.diagram.edit.commands.CoursePrerequisitesCreateCommand;
import grdsl.diagram.edit.commands.CoursePrerequisitesReorientCommand;
import grdsl.diagram.edit.commands.GraduationRequirementRequiredCoursesCreateCommand;
import grdsl.diagram.edit.commands.GraduationRequirementRequiredCoursesReorientCommand;
import grdsl.diagram.edit.commands.StudentSelectedCoursesCreateCommand;
import grdsl.diagram.edit.commands.StudentSelectedCoursesReorientCommand;
import grdsl.diagram.edit.commands.TeacherCoursesCreateCommand;
import grdsl.diagram.edit.commands.TeacherCoursesReorientCommand;
import grdsl.diagram.edit.parts.CourseDepartmentEditPart;
import grdsl.diagram.edit.parts.CoursePrerequisitesEditPart;
import grdsl.diagram.edit.parts.GraduationRequirementRequiredCoursesEditPart;
import grdsl.diagram.edit.parts.StudentSelectedCoursesEditPart;
import grdsl.diagram.edit.parts.TeacherCoursesEditPart;
import grdsl.diagram.part.GrdslVisualIDRegistry;
import grdsl.diagram.providers.GrdslElementTypes;

/**
 * @generated
 */
public class Course2ItemSemanticEditPolicy extends GrdslBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public Course2ItemSemanticEditPolicy() {
		super(GrdslElementTypes.Course_3002);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (GrdslVisualIDRegistry.getVisualID(incomingLink) == CoursePrerequisitesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (GrdslVisualIDRegistry.getVisualID(incomingLink) == StudentSelectedCoursesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (GrdslVisualIDRegistry
					.getVisualID(incomingLink) == GraduationRequirementRequiredCoursesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (GrdslVisualIDRegistry.getVisualID(incomingLink) == TeacherCoursesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (GrdslVisualIDRegistry.getVisualID(outgoingLink) == CoursePrerequisitesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (GrdslVisualIDRegistry.getVisualID(outgoingLink) == CourseDepartmentEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (GrdslElementTypes.CoursePrerequisites_4001 == req.getElementType()) {
			return getGEFWrapper(new CoursePrerequisitesCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (GrdslElementTypes.CourseDepartment_4002 == req.getElementType()) {
			return getGEFWrapper(new CourseDepartmentCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (GrdslElementTypes.StudentSelectedCourses_4004 == req.getElementType()) {
			return null;
		}
		if (GrdslElementTypes.GraduationRequirementRequiredCourses_4005 == req.getElementType()) {
			return null;
		}
		if (GrdslElementTypes.TeacherCourses_4006 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (GrdslElementTypes.CoursePrerequisites_4001 == req.getElementType()) {
			return getGEFWrapper(new CoursePrerequisitesCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (GrdslElementTypes.CourseDepartment_4002 == req.getElementType()) {
			return null;
		}
		if (GrdslElementTypes.StudentSelectedCourses_4004 == req.getElementType()) {
			return getGEFWrapper(new StudentSelectedCoursesCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (GrdslElementTypes.GraduationRequirementRequiredCourses_4005 == req.getElementType()) {
			return getGEFWrapper(
					new GraduationRequirementRequiredCoursesCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (GrdslElementTypes.TeacherCourses_4006 == req.getElementType()) {
			return getGEFWrapper(new TeacherCoursesCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case CoursePrerequisitesEditPart.VISUAL_ID:
			return getGEFWrapper(new CoursePrerequisitesReorientCommand(req));
		case CourseDepartmentEditPart.VISUAL_ID:
			return getGEFWrapper(new CourseDepartmentReorientCommand(req));
		case StudentSelectedCoursesEditPart.VISUAL_ID:
			return getGEFWrapper(new StudentSelectedCoursesReorientCommand(req));
		case GraduationRequirementRequiredCoursesEditPart.VISUAL_ID:
			return getGEFWrapper(new GraduationRequirementRequiredCoursesReorientCommand(req));
		case TeacherCoursesEditPart.VISUAL_ID:
			return getGEFWrapper(new TeacherCoursesReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
