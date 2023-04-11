/*
* 
*/
package grdsl.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import grdsl.Course;
import grdsl.CourseSelection;
import grdsl.DegreeProgram;
import grdsl.Department;
import grdsl.GraduationRequirement;
import grdsl.GrdslPackage;
import grdsl.Student;
import grdsl.Teacher;
import grdsl.diagram.edit.parts.Course2EditPart;
import grdsl.diagram.edit.parts.CourseDepartmentEditPart;
import grdsl.diagram.edit.parts.CourseEditPart;
import grdsl.diagram.edit.parts.CoursePrerequisitesEditPart;
import grdsl.diagram.edit.parts.CourseSelectionEditPart;
import grdsl.diagram.edit.parts.DegreeProgramDegreeProgramGraduationRequirementsCompartmentEditPart;
import grdsl.diagram.edit.parts.DegreeProgramEditPart;
import grdsl.diagram.edit.parts.DepartmentDepartmentCoursesCompartmentEditPart;
import grdsl.diagram.edit.parts.DepartmentDepartmentTeachersCompartmentEditPart;
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
import grdsl.diagram.providers.GrdslElementTypes;

/**
 * @generated
 */
public class GrdslDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<GrdslNodeDescriptor> getSemanticChildren(View view) {
		switch (GrdslVisualIDRegistry.getVisualID(view)) {
		case CourseSelectionEditPart.VISUAL_ID:
			return getCourseSelection_1000SemanticChildren(view);
		case DegreeProgramDegreeProgramGraduationRequirementsCompartmentEditPart.VISUAL_ID:
			return getDegreeProgramDegreeProgramGraduationRequirementsCompartment_7001SemanticChildren(view);
		case DepartmentDepartmentCoursesCompartmentEditPart.VISUAL_ID:
			return getDepartmentDepartmentCoursesCompartment_7002SemanticChildren(view);
		case DepartmentDepartmentTeachersCompartmentEditPart.VISUAL_ID:
			return getDepartmentDepartmentTeachersCompartment_7003SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<GrdslNodeDescriptor> getCourseSelection_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CourseSelection modelElement = (CourseSelection) view.getElement();
		LinkedList<GrdslNodeDescriptor> result = new LinkedList<GrdslNodeDescriptor>();
		for (Iterator<?> it = modelElement.getStudent().iterator(); it.hasNext();) {
			Student childElement = (Student) it.next();
			int visualID = GrdslVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == StudentEditPart.VISUAL_ID) {
				result.add(new GrdslNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getDegreePrograms().iterator(); it.hasNext();) {
			DegreeProgram childElement = (DegreeProgram) it.next();
			int visualID = GrdslVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DegreeProgramEditPart.VISUAL_ID) {
				result.add(new GrdslNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getAllCourses().iterator(); it.hasNext();) {
			Course childElement = (Course) it.next();
			int visualID = GrdslVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CourseEditPart.VISUAL_ID) {
				result.add(new GrdslNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getDepartments().iterator(); it.hasNext();) {
			Department childElement = (Department) it.next();
			int visualID = GrdslVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DepartmentEditPart.VISUAL_ID) {
				result.add(new GrdslNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTeachers().iterator(); it.hasNext();) {
			Teacher childElement = (Teacher) it.next();
			int visualID = GrdslVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == TeacherEditPart.VISUAL_ID) {
				result.add(new GrdslNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getGraduationRequirements().iterator(); it.hasNext();) {
			GraduationRequirement childElement = (GraduationRequirement) it.next();
			int visualID = GrdslVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == GraduationRequirementEditPart.VISUAL_ID) {
				result.add(new GrdslNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<GrdslNodeDescriptor> getDegreeProgramDegreeProgramGraduationRequirementsCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		DegreeProgram modelElement = (DegreeProgram) containerView.getElement();
		LinkedList<GrdslNodeDescriptor> result = new LinkedList<GrdslNodeDescriptor>();
		for (Iterator<?> it = modelElement.getGraduationRequirements().iterator(); it.hasNext();) {
			GraduationRequirement childElement = (GraduationRequirement) it.next();
			int visualID = GrdslVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == GraduationRequirement2EditPart.VISUAL_ID) {
				result.add(new GrdslNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<GrdslNodeDescriptor> getDepartmentDepartmentCoursesCompartment_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Department modelElement = (Department) containerView.getElement();
		LinkedList<GrdslNodeDescriptor> result = new LinkedList<GrdslNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCourses().iterator(); it.hasNext();) {
			Course childElement = (Course) it.next();
			int visualID = GrdslVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Course2EditPart.VISUAL_ID) {
				result.add(new GrdslNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<GrdslNodeDescriptor> getDepartmentDepartmentTeachersCompartment_7003SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Department modelElement = (Department) containerView.getElement();
		LinkedList<GrdslNodeDescriptor> result = new LinkedList<GrdslNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTeachers().iterator(); it.hasNext();) {
			Teacher childElement = (Teacher) it.next();
			int visualID = GrdslVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Teacher2EditPart.VISUAL_ID) {
				result.add(new GrdslNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<GrdslLinkDescriptor> getContainedLinks(View view) {
		switch (GrdslVisualIDRegistry.getVisualID(view)) {
		case CourseSelectionEditPart.VISUAL_ID:
			return getCourseSelection_1000ContainedLinks(view);
		case StudentEditPart.VISUAL_ID:
			return getStudent_2001ContainedLinks(view);
		case DegreeProgramEditPart.VISUAL_ID:
			return getDegreeProgram_2002ContainedLinks(view);
		case CourseEditPart.VISUAL_ID:
			return getCourse_2003ContainedLinks(view);
		case DepartmentEditPart.VISUAL_ID:
			return getDepartment_2004ContainedLinks(view);
		case TeacherEditPart.VISUAL_ID:
			return getTeacher_2005ContainedLinks(view);
		case GraduationRequirementEditPart.VISUAL_ID:
			return getGraduationRequirement_2006ContainedLinks(view);
		case GraduationRequirement2EditPart.VISUAL_ID:
			return getGraduationRequirement_3001ContainedLinks(view);
		case Course2EditPart.VISUAL_ID:
			return getCourse_3002ContainedLinks(view);
		case Teacher2EditPart.VISUAL_ID:
			return getTeacher_3003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<GrdslLinkDescriptor> getIncomingLinks(View view) {
		switch (GrdslVisualIDRegistry.getVisualID(view)) {
		case StudentEditPart.VISUAL_ID:
			return getStudent_2001IncomingLinks(view);
		case DegreeProgramEditPart.VISUAL_ID:
			return getDegreeProgram_2002IncomingLinks(view);
		case CourseEditPart.VISUAL_ID:
			return getCourse_2003IncomingLinks(view);
		case DepartmentEditPart.VISUAL_ID:
			return getDepartment_2004IncomingLinks(view);
		case TeacherEditPart.VISUAL_ID:
			return getTeacher_2005IncomingLinks(view);
		case GraduationRequirementEditPart.VISUAL_ID:
			return getGraduationRequirement_2006IncomingLinks(view);
		case GraduationRequirement2EditPart.VISUAL_ID:
			return getGraduationRequirement_3001IncomingLinks(view);
		case Course2EditPart.VISUAL_ID:
			return getCourse_3002IncomingLinks(view);
		case Teacher2EditPart.VISUAL_ID:
			return getTeacher_3003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<GrdslLinkDescriptor> getOutgoingLinks(View view) {
		switch (GrdslVisualIDRegistry.getVisualID(view)) {
		case StudentEditPart.VISUAL_ID:
			return getStudent_2001OutgoingLinks(view);
		case DegreeProgramEditPart.VISUAL_ID:
			return getDegreeProgram_2002OutgoingLinks(view);
		case CourseEditPart.VISUAL_ID:
			return getCourse_2003OutgoingLinks(view);
		case DepartmentEditPart.VISUAL_ID:
			return getDepartment_2004OutgoingLinks(view);
		case TeacherEditPart.VISUAL_ID:
			return getTeacher_2005OutgoingLinks(view);
		case GraduationRequirementEditPart.VISUAL_ID:
			return getGraduationRequirement_2006OutgoingLinks(view);
		case GraduationRequirement2EditPart.VISUAL_ID:
			return getGraduationRequirement_3001OutgoingLinks(view);
		case Course2EditPart.VISUAL_ID:
			return getCourse_3002OutgoingLinks(view);
		case Teacher2EditPart.VISUAL_ID:
			return getTeacher_3003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GrdslLinkDescriptor> getCourseSelection_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GrdslLinkDescriptor> getStudent_2001ContainedLinks(View view) {
		Student modelElement = (Student) view.getElement();
		LinkedList<GrdslLinkDescriptor> result = new LinkedList<GrdslLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Student_DesiredDegreeProgram_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Student_SelectedCourses_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GrdslLinkDescriptor> getDegreeProgram_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GrdslLinkDescriptor> getCourse_2003ContainedLinks(View view) {
		Course modelElement = (Course) view.getElement();
		LinkedList<GrdslLinkDescriptor> result = new LinkedList<GrdslLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Course_Prerequisites_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Course_Department_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GrdslLinkDescriptor> getDepartment_2004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GrdslLinkDescriptor> getTeacher_2005ContainedLinks(View view) {
		Teacher modelElement = (Teacher) view.getElement();
		LinkedList<GrdslLinkDescriptor> result = new LinkedList<GrdslLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Teacher_Courses_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GrdslLinkDescriptor> getGraduationRequirement_2006ContainedLinks(View view) {
		GraduationRequirement modelElement = (GraduationRequirement) view.getElement();
		LinkedList<GrdslLinkDescriptor> result = new LinkedList<GrdslLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_GraduationRequirement_RequiredCourses_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GrdslLinkDescriptor> getGraduationRequirement_3001ContainedLinks(View view) {
		GraduationRequirement modelElement = (GraduationRequirement) view.getElement();
		LinkedList<GrdslLinkDescriptor> result = new LinkedList<GrdslLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_GraduationRequirement_RequiredCourses_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GrdslLinkDescriptor> getCourse_3002ContainedLinks(View view) {
		Course modelElement = (Course) view.getElement();
		LinkedList<GrdslLinkDescriptor> result = new LinkedList<GrdslLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Course_Prerequisites_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Course_Department_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GrdslLinkDescriptor> getTeacher_3003ContainedLinks(View view) {
		Teacher modelElement = (Teacher) view.getElement();
		LinkedList<GrdslLinkDescriptor> result = new LinkedList<GrdslLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Teacher_Courses_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GrdslLinkDescriptor> getStudent_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GrdslLinkDescriptor> getDegreeProgram_2002IncomingLinks(View view) {
		DegreeProgram modelElement = (DegreeProgram) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GrdslLinkDescriptor> result = new LinkedList<GrdslLinkDescriptor>();
		result.addAll(
				getIncomingFeatureModelFacetLinks_Student_DesiredDegreeProgram_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GrdslLinkDescriptor> getCourse_2003IncomingLinks(View view) {
		Course modelElement = (Course) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GrdslLinkDescriptor> result = new LinkedList<GrdslLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Course_Prerequisites_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Student_SelectedCourses_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_GraduationRequirement_RequiredCourses_4005(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Teacher_Courses_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GrdslLinkDescriptor> getDepartment_2004IncomingLinks(View view) {
		Department modelElement = (Department) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GrdslLinkDescriptor> result = new LinkedList<GrdslLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Course_Department_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GrdslLinkDescriptor> getTeacher_2005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GrdslLinkDescriptor> getGraduationRequirement_2006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GrdslLinkDescriptor> getGraduationRequirement_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GrdslLinkDescriptor> getCourse_3002IncomingLinks(View view) {
		Course modelElement = (Course) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GrdslLinkDescriptor> result = new LinkedList<GrdslLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Course_Prerequisites_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Student_SelectedCourses_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_GraduationRequirement_RequiredCourses_4005(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Teacher_Courses_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GrdslLinkDescriptor> getTeacher_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GrdslLinkDescriptor> getStudent_2001OutgoingLinks(View view) {
		Student modelElement = (Student) view.getElement();
		LinkedList<GrdslLinkDescriptor> result = new LinkedList<GrdslLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Student_DesiredDegreeProgram_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Student_SelectedCourses_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GrdslLinkDescriptor> getDegreeProgram_2002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GrdslLinkDescriptor> getCourse_2003OutgoingLinks(View view) {
		Course modelElement = (Course) view.getElement();
		LinkedList<GrdslLinkDescriptor> result = new LinkedList<GrdslLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Course_Prerequisites_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Course_Department_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GrdslLinkDescriptor> getDepartment_2004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GrdslLinkDescriptor> getTeacher_2005OutgoingLinks(View view) {
		Teacher modelElement = (Teacher) view.getElement();
		LinkedList<GrdslLinkDescriptor> result = new LinkedList<GrdslLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Teacher_Courses_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GrdslLinkDescriptor> getGraduationRequirement_2006OutgoingLinks(View view) {
		GraduationRequirement modelElement = (GraduationRequirement) view.getElement();
		LinkedList<GrdslLinkDescriptor> result = new LinkedList<GrdslLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_GraduationRequirement_RequiredCourses_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GrdslLinkDescriptor> getGraduationRequirement_3001OutgoingLinks(View view) {
		GraduationRequirement modelElement = (GraduationRequirement) view.getElement();
		LinkedList<GrdslLinkDescriptor> result = new LinkedList<GrdslLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_GraduationRequirement_RequiredCourses_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GrdslLinkDescriptor> getCourse_3002OutgoingLinks(View view) {
		Course modelElement = (Course) view.getElement();
		LinkedList<GrdslLinkDescriptor> result = new LinkedList<GrdslLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Course_Prerequisites_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Course_Department_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GrdslLinkDescriptor> getTeacher_3003OutgoingLinks(View view) {
		Teacher modelElement = (Teacher) view.getElement();
		LinkedList<GrdslLinkDescriptor> result = new LinkedList<GrdslLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Teacher_Courses_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GrdslLinkDescriptor> getIncomingFeatureModelFacetLinks_Course_Prerequisites_4001(
			Course target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GrdslLinkDescriptor> result = new LinkedList<GrdslLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == GrdslPackage.eINSTANCE.getCourse_Prerequisites()) {
				result.add(new GrdslLinkDescriptor(setting.getEObject(), target,
						GrdslElementTypes.CoursePrerequisites_4001, CoursePrerequisitesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GrdslLinkDescriptor> getIncomingFeatureModelFacetLinks_Course_Department_4002(
			Department target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GrdslLinkDescriptor> result = new LinkedList<GrdslLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == GrdslPackage.eINSTANCE.getCourse_Department()) {
				result.add(new GrdslLinkDescriptor(setting.getEObject(), target,
						GrdslElementTypes.CourseDepartment_4002, CourseDepartmentEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GrdslLinkDescriptor> getIncomingFeatureModelFacetLinks_Student_DesiredDegreeProgram_4003(
			DegreeProgram target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GrdslLinkDescriptor> result = new LinkedList<GrdslLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == GrdslPackage.eINSTANCE.getStudent_DesiredDegreeProgram()) {
				result.add(new GrdslLinkDescriptor(setting.getEObject(), target,
						GrdslElementTypes.StudentDesiredDegreeProgram_4003,
						StudentDesiredDegreeProgramEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GrdslLinkDescriptor> getIncomingFeatureModelFacetLinks_Student_SelectedCourses_4004(
			Course target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GrdslLinkDescriptor> result = new LinkedList<GrdslLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == GrdslPackage.eINSTANCE.getStudent_SelectedCourses()) {
				result.add(new GrdslLinkDescriptor(setting.getEObject(), target,
						GrdslElementTypes.StudentSelectedCourses_4004, StudentSelectedCoursesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GrdslLinkDescriptor> getIncomingFeatureModelFacetLinks_GraduationRequirement_RequiredCourses_4005(
			Course target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GrdslLinkDescriptor> result = new LinkedList<GrdslLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == GrdslPackage.eINSTANCE.getGraduationRequirement_RequiredCourses()) {
				result.add(new GrdslLinkDescriptor(setting.getEObject(), target,
						GrdslElementTypes.GraduationRequirementRequiredCourses_4005,
						GraduationRequirementRequiredCoursesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GrdslLinkDescriptor> getIncomingFeatureModelFacetLinks_Teacher_Courses_4006(Course target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GrdslLinkDescriptor> result = new LinkedList<GrdslLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == GrdslPackage.eINSTANCE.getTeacher_Courses()) {
				result.add(new GrdslLinkDescriptor(setting.getEObject(), target, GrdslElementTypes.TeacherCourses_4006,
						TeacherCoursesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<GrdslLinkDescriptor> getOutgoingFeatureModelFacetLinks_Course_Prerequisites_4001(
			Course source) {
		LinkedList<GrdslLinkDescriptor> result = new LinkedList<GrdslLinkDescriptor>();
		for (Iterator<?> destinations = source.getPrerequisites().iterator(); destinations.hasNext();) {
			Course destination = (Course) destinations.next();
			result.add(new GrdslLinkDescriptor(source, destination, GrdslElementTypes.CoursePrerequisites_4001,
					CoursePrerequisitesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<GrdslLinkDescriptor> getOutgoingFeatureModelFacetLinks_Course_Department_4002(
			Course source) {
		LinkedList<GrdslLinkDescriptor> result = new LinkedList<GrdslLinkDescriptor>();
		Department destination = source.getDepartment();
		if (destination == null) {
			return result;
		}
		result.add(new GrdslLinkDescriptor(source, destination, GrdslElementTypes.CourseDepartment_4002,
				CourseDepartmentEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<GrdslLinkDescriptor> getOutgoingFeatureModelFacetLinks_Student_DesiredDegreeProgram_4003(
			Student source) {
		LinkedList<GrdslLinkDescriptor> result = new LinkedList<GrdslLinkDescriptor>();
		DegreeProgram destination = source.getDesiredDegreeProgram();
		if (destination == null) {
			return result;
		}
		result.add(new GrdslLinkDescriptor(source, destination, GrdslElementTypes.StudentDesiredDegreeProgram_4003,
				StudentDesiredDegreeProgramEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<GrdslLinkDescriptor> getOutgoingFeatureModelFacetLinks_Student_SelectedCourses_4004(
			Student source) {
		LinkedList<GrdslLinkDescriptor> result = new LinkedList<GrdslLinkDescriptor>();
		for (Iterator<?> destinations = source.getSelectedCourses().iterator(); destinations.hasNext();) {
			Course destination = (Course) destinations.next();
			result.add(new GrdslLinkDescriptor(source, destination, GrdslElementTypes.StudentSelectedCourses_4004,
					StudentSelectedCoursesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<GrdslLinkDescriptor> getOutgoingFeatureModelFacetLinks_GraduationRequirement_RequiredCourses_4005(
			GraduationRequirement source) {
		LinkedList<GrdslLinkDescriptor> result = new LinkedList<GrdslLinkDescriptor>();
		for (Iterator<?> destinations = source.getRequiredCourses().iterator(); destinations.hasNext();) {
			Course destination = (Course) destinations.next();
			result.add(new GrdslLinkDescriptor(source, destination,
					GrdslElementTypes.GraduationRequirementRequiredCourses_4005,
					GraduationRequirementRequiredCoursesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<GrdslLinkDescriptor> getOutgoingFeatureModelFacetLinks_Teacher_Courses_4006(
			Teacher source) {
		LinkedList<GrdslLinkDescriptor> result = new LinkedList<GrdslLinkDescriptor>();
		for (Iterator<?> destinations = source.getCourses().iterator(); destinations.hasNext();) {
			Course destination = (Course) destinations.next();
			result.add(new GrdslLinkDescriptor(source, destination, GrdslElementTypes.TeacherCourses_4006,
					TeacherCoursesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<GrdslNodeDescriptor> getSemanticChildren(View view) {
			return GrdslDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<GrdslLinkDescriptor> getContainedLinks(View view) {
			return GrdslDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<GrdslLinkDescriptor> getIncomingLinks(View view) {
			return GrdslDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<GrdslLinkDescriptor> getOutgoingLinks(View view) {
			return GrdslDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
