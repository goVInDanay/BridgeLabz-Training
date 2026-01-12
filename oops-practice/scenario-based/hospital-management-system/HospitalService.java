package oops_practice.scenario_based.hospital_management_system;

interface HospitalService {
	void addPatient(Patient patient);

	void addDoctor(Doctor doctor);

	void deletePatient(Patient patient);

	void bookAppointment(Appointment appointment) throws AppointmentNotAvailableException;

	void cancelAppointment(Appointment appointment);
}
