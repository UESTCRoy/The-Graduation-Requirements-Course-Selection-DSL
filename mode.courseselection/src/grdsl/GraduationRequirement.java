/**
 */
package grdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graduation Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link grdsl.GraduationRequirement#getName <em>Name</em>}</li>
 *   <li>{@link grdsl.GraduationRequirement#getMinimumCreditHours <em>Minimum Credit Hours</em>}</li>
 *   <li>{@link grdsl.GraduationRequirement#getRequiredCourses <em>Required Courses</em>}</li>
 *   <li>{@link grdsl.GraduationRequirement#getRequiredCourseCategories <em>Required Course Categories</em>}</li>
 * </ul>
 *
 * @see grdsl.GrdslPackage#getGraduationRequirement()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface GraduationRequirement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see grdsl.GrdslPackage#getGraduationRequirement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link grdsl.GraduationRequirement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Minimum Credit Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Credit Hours</em>' attribute.
	 * @see #setMinimumCreditHours(int)
	 * @see grdsl.GrdslPackage#getGraduationRequirement_MinimumCreditHours()
	 * @model
	 * @generated
	 */
	int getMinimumCreditHours();

	/**
	 * Sets the value of the '{@link grdsl.GraduationRequirement#getMinimumCreditHours <em>Minimum Credit Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Credit Hours</em>' attribute.
	 * @see #getMinimumCreditHours()
	 * @generated
	 */
	void setMinimumCreditHours(int value);

	/**
	 * Returns the value of the '<em><b>Required Courses</b></em>' reference list.
	 * The list contents are of type {@link grdsl.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Courses</em>' reference list.
	 * @see grdsl.GrdslPackage#getGraduationRequirement_RequiredCourses()
	 * @model annotation="gmf.link label='requiredCourse' target.decoration='arrow'"
	 * @generated
	 */
	EList<Course> getRequiredCourses();

	/**
	 * Returns the value of the '<em><b>Required Course Categories</b></em>' attribute list.
	 * The list contents are of type {@link grdsl.CourseCategory}.
	 * The literals are from the enumeration {@link grdsl.CourseCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Course Categories</em>' attribute list.
	 * @see grdsl.CourseCategory
	 * @see grdsl.GrdslPackage#getGraduationRequirement_RequiredCourseCategories()
	 * @model
	 * @generated
	 */
	EList<CourseCategory> getRequiredCourseCategories();

} // GraduationRequirement
