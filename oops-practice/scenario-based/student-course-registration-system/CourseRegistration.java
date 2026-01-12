package oops_practice.scenario_based.student_course_registration_system;

class CourseRegistration extends RegistrationServices {
	
	@Override
	public void enroll(Student student, String course) throws CourseLimitExceededException {
		student.addCourse(course);
		System.out.println(student.getName() + " enrolled in " + course);
	}
}
