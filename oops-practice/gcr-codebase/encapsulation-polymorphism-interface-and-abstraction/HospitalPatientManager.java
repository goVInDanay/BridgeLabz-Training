package oops_practice.gcr_codebase.encapsulation_polymorphism_interface_and_abstraction;

import java.util.*;

interface MedicalRecords {
	void addRecord();

	void viewRecords();
}

abstract class Patient {

	private String patientId;
	private String name;
	private int age;

	Patient(String patientId, String name, int age) {
		this.patientId = patientId;
		this.name = name;
		this.age = age;
	}

	public String getPatientId() {
		return patientId;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setPatientId(String patientId) {
		if (patientId == null || patientId.isEmpty()) {
			throw new IllegalArgumentException("ID cannot be empty");
		}
		this.patientId = patientId;
	}

	public void setName(String name) {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("Name cannot be empty");
		}
		this.name = name;
	}

	public void setAge(int age) {
		if (age <= 0) {
			throw new IllegalArgumentException("Age must be positive");
		}
		this.age = age;
	}

	abstract double calculateBill();

	void getPatientDetails() {
		System.out.println("Patient ID: " + patientId);
		System.out.println("Patient Name: " + name);
		System.out.println("Age: " + age);
	}

}

class InPatient extends Patient implements MedicalRecords {

	Scanner sc = new Scanner(System.in);
	double rate;
	int daysAdmitted;
	List<String> medicalRecords = new ArrayList<String>();

	InPatient(String patientId, String name, int age, double rate, int daysAdmitted) {
		super(patientId, name, age);
		this.rate = rate;
		this.daysAdmitted = daysAdmitted;
	}

	@Override
	public double calculateBill() {
		return daysAdmitted * rate;
	}

	@Override
	public void addRecord() {
		System.out.println("Enter medical record for: " + getName());
		String record = sc.nextLine();
		medicalRecords.add(record);
	}

	@Override
	public void viewRecords() {
		System.out.println("Records for " + getAge());
		for (String record : medicalRecords) {
			System.out.println(record);
		}
	}
}

class OutPatient extends Patient implements MedicalRecords {

	Scanner sc = new Scanner(System.in);
	double fee;
	List<String> medicalRecords = new ArrayList<String>();

	OutPatient(String patientId, String name, int age, double fee) {
		super(patientId, name, age);
		this.fee = fee;
	}

	@Override
	public double calculateBill() {
		return fee;
	}

	@Override
	public void addRecord() {
		System.out.println("Enter medical record for: " + getName());
		String record = sc.nextLine();
		medicalRecords.add(record);
	}

	@Override
	public void viewRecords() {
		System.out.println("Records for " + getName());
		for (String record : medicalRecords) {
			System.out.println(record);
		}
		System.out.println();
	}
}

public class HospitalPatientManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Patient> patients = new ArrayList<Patient>();

		Patient p1 = new InPatient("P001", "Govind", 23, 115.5, 4);
		Patient p2 = new OutPatient("P001", "Akash", 21, 300);
		
		if (p1 instanceof MedicalRecords) {
			((MedicalRecords) p1).addRecord();
			((MedicalRecords) p1).addRecord();
		}

		if (p2 instanceof MedicalRecords) {
			((MedicalRecords) p2).addRecord();
			((MedicalRecords) p2).addRecord();
		}

		patients.add(p1);
		patients.add(p2);

		for (Patient p : patients) {
			p.getPatientDetails();
			System.out.println("Total Bill: Rs " + p.calculateBill());
			if (p instanceof MedicalRecords) {
				((MedicalRecords) p).viewRecords();
			}
			System.out.println();
		}

	}

}
