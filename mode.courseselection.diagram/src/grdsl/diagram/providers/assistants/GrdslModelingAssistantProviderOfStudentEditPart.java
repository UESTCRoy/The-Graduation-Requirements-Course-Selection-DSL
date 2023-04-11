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
import grdsl.diagram.edit.parts.DegreeProgramEditPart;
import grdsl.diagram.edit.parts.StudentEditPart;
import grdsl.diagram.providers.GrdslElementTypes;
import grdsl.diagram.providers.GrdslModelingAssistantProvider;

/**
 * @generated
 */
public class GrdslModelingAssistantProviderOfStudentEditPart extends GrdslModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((StudentEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(StudentEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(GrdslElementTypes.StudentDesiredDegreeProgram_4003);
		types.add(GrdslElementTypes.StudentSelectedCourses_4004);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((StudentEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(StudentEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof DegreeProgramEditPart) {
			types.add(GrdslElementTypes.StudentDesiredDegreeProgram_4003);
		}
		if (targetEditPart instanceof CourseEditPart) {
			types.add(GrdslElementTypes.StudentSelectedCourses_4004);
		}
		if (targetEditPart instanceof Course2EditPart) {
			types.add(GrdslElementTypes.StudentSelectedCourses_4004);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((StudentEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(StudentEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == GrdslElementTypes.StudentDesiredDegreeProgram_4003) {
			types.add(GrdslElementTypes.DegreeProgram_2002);
		} else if (relationshipType == GrdslElementTypes.StudentSelectedCourses_4004) {
			types.add(GrdslElementTypes.Course_2003);
			types.add(GrdslElementTypes.Course_3002);
		}
		return types;
	}

}
