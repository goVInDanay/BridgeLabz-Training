package core_java_practice.scenario_based;

import java.util.*;

class InvalidMarkException extends Exception {
	public InvalidMarkException(String message) {
		super(message);
	}
}

class Student {
	private String name;
	private String subjects[];
	private int marks[];

	public Student(String name, String subjects[], int marks[]) throws InvalidMarkException {
		this.name = name;
		this.subjects = subjects;
		validateMarks(marks);
		this.marks = marks;
	}

	// validate marks
	private void validateMarks(int[] marks) throws InvalidMarkException {
		for (int m : marks) {
			if (m < 0 || m > 100) {
				throw new InvalidMarkException("Marks must be between 0 and 100");
			}
		}
	}

	// calculate average
	public double calculateAverage() {
		double sum = 0;
		for (int m : marks) {
			sum += m;
		}
		return sum / marks.length;
	}

	// calculate grade
	public char calculateGrade() {
		double avg = calculateAverage();
		if (avg >= 90) {
			return 'O';
		}
		if (avg >= 80) {
			return 'A';
		}
		if (avg >= 70) {
			return 'B';
		}
		if (avg >= 60) {
			return 'C';
		}
		if (avg >= 50) {
			return 'D';
		}
		return 'F';
	}

	// display details
	public void displayReport() {
		System.out.println("Name: " + name);
		for (int i = 0; i < subjects.length; i++) {
			System.out.println(subjects[i] + " : " + marks[i]);
		}
		System.out.printf("Average: %.2f\n", calculateAverage());
		System.out.println("Grade: " + calculateGrade());
		System.out.println();
	}
}

public class StudentReportGenerator {

	public static void main(String[] args) throws InvalidMarkException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Student> students = new ArrayList<>();
		try {
			while (true) {
				System.out.println("Enter exit to exit. Enter anything else to continue");
				String input = sc.next();
				if (input.trim().equalsIgnoreCase("exit")) {
					break;
				}
				System.out.println("Enter student name");
				String name = sc.next();
				System.out.println("Enter number of subjects");
				int n = sc.nextInt();
				String subjects[] = new String[n];
				System.out.println("Enter subjects");
				for (int i = 0; i < n; i++) {
					subjects[i] = sc.next();
				}
				System.out.println("Enter marks of each subject");
				int marks[] = new int[n];
				for (int i = 0; i < n; i++) {
					marks[i] = sc.nextInt();
				}
				students.add(new Student(name, subjects, marks));
			}
			for (Student s : students) {
				s.displayReport();
			}
		} catch (InvalidMarkException e) {
			System.out.println(e);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
