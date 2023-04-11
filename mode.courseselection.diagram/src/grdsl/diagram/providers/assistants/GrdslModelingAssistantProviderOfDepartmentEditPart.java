/*
 * 
 */
package grdsl.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import grdsl.diagram.edit.parts.DepartmentEditPart;
import grdsl.diagram.providers.GrdslElementTypes;
import grdsl.diagram.providers.GrdslModelingAssistantProvider;

/**
 * @generated
 */
public class GrdslModelingAssistantProviderOfDepartmentEditPart extends GrdslModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((DepartmentEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(DepartmentEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(GrdslElementTypes.CourseDepartment_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((DepartmentEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(DepartmentEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == GrdslElementTypes.CourseDepartment_4002) {
			types.add(GrdslElementTypes.Course_2003);
			types.add(GrdslElementTypes.Course_3002);
		}
		return types;
	}

}
