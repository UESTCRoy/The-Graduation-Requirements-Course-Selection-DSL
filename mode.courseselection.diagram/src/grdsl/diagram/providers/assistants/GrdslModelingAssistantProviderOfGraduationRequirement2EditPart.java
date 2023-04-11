/*
 * 
 */
package grdsl.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import grdsl.diagram.edit.parts.Course2EditPart;
import grdsl.diagram.edit.parts.CourseEditPart;
import grdsl.diagram.edit.parts.GraduationRequirement2EditPart;
import grdsl.diagram.providers.GrdslElementTypes;
import grdsl.diagram.providers.GrdslModelingAssistantProvider;

/**
 * @generated
 */
public class GrdslModelingAssistantProviderOfGraduationRequirement2EditPart extends GrdslModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((GraduationRequirement2EditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(GraduationRequirement2EditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(GrdslElementTypes.GraduationRequirementRequiredCourses_4005);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((GraduationRequirement2EditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(GraduationRequirement2EditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof CourseEditPart) {
			types.add(GrdslElementTypes.GraduationRequirementRequiredCourses_4005);
		}
		if (targetEditPart instanceof Course2EditPart) {
			types.add(GrdslElementTypes.GraduationRequirementRequiredCourses_4005);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((GraduationRequirement2EditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(GraduationRequirement2EditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == GrdslElementTypes.GraduationRequirementRequiredCourses_4005) {
			types.add(GrdslElementTypes.Course_2003);
			types.add(GrdslElementTypes.Course_3002);
		}
		return types;
	}

}
