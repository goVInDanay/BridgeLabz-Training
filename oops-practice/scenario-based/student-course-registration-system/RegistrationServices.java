package oops_practice.scenario_based.student_course_registration_system;

abstract class RegistrationServices {
	abstract void enroll(Student student, String course) throws CourseLimitExceededException;
}
