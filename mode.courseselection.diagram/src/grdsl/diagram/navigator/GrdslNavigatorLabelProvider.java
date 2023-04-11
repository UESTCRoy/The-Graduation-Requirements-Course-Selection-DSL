/*
* 
*/
package grdsl.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import grdsl.diagram.edit.parts.Course2EditPart;
import grdsl.diagram.edit.parts.CourseDepartmentEditPart;
import grdsl.diagram.edit.parts.CourseEditPart;
import grdsl.diagram.edit.parts.CourseName2EditPart;
import grdsl.diagram.edit.parts.CourseNameEditPart;
import grdsl.diagram.edit.parts.CoursePrerequisitesEditPart;
import grdsl.diagram.edit.parts.CourseSelectionEditPart;
import grdsl.diagram.edit.parts.DegreeProgramEditPart;
import grdsl.diagram.edit.parts.DegreeProgramNameEditPart;
import grdsl.diagram.edit.parts.DepartmentEditPart;
import grdsl.diagram.edit.parts.DepartmentNameEditPart;
import grdsl.diagram.edit.parts.GraduationRequirement2EditPart;
import grdsl.diagram.edit.parts.GraduationRequirementEditPart;
import grdsl.diagram.edit.parts.GraduationRequirementName2EditPart;
import grdsl.diagram.edit.parts.GraduationRequirementNameEditPart;
import grdsl.diagram.edit.parts.GraduationRequirementRequiredCoursesEditPart;
import grdsl.diagram.edit.parts.StudentDesiredDegreeProgramEditPart;
import grdsl.diagram.edit.parts.StudentEditPart;
import grdsl.diagram.edit.parts.StudentNameEditPart;
import grdsl.diagram.edit.parts.StudentSelectedCoursesEditPart;
import grdsl.diagram.edit.parts.Teacher2EditPart;
import grdsl.diagram.edit.parts.TeacherCoursesEditPart;
import grdsl.diagram.edit.parts.TeacherEditPart;
import grdsl.diagram.edit.parts.TeacherName2EditPart;
import grdsl.diagram.edit.parts.TeacherNameEditPart;
import grdsl.diagram.part.GrdslDiagramEditorPlugin;
import grdsl.diagram.part.GrdslVisualIDRegistry;
import grdsl.diagram.providers.GrdslElementTypes;
import grdsl.diagram.providers.GrdslParserProvider;

/**
 * @generated
 */
