/**
 */
package grdsl.impl;

import grdsl.Course;
import grdsl.CourseCategory;
import grdsl.CourseSelection;
import grdsl.DegreeProgram;
import grdsl.Department;
import grdsl.GraduationRequirement;
import grdsl.GrdslFactory;
import grdsl.GrdslPackage;
import grdsl.Student;
import grdsl.Teacher;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GrdslPackageImpl extends EPackageImpl implements GrdslPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass studentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass degreeProgramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graduationRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teacherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass departmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseSelectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum courseCategoryEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see grdsl.GrdslPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GrdslPackageImpl() {
		super(eNS_URI, GrdslFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link GrdslPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GrdslPackage init() {
		if (isInited) return (GrdslPackage)EPackage.Registry.INSTANCE.getEPackage(GrdslPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGrdslPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GrdslPackageImpl theGrdslPackage = registeredGrdslPackage instanceof GrdslPackageImpl ? (GrdslPackageImpl)registeredGrdslPackage : new GrdslPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theGrdslPackage.createPackageContents();

		// Initialize created meta-data
		theGrdslPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGrdslPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GrdslPackage.eNS_URI, theGrdslPackage);
		return theGrdslPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCourse() {
		return courseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_CourseID() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_Name() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_Description() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_CreditHours() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCourse_Prerequisites() {
		return (EReference)courseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCourse_ParentCourse() {
		return (EReference)courseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCourse_Teacher() {
		return (EReference)courseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCourse_Department() {
		return (EReference)courseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStudent() {
		return studentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStudent_Name() {
		return (EAttribute)studentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStudent_GradeLevel() {
		return (EAttribute)studentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStudent_AcademicInterests() {
		return (EAttribute)studentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStudent_DesiredDegreeProgram() {
		return (EReference)studentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStudent_SelectedCourses() {
		return (EReference)studentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDegreeProgram() {
		return degreeProgramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDegreeProgram_Name() {
		return (EAttribute)degreeProgramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDegreeProgram_Description() {
		return (EAttribute)degreeProgramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDegreeProgram_GraduationRequirements() {
		return (EReference)degreeProgramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraduationRequirement() {
		return graduationRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraduationRequirement_Name() {
		return (EAttribute)graduationRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraduationRequirement_MinimumCreditHours() {
		return (EAttribute)graduationRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraduationRequirement_RequiredCourses() {
		return (EReference)graduationRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraduationRequirement_RequiredCourseCategories() {
		return (EAttribute)graduationRequirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTeacher() {
		return teacherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTeacher_Name() {
		return (EAttribute)teacherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTeacher_Courses() {
		return (EReference)teacherEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDepartment() {
		return departmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDepartment_Name() {
		return (EAttribute)departmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDepartment_Courses() {
		return (EReference)departmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDepartment_Teachers() {
		return (EReference)departmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCourseSelection() {
		return courseSelectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCourseSelection_Student() {
		return (EReference)courseSelectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCourseSelection_DegreePrograms() {
		return (EReference)courseSelectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCourseSelection_AllCourses() {
		return (EReference)courseSelectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCourseSelection_Departments() {
		return (EReference)courseSelectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCourseSelection_Teachers() {
		return (EReference)courseSelectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCourseSelection_GraduationRequirements() {
		return (EReference)courseSelectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCourseCategory() {
		return courseCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GrdslFactory getGrdslFactory() {
		return (GrdslFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		courseEClass = createEClass(COURSE);
		createEAttribute(courseEClass, COURSE__COURSE_ID);
		createEAttribute(courseEClass, COURSE__NAME);
		createEAttribute(courseEClass, COURSE__DESCRIPTION);
		createEAttribute(courseEClass, COURSE__CREDIT_HOURS);
		createEReference(courseEClass, COURSE__PREREQUISITES);
		createEReference(courseEClass, COURSE__PARENT_COURSE);
		createEReference(courseEClass, COURSE__TEACHER);
		createEReference(courseEClass, COURSE__DEPARTMENT);

		studentEClass = createEClass(STUDENT);
		createEAttribute(studentEClass, STUDENT__NAME);
		createEAttribute(studentEClass, STUDENT__GRADE_LEVEL);
		createEAttribute(studentEClass, STUDENT__ACADEMIC_INTERESTS);
		createEReference(studentEClass, STUDENT__DESIRED_DEGREE_PROGRAM);
		createEReference(studentEClass, STUDENT__SELECTED_COURSES);

		degreeProgramEClass = createEClass(DEGREE_PROGRAM);
		createEAttribute(degreeProgramEClass, DEGREE_PROGRAM__NAME);
		createEAttribute(degreeProgramEClass, DEGREE_PROGRAM__DESCRIPTION);
		createEReference(degreeProgramEClass, DEGREE_PROGRAM__GRADUATION_REQUIREMENTS);

		graduationRequirementEClass = createEClass(GRADUATION_REQUIREMENT);
		createEAttribute(graduationRequirementEClass, GRADUATION_REQUIREMENT__NAME);
		createEAttribute(graduationRequirementEClass, GRADUATION_REQUIREMENT__MINIMUM_CREDIT_HOURS);
		createEReference(graduationRequirementEClass, GRADUATION_REQUIREMENT__REQUIRED_COURSES);
		createEAttribute(graduationRequirementEClass, GRADUATION_REQUIREMENT__REQUIRED_COURSE_CATEGORIES);

		teacherEClass = createEClass(TEACHER);
		createEAttribute(teacherEClass, TEACHER__NAME);
		createEReference(teacherEClass, TEACHER__COURSES);

		departmentEClass = createEClass(DEPARTMENT);
		createEAttribute(departmentEClass, DEPARTMENT__NAME);
		createEReference(departmentEClass, DEPARTMENT__COURSES);
		createEReference(departmentEClass, DEPARTMENT__TEACHERS);

		courseSelectionEClass = createEClass(COURSE_SELECTION);
		createEReference(courseSelectionEClass, COURSE_SELECTION__STUDENT);
		createEReference(courseSelectionEClass, COURSE_SELECTION__DEGREE_PROGRAMS);
		createEReference(courseSelectionEClass, COURSE_SELECTION__ALL_COURSES);
		createEReference(courseSelectionEClass, COURSE_SELECTION__DEPARTMENTS);
		createEReference(courseSelectionEClass, COURSE_SELECTION__TEACHERS);
		createEReference(courseSelectionEClass, COURSE_SELECTION__GRADUATION_REQUIREMENTS);

		// Create enums
		courseCategoryEEnum = createEEnum(COURSE_CATEGORY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(courseEClass, Course.class, "Course", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCourse_CourseID(), ecorePackage.getEString(), "courseID", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Name(), ecorePackage.getEString(), "name", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Description(), ecorePackage.getEString(), "description", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_CreditHours(), ecorePackage.getEInt(), "creditHours", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_Prerequisites(), this.getCourse(), this.getCourse_ParentCourse(), "prerequisites", null, 0, -1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_ParentCourse(), this.getCourse(), this.getCourse_Prerequisites(), "parentCourse", null, 0, -1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_Teacher(), this.getTeacher(), null, "teacher", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_Department(), this.getDepartment(), null, "department", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(studentEClass, Student.class, "Student", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStudent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudent_GradeLevel(), ecorePackage.getEInt(), "gradeLevel", null, 0, 1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudent_AcademicInterests(), ecorePackage.getEString(), "academicInterests", null, 0, -1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudent_DesiredDegreeProgram(), this.getDegreeProgram(), null, "desiredDegreeProgram", null, 0, 1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudent_SelectedCourses(), this.getCourse(), null, "selectedCourses", null, 0, -1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(degreeProgramEClass, DegreeProgram.class, "DegreeProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDegreeProgram_Name(), ecorePackage.getEString(), "name", null, 0, 1, DegreeProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDegreeProgram_Description(), ecorePackage.getEString(), "description", null, 0, 1, DegreeProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDegreeProgram_GraduationRequirements(), this.getGraduationRequirement(), null, "graduationRequirements", null, 0, -1, DegreeProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graduationRequirementEClass, GraduationRequirement.class, "GraduationRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraduationRequirement_Name(), ecorePackage.getEString(), "name", null, 0, 1, GraduationRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraduationRequirement_MinimumCreditHours(), ecorePackage.getEInt(), "minimumCreditHours", null, 0, 1, GraduationRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraduationRequirement_RequiredCourses(), this.getCourse(), null, "requiredCourses", null, 0, -1, GraduationRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraduationRequirement_RequiredCourseCategories(), this.getCourseCategory(), "requiredCourseCategories", null, 0, -1, GraduationRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(teacherEClass, Teacher.class, "Teacher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTeacher_Name(), ecorePackage.getEString(), "name", null, 0, 1, Teacher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeacher_Courses(), this.getCourse(), null, "courses", null, 0, -1, Teacher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(departmentEClass, Department.class, "Department", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDepartment_Name(), ecorePackage.getEString(), "name", null, 0, 1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDepartment_Courses(), this.getCourse(), null, "courses", null, 0, -1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDepartment_Teachers(), this.getTeacher(), null, "teachers", null, 0, -1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(courseSelectionEClass, CourseSelection.class, "CourseSelection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCourseSelection_Student(), this.getStudent(), null, "student", null, 0, -1, CourseSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourseSelection_DegreePrograms(), this.getDegreeProgram(), null, "degreePrograms", null, 0, -1, CourseSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourseSelection_AllCourses(), this.getCourse(), null, "allCourses", null, 0, -1, CourseSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourseSelection_Departments(), this.getDepartment(), null, "departments", null, 0, -1, CourseSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourseSelection_Teachers(), this.getTeacher(), null, "teachers", null, 0, -1, CourseSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourseSelection_GraduationRequirements(), this.getGraduationRequirement(), null, "graduationRequirements", null, 0, -1, CourseSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(courseCategoryEEnum, CourseCategory.class, "CourseCategory");
		addEEnumLiteral(courseCategoryEEnum, CourseCategory.MATH);
		addEEnumLiteral(courseCategoryEEnum, CourseCategory.SCIENCE);
		addEEnumLiteral(courseCategoryEEnum, CourseCategory.HUMANITIES);
		addEEnumLiteral(courseCategoryEEnum, CourseCategory.SOCIAL_STUDIES);
		addEEnumLiteral(courseCategoryEEnum, CourseCategory.ARTS);
		addEEnumLiteral(courseCategoryEEnum, CourseCategory.TECHNOLOGY);
		addEEnumLiteral(courseCategoryEEnum, CourseCategory.LANGUAGE);
		addEEnumLiteral(courseCategoryEEnum, CourseCategory.PHYSICAL_EDUCATION);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.node
		createGmf_1Annotations();
		// gmf.link
		createGmf_2Annotations();
		// gmf.label
		createGmf_3Annotations();
		// gmf.compartment
		createGmf_4Annotations();
		// gmf.diagram
		createGmf_5Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.node";
		addAnnotation
		  (courseEClass,
		   source,
		   new String[] {
			   "label", "name"
		   });
		addAnnotation
		  (studentEClass,
		   source,
		   new String[] {
			   "label", "name"
		   });
		addAnnotation
		  (degreeProgramEClass,
		   source,
		   new String[] {
			   "label", "name"
		   });
		addAnnotation
		  (graduationRequirementEClass,
		   source,
		   new String[] {
			   "label", "name"
		   });
		addAnnotation
		  (teacherEClass,
		   source,
		   new String[] {
			   "label", "name"
		   });
		addAnnotation
		  (departmentEClass,
		   source,
		   new String[] {
			   "label", "name"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.link";
		addAnnotation
		  (getCourse_Prerequisites(),
		   source,
		   new String[] {
			   "label", "prerequisites",
			   "target.decoration", "arrow"
		   });
		addAnnotation
		  (getCourse_Department(),
		   source,
		   new String[] {
			   "label", "belongTo",
			   "target.decoration", "arrow"
		   });
		addAnnotation
		  (getStudent_DesiredDegreeProgram(),
		   source,
		   new String[] {
			   "label", "desiredDegreeProgram",
			   "target.decoration", "arrow"
		   });
		addAnnotation
		  (getStudent_SelectedCourses(),
		   source,
		   new String[] {
			   "label", "selectedCourses",
			   "target.decoration", "arrow"
		   });
		addAnnotation
		  (getGraduationRequirement_RequiredCourses(),
		   source,
		   new String[] {
			   "label", "requiredCourse",
			   "target.decoration", "arrow"
		   });
		addAnnotation
		  (getTeacher_Courses(),
		   source,
		   new String[] {
			   "label", "teach",
			   "target.decoration", "arrow"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.label</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.label";
		addAnnotation
		  (courseCategoryEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "value", "Math"
		   });
		addAnnotation
		  (courseCategoryEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "value", "SCIENCE"
		   });
		addAnnotation
		  (courseCategoryEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "value", "HUMANITIES"
		   });
		addAnnotation
		  (courseCategoryEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "value", "SOCIAL_STUDIES"
		   });
		addAnnotation
		  (courseCategoryEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "value", "ARTS"
		   });
		addAnnotation
		  (courseCategoryEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "value", "TECHNOLOGY"
		   });
		addAnnotation
		  (courseCategoryEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "value", "LANGUAGE"
		   });
		addAnnotation
		  (courseCategoryEEnum.getELiterals().get(7),
		   source,
		   new String[] {
			   "value", "PHYSICAL_EDUCATION"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.compartment";
		addAnnotation
		  (getDegreeProgram_GraduationRequirements(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDepartment_Courses(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDepartment_Teachers(),
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_5Annotations() {
		String source = "gmf.diagram";
		addAnnotation
		  (courseSelectionEClass,
		   source,
		   new String[] {
		   });
	}

} //GrdslPackageImpl
