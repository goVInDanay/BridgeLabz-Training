package java8_features_practice.scenario_based.online_course_manager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class EnrollmentData {
	public static List<Enrollment> getEnrollments() {
		List<Enrollment> enrollments = new ArrayList<>();
		enrollments.add(new Enrollment("Govind", "Java Basics", "Programming", LocalDate.of(2026, 2, 10)));
		enrollments.add(new Enrollment("Akash", "Data Science", "Data Science", LocalDate.of(2026, 2, 12)));
		enrollments.add(new Enrollment("Nitai", "Java Basics", "Programming", LocalDate.of(2026, 2, 11)));
		enrollments.add(new Enrollment("Aman", "Web Development", "Programming", LocalDate.of(2026, 2, 9)));
		enrollments.add(new Enrollment("Hariom", "Data Science", "Data Science", LocalDate.of(2026, 2, 13)));
		return enrollments;
	}
}
