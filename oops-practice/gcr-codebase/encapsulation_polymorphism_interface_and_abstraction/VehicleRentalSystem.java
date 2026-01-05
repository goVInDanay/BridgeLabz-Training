package oops_practice.gcr_codebase.encapsulation_polymorphism_interface_and_abstraction;

import java.util.*;

interface Insurable {
	double calculateInsurance();

	String getInsuranceDetails();
}

abstract class Vehicle {
	private String vehicleNumber;
	private String type;
	private double rentalRate;
	private String policyNumber;

	Vehicle(String vehicleNumber, String type, double rentalRate, String policyNumber) {
		this.vehicleNumber = vehicleNumber;
		this.type = type;
		this.rentalRate = rentalRate;
		this.policyNumber = policyNumber;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getRentalRate() {
		return rentalRate;
	}

	public void setRentalRate(double rentalRate) {
		this.rentalRate = rentalRate;
	}

	protected String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	abstract double calculateRentalCost(int days);

	void displayDetails() {
		System.out.println("Vehicle Number: " + vehicleNumber);
		System.out.println("Vehicle Type: " + type);
		System.out.println("Rental Rate per day: " + rentalRate);
	}
}

class Car extends Vehicle implements Insurable {

	Car(String vehicleNumber, String type, double rentalRate, String policyNumber) {
		super(vehicleNumber, type, rentalRate, policyNumber);
	}

	@Override
	public double calculateRentalCost(int days) {
		return getRentalRate() * days;
	}

	@Override
	public double calculateInsurance() {
		return 400;
	}

	@Override
	public String getInsuranceDetails() {
		return "Insurance Rs 400. Policy Number: " + getPolicyNumber();
	}

}

class Bike extends Vehicle implements Insurable {

	Bike(String vehicleNumber, String type, double rentalRate, String policyNumber) {
		super(vehicleNumber, type, rentalRate, policyNumber);
	}

	@Override
	public double calculateRentalCost(int days) {
		return getRentalRate() * days;
	}

	@Override
	public double calculateInsurance() {
		return 300;
	}

	@Override
	public String getInsuranceDetails() {
		return "Insurance Rs 300. Policy Number: " + getPolicyNumber();
	}

}

class Truck extends Vehicle implements Insurable {

	Truck(String vehicleNumber, String type, double rentalRate, String policyNumber) {
		super(vehicleNumber, type, rentalRate, policyNumber);
	}

	@Override
	public double calculateRentalCost(int days) {
		return getRentalRate() * days;
	}

	@Override
	public double calculateInsurance() {
		return 500;
	}

	@Override
	public String getInsuranceDetails() {
		return "Insurance Rs 500. Policy Number: " + getPolicyNumber();
	}

}

public class VehicleRentalSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(new Car("UP801001", "BMW", 3000, "AIOGH"));
		vehicles.add(new Bike("UP801231", "KTM", 2500, "AGAGG"));
		vehicles.add(new Car("UP801481", "Truck", 6000, "BIUUB"));

		for (Vehicle v : vehicles) {
			v.displayDetails();
			System.out.println("Enter number of days");
			int days = sc.nextInt();
			double rentalCost = v.calculateRentalCost(days);
			double insuranceCost = 0;
			if (v instanceof Insurable) {
				insuranceCost = ((Insurable) v).calculateInsurance();
				System.out.println(((Insurable) v).getInsuranceDetails());
			}
			System.out.println("Rental Cost for " + days + " days is " + rentalCost);
			System.out.println("Insurance Cost: " + insuranceCost);
			System.out.println("Total Cost: " + (insuranceCost + rentalCost));
			System.out.println();
		}
	}

}
