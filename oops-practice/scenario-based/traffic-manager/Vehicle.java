package oops_practice.scenario_based.traffic_manager;

class Vehicle {
	String vehicleNumber;
	Vehicle next;

	Vehicle(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
		this.next = null;
	}
}
