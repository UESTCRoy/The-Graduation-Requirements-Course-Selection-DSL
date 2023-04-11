
/*
 * 
 */
package grdsl.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import grdsl.diagram.providers.GrdslElementTypes;

/**
 * @generated
 */
public class GrdslPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createCourse1CreationTool());
		paletteContainer.add(createDegreeProgram2CreationTool());
		paletteContainer.add(createDepartment3CreationTool());
		paletteContainer.add(createGraduationRequirement4CreationTool());
		paletteContainer.add(createStudent5CreationTool());
		paletteContainer.add(createTeacher6CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createCourses1CreationTool());
		paletteContainer.add(createDepartment2CreationTool());
		paletteContainer.add(createDesiredDegreeProgram3CreationTool());
		paletteContainer.add(createPrerequisites4CreationTool());
		paletteContainer.add(createRequiredCourses5CreationTool());
		paletteContainer.add(createSelectedCourses6CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createCourse1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(GrdslElementTypes.Course_2003);
		types.add(GrdslElementTypes.Course_3002);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Course1CreationTool_title,
				Messages.Course1CreationTool_desc, types);
		entry.setId("createCourse1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GrdslElementTypes.getImageDescriptor(GrdslElementTypes.Course_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDegreeProgram2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DegreeProgram2CreationTool_title,
				Messages.DegreeProgram2CreationTool_desc,
				Collections.singletonList(GrdslElementTypes.DegreeProgram_2002));
		entry.setId("createDegreeProgram2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GrdslElementTypes.getImageDescriptor(GrdslElementTypes.DegreeProgram_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDepartment3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Department3CreationTool_title,
				Messages.Department3CreationTool_desc, Collections.singletonList(GrdslElementTypes.Department_2004));
		entry.setId("createDepartment3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GrdslElementTypes.getImageDescriptor(GrdslElementTypes.Department_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGraduationRequirement4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(GrdslElementTypes.GraduationRequirement_3001);
		types.add(GrdslElementTypes.GraduationRequirement_2006);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.GraduationRequirement4CreationTool_title,
				Messages.GraduationRequirement4CreationTool_desc, types);
		entry.setId("createGraduationRequirement4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GrdslElementTypes.getImageDescriptor(GrdslElementTypes.GraduationRequirement_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createStudent5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Student5CreationTool_title,
				Messages.Student5CreationTool_desc, Collections.singletonList(GrdslElementTypes.Student_2001));
		entry.setId("createStudent5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GrdslElementTypes.getImageDescriptor(GrdslElementTypes.Student_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTeacher6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(GrdslElementTypes.Teacher_3003);
		types.add(GrdslElementTypes.Teacher_2005);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Teacher6CreationTool_title,
				Messages.Teacher6CreationTool_desc, types);
		entry.setId("createTeacher6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GrdslElementTypes.getImageDescriptor(GrdslElementTypes.Teacher_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCourses1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Courses1CreationTool_title,
				Messages.Courses1CreationTool_desc, Collections.singletonList(GrdslElementTypes.TeacherCourses_4006));
		entry.setId("createCourses1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GrdslElementTypes.getImageDescriptor(GrdslElementTypes.TeacherCourses_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDepartment2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Department2CreationTool_title,
				Messages.Department2CreationTool_desc,
				Collections.singletonList(GrdslElementTypes.CourseDepartment_4002));
		entry.setId("createDepartment2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GrdslElementTypes.getImageDescriptor(GrdslElementTypes.CourseDepartment_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDesiredDegreeProgram3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.DesiredDegreeProgram3CreationTool_title,
				Messages.DesiredDegreeProgram3CreationTool_desc,
				Collections.singletonList(GrdslElementTypes.StudentDesiredDegreeProgram_4003));
		entry.setId("createDesiredDegreeProgram3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GrdslElementTypes.getImageDescriptor(GrdslElementTypes.StudentDesiredDegreeProgram_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPrerequisites4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Prerequisites4CreationTool_title,
				Messages.Prerequisites4CreationTool_desc,
				Collections.singletonList(GrdslElementTypes.CoursePrerequisites_4001));
		entry.setId("createPrerequisites4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GrdslElementTypes.getImageDescriptor(GrdslElementTypes.CoursePrerequisites_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRequiredCourses5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.RequiredCourses5CreationTool_title,
				Messages.RequiredCourses5CreationTool_desc,
				Collections.singletonList(GrdslElementTypes.GraduationRequirementRequiredCourses_4005));
		entry.setId("createRequiredCourses5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				GrdslElementTypes.getImageDescriptor(GrdslElementTypes.GraduationRequirementRequiredCourses_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSelectedCourses6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.SelectedCourses6CreationTool_title,
				Messages.SelectedCourses6CreationTool_desc,
				Collections.singletonList(GrdslElementTypes.StudentSelectedCourses_4004));
		entry.setId("createSelectedCourses6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GrdslElementTypes.getImageDescriptor(GrdslElementTypes.StudentSelectedCourses_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
