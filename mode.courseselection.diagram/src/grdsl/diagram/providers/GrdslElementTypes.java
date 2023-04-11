/*
 * 
 */
package grdsl.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import grdsl.GrdslPackage;
import grdsl.diagram.edit.parts.Course2EditPart;
import grdsl.diagram.edit.parts.CourseDepartmentEditPart;
import grdsl.diagram.edit.parts.CourseEditPart;
import grdsl.diagram.edit.parts.CoursePrerequisitesEditPart;
import grdsl.diagram.edit.parts.CourseSelectionEditPart;
import grdsl.diagram.edit.parts.DegreeProgramEditPart;
import grdsl.diagram.edit.parts.DepartmentEditPart;
import grdsl.diagram.edit.parts.GraduationRequirement2EditPart;
import grdsl.diagram.edit.parts.GraduationRequirementEditPart;
import grdsl.diagram.edit.parts.GraduationRequirementRequiredCoursesEditPart;
import grdsl.diagram.edit.parts.StudentDesiredDegreeProgramEditPart;
import grdsl.diagram.edit.parts.StudentEditPart;
import grdsl.diagram.edit.parts.StudentSelectedCoursesEditPart;
import grdsl.diagram.edit.parts.Teacher2EditPart;
import grdsl.diagram.edit.parts.TeacherCoursesEditPart;
import grdsl.diagram.edit.parts.TeacherEditPart;
import grdsl.diagram.part.GrdslDiagramEditorPlugin;

/**
 * @generated
 */
public class GrdslElementTypes {

