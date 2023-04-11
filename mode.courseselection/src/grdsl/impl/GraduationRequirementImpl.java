/**
 */
package grdsl.impl;

import grdsl.Course;
import grdsl.CourseCategory;
import grdsl.GraduationRequirement;
import grdsl.GrdslPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graduation Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link grdsl.impl.GraduationRequirementImpl#getName <em>Name</em>}</li>
 *   <li>{@link grdsl.impl.GraduationRequirementImpl#getMinimumCreditHours <em>Minimum Credit Hours</em>}</li>
 *   <li>{@link grdsl.impl.GraduationRequirementImpl#getRequiredCourses <em>Required Courses</em>}</li>
 *   <li>{@link grdsl.impl.GraduationRequirementImpl#getRequiredCourseCategories <em>Required Course Categories</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraduationRequirementImpl extends EObjectImpl implements GraduationRequirement {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumCreditHours() <em>Minimum Credit Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumCreditHours()
	 * @generated
	 * @ordered
	 */
	protected static final int MINIMUM_CREDIT_HOURS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinimumCreditHours() <em>Minimum Credit Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumCreditHours()
	 * @generated
	 * @ordered
	 */
	protected int minimumCreditHours = MINIMUM_CREDIT_HOURS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequiredCourses() <em>Required Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> requiredCourses;

	/**
	 * The cached value of the '{@link #getRequiredCourseCategories() <em>Required Course Categories</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredCourseCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseCategory> requiredCourseCategories;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraduationRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrdslPackage.Literals.GRADUATION_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrdslPackage.GRADUATION_REQUIREMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinimumCreditHours() {
		return minimumCreditHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinimumCreditHours(int newMinimumCreditHours) {
		int oldMinimumCreditHours = minimumCreditHours;
		minimumCreditHours = newMinimumCreditHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrdslPackage.GRADUATION_REQUIREMENT__MINIMUM_CREDIT_HOURS, oldMinimumCreditHours, minimumCreditHours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getRequiredCourses() {
		if (requiredCourses == null) {
			requiredCourses = new EObjectResolvingEList<Course>(Course.class, this, GrdslPackage.GRADUATION_REQUIREMENT__REQUIRED_COURSES);
		}
		return requiredCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CourseCategory> getRequiredCourseCategories() {
		if (requiredCourseCategories == null) {
			requiredCourseCategories = new EDataTypeUniqueEList<CourseCategory>(CourseCategory.class, this, GrdslPackage.GRADUATION_REQUIREMENT__REQUIRED_COURSE_CATEGORIES);
		}
		return requiredCourseCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrdslPackage.GRADUATION_REQUIREMENT__NAME:
				return getName();
			case GrdslPackage.GRADUATION_REQUIREMENT__MINIMUM_CREDIT_HOURS:
				return getMinimumCreditHours();
			case GrdslPackage.GRADUATION_REQUIREMENT__REQUIRED_COURSES:
				return getRequiredCourses();
			case GrdslPackage.GRADUATION_REQUIREMENT__REQUIRED_COURSE_CATEGORIES:
				return getRequiredCourseCategories();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GrdslPackage.GRADUATION_REQUIREMENT__NAME:
				setName((String)newValue);
				return;
			case GrdslPackage.GRADUATION_REQUIREMENT__MINIMUM_CREDIT_HOURS:
				setMinimumCreditHours((Integer)newValue);
				return;
			case GrdslPackage.GRADUATION_REQUIREMENT__REQUIRED_COURSES:
				getRequiredCourses().clear();
				getRequiredCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case GrdslPackage.GRADUATION_REQUIREMENT__REQUIRED_COURSE_CATEGORIES:
				getRequiredCourseCategories().clear();
				getRequiredCourseCategories().addAll((Collection<? extends CourseCategory>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GrdslPackage.GRADUATION_REQUIREMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GrdslPackage.GRADUATION_REQUIREMENT__MINIMUM_CREDIT_HOURS:
				setMinimumCreditHours(MINIMUM_CREDIT_HOURS_EDEFAULT);
				return;
			case GrdslPackage.GRADUATION_REQUIREMENT__REQUIRED_COURSES:
				getRequiredCourses().clear();
				return;
			case GrdslPackage.GRADUATION_REQUIREMENT__REQUIRED_COURSE_CATEGORIES:
				getRequiredCourseCategories().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GrdslPackage.GRADUATION_REQUIREMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GrdslPackage.GRADUATION_REQUIREMENT__MINIMUM_CREDIT_HOURS:
				return minimumCreditHours != MINIMUM_CREDIT_HOURS_EDEFAULT;
			case GrdslPackage.GRADUATION_REQUIREMENT__REQUIRED_COURSES:
				return requiredCourses != null && !requiredCourses.isEmpty();
			case GrdslPackage.GRADUATION_REQUIREMENT__REQUIRED_COURSE_CATEGORIES:
				return requiredCourseCategories != null && !requiredCourseCategories.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", minimumCreditHours: ");
		result.append(minimumCreditHours);
		result.append(", requiredCourseCategories: ");
		result.append(requiredCourseCategories);
		result.append(')');
		return result.toString();
	}

} //GraduationRequirementImpl
