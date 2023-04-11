/*
* 
*/
package grdsl.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import grdsl.diagram.edit.commands.GraduationRequirement2CreateCommand;
import grdsl.diagram.providers.GrdslElementTypes;

/**
 * @generated
 */
public class DegreeProgramDegreeProgramGraduationRequirementsCompartmentItemSemanticEditPolicy
		extends GrdslBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public DegreeProgramDegreeProgramGraduationRequirementsCompartmentItemSemanticEditPolicy() {
		super(GrdslElementTypes.DegreeProgram_2002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (GrdslElementTypes.GraduationRequirement_3001 == req.getElementType()) {
			return getGEFWrapper(new GraduationRequirement2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
