package oops_practice.scenario_based.student_course_registration_system;

public class StudentCourseRegistrationSystem {

	public static void main(String[] args) throws CourseLimitExceededException {
		// TODO Auto-generated method stub
		Student student = new Student(1, "Govind");
		RegistrationServices service = new CourseRegistration();

		try {
			service.enroll(student, "Maths");
			service.enroll(student, "Computer Science");
			service.enroll(student, "AI");
			service.enroll(student, "ML");
		} catch (CourseLimitExceededException e) {
			// TODO: handle exception
			System.out.println(e);
		}

		student.addGrade('A');
		student.addGrade('O');
		student.addGrade('A');
		student.viewGrade();
	}

}
