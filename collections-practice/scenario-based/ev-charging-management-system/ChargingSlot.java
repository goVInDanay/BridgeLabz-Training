package collections.scenario_based.ev_charging_management_system;

class ChargingSlot {
	private int slotId;
	private boolean isAvailable;
	private Vehicle currentVehicle;

	public ChargingSlot(int slotId) {
		this.slotId = slotId;
		this.isAvailable = true;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void assignVehicle(Vehicle vehicle) {
		this.currentVehicle = vehicle;
		this.isAvailable = false;
	}

	public void releaseSlot() {
		this.currentVehicle = null;
		this.isAvailable = true;
	}

	public int getSlotId() {
		return slotId;
	}

	public Vehicle getCurrentVehicle() {
		return currentVehicle;
	}
}
