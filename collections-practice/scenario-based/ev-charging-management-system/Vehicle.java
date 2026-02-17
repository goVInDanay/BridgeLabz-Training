package collections.scenario_based.ev_charging_management_system;

class Vehicle {
	private String vehicleNumber;
	private double unitsConsumed;

	public Vehicle(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setUnitsConsumed(double units) {
		this.unitsConsumed = units;
	}

	public double getUnitsConsumed() {
		return unitsConsumed;
	}
}
