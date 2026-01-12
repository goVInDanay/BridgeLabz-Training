package oops_practice.scenario_based.hospital_management_system;

class Appointment {
	private Doctor doctor;
	private Patient patient;
	private String date;

	Appointment(Doctor doctor, Patient patient, String date) {
		this.doctor = doctor;
		this.patient = patient;
		this.date = date;
	}

	public void getAppointmentDetails() {
		System.out.println(
				"Doctor Name: " + doctor.getName() + " Patient Name: " + patient.getName() + " On Date: " + date);
	}
}
