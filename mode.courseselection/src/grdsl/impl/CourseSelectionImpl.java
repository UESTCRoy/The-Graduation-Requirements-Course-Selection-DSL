/**
 */
package grdsl.impl;

import grdsl.Course;
import grdsl.CourseSelection;
import grdsl.DegreeProgram;
import grdsl.Department;
import grdsl.GraduationRequirement;
import grdsl.GrdslPackage;
import grdsl.Student;
import grdsl.Teacher;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link grdsl.impl.CourseSelectionImpl#getStudent <em>Student</em>}</li>
 *   <li>{@link grdsl.impl.CourseSelectionImpl#getDegreePrograms <em>Degree Programs</em>}</li>
 *   <li>{@link grdsl.impl.CourseSelectionImpl#getAllCourses <em>All Courses</em>}</li>
 *   <li>{@link grdsl.impl.CourseSelectionImpl#getDepartments <em>Departments</em>}</li>
 *   <li>{@link grdsl.impl.CourseSelectionImpl#getTeachers <em>Teachers</em>}</li>
 *   <li>{@link grdsl.impl.CourseSelectionImpl#getGraduationRequirements <em>Graduation Requirements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseSelectionImpl extends EObjectImpl implements CourseSelection {
	/**
	 * The cached value of the '{@link #getStudent() <em>Student</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudent()
	 * @generated
	 * @ordered
	 */
	protected EList<Student> student;

	/**
	 * The cached value of the '{@link #getDegreePrograms() <em>Degree Programs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegreePrograms()
	 * @generated
	 * @ordered
	 */
	protected EList<DegreeProgram> degreePrograms;

	/**
	 * The cached value of the '{@link #getAllCourses() <em>All Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> allCourses;

	/**
	 * The cached value of the '{@link #getDepartments() <em>Departments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartments()
	 * @generated
	 * @ordered
	 */
	protected EList<Department> departments;

	/**
	 * The cached value of the '{@link #getTeachers() <em>Teachers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeachers()
	 * @generated
	 * @ordered
	 */
	protected EList<Teacher> teachers;

	/**
	 * The cached value of the '{@link #getGraduationRequirements() <em>Graduation Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraduationRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<GraduationRequirement> graduationRequirements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseSelectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrdslPackage.Literals.COURSE_SELECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Student> getStudent() {
		if (student == null) {
			student = new EObjectContainmentEList<Student>(Student.class, this, GrdslPackage.COURSE_SELECTION__STUDENT);
		}
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DegreeProgram> getDegreePrograms() {
		if (degreePrograms == null) {
			degreePrograms = new EObjectContainmentEList<DegreeProgram>(DegreeProgram.class, this, GrdslPackage.COURSE_SELECTION__DEGREE_PROGRAMS);
		}
		return degreePrograms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getAllCourses() {
		if (allCourses == null) {
			allCourses = new EObjectContainmentEList<Course>(Course.class, this, GrdslPackage.COURSE_SELECTION__ALL_COURSES);
		}
		return allCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Department> getDepartments() {
		if (departments == null) {
			departments = new EObjectContainmentEList<Department>(Department.class, this, GrdslPackage.COURSE_SELECTION__DEPARTMENTS);
		}
		return departments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Teacher> getTeachers() {
		if (teachers == null) {
			teachers = new EObjectContainmentEList<Teacher>(Teacher.class, this, GrdslPackage.COURSE_SELECTION__TEACHERS);
		}
		return teachers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraduationRequirement> getGraduationRequirements() {
		if (graduationRequirements == null) {
			graduationRequirements = new EObjectContainmentEList<GraduationRequirement>(GraduationRequirement.class, this, GrdslPackage.COURSE_SELECTION__GRADUATION_REQUIREMENTS);
		}
		return graduationRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrdslPackage.COURSE_SELECTION__STUDENT:
				return ((InternalEList<?>)getStudent()).basicRemove(otherEnd, msgs);
			case GrdslPackage.COURSE_SELECTION__DEGREE_PROGRAMS:
				return ((InternalEList<?>)getDegreePrograms()).basicRemove(otherEnd, msgs);
			case GrdslPackage.COURSE_SELECTION__ALL_COURSES:
				return ((InternalEList<?>)getAllCourses()).basicRemove(otherEnd, msgs);
			case GrdslPackage.COURSE_SELECTION__DEPARTMENTS:
				return ((InternalEList<?>)getDepartments()).basicRemove(otherEnd, msgs);
			case GrdslPackage.COURSE_SELECTION__TEACHERS:
				return ((InternalEList<?>)getTeachers()).basicRemove(otherEnd, msgs);
			case GrdslPackage.COURSE_SELECTION__GRADUATION_REQUIREMENTS:
				return ((InternalEList<?>)getGraduationRequirements()).basicRemove(otherEnd, msgs);
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
			case GrdslPackage.COURSE_SELECTION__STUDENT:
				return getStudent();
			case GrdslPackage.COURSE_SELECTION__DEGREE_PROGRAMS:
				return getDegreePrograms();
			case GrdslPackage.COURSE_SELECTION__ALL_COURSES:
				return getAllCourses();
			case GrdslPackage.COURSE_SELECTION__DEPARTMENTS:
				return getDepartments();
			case GrdslPackage.COURSE_SELECTION__TEACHERS:
				return getTeachers();
			case GrdslPackage.COURSE_SELECTION__GRADUATION_REQUIREMENTS:
				return getGraduationRequirements();
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
			case GrdslPackage.COURSE_SELECTION__STUDENT:
				getStudent().clear();
				getStudent().addAll((Collection<? extends Student>)newValue);
				return;
			case GrdslPackage.COURSE_SELECTION__DEGREE_PROGRAMS:
				getDegreePrograms().clear();
				getDegreePrograms().addAll((Collection<? extends DegreeProgram>)newValue);
				return;
			case GrdslPackage.COURSE_SELECTION__ALL_COURSES:
				getAllCourses().clear();
				getAllCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case GrdslPackage.COURSE_SELECTION__DEPARTMENTS:
				getDepartments().clear();
				getDepartments().addAll((Collection<? extends Department>)newValue);
				return;
			case GrdslPackage.COURSE_SELECTION__TEACHERS:
				getTeachers().clear();
				getTeachers().addAll((Collection<? extends Teacher>)newValue);
				return;
			case GrdslPackage.COURSE_SELECTION__GRADUATION_REQUIREMENTS:
				getGraduationRequirements().clear();
				getGraduationRequirements().addAll((Collection<? extends GraduationRequirement>)newValue);
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
			case GrdslPackage.COURSE_SELECTION__STUDENT:
				getStudent().clear();
				return;
			case GrdslPackage.COURSE_SELECTION__DEGREE_PROGRAMS:
				getDegreePrograms().clear();
				return;
			case GrdslPackage.COURSE_SELECTION__ALL_COURSES:
				getAllCourses().clear();
				return;
			case GrdslPackage.COURSE_SELECTION__DEPARTMENTS:
				getDepartments().clear();
				return;
			case GrdslPackage.COURSE_SELECTION__TEACHERS:
				getTeachers().clear();
				return;
			case GrdslPackage.COURSE_SELECTION__GRADUATION_REQUIREMENTS:
				getGraduationRequirements().clear();
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
			case GrdslPackage.COURSE_SELECTION__STUDENT:
				return student != null && !student.isEmpty();
			case GrdslPackage.COURSE_SELECTION__DEGREE_PROGRAMS:
				return degreePrograms != null && !degreePrograms.isEmpty();
			case GrdslPackage.COURSE_SELECTION__ALL_COURSES:
				return allCourses != null && !allCourses.isEmpty();
			case GrdslPackage.COURSE_SELECTION__DEPARTMENTS:
				return departments != null && !departments.isEmpty();
			case GrdslPackage.COURSE_SELECTION__TEACHERS:
				return teachers != null && !teachers.isEmpty();
			case GrdslPackage.COURSE_SELECTION__GRADUATION_REQUIREMENTS:
				return graduationRequirements != null && !graduationRequirements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CourseSelectionImpl
