/**
 */
package grdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link grdsl.Student#getName <em>Name</em>}</li>
 *   <li>{@link grdsl.Student#getGradeLevel <em>Grade Level</em>}</li>
 *   <li>{@link grdsl.Student#getAcademicInterests <em>Academic Interests</em>}</li>
 *   <li>{@link grdsl.Student#getDesiredDegreeProgram <em>Desired Degree Program</em>}</li>
 *   <li>{@link grdsl.Student#getSelectedCourses <em>Selected Courses</em>}</li>
 * </ul>
 *
 * @see grdsl.GrdslPackage#getStudent()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Student extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see grdsl.GrdslPackage#getStudent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link grdsl.Student#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Grade Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grade Level</em>' attribute.
	 * @see #setGradeLevel(int)
	 * @see grdsl.GrdslPackage#getStudent_GradeLevel()
	 * @model
	 * @generated
	 */
	int getGradeLevel();

	/**
	 * Sets the value of the '{@link grdsl.Student#getGradeLevel <em>Grade Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grade Level</em>' attribute.
	 * @see #getGradeLevel()
	 * @generated
	 */
	void setGradeLevel(int value);

	/**
	 * Returns the value of the '<em><b>Academic Interests</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Academic Interests</em>' attribute list.
	 * @see grdsl.GrdslPackage#getStudent_AcademicInterests()
	 * @model
	 * @generated
	 */
	EList<String> getAcademicInterests();

	/**
	 * Returns the value of the '<em><b>Desired Degree Program</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desired Degree Program</em>' reference.
	 * @see #setDesiredDegreeProgram(DegreeProgram)
	 * @see grdsl.GrdslPackage#getStudent_DesiredDegreeProgram()
	 * @model annotation="gmf.link label='desiredDegreeProgram' target.decoration='arrow'"
	 * @generated
	 */
	DegreeProgram getDesiredDegreeProgram();

	/**
	 * Sets the value of the '{@link grdsl.Student#getDesiredDegreeProgram <em>Desired Degree Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desired Degree Program</em>' reference.
	 * @see #getDesiredDegreeProgram()
	 * @generated
	 */
	void setDesiredDegreeProgram(DegreeProgram value);

	/**
	 * Returns the value of the '<em><b>Selected Courses</b></em>' reference list.
	 * The list contents are of type {@link grdsl.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Courses</em>' reference list.
	 * @see grdsl.GrdslPackage#getStudent_SelectedCourses()
	 * @model annotation="gmf.link label='selectedCourses' target.decoration='arrow'"
	 * @generated
	 */
	EList<Course> getSelectedCourses();

} // Student
