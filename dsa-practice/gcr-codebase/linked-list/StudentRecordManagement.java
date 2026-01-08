package dsa_practice.gcr_codebase.linked_list;
import java.util.*;
class StudentList{
	int rollNumber;
	String name;
	int age;
	char grade;
	StudentList  next;
	StudentList(){
	}
	StudentList(int rollNumber, String name, int age, char grade){
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.next = null;
	}
	
	StudentList head = null;
	StudentList tail = null;
	int size = 0;
	public void addStudentAtStart(int rollNumber, String name, int age, char grade) {
		StudentList node = new StudentList(rollNumber, name, age, grade);
		if(head == null) {
			head = tail = node;
			size++;
			System.out.println("Student added");
			return;
		}
		node.next = head;
		head = node;
		System.out.println("Student added");
		size++;
	}
	
	public void addStudentAtEnd(int rollNumber, String name, int age, char grade) {
		StudentList node = new StudentList(rollNumber, name, age, grade);
		if(head == null) {
			head = tail = node;
			size++;
			System.out.println("Student added");
			return;
		}
		tail.next = node;
		tail = node;
		System.out.println("Student added");
		size++;
	}
	
	
	public void addStudentAtPostition(int idx, int rollNumber, String name, int age, char grade) {
		if(idx <= 0 || idx > size + 1) {
			System.out.println("Invalid position");
			return;
		}
		if(idx == 1) {
			addStudentAtStart(rollNumber, name, age, grade);
			return;
		}
		if(idx == size + 1) {
			addStudentAtEnd(rollNumber, name, age, grade);
			return;
		}
		
		int pos = 1;
		StudentList temp = head;
		while(pos < idx - 1 && temp != null) {
			temp = temp.next;
			pos++;
		}
		StudentList node = new StudentList(rollNumber, name, age, grade);
		node.next = temp.next;
		temp.next = node;
		size++;
		System.out.println("Student added");
	}
	
	public void deleteByRollNumber(int rollNumber) {
		if(head == null) {
			System.out.println("Student List is empty");
			return;
		}
		if(head.rollNumber == rollNumber) {
			head = head.next;
			size--;
			System.out.println("Student deleted");
			return;
		}
		
		StudentList prev = head;
		StudentList temp = head.next;
		while(temp != null && temp.rollNumber != rollNumber) {
			prev = temp;
			temp = temp.next;
		}
		
		if(temp == null) {
			System.out.println("Student not found");
			return;
		}
		
		prev.next = temp.next;
		size--;
		System.out.println("Student deleted");
	}
	
	public void searchByRollNumber(int rollNumber) {
		StudentList temp = head;
		while(temp != null && temp.rollNumber != rollNumber) {
			temp = temp.next;
		}
		if(temp == null) {
			System.out.println("Student not found");
			return;
		}
		System.out.println("Roll Number: " + temp.rollNumber);
		System.out.println("Name: " + temp.name);
		System.out.println("Age: " + temp.age);
		System.out.println("Grade: " + temp.grade);
		System.out.println();
	}
	
	public void displayAllStudentsRecords() {
		StudentList temp = head;
		while(temp != null) {
			System.out.println("Roll Number: " + temp.rollNumber);
			System.out.println("Name: " + temp.name);
			System.out.println("Age: " + temp.age);
			System.out.println("Grade: " + temp.grade);
			System.out.println();
			temp = temp.next;
		}
	}
	
	public void updateGrade(int rollNumber, char grade) {
		StudentList temp = head;
		while(temp != null && temp.rollNumber != rollNumber) {
			temp = temp.next;
		}
		if(temp == null) {
			System.out.println("Student not found");
			return;
		}
		temp.grade = grade;
		System.out.println("Grade updated");
	}
}

public class StudentRecordManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StudentList obj = new StudentList();	
		while(true) {
			System.out.println("Enter \n1. for insertion.\n2. For deletion.\n3. To search.\n4. To update Grade");
			int choice = sc.nextInt();
			if(choice == 1) {
				System.out.println("Enter Roll Number");
				int rollNumber = sc.nextInt();
				System.out.println("Enter name");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println("Enter age");
				int age = sc.nextInt();
				System.out.println("Enter grade");
				sc.nextLine();
				char grade = sc.next().charAt(0);
				if(obj.size == 0) {
					obj.addStudentAtStart(rollNumber, name, age, grade);
				}
				else {
					System.out.println("Enter position to enter. Current number of students " + obj.size);
					int pos = sc.nextInt();
					obj.addStudentAtPostition(pos, rollNumber, name, age, grade);
				}
			}
			else if(choice == 2) {
				System.out.println("Enter roll number to delete");
				int rollNumber = sc.nextInt();
				obj.deleteByRollNumber(rollNumber);
			}
			else if(choice == 3) {
				System.out.println("Enter roll number to search");
				int rollNumber = sc.nextInt();
				obj.searchByRollNumber(rollNumber);
			}
			else if(choice == 4) {
				System.out.println("Enter roll number and grade to update grade");
				int rollNumber = sc.nextInt();
				sc.nextLine();
				char grade = sc.next().charAt(0);
				obj.updateGrade(rollNumber, grade);
			}
			obj.displayAllStudentsRecords();
			System.out.println("Enter exit to exit. Else enter anything else");
			sc.nextLine();
			String input = sc.nextLine().trim();
			if(input.equalsIgnoreCase("exit")) {
				break;
			}
		}
		
	}

}
