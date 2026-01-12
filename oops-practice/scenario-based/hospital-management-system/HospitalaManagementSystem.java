package oops_practice.scenario_based.hospital_management_system;

public class HospitalaManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HospitalService service = new Services();
		Doctor doctor = new Doctor(1, "Govind", 25, 500);
		Patient patient = new Patient(1, "Akash", 22, "Underweight");
		
		service.addDoctor(doctor);
		service.addPatient(patient);
		
		try {
			Appointment appointment1 = new Appointment(doctor, patient, "14 Jan 2026");
			service.bookAppointment(appointment1);
			Appointment appointment2 = new Appointment(doctor, patient, "15 Jan 2026");
			service.bookAppointment(appointment2);
			service.cancelAppointment(appointment2);
			service.deletePatient(patient);
		}
		catch (AppointmentNotAvailableException e) {
			// TODO: handle exception
			System.err.println(e);
		}
		
		System.out.println("Doctor Fee: " + doctor.getConsultationFee());
	}

}
