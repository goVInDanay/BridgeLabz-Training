package java8_features_practice.scenario_based.online_course_manager;

import java.time.LocalDate;

class Enrollment {
	private String studentName;
	private String courseName;
	private String category;
	private LocalDate enrollmentDate;

	Enrollment(String studentName, String courseName, String category, LocalDate enrollmentDate) {
		this.studentName = studentName;
		this.courseName = courseName;
		this.category = category;
		this.enrollmentDate = enrollmentDate;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getCourseName() {
		return courseName;
	}

	public String getCategory() {
		return category;
	}

	public LocalDate getEnrollmentDate() {
		return enrollmentDate;
	}

	@Override
	public String toString() {
		return studentName + " | " + courseName + " | " + category + " | " + enrollmentDate;
	}
}