public class GrdslNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		GrdslDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		GrdslDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof GrdslNavigatorItem && !isOwnView(((GrdslNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof GrdslNavigatorGroup) {
			GrdslNavigatorGroup group = (GrdslNavigatorGroup) element;
			return GrdslDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof GrdslNavigatorItem) {
			GrdslNavigatorItem navigatorItem = (GrdslNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (GrdslVisualIDRegistry.getVisualID(view)) {
		case CourseSelectionEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?grdsl?CourseSelection", GrdslElementTypes.CourseSelection_1000); //$NON-NLS-1$
		case StudentEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?grdsl?Student", GrdslElementTypes.Student_2001); //$NON-NLS-1$
		case DegreeProgramEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?grdsl?DegreeProgram", GrdslElementTypes.DegreeProgram_2002); //$NON-NLS-1$
		case CourseEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?grdsl?Course", GrdslElementTypes.Course_2003); //$NON-NLS-1$
		case DepartmentEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?grdsl?Department", GrdslElementTypes.Department_2004); //$NON-NLS-1$
		case TeacherEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?grdsl?Teacher", GrdslElementTypes.Teacher_2005); //$NON-NLS-1$
		case GraduationRequirementEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?grdsl?GraduationRequirement", //$NON-NLS-1$
					GrdslElementTypes.GraduationRequirement_2006);
		case GraduationRequirement2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?grdsl?GraduationRequirement", GrdslElementTypes.GraduationRequirement_3001); //$NON-NLS-1$
		case Course2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?grdsl?Course", GrdslElementTypes.Course_3002); //$NON-NLS-1$
		case Teacher2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?grdsl?Teacher", GrdslElementTypes.Teacher_3003); //$NON-NLS-1$
		case CoursePrerequisitesEditPart.VISUAL_ID:
			return getImage("Navigator?Link?grdsl?Course?prerequisites", GrdslElementTypes.CoursePrerequisites_4001); //$NON-NLS-1$
		case CourseDepartmentEditPart.VISUAL_ID:
			return getImage("Navigator?Link?grdsl?Course?department", GrdslElementTypes.CourseDepartment_4002); //$NON-NLS-1$
		case StudentDesiredDegreeProgramEditPart.VISUAL_ID:
			return getImage("Navigator?Link?grdsl?Student?desiredDegreeProgram", //$NON-NLS-1$
					GrdslElementTypes.StudentDesiredDegreeProgram_4003);
		case StudentSelectedCoursesEditPart.VISUAL_ID:
			return getImage("Navigator?Link?grdsl?Student?selectedCourses", //$NON-NLS-1$
					GrdslElementTypes.StudentSelectedCourses_4004);
		case GraduationRequirementRequiredCoursesEditPart.VISUAL_ID:
			return getImage("Navigator?Link?grdsl?GraduationRequirement?requiredCourses", //$NON-NLS-1$
					GrdslElementTypes.GraduationRequirementRequiredCourses_4005);
		case TeacherCoursesEditPart.VISUAL_ID:
			return getImage("Navigator?Link?grdsl?Teacher?courses", GrdslElementTypes.TeacherCourses_4006); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = GrdslDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && GrdslElementTypes.isKnownElementType(elementType)) {
			image = GrdslElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof GrdslNavigatorGroup) {
			GrdslNavigatorGroup group = (GrdslNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof GrdslNavigatorItem) {
			GrdslNavigatorItem navigatorItem = (GrdslNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (GrdslVisualIDRegistry.getVisualID(view)) {
		case CourseSelectionEditPart.VISUAL_ID:
			return getCourseSelection_1000Text(view);
		case StudentEditPart.VISUAL_ID:
			return getStudent_2001Text(view);
		case DegreeProgramEditPart.VISUAL_ID:
			return getDegreeProgram_2002Text(view);
		case CourseEditPart.VISUAL_ID:
			return getCourse_2003Text(view);
		case DepartmentEditPart.VISUAL_ID:
			return getDepartment_2004Text(view);
		case TeacherEditPart.VISUAL_ID:
			return getTeacher_2005Text(view);
		case GraduationRequirementEditPart.VISUAL_ID:
			return getGraduationRequirement_2006Text(view);
		case GraduationRequirement2EditPart.VISUAL_ID:
			return getGraduationRequirement_3001Text(view);
		case Course2EditPart.VISUAL_ID:
			return getCourse_3002Text(view);
		case Teacher2EditPart.VISUAL_ID:
			return getTeacher_3003Text(view);
		case CoursePrerequisitesEditPart.VISUAL_ID:
			return getCoursePrerequisites_4001Text(view);
		case CourseDepartmentEditPart.VISUAL_ID:
			return getCourseDepartment_4002Text(view);
		case StudentDesiredDegreeProgramEditPart.VISUAL_ID:
			return getStudentDesiredDegreeProgram_4003Text(view);
		case StudentSelectedCoursesEditPart.VISUAL_ID:
			return getStudentSelectedCourses_4004Text(view);
		case GraduationRequirementRequiredCoursesEditPart.VISUAL_ID:
			return getGraduationRequirementRequiredCourses_4005Text(view);
		case TeacherCoursesEditPart.VISUAL_ID:
			return getTeacherCourses_4006Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getCourseSelection_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getStudent_2001Text(View view) {
		IParser parser = GrdslParserProvider.getParser(GrdslElementTypes.Student_2001,
				view.getElement() != null ? view.getElement() : view,
				GrdslVisualIDRegistry.getType(StudentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GrdslDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDegreeProgram_2002Text(View view) {
		IParser parser = GrdslParserProvider.getParser(GrdslElementTypes.DegreeProgram_2002,
				view.getElement() != null ? view.getElement() : view,
				GrdslVisualIDRegistry.getType(DegreeProgramNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GrdslDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCourse_2003Text(View view) {
		IParser parser = GrdslParserProvider.getParser(GrdslElementTypes.Course_2003,
				view.getElement() != null ? view.getElement() : view,
				GrdslVisualIDRegistry.getType(CourseNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GrdslDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDepartment_2004Text(View view) {
		IParser parser = GrdslParserProvider.getParser(GrdslElementTypes.Department_2004,
				view.getElement() != null ? view.getElement() : view,
				GrdslVisualIDRegistry.getType(DepartmentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GrdslDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTeacher_2005Text(View view) {
		IParser parser = GrdslParserProvider.getParser(GrdslElementTypes.Teacher_2005,
				view.getElement() != null ? view.getElement() : view,
				GrdslVisualIDRegistry.getType(TeacherNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GrdslDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGraduationRequirement_2006Text(View view) {
		IParser parser = GrdslParserProvider.getParser(GrdslElementTypes.GraduationRequirement_2006,
				view.getElement() != null ? view.getElement() : view,
				GrdslVisualIDRegistry.getType(GraduationRequirementNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GrdslDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGraduationRequirement_3001Text(View view) {
		IParser parser = GrdslParserProvider.getParser(GrdslElementTypes.GraduationRequirement_3001,
				view.getElement() != null ? view.getElement() : view,
				GrdslVisualIDRegistry.getType(GraduationRequirementName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GrdslDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCourse_3002Text(View view) {
		IParser parser = GrdslParserProvider.getParser(GrdslElementTypes.Course_3002,
				view.getElement() != null ? view.getElement() : view,
				GrdslVisualIDRegistry.getType(CourseName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GrdslDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTeacher_3003Text(View view) {
		IParser parser = GrdslParserProvider.getParser(GrdslElementTypes.Teacher_3003,
				view.getElement() != null ? view.getElement() : view,
				GrdslVisualIDRegistry.getType(TeacherName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GrdslDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCoursePrerequisites_4001Text(View view) {
		IParser parser = GrdslParserProvider.getParser(GrdslElementTypes.CoursePrerequisites_4001,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GrdslDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCourseDepartment_4002Text(View view) {
		IParser parser = GrdslParserProvider.getParser(GrdslElementTypes.CourseDepartment_4002,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GrdslDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getStudentDesiredDegreeProgram_4003Text(View view) {
		IParser parser = GrdslParserProvider.getParser(GrdslElementTypes.StudentDesiredDegreeProgram_4003,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GrdslDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getStudentSelectedCourses_4004Text(View view) {
		IParser parser = GrdslParserProvider.getParser(GrdslElementTypes.StudentSelectedCourses_4004,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GrdslDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGraduationRequirementRequiredCourses_4005Text(View view) {
		IParser parser = GrdslParserProvider.getParser(GrdslElementTypes.GraduationRequirementRequiredCourses_4005,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GrdslDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTeacherCourses_4006Text(View view) {
		IParser parser = GrdslParserProvider.getParser(GrdslElementTypes.TeacherCourses_4006,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GrdslDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return CourseSelectionEditPart.MODEL_ID.equals(GrdslVisualIDRegistry.getModelID(view));
	}

}
