package oops_practice.gcr_codebase.this_static_final_and_instanceOf;

class Patient {
	private static String hospitalName;
	private static int totalPatients;
	private String name;
	private int age;
	private String ailment;
	final private String patientId;

	static {
		hospitalName = "City Hospital";
		totalPatients = 0;
	}

	Patient(String name, String patientId, int age, String ailment) {
		this.name = name;
		this.patientId = patientId;
		this.age = age;
		this.ailment = ailment;
		totalPatients++;
	}

	void display() {
		System.out.println("Hospital Name: " + hospitalName);
		System.out.println("Patient ID: " + patientId);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Ailment: " + ailment);
		System.out.println();
	}

	static int getTotalPatients() {
		return totalPatients;
	}
}

public class HospitalManagementSystem {

	static boolean checkInstanceOfPatient(Object obj) {
		return obj instanceof Patient;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient p1 = new Patient("Lathika", "P001", 30, "Flu");
		Patient p2 = new Patient("Lidiya", "P002", 45, "Fracture");
		
		System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());
		
		if (checkInstanceOfPatient(p1)) {
			p1.display();
		} else {
			System.out.println("Invalid Instance");
		}
		if (checkInstanceOfPatient(p2)) {
			p2.display();
		} else {
			System.out.println("Invalid Instance");
		}
	}

}
