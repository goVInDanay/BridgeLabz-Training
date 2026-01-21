package collections.gcr_codebase.generics.multi_level_university_course_management;

import java.util.List;

class CourseUtil {

	static void displayCourses(List<? extends CourseType> courseTypes) {
		for (CourseType type : courseTypes) {
			System.out.println("Evaluation Type: " + type.getEvaluationType());
		}
	}
}
