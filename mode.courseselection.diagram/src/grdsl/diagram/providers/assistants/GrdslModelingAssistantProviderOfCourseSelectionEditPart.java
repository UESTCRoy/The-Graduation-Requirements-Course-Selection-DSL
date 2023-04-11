/*
 * 
 */
package grdsl.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import grdsl.diagram.providers.GrdslElementTypes;
import grdsl.diagram.providers.GrdslModelingAssistantProvider;

/**
 * @generated
 */
public class GrdslModelingAssistantProviderOfCourseSelectionEditPart extends GrdslModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(6);
		types.add(GrdslElementTypes.Student_2001);
		types.add(GrdslElementTypes.DegreeProgram_2002);
		types.add(GrdslElementTypes.Course_2003);
		types.add(GrdslElementTypes.Department_2004);
		types.add(GrdslElementTypes.Teacher_2005);
		types.add(GrdslElementTypes.GraduationRequirement_2006);
		return types;
	}

}
