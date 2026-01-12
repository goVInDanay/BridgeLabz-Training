package oops_practice.scenario_based.hospital_management_system;

class Patient extends Person {
	private String medicalHistory;

	Patient(int id, String name, int age, String medicalHistory) {
		super(id, name, age);
		this.medicalHistory = medicalHistory;
	}

	public String getMedicalHistory() {
		return medicalHistory;
	}
}
