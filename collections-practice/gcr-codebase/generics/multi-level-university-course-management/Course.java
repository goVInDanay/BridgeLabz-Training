package collections.gcr_codebase.generics.multi_level_university_course_management;

class Course<T extends CourseType> {

	private String courseName;
	private String department;
	private T courseType;

	Course(String courseName, String department, T courseType) {
		this.courseName = courseName;
		this.department = department;
		this.courseType = courseType;
	}

	String getCourseName() {
		return courseName;
	}

	String getDepartment() {
		return department;
	}

	T getCourseType() {
		return courseType;
	}
}
