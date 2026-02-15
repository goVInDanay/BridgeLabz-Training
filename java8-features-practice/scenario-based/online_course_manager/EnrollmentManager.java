package java8_features_practice.scenario_based.online_course_manager;

import java.util.*;
import java.util.stream.*;

class EnrollmentManager {

	public static void main(String[] args) {
		List<Enrollment> enrollments = EnrollmentData.getEnrollments();

		System.out.println("Enrollments in 'Java Basics':");
		enrollments.stream().filter(e -> e.getCourseName().equalsIgnoreCase("Java Basics"))
				.forEach(System.out::println);
		System.out.println();
		
		System.out.println("Enrollments in 'Data Science' category:");
		enrollments.stream().filter(e -> e.getCategory().equalsIgnoreCase("Data Science")).forEach(System.out::println);
		System.out.println();

		
		System.out.println("Enrollments grouped by course name:");
		Map<String, List<Enrollment>> groupedByCourse = enrollments.stream()
				.collect(Collectors.groupingBy(Enrollment::getCourseName));
		
		groupedByCourse.forEach((course, list) -> {
			System.out.println(course + ":");
			list.forEach(System.out::println);
		});
		System.out.println();

		System.out.println("Number of enrollments per category:");
		Map<String, Long> countPerCategory = enrollments.stream()
				.collect(Collectors.groupingBy(Enrollment::getCategory, Collectors.counting()));
		countPerCategory.forEach((category, count) -> System.out.println(category + ": " + count));
		System.out.println();

		System.out.println("Enrollments sorted by enrollment date:");
		enrollments.stream().sorted(Comparator.comparing(Enrollment::getEnrollmentDate)).forEach(System.out::println);
	}

}
