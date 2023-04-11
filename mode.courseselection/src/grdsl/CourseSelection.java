/**
 */
package grdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link grdsl.CourseSelection#getStudent <em>Student</em>}</li>
 *   <li>{@link grdsl.CourseSelection#getDegreePrograms <em>Degree Programs</em>}</li>
 *   <li>{@link grdsl.CourseSelection#getAllCourses <em>All Courses</em>}</li>
 *   <li>{@link grdsl.CourseSelection#getDepartments <em>Departments</em>}</li>
 *   <li>{@link grdsl.CourseSelection#getTeachers <em>Teachers</em>}</li>
 *   <li>{@link grdsl.CourseSelection#getGraduationRequirements <em>Graduation Requirements</em>}</li>
 * </ul>
 *
 * @see grdsl.GrdslPackage#getCourseSelection()
 * @model annotation="gmf.diagram"
 * @generated
 */
public interface CourseSelection extends EObject {
	/**
	 * Returns the value of the '<em><b>Student</b></em>' containment reference list.
	 * The list contents are of type {@link grdsl.Student}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student</em>' containment reference list.
	 * @see grdsl.GrdslPackage#getCourseSelection_Student()
	 * @model containment="true"
	 * @generated
	 */
	EList<Student> getStudent();

	/**
	 * Returns the value of the '<em><b>Degree Programs</b></em>' containment reference list.
	 * The list contents are of type {@link grdsl.DegreeProgram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degree Programs</em>' containment reference list.
	 * @see grdsl.GrdslPackage#getCourseSelection_DegreePrograms()
	 * @model containment="true"
	 * @generated
	 */
	EList<DegreeProgram> getDegreePrograms();

	/**
	 * Returns the value of the '<em><b>All Courses</b></em>' containment reference list.
	 * The list contents are of type {@link grdsl.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Courses</em>' containment reference list.
	 * @see grdsl.GrdslPackage#getCourseSelection_AllCourses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getAllCourses();

	/**
	 * Returns the value of the '<em><b>Departments</b></em>' containment reference list.
	 * The list contents are of type {@link grdsl.Department}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departments</em>' containment reference list.
	 * @see grdsl.GrdslPackage#getCourseSelection_Departments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Department> getDepartments();

	/**
	 * Returns the value of the '<em><b>Teachers</b></em>' containment reference list.
	 * The list contents are of type {@link grdsl.Teacher}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teachers</em>' containment reference list.
	 * @see grdsl.GrdslPackage#getCourseSelection_Teachers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Teacher> getTeachers();

	/**
	 * Returns the value of the '<em><b>Graduation Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link grdsl.GraduationRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graduation Requirements</em>' containment reference list.
	 * @see grdsl.GrdslPackage#getCourseSelection_GraduationRequirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<GraduationRequirement> getGraduationRequirements();

} // CourseSelection
