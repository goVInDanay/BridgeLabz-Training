package oops_practice.scenario_based.student_course_registration_system;

public class Student extends Person {

	private String course[];
	private int countCourse = 0;
	private char grades[];
	private int countGrade = 0;
	private final int MAX_COURSE = 3;

	Student(int id, String name) {
		super(id, name);
		course = new String[MAX_COURSE];
		grades = new char[MAX_COURSE];
	}

	public String getName() {
		return name;
	}
	
	public void addCourse(String course) throws CourseLimitExceededException {
		if (countCourse == MAX_COURSE) {
			throw new CourseLimitExceededException("Course Limit Exceeded");

		}

		this.course[countCourse] = course;
		countCourse++;
	}

	public void addGrade(char grade) throws CourseLimitExceededException {
		if (countGrade == countCourse) {
			throw new CourseLimitExceededException("Grades without course");
		}

		this.grades[countGrade] = grade;
		countGrade++;
	}

	public void viewGrade() {
		for (int i = 0; i < countGrade; i++) {
			System.out.println("Grades: " + grades[i]);
		}
	}
}