	/**
	* @generated
	*/
	private GrdslElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			GrdslDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType CourseSelection_1000 = getElementType(
			"mode.courseselection.diagram.CourseSelection_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Student_2001 = getElementType("mode.courseselection.diagram.Student_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DegreeProgram_2002 = getElementType(
			"mode.courseselection.diagram.DegreeProgram_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Course_2003 = getElementType("mode.courseselection.diagram.Course_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Department_2004 = getElementType("mode.courseselection.diagram.Department_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Teacher_2005 = getElementType("mode.courseselection.diagram.Teacher_2005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GraduationRequirement_2006 = getElementType(
			"mode.courseselection.diagram.GraduationRequirement_2006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GraduationRequirement_3001 = getElementType(
			"mode.courseselection.diagram.GraduationRequirement_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Course_3002 = getElementType("mode.courseselection.diagram.Course_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Teacher_3003 = getElementType("mode.courseselection.diagram.Teacher_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CoursePrerequisites_4001 = getElementType(
			"mode.courseselection.diagram.CoursePrerequisites_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CourseDepartment_4002 = getElementType(
			"mode.courseselection.diagram.CourseDepartment_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType StudentDesiredDegreeProgram_4003 = getElementType(
			"mode.courseselection.diagram.StudentDesiredDegreeProgram_4003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType StudentSelectedCourses_4004 = getElementType(
			"mode.courseselection.diagram.StudentSelectedCourses_4004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GraduationRequirementRequiredCourses_4005 = getElementType(
			"mode.courseselection.diagram.GraduationRequirementRequiredCourses_4005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TeacherCourses_4006 = getElementType(
			"mode.courseselection.diagram.TeacherCourses_4006"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(CourseSelection_1000, GrdslPackage.eINSTANCE.getCourseSelection());

			elements.put(Student_2001, GrdslPackage.eINSTANCE.getStudent());

			elements.put(DegreeProgram_2002, GrdslPackage.eINSTANCE.getDegreeProgram());

			elements.put(Course_2003, GrdslPackage.eINSTANCE.getCourse());

			elements.put(Department_2004, GrdslPackage.eINSTANCE.getDepartment());

			elements.put(Teacher_2005, GrdslPackage.eINSTANCE.getTeacher());

			elements.put(GraduationRequirement_2006, GrdslPackage.eINSTANCE.getGraduationRequirement());

			elements.put(GraduationRequirement_3001, GrdslPackage.eINSTANCE.getGraduationRequirement());

			elements.put(Course_3002, GrdslPackage.eINSTANCE.getCourse());

			elements.put(Teacher_3003, GrdslPackage.eINSTANCE.getTeacher());

			elements.put(CoursePrerequisites_4001, GrdslPackage.eINSTANCE.getCourse_Prerequisites());

			elements.put(CourseDepartment_4002, GrdslPackage.eINSTANCE.getCourse_Department());

			elements.put(StudentDesiredDegreeProgram_4003, GrdslPackage.eINSTANCE.getStudent_DesiredDegreeProgram());

			elements.put(StudentSelectedCourses_4004, GrdslPackage.eINSTANCE.getStudent_SelectedCourses());

			elements.put(GraduationRequirementRequiredCourses_4005,
					GrdslPackage.eINSTANCE.getGraduationRequirement_RequiredCourses());

			elements.put(TeacherCourses_4006, GrdslPackage.eINSTANCE.getTeacher_Courses());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(CourseSelection_1000);
			KNOWN_ELEMENT_TYPES.add(Student_2001);
			KNOWN_ELEMENT_TYPES.add(DegreeProgram_2002);
			KNOWN_ELEMENT_TYPES.add(Course_2003);
			KNOWN_ELEMENT_TYPES.add(Department_2004);
			KNOWN_ELEMENT_TYPES.add(Teacher_2005);
			KNOWN_ELEMENT_TYPES.add(GraduationRequirement_2006);
			KNOWN_ELEMENT_TYPES.add(GraduationRequirement_3001);
			KNOWN_ELEMENT_TYPES.add(Course_3002);
			KNOWN_ELEMENT_TYPES.add(Teacher_3003);
			KNOWN_ELEMENT_TYPES.add(CoursePrerequisites_4001);
			KNOWN_ELEMENT_TYPES.add(CourseDepartment_4002);
			KNOWN_ELEMENT_TYPES.add(StudentDesiredDegreeProgram_4003);
			KNOWN_ELEMENT_TYPES.add(StudentSelectedCourses_4004);
			KNOWN_ELEMENT_TYPES.add(GraduationRequirementRequiredCourses_4005);
			KNOWN_ELEMENT_TYPES.add(TeacherCourses_4006);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case CourseSelectionEditPart.VISUAL_ID:
			return CourseSelection_1000;
		case StudentEditPart.VISUAL_ID:
			return Student_2001;
		case DegreeProgramEditPart.VISUAL_ID:
			return DegreeProgram_2002;
		case CourseEditPart.VISUAL_ID:
			return Course_2003;
		case DepartmentEditPart.VISUAL_ID:
			return Department_2004;
		case TeacherEditPart.VISUAL_ID:
			return Teacher_2005;
		case GraduationRequirementEditPart.VISUAL_ID:
			return GraduationRequirement_2006;
		case GraduationRequirement2EditPart.VISUAL_ID:
			return GraduationRequirement_3001;
		case Course2EditPart.VISUAL_ID:
			return Course_3002;
		case Teacher2EditPart.VISUAL_ID:
			return Teacher_3003;
		case CoursePrerequisitesEditPart.VISUAL_ID:
			return CoursePrerequisites_4001;
		case CourseDepartmentEditPart.VISUAL_ID:
			return CourseDepartment_4002;
		case StudentDesiredDegreeProgramEditPart.VISUAL_ID:
			return StudentDesiredDegreeProgram_4003;
		case StudentSelectedCoursesEditPart.VISUAL_ID:
			return StudentSelectedCourses_4004;
		case GraduationRequirementRequiredCoursesEditPart.VISUAL_ID:
			return GraduationRequirementRequiredCourses_4005;
		case TeacherCoursesEditPart.VISUAL_ID:
			return TeacherCourses_4006;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return grdsl.diagram.providers.GrdslElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return grdsl.diagram.providers.GrdslElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return grdsl.diagram.providers.GrdslElementTypes.getElement(elementTypeAdapter);
		}
	};

}
