/**
 */
package grdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link grdsl.Course#getCourseID <em>Course ID</em>}</li>
 *   <li>{@link grdsl.Course#getName <em>Name</em>}</li>
 *   <li>{@link grdsl.Course#getDescription <em>Description</em>}</li>
 *   <li>{@link grdsl.Course#getCreditHours <em>Credit Hours</em>}</li>
 *   <li>{@link grdsl.Course#getPrerequisites <em>Prerequisites</em>}</li>
 *   <li>{@link grdsl.Course#getParentCourse <em>Parent Course</em>}</li>
 *   <li>{@link grdsl.Course#getTeacher <em>Teacher</em>}</li>
 *   <li>{@link grdsl.Course#getDepartment <em>Department</em>}</li>
 * </ul>
 *
 * @see grdsl.GrdslPackage#getCourse()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Course ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course ID</em>' attribute.
	 * @see #setCourseID(String)
	 * @see grdsl.GrdslPackage#getCourse_CourseID()
	 * @model
	 * @generated
	 */
	String getCourseID();

	/**
	 * Sets the value of the '{@link grdsl.Course#getCourseID <em>Course ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course ID</em>' attribute.
	 * @see #getCourseID()
	 * @generated
	 */
	void setCourseID(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see grdsl.GrdslPackage#getCourse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link grdsl.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see grdsl.GrdslPackage#getCourse_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link grdsl.Course#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Credit Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit Hours</em>' attribute.
	 * @see #setCreditHours(int)
	 * @see grdsl.GrdslPackage#getCourse_CreditHours()
	 * @model
	 * @generated
	 */
	int getCreditHours();

	/**
	 * Sets the value of the '{@link grdsl.Course#getCreditHours <em>Credit Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit Hours</em>' attribute.
	 * @see #getCreditHours()
	 * @generated
	 */
	void setCreditHours(int value);

	/**
	 * Returns the value of the '<em><b>Prerequisites</b></em>' reference list.
	 * The list contents are of type {@link grdsl.Course}.
	 * It is bidirectional and its opposite is '{@link grdsl.Course#getParentCourse <em>Parent Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prerequisites</em>' reference list.
	 * @see grdsl.GrdslPackage#getCourse_Prerequisites()
	 * @see grdsl.Course#getParentCourse
	 * @model opposite="parentCourse"
	 *        annotation="gmf.link label='prerequisites' target.decoration='arrow'"
	 * @generated
	 */
	EList<Course> getPrerequisites();

	/**
	 * Returns the value of the '<em><b>Parent Course</b></em>' reference list.
	 * The list contents are of type {@link grdsl.Course}.
	 * It is bidirectional and its opposite is '{@link grdsl.Course#getPrerequisites <em>Prerequisites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Course</em>' reference list.
	 * @see grdsl.GrdslPackage#getCourse_ParentCourse()
	 * @see grdsl.Course#getPrerequisites
	 * @model opposite="prerequisites"
	 * @generated
	 */
	EList<Course> getParentCourse();

	/**
	 * Returns the value of the '<em><b>Teacher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teacher</em>' reference.
	 * @see #setTeacher(Teacher)
	 * @see grdsl.GrdslPackage#getCourse_Teacher()
	 * @model
	 * @generated
	 */
	Teacher getTeacher();

	/**
	 * Sets the value of the '{@link grdsl.Course#getTeacher <em>Teacher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teacher</em>' reference.
	 * @see #getTeacher()
	 * @generated
	 */
	void setTeacher(Teacher value);

	/**
	 * Returns the value of the '<em><b>Department</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Department</em>' reference.
	 * @see #setDepartment(Department)
	 * @see grdsl.GrdslPackage#getCourse_Department()
	 * @model annotation="gmf.link label='belongTo' target.decoration='arrow'"
	 * @generated
	 */
	Department getDepartment();

	/**
	 * Sets the value of the '{@link grdsl.Course#getDepartment <em>Department</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Department</em>' reference.
	 * @see #getDepartment()
	 * @generated
	 */
	void setDepartment(Department value);

} // Course
