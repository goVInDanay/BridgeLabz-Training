package oops_practice.scenario_based.hotel_reservation_system;

class StandardRoom extends Room {
	double price;
	StandardRoom(int roomNumber, double price) {
		super(roomNumber);
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
}
