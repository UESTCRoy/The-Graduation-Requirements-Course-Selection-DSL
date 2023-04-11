/*
* 
*/
package grdsl.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import grdsl.CourseSelection;
import grdsl.GrdslPackage;
import grdsl.diagram.edit.parts.Course2EditPart;
import grdsl.diagram.edit.parts.CourseDepartmentEditPart;
import grdsl.diagram.edit.parts.CourseDepartmentExternalLabelEditPart;
import grdsl.diagram.edit.parts.CourseEditPart;
import grdsl.diagram.edit.parts.CourseName2EditPart;
import grdsl.diagram.edit.parts.CourseNameEditPart;
import grdsl.diagram.edit.parts.CoursePrerequisitesEditPart;
import grdsl.diagram.edit.parts.CoursePrerequisitesExternalLabelEditPart;
import grdsl.diagram.edit.parts.CourseSelectionEditPart;
import grdsl.diagram.edit.parts.DegreeProgramDegreeProgramGraduationRequirementsCompartmentEditPart;
import grdsl.diagram.edit.parts.DegreeProgramEditPart;
import grdsl.diagram.edit.parts.DegreeProgramNameEditPart;
import grdsl.diagram.edit.parts.DepartmentDepartmentCoursesCompartmentEditPart;
import grdsl.diagram.edit.parts.DepartmentDepartmentTeachersCompartmentEditPart;
import grdsl.diagram.edit.parts.DepartmentEditPart;
import grdsl.diagram.edit.parts.DepartmentNameEditPart;
import grdsl.diagram.edit.parts.GraduationRequirement2EditPart;
import grdsl.diagram.edit.parts.GraduationRequirementEditPart;
import grdsl.diagram.edit.parts.GraduationRequirementName2EditPart;
import grdsl.diagram.edit.parts.GraduationRequirementNameEditPart;
import grdsl.diagram.edit.parts.GraduationRequirementRequiredCoursesEditPart;
import grdsl.diagram.edit.parts.GraduationRequirementRequiredCoursesExternalLabelEditPart;
import grdsl.diagram.edit.parts.StudentDesiredDegreeProgramEditPart;
import grdsl.diagram.edit.parts.StudentDesiredDegreeProgramExternalLabelEditPart;
import grdsl.diagram.edit.parts.StudentEditPart;
import grdsl.diagram.edit.parts.StudentNameEditPart;
import grdsl.diagram.edit.parts.StudentSelectedCoursesEditPart;
import grdsl.diagram.edit.parts.StudentSelectedCoursesExternalLabelEditPart;
import grdsl.diagram.edit.parts.Teacher2EditPart;
import grdsl.diagram.edit.parts.TeacherCoursesEditPart;
import grdsl.diagram.edit.parts.TeacherCoursesExternalLabelEditPart;
import grdsl.diagram.edit.parts.TeacherEditPart;
import grdsl.diagram.edit.parts.TeacherName2EditPart;
import grdsl.diagram.edit.parts.TeacherNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class GrdslVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "mode.courseselection.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (CourseSelectionEditPart.MODEL_ID.equals(view.getType())) {
				return CourseSelectionEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return grdsl.diagram.part.GrdslVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				GrdslDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (GrdslPackage.eINSTANCE.getCourseSelection().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((CourseSelection) domainElement)) {
			return CourseSelectionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = grdsl.diagram.part.GrdslVisualIDRegistry.getModelID(containerView);
		if (!CourseSelectionEditPart.MODEL_ID.equals(containerModelID) && !"grdsl".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (CourseSelectionEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = grdsl.diagram.part.GrdslVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CourseSelectionEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case CourseSelectionEditPart.VISUAL_ID:
			if (GrdslPackage.eINSTANCE.getStudent().isSuperTypeOf(domainElement.eClass())) {
				return StudentEditPart.VISUAL_ID;
			}
			if (GrdslPackage.eINSTANCE.getDegreeProgram().isSuperTypeOf(domainElement.eClass())) {
				return DegreeProgramEditPart.VISUAL_ID;
			}
			if (GrdslPackage.eINSTANCE.getCourse().isSuperTypeOf(domainElement.eClass())) {
				return CourseEditPart.VISUAL_ID;
			}
			if (GrdslPackage.eINSTANCE.getDepartment().isSuperTypeOf(domainElement.eClass())) {
				return DepartmentEditPart.VISUAL_ID;
			}
			if (GrdslPackage.eINSTANCE.getTeacher().isSuperTypeOf(domainElement.eClass())) {
				return TeacherEditPart.VISUAL_ID;
			}
			if (GrdslPackage.eINSTANCE.getGraduationRequirement().isSuperTypeOf(domainElement.eClass())) {
				return GraduationRequirementEditPart.VISUAL_ID;
			}
			break;
		case DegreeProgramDegreeProgramGraduationRequirementsCompartmentEditPart.VISUAL_ID:
			if (GrdslPackage.eINSTANCE.getGraduationRequirement().isSuperTypeOf(domainElement.eClass())) {
				return GraduationRequirement2EditPart.VISUAL_ID;
			}
			break;
		case DepartmentDepartmentCoursesCompartmentEditPart.VISUAL_ID:
			if (GrdslPackage.eINSTANCE.getCourse().isSuperTypeOf(domainElement.eClass())) {
				return Course2EditPart.VISUAL_ID;
			}
			break;
		case DepartmentDepartmentTeachersCompartmentEditPart.VISUAL_ID:
			if (GrdslPackage.eINSTANCE.getTeacher().isSuperTypeOf(domainElement.eClass())) {
				return Teacher2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = grdsl.diagram.part.GrdslVisualIDRegistry.getModelID(containerView);
		if (!CourseSelectionEditPart.MODEL_ID.equals(containerModelID) && !"grdsl".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (CourseSelectionEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = grdsl.diagram.part.GrdslVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CourseSelectionEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case CourseSelectionEditPart.VISUAL_ID:
			if (StudentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DegreeProgramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CourseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DepartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TeacherEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GraduationRequirementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StudentEditPart.VISUAL_ID:
			if (StudentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DegreeProgramEditPart.VISUAL_ID:
			if (DegreeProgramNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DegreeProgramDegreeProgramGraduationRequirementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CourseEditPart.VISUAL_ID:
			if (CourseNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DepartmentEditPart.VISUAL_ID:
			if (DepartmentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DepartmentDepartmentCoursesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DepartmentDepartmentTeachersCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TeacherEditPart.VISUAL_ID:
			if (TeacherNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GraduationRequirementEditPart.VISUAL_ID:
			if (GraduationRequirementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GraduationRequirement2EditPart.VISUAL_ID:
			if (GraduationRequirementName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Course2EditPart.VISUAL_ID:
			if (CourseName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Teacher2EditPart.VISUAL_ID:
			if (TeacherName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DegreeProgramDegreeProgramGraduationRequirementsCompartmentEditPart.VISUAL_ID:
			if (GraduationRequirement2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DepartmentDepartmentCoursesCompartmentEditPart.VISUAL_ID:
			if (Course2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DepartmentDepartmentTeachersCompartmentEditPart.VISUAL_ID:
			if (Teacher2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CoursePrerequisitesEditPart.VISUAL_ID:
			if (CoursePrerequisitesExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CourseDepartmentEditPart.VISUAL_ID:
			if (CourseDepartmentExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StudentDesiredDegreeProgramEditPart.VISUAL_ID:
			if (StudentDesiredDegreeProgramExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StudentSelectedCoursesEditPart.VISUAL_ID:
			if (StudentSelectedCoursesExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GraduationRequirementRequiredCoursesEditPart.VISUAL_ID:
			if (GraduationRequirementRequiredCoursesExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TeacherCoursesEditPart.VISUAL_ID:
			if (TeacherCoursesExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(CourseSelection element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case DegreeProgramDegreeProgramGraduationRequirementsCompartmentEditPart.VISUAL_ID:
		case DepartmentDepartmentCoursesCompartmentEditPart.VISUAL_ID:
		case DepartmentDepartmentTeachersCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case CourseSelectionEditPart.VISUAL_ID:
			return false;
		case StudentEditPart.VISUAL_ID:
		case CourseEditPart.VISUAL_ID:
		case TeacherEditPart.VISUAL_ID:
		case GraduationRequirementEditPart.VISUAL_ID:
		case GraduationRequirement2EditPart.VISUAL_ID:
		case Course2EditPart.VISUAL_ID:
		case Teacher2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return grdsl.diagram.part.GrdslVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return grdsl.diagram.part.GrdslVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return grdsl.diagram.part.GrdslVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return grdsl.diagram.part.GrdslVisualIDRegistry.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return grdsl.diagram.part.GrdslVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return grdsl.diagram.part.GrdslVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
