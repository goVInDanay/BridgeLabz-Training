package collections.gcr_codebase.generics.multi_level_university_course_management;

import java.util.*;

class CourseManager {

	private List<Course<? extends CourseType>> courses = new ArrayList<>();

	void addCourse(Course<? extends CourseType> course) {
		courses.add(course);
	}

	List<Course<? extends CourseType>> getCourses() {
		return courses;
	}
}