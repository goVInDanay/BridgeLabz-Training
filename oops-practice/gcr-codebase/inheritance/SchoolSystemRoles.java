package oops_practice.gcr_codebase.inheritance;

class Person {
	private String name;
	private int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void displayRole() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

class Teacher extends Person {
	private String subject;

	Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	@Override
	void displayRole() {
		super.displayRole();
		System.out.println("Subject: " + subject);
	}
}

class Student extends Person {
	private String grade;

	Student(String name, int age, String grade) {
		super(name, age);
		this.grade = grade;
	}

	@Override
	void displayRole() {
		super.displayRole();
		System.out.println("Grade: " + grade);
	}
}

class Staff extends Person {
	private String id;

	Staff(String name, int age, String id) {
		super(name, age);
		this.id = id;
	}

	@Override
	void displayRole() {
		super.displayRole();
		System.out.println("Staff ID: " + id);
	}
}

public class SchoolSystemRoles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Luffy", 19);
		Person p2 = new Teacher("Monica", 38, "Moral Science");
		Person p3 = new Student("Govind", 22, "A");
		Person p4 = new Staff("Naresh", 45, "S001");
		p1.displayRole();
		System.out.println();
		p2.displayRole();
		System.out.println();
		p3.displayRole();
		System.out.println();
		p4.displayRole();
		System.out.println();
	}

}
