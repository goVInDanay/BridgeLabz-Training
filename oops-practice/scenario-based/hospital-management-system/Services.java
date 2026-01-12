package oops_practice.scenario_based.hospital_management_system;

class Services implements HospitalService {
	Patient patients[] = new Patient[5];
	Doctor doctors[] = new Doctor[5];
	Appointment appointments[] = new Appointment[5];

	private int patientCount = 0;
	private int doctorCount = 0;
	private int appointmentCount = 0;

	@Override
	public void addPatient(Patient patient) {
		patients[patientCount++] = patient;
		System.out.println("Added Patient " + patient.getName());
	}

	@Override
	public void addDoctor(Doctor doctor) {
		doctors[doctorCount++] = doctor;
		System.out.println("Added Doctor " + doctor.getName());
	}

	@Override
	public void deletePatient(Patient patient) {
		for (int i = 0; i < patientCount; i++) {
			if (patients[i].equals(patient)) {
				patients[i] = patients[patientCount - 1];
				patientCount--;
				System.out.println("Patient deleted");
				return;
			}
		}
		System.out.println("Patient not found");
	}

	@Override
	public void bookAppointment(Appointment appointment) throws AppointmentNotAvailableException {
		if (appointmentCount >= appointments.length) {
			throw new AppointmentNotAvailableException("Appointment not available");
		}

		appointments[appointmentCount++] = appointment;
		System.out.println("Appointment booked successfully");
	}

	@Override
	public void cancelAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		for (int i = 0; i < appointmentCount; i++) {
			if(appointments[i].equals(appointment)) {
				for (int j = i; j < appointmentCount - 1; j++) {
	                appointments[j] = appointments[j + 1];
	            }
	            appointments[appointmentCount - 1] = null;
	            appointmentCount--;
	            System.out.println("Appointment cancelled successfully.");
	            return;
			}
		}
		System.out.println("Appointment not found");
	}
}
