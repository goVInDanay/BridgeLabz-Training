package oops_practice.gcr_codebase.inheritance;

class Vehicle {
	private int maxSpeed;
	private String model;

	Vehicle(int maxSpeed, String model) {
		this.maxSpeed = maxSpeed;
		this.model = model;
	}

	void display() {
		System.out.println("Max Speed: " + maxSpeed);
		System.out.println("Model: " + model);
	}
}

interface Refuelable {
	void refuel();
}

class ElectricVehicle extends Vehicle {

	ElectricVehicle(int maxSpeed, String model) {
		super(maxSpeed, model);
	}

	void charge() {
		super.display();
		System.out.println("Charging");
	}
}

class PetrolVehicle extends Vehicle implements Refuelable {
	PetrolVehicle(int maxSpeed, String model) {
		super(maxSpeed, model);
	}

	@Override
	public void refuel() {
		super.display();
		System.out.println("Refueling");
	}

}

public class VehicleManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PetrolVehicle p1 = new PetrolVehicle(160, "BMW");
		ElectricVehicle e1 = new ElectricVehicle(80, "Tesla");
		
		p1.refuel();
		System.out.println();
		e1.charge();
	}

}
