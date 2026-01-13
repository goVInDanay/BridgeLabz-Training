package oops_practice.scenario_based.hotel_reservation_system;

public class HotelReservationSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hotel hotel = new Hotel(10);

		hotel.addRoom(new StandardRoom(1, 300));
		hotel.addRoom(new DeluxeRoom(2, 550));

		hotel.listRooms();

		Guest g1 = new Guest(1, "Govind");
		Guest g2 = new Guest(2, "Akash");
		PricingSystem pricingSystem1 = new SeasonalPricing(2);
		PricingSystem pricingSystem2 = new SeasonalPricing(3);

		try {
			hotel.bookRoom(1, g1, 3);
			hotel.bookRoom(2, g2, 3);
			hotel.checkOut(g1, pricingSystem1);
			hotel.checkOut(g2, pricingSystem2);
			hotel.bookRoom(1, g1, 3);
			hotel.bookRoom(1, g2, 5);
		} catch (RoomNotAvailableException e) {
			// TODO: handle exception
			System.err.println(e);
		}
	}

}
