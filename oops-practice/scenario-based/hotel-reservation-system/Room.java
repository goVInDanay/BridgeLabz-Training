package oops_practice.scenario_based.hotel_reservation_system;

class Room {
	protected int roomNumber;
	protected boolean isBooked;

	Room(int roomNumber) {
		this.roomNumber = roomNumber;
		this.isBooked = false;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
	
	public boolean isBooked() {
		return isBooked;
	}
	
	public void setIsBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}
	
}
