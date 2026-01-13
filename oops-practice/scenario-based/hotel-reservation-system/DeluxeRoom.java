package oops_practice.scenario_based.hotel_reservation_system;

class DeluxeRoom extends Room {
	double price;
	DeluxeRoom(int roomNumber, double price) {
		super(roomNumber);
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
}
