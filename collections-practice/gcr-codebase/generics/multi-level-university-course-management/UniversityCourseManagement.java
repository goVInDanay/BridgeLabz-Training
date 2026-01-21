package collections.gcr_codebase.generics.multi_level_university_course_management;

import java.util.*;

public class UniversityCourseManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course<ExamCourse> math = new Course<>("Mathematics", "Science", new ExamCourse());

		Course<AssignmentCourse> cs = new Course<>("Data Structures", "Computer Science", new AssignmentCourse());

		Course<ResearchCourse> phd = new Course<>("AI Research", "Computer Science", new ResearchCourse());

		CourseManager manager = new CourseManager();
		manager.addCourse(math);
		manager.addCourse(cs);
		manager.addCourse(phd);

		List<CourseType> courseTypes = new ArrayList<>();
		for (Course<? extends CourseType> c : manager.getCourses()) {
			courseTypes.add(c.getCourseType());
		}

		CourseUtil.displayCourses(courseTypes);
	}

}
