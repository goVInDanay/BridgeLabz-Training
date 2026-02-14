package collections.scenario_based.smart_parking_slot_allocation;

class ParkingSlot {
	private int slotNumber;
	private boolean isFree;
	private Vehicle vehicle;

	public ParkingSlot(int slotNumber) {
		this.slotNumber = slotNumber;
		this.isFree = true;
	}

	public boolean isFree() {
		return isFree;
	}

	public int getSlotNumber() {
		return slotNumber;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void parkVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
		this.isFree = false;
	}

	public void leaveSlot() {
		this.vehicle = null;
		this.isFree = true;
	}

	@Override
	public String toString() {
		return "Slot " + slotNumber + " | " + (isFree ? "Free" : "Occupied by " + vehicle);
	}
}
