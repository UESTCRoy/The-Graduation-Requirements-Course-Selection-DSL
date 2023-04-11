/*
 * 
 */
package grdsl.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import grdsl.Course;
import grdsl.GraduationRequirement;
import grdsl.diagram.edit.policies.GrdslBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class GraduationRequirementRequiredCoursesReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject referenceOwner;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public GraduationRequirementRequiredCoursesReorientCommand(ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == referenceOwner instanceof GraduationRequirement) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Course && newEnd instanceof GraduationRequirement)) {
			return false;
		}
		return GrdslBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistGraduationRequirementRequiredCourses_4005(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Course && newEnd instanceof Course)) {
			return false;
		}
		return GrdslBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistGraduationRequirementRequiredCourses_4005(getOldSource(), getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getRequiredCourses().remove(getOldTarget());
		getNewSource().getRequiredCourses().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getRequiredCourses().remove(getOldTarget());
		getOldSource().getRequiredCourses().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected GraduationRequirement getOldSource() {
		return (GraduationRequirement) referenceOwner;
	}

	/**
	* @generated
	*/
	protected GraduationRequirement getNewSource() {
		return (GraduationRequirement) newEnd;
	}

	/**
	* @generated
	*/
	protected Course getOldTarget() {
		return (Course) oldEnd;
	}

	/**
	* @generated
	*/
	protected Course getNewTarget() {
		return (Course) newEnd;
	}
}
