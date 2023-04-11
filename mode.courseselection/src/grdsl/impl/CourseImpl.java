/**
 */
package grdsl.impl;

import grdsl.Course;
import grdsl.Department;
import grdsl.GrdslPackage;
import grdsl.Teacher;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link grdsl.impl.CourseImpl#getCourseID <em>Course ID</em>}</li>
 *   <li>{@link grdsl.impl.CourseImpl#getName <em>Name</em>}</li>
 *   <li>{@link grdsl.impl.CourseImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link grdsl.impl.CourseImpl#getCreditHours <em>Credit Hours</em>}</li>
 *   <li>{@link grdsl.impl.CourseImpl#getPrerequisites <em>Prerequisites</em>}</li>
 *   <li>{@link grdsl.impl.CourseImpl#getParentCourse <em>Parent Course</em>}</li>
 *   <li>{@link grdsl.impl.CourseImpl#getTeacher <em>Teacher</em>}</li>
 *   <li>{@link grdsl.impl.CourseImpl#getDepartment <em>Department</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends EObjectImpl implements Course {
	/**
	 * The default value of the '{@link #getCourseID() <em>Course ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseID()
	 * @generated
	 * @ordered
	 */
	protected static final String COURSE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCourseID() <em>Course ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseID()
	 * @generated
	 * @ordered
	 */
	protected String courseID = COURSE_ID_EDEFAULT;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreditHours() <em>Credit Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditHours()
	 * @generated
	 * @ordered
	 */
	protected static final int CREDIT_HOURS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCreditHours() <em>Credit Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditHours()
	 * @generated
	 * @ordered
	 */
	protected int creditHours = CREDIT_HOURS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrerequisites() <em>Prerequisites</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrerequisites()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> prerequisites;

	/**
	 * The cached value of the '{@link #getParentCourse() <em>Parent Course</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentCourse()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> parentCourse;

	/**
	 * The cached value of the '{@link #getTeacher() <em>Teacher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeacher()
	 * @generated
	 * @ordered
	 */
	protected Teacher teacher;

	/**
	 * The cached value of the '{@link #getDepartment() <em>Department</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartment()
	 * @generated
	 * @ordered
	 */
	protected Department department;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrdslPackage.Literals.COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCourseID() {
		return courseID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCourseID(String newCourseID) {
		String oldCourseID = courseID;
		courseID = newCourseID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrdslPackage.COURSE__COURSE_ID, oldCourseID, courseID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GrdslPackage.COURSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrdslPackage.COURSE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCreditHours() {
		return creditHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreditHours(int newCreditHours) {
		int oldCreditHours = creditHours;
		creditHours = newCreditHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrdslPackage.COURSE__CREDIT_HOURS, oldCreditHours, creditHours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getPrerequisites() {
		if (prerequisites == null) {
			prerequisites = new EObjectWithInverseResolvingEList.ManyInverse<Course>(Course.class, this, GrdslPackage.COURSE__PREREQUISITES, GrdslPackage.COURSE__PARENT_COURSE);
		}
		return prerequisites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getParentCourse() {
		if (parentCourse == null) {
			parentCourse = new EObjectWithInverseResolvingEList.ManyInverse<Course>(Course.class, this, GrdslPackage.COURSE__PARENT_COURSE, GrdslPackage.COURSE__PREREQUISITES);
		}
		return parentCourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Teacher getTeacher() {
		if (teacher != null && teacher.eIsProxy()) {
			InternalEObject oldTeacher = (InternalEObject)teacher;
			teacher = (Teacher)eResolveProxy(oldTeacher);
			if (teacher != oldTeacher) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrdslPackage.COURSE__TEACHER, oldTeacher, teacher));
			}
		}
		return teacher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Teacher basicGetTeacher() {
		return teacher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTeacher(Teacher newTeacher) {
		Teacher oldTeacher = teacher;
		teacher = newTeacher;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrdslPackage.COURSE__TEACHER, oldTeacher, teacher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Department getDepartment() {
		if (department != null && department.eIsProxy()) {
			InternalEObject oldDepartment = (InternalEObject)department;
			department = (Department)eResolveProxy(oldDepartment);
			if (department != oldDepartment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrdslPackage.COURSE__DEPARTMENT, oldDepartment, department));
			}
		}
		return department;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Department basicGetDepartment() {
		return department;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepartment(Department newDepartment) {
		Department oldDepartment = department;
		department = newDepartment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrdslPackage.COURSE__DEPARTMENT, oldDepartment, department));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrdslPackage.COURSE__PREREQUISITES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPrerequisites()).basicAdd(otherEnd, msgs);
			case GrdslPackage.COURSE__PARENT_COURSE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParentCourse()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrdslPackage.COURSE__PREREQUISITES:
				return ((InternalEList<?>)getPrerequisites()).basicRemove(otherEnd, msgs);
			case GrdslPackage.COURSE__PARENT_COURSE:
				return ((InternalEList<?>)getParentCourse()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrdslPackage.COURSE__COURSE_ID:
				return getCourseID();
			case GrdslPackage.COURSE__NAME:
				return getName();
			case GrdslPackage.COURSE__DESCRIPTION:
				return getDescription();
			case GrdslPackage.COURSE__CREDIT_HOURS:
				return getCreditHours();
			case GrdslPackage.COURSE__PREREQUISITES:
				return getPrerequisites();
			case GrdslPackage.COURSE__PARENT_COURSE:
				return getParentCourse();
			case GrdslPackage.COURSE__TEACHER:
				if (resolve) return getTeacher();
				return basicGetTeacher();
			case GrdslPackage.COURSE__DEPARTMENT:
				if (resolve) return getDepartment();
				return basicGetDepartment();
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
			case GrdslPackage.COURSE__COURSE_ID:
				setCourseID((String)newValue);
				return;
			case GrdslPackage.COURSE__NAME:
				setName((String)newValue);
				return;
			case GrdslPackage.COURSE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case GrdslPackage.COURSE__CREDIT_HOURS:
				setCreditHours((Integer)newValue);
				return;
			case GrdslPackage.COURSE__PREREQUISITES:
				getPrerequisites().clear();
				getPrerequisites().addAll((Collection<? extends Course>)newValue);
				return;
			case GrdslPackage.COURSE__PARENT_COURSE:
				getParentCourse().clear();
				getParentCourse().addAll((Collection<? extends Course>)newValue);
				return;
			case GrdslPackage.COURSE__TEACHER:
				setTeacher((Teacher)newValue);
				return;
			case GrdslPackage.COURSE__DEPARTMENT:
				setDepartment((Department)newValue);
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
			case GrdslPackage.COURSE__COURSE_ID:
				setCourseID(COURSE_ID_EDEFAULT);
				return;
			case GrdslPackage.COURSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GrdslPackage.COURSE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case GrdslPackage.COURSE__CREDIT_HOURS:
				setCreditHours(CREDIT_HOURS_EDEFAULT);
				return;
			case GrdslPackage.COURSE__PREREQUISITES:
				getPrerequisites().clear();
				return;
			case GrdslPackage.COURSE__PARENT_COURSE:
				getParentCourse().clear();
				return;
			case GrdslPackage.COURSE__TEACHER:
				setTeacher((Teacher)null);
				return;
			case GrdslPackage.COURSE__DEPARTMENT:
				setDepartment((Department)null);
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
			case GrdslPackage.COURSE__COURSE_ID:
				return COURSE_ID_EDEFAULT == null ? courseID != null : !COURSE_ID_EDEFAULT.equals(courseID);
			case GrdslPackage.COURSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GrdslPackage.COURSE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case GrdslPackage.COURSE__CREDIT_HOURS:
				return creditHours != CREDIT_HOURS_EDEFAULT;
			case GrdslPackage.COURSE__PREREQUISITES:
				return prerequisites != null && !prerequisites.isEmpty();
			case GrdslPackage.COURSE__PARENT_COURSE:
				return parentCourse != null && !parentCourse.isEmpty();
			case GrdslPackage.COURSE__TEACHER:
				return teacher != null;
			case GrdslPackage.COURSE__DEPARTMENT:
				return department != null;
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
		result.append(" (courseID: ");
		result.append(courseID);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", creditHours: ");
		result.append(creditHours);
		result.append(')');
		return result.toString();
	}

} //CourseImpl
