package oops_practice.scenario_based;

// Abstraction
interface IPayable {
	double calculateBill();
}

// class Patient
class Patient implements IPayable {
	private int id;
	private String name;
	private int age;

	Patient(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	/* Encapsulation */
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void displayInfo() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

	/* Polymorphism */

	@Override
	public double calculateBill() {
		// TODO Auto-generated method stub
		return 0;
	}

}

// Inheritance
class InPatient extends Patient implements IPayable {
	private double rate;
	private int days;

	public InPatient(int id, String name, int age, double rate, int days) {
		// TODO Auto-generated constructor stub
		super(id, name, age);
		this.rate = rate;
		this.days = days;
	}

	/* Encapsulation */
	public double getRate() {
		return rate;
	}

	public int getHours() {
		return days;
	}

	public void setHours(int days) {
		this.days = days;
	}

	/* Polymorphism */

	@Override
	public double calculateBill() {
		// TODO Auto-generated method stub
		return rate * days;
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Rate per day: " + rate);
		System.out.println("Days stayed: " + days);
		System.out.println();
	}
}

class OutPatient extends Patient {
	private double amount;

	public OutPatient(int id, String name, int age, double amount) {
		// TODO Auto-generated constructor stub
		super(id, name, age);
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	/* Polymorphism */
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Amount for house Visit: " + amount);
		System.out.println();
	}
}

class Doctor {
	private int id;
	private String name;
	private String specialization;

	public Doctor(int id, String name, String specialization) {
		this.id = id;
		this.name = name;
		this.specialization = specialization;
	}

	/* Encapsulation */
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public void displayInfo() {
		System.out.println("\nID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Specialization: " + specialization);
		System.out.println();
	}

}

class Bill {
	Patient patient;

	public Bill(Patient patient) {
		// TODO Auto-generated constructor stub
		this.patient = patient;
	}

	public void displayInfo() {
		patient.displayInfo();
		double totalBill = 0;
		if (patient instanceof IPayable) {
			totalBill = ((IPayable) patient).calculateBill();
		}
		System.out.println("Total bill: " + totalBill);
		System.out.println();
	}
}

public class HospitalManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create
		Doctor d1 = new Doctor(1, "Govind", "Orthopedist");
		Doctor d2 = new Doctor(2, "Nitai", "Dermatologist (Hair Care)");

		Patient p1 = new InPatient(1, "Aman", 50, 150, 3);
		Patient p2 = new OutPatient(2, "Akash", 22, 500);

		// Read
		Bill b1 = new Bill(p1);
		Bill b2 = new Bill(p2);
		b1.displayInfo();
		b2.displayInfo();

		// Update
		p1.setAge(30);
		p2.setName("Akash Yadav");
		p1.displayInfo();
		p2.displayInfo();
	}

}
