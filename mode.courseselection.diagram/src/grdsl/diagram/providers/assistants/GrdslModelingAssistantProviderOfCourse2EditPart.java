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
import grdsl.diagram.edit.parts.DepartmentEditPart;
import grdsl.diagram.providers.GrdslElementTypes;
import grdsl.diagram.providers.GrdslModelingAssistantProvider;

/**
 * @generated
 */
public class GrdslModelingAssistantProviderOfCourse2EditPart extends GrdslModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((Course2EditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(Course2EditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(GrdslElementTypes.CoursePrerequisites_4001);
		types.add(GrdslElementTypes.CourseDepartment_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((Course2EditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(Course2EditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof CourseEditPart) {
			types.add(GrdslElementTypes.CoursePrerequisites_4001);
		}
		if (targetEditPart instanceof Course2EditPart) {
			types.add(GrdslElementTypes.CoursePrerequisites_4001);
		}
		if (targetEditPart instanceof DepartmentEditPart) {
			types.add(GrdslElementTypes.CourseDepartment_4002);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((Course2EditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(Course2EditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == GrdslElementTypes.CoursePrerequisites_4001) {
			types.add(GrdslElementTypes.Course_2003);
			types.add(GrdslElementTypes.Course_3002);
		} else if (relationshipType == GrdslElementTypes.CourseDepartment_4002) {
			types.add(GrdslElementTypes.Department_2004);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((Course2EditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(Course2EditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(GrdslElementTypes.CoursePrerequisites_4001);
		types.add(GrdslElementTypes.StudentSelectedCourses_4004);
		types.add(GrdslElementTypes.GraduationRequirementRequiredCourses_4005);
		types.add(GrdslElementTypes.TeacherCourses_4006);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((Course2EditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(Course2EditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == GrdslElementTypes.CoursePrerequisites_4001) {
			types.add(GrdslElementTypes.Course_2003);
			types.add(GrdslElementTypes.Course_3002);
		} else if (relationshipType == GrdslElementTypes.StudentSelectedCourses_4004) {
			types.add(GrdslElementTypes.Student_2001);
		} else if (relationshipType == GrdslElementTypes.GraduationRequirementRequiredCourses_4005) {
			types.add(GrdslElementTypes.GraduationRequirement_2006);
			types.add(GrdslElementTypes.GraduationRequirement_3001);
		} else if (relationshipType == GrdslElementTypes.TeacherCourses_4006) {
			types.add(GrdslElementTypes.Teacher_2005);
			types.add(GrdslElementTypes.Teacher_3003);
		}
		return types;
	}

}
