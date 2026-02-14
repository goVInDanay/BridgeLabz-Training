package collections.scenario_based.smart_parking_slot_allocation;

abstract class Vehicle {
	private String licensePlate;

	public Vehicle(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " | " + licensePlate;
	}
}
