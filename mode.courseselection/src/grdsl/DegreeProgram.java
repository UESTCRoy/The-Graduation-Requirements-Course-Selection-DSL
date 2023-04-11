/**
 */
package grdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Degree Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link grdsl.DegreeProgram#getName <em>Name</em>}</li>
 *   <li>{@link grdsl.DegreeProgram#getDescription <em>Description</em>}</li>
 *   <li>{@link grdsl.DegreeProgram#getGraduationRequirements <em>Graduation Requirements</em>}</li>
 * </ul>
 *
 * @see grdsl.GrdslPackage#getDegreeProgram()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface DegreeProgram extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see grdsl.GrdslPackage#getDegreeProgram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link grdsl.DegreeProgram#getName <em>Name</em>}' attribute.
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
	 * @see grdsl.GrdslPackage#getDegreeProgram_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link grdsl.DegreeProgram#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Graduation Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link grdsl.GraduationRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graduation Requirements</em>' containment reference list.
	 * @see grdsl.GrdslPackage#getDegreeProgram_GraduationRequirements()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<GraduationRequirement> getGraduationRequirements();

} // DegreeProgram
