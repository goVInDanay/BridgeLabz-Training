package oops_practice.scenario_based.hotel_reservation_system;

class Reservation {
	private Room room;
	private Guest guest;
	private int days;

	Reservation(Room room, Guest guest, int days) {
		this.room = room;
		this.guest = guest;
		this.days = days;
		this.room.setIsBooked(true);
	}

	public Room getRoom() {
		return room;
	}

	public Guest getGuest() {
		return guest;
	}

	public int getDays() {
		return days;
	}

	public void checkIn() {
		this.room.setIsBooked(true);
	}

	public void checkOut() {
		this.room.setIsBooked(false);
	}

	public void generateInvoice(PricingSystem pricingSystem) {
		double amount = 0;
		if (room instanceof StandardRoom) {
			amount = pricingSystem.calculatePrice(((StandardRoom) room).getPrice(), days);
		} else if (room instanceof DeluxeRoom) {
			amount = pricingSystem.calculatePrice(((DeluxeRoom) room).getPrice(), days);
		}
		System.out.println(guest.getName() + " Invoice of: Rs " + amount);
	}
}
