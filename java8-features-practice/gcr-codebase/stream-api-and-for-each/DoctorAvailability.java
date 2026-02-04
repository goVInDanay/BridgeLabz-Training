package java8_features_practice.gcr_codebase.stream_api_and_for_each;

import java.util.List;

class Doctor {
	String name;
	String specialty;
	boolean availableOnWeekend;

	Doctor(String name, String specialty, boolean availableOnWeekend) {
		this.name = name;
		this.specialty = specialty;
		this.availableOnWeekend = availableOnWeekend;
	}

	@Override
	public String toString() {
		return name + " | " + specialty + " | Available On Weekends? " + (availableOnWeekend ? "YES" : "NO");
	}
}

public class DoctorAvailability {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Doctor> doctors = List.of(new Doctor("Govind", "Cardiology", true),
				new Doctor("Akash", "Dermatology", false), new Doctor("Nital", "Weight", true),
				new Doctor("Aman", "Neurology", true));

		List<Doctor> availableDoctors = doctors.stream().filter(doctor -> doctor.availableOnWeekend)
				.sorted((d1, d2) -> d1.specialty.compareTo(d2.specialty)).toList();
		availableDoctors.forEach(System.out::println);
	}

}
