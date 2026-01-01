package oops_practice.gcr_codebase.this_static_final_and_instanceOf;

class Student {
	private static String universityName;
	private static int totalStudents;
	private String name;
	final private int rollNumber;
	private String grade;

	static {
		universityName = "Global University";
		totalStudents = 0;
	}

	public Student(String name, int rollNumber, String grade) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.rollNumber = rollNumber;
		this.grade = grade;
		totalStudents++;
	}

	void updateGrade(String grade) {
		this.grade = grade;
		System.out.println("Grade updated to: " + this.grade);
	}

	void display() {
		System.out.println("University Name: " + universityName);
		System.out.println("Roll Number: " + rollNumber);
		System.out.println("Name: " + name);
		System.out.println("Grade: " + grade);
		System.out.println();
	}

	static void displayTotalStudents() {
		System.out.println("Total Students Enrolled: " + totalStudents);
	}
}

public class UniversityManagementSystem {
	static boolean checkInstanceOfStudent(Object obj) {
		return obj instanceof Student;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Hemashree", 101, "A");
		Student s2 = new Student("Sharmila", 102, "B");
		Student.displayTotalStudents();
		if (checkInstanceOfStudent(s1)) {
			s1.display();
		} else {
			System.out.println("Invalid Instance");
		}
		if (checkInstanceOfStudent(s2)) {
			s2.display();
		} else {
			System.out.println("Invalid Instance");
		}
		s2.updateGrade("A");
		if (checkInstanceOfStudent(s2)) {
			s2.display();
		} else {
			System.out.println("Invalid Instance");
		}
	}

}
