package oops_practice.scenario_based;

import java.util.ArrayList;
import java.util.List;

interface IRentable {
	double calculateRent(int days);
}

class Vehicle {
	protected String vehicleNumber;
	protected String type;
	protected double rate;

	Vehicle(String vehicleNumber, String type, double rate) {
		this.vehicleNumber = vehicleNumber;
		this.type = type;
		this.rate = rate;
	}

	/* Encapsulation */
	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public String getType() {
		return type;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	void displayDetails() {
		System.out.println("Vehicle Number: " + vehicleNumber);
		System.out.println("Vehicle Type: " + type);
		System.out.println("Rate Per Day: " + rate);
	}
}

class Bike extends Vehicle implements IRentable {
	public Bike(String vehicleNumber, String type, double rate) {
		super(vehicleNumber, type, rate);
	}

	/* Polymophism */
	@Override
	public double calculateRent(int days) {
		// TODO Auto-generated method stub
		return rate * days;
	}

	@Override
	void displayDetails() {
		// TODO Auto-generated method stub
		super.displayDetails();
	}
}

class Car extends Vehicle implements IRentable {
	public Car(String vehicleNumber, String type, double rate) {
		super(vehicleNumber, type, rate);
	}

	/* Polymophism */
	@Override
	public double calculateRent(int days) {
		// TODO Auto-generated method stub
		return rate * days + 1000;
	}

	@Override
	void displayDetails() {
		// TODO Auto-generated method stub
		super.displayDetails();
	}
}

// Inheritance
class Truck extends Vehicle implements IRentable {
	public Truck(String vehicleNumber, String type, double rate) {
		super(vehicleNumber, type, rate);
	}

	/* Polymophism */
	@Override
	public double calculateRent(int days) {
		// TODO Auto-generated method stub
		return rate * days + 3000;
	}

	@Override
	void displayDetails() {
		// TODO Auto-generated method stub
		super.displayDetails();
	}
}

class Customer {
	protected String name;
	protected int age;

	public Customer(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}

	/* Encapsulation */
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void displayInfo() {
		System.out.println("Name: " + name + " Age: " + age);
		System.out.println();
	}
}

public class VehicleRentalApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Create */
		List<Customer> customers = new ArrayList<Customer>();
		List<Vehicle> vehicles = new ArrayList<Vehicle>();

		customers.add(new Customer("Govind", 22));
		customers.add(new Customer("Akash", 17));
		customers.add(new Customer("Aman", 25));

		vehicles.add(new Bike("BUAO134123", "KTM", 120));
		vehicles.add(new Car("AINO491821", "BMW", 300));
		vehicles.add(new Truck("AFSI132923", "Trucl", 500));

		/* Read */
		for (Customer c : customers) {
			if (c.getAge() >= 18) {
				for (Vehicle v : vehicles) {
					v.displayDetails();
					if (v instanceof IRentable) {
						System.out.println("Total Amount: " + ((IRentable) v).calculateRent(3));
					}
					System.out.println();
				}
			}
		}

		/* Update */
		vehicles.get(0).setRate(150);
		vehicles.get(0).displayDetails();

		/* Delete */
		vehicles.remove(0);

		for (Vehicle v : vehicles) {
			v.displayDetails();
			System.out.println();
		}

	}

}
