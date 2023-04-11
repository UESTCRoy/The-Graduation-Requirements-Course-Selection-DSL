/*
 * 
 */
package grdsl.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import grdsl.GrdslPackage;
import grdsl.diagram.edit.parts.CourseName2EditPart;
import grdsl.diagram.edit.parts.CourseNameEditPart;
import grdsl.diagram.edit.parts.DegreeProgramNameEditPart;
import grdsl.diagram.edit.parts.DepartmentNameEditPart;
import grdsl.diagram.edit.parts.GraduationRequirementName2EditPart;
import grdsl.diagram.edit.parts.GraduationRequirementNameEditPart;
import grdsl.diagram.edit.parts.StudentNameEditPart;
import grdsl.diagram.edit.parts.TeacherName2EditPart;
import grdsl.diagram.edit.parts.TeacherNameEditPart;
import grdsl.diagram.parsers.MessageFormatParser;
import grdsl.diagram.part.GrdslVisualIDRegistry;

/**
 * @generated
 */
public class GrdslParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser studentName_5001Parser;

	/**
	* @generated
	*/
	private IParser getStudentName_5001Parser() {
		if (studentName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { GrdslPackage.eINSTANCE.getStudent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			studentName_5001Parser = parser;
		}
		return studentName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser degreeProgramName_5003Parser;

	/**
	* @generated
	*/
	private IParser getDegreeProgramName_5003Parser() {
		if (degreeProgramName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { GrdslPackage.eINSTANCE.getDegreeProgram_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			degreeProgramName_5003Parser = parser;
		}
		return degreeProgramName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser courseName_5004Parser;

	/**
	* @generated
	*/
	private IParser getCourseName_5004Parser() {
		if (courseName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { GrdslPackage.eINSTANCE.getCourse_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			courseName_5004Parser = parser;
		}
		return courseName_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser departmentName_5007Parser;

	/**
	* @generated
	*/
	private IParser getDepartmentName_5007Parser() {
		if (departmentName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { GrdslPackage.eINSTANCE.getDepartment_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			departmentName_5007Parser = parser;
		}
		return departmentName_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser teacherName_5008Parser;

	/**
	* @generated
	*/
	private IParser getTeacherName_5008Parser() {
		if (teacherName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { GrdslPackage.eINSTANCE.getTeacher_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			teacherName_5008Parser = parser;
		}
		return teacherName_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser graduationRequirementName_5009Parser;

	/**
	* @generated
	*/
	private IParser getGraduationRequirementName_5009Parser() {
		if (graduationRequirementName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { GrdslPackage.eINSTANCE.getGraduationRequirement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			graduationRequirementName_5009Parser = parser;
		}
		return graduationRequirementName_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser graduationRequirementName_5002Parser;

	/**
	* @generated
	*/
	private IParser getGraduationRequirementName_5002Parser() {
		if (graduationRequirementName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { GrdslPackage.eINSTANCE.getGraduationRequirement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			graduationRequirementName_5002Parser = parser;
		}
		return graduationRequirementName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser courseName_5005Parser;

	/**
	* @generated
	*/
	private IParser getCourseName_5005Parser() {
		if (courseName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { GrdslPackage.eINSTANCE.getCourse_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			courseName_5005Parser = parser;
		}
		return courseName_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser teacherName_5006Parser;

	/**
	* @generated
	*/
	private IParser getTeacherName_5006Parser() {
		if (teacherName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { GrdslPackage.eINSTANCE.getTeacher_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			teacherName_5006Parser = parser;
		}
		return teacherName_5006Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case StudentNameEditPart.VISUAL_ID:
			return getStudentName_5001Parser();
		case DegreeProgramNameEditPart.VISUAL_ID:
			return getDegreeProgramName_5003Parser();
		case CourseNameEditPart.VISUAL_ID:
			return getCourseName_5004Parser();
		case DepartmentNameEditPart.VISUAL_ID:
			return getDepartmentName_5007Parser();
		case TeacherNameEditPart.VISUAL_ID:
			return getTeacherName_5008Parser();
		case GraduationRequirementNameEditPart.VISUAL_ID:
			return getGraduationRequirementName_5009Parser();
		case GraduationRequirementName2EditPart.VISUAL_ID:
			return getGraduationRequirementName_5002Parser();
		case CourseName2EditPart.VISUAL_ID:
			return getCourseName_5005Parser();
		case TeacherName2EditPart.VISUAL_ID:
			return getTeacherName_5006Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(GrdslVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(GrdslVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (GrdslElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
