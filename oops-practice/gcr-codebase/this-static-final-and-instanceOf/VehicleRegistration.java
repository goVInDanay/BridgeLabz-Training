package oops_practice.gcr_codebase.this_static_final_and_instanceOf;

import java.beans.VetoableChangeListener;

class Vehicle {
	private static double registrationFee;
	private String ownerName;
	private String vehicleType;
	final private String registrationNumber;

	static {
		registrationFee = 150;
	}

	Vehicle(String ownerName, String vehicleType, String registrationNumber) {
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
		this.registrationNumber = registrationNumber;
	}

	void display() {
		System.out.println("Owner Name: " + ownerName);
		System.out.println("Vehicle Type: " + vehicleType);
		System.out.println("Registration Number: " + registrationNumber);
		System.out.println("Registration Fee: " + registrationFee);
		System.out.println();
	}

	static void updateRegistrationFee(double registrationFee) {
		Vehicle.registrationFee = registrationFee;
	}
}

public class VehicleRegistration {

	static boolean checkInstanceOfVehicle(Object obj) {
		return obj instanceof Vehicle;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Vehicle("Honest raj", "Sedan", "ABC123");
		Vehicle v2 = new Vehicle("Price danish", "SUV", "XYZ789");
		if (checkInstanceOfVehicle(v1)) {
			v1.display();
		} else {
			System.out.println("Invalid Instance");
		}
		if (checkInstanceOfVehicle(v2)) {
			v2.display();
		} else {
			System.out.println("Invalid Instance");
		}
	}

}
