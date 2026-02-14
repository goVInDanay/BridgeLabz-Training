package collections.scenario_based.restaurant_table_reservation_system;

import java.util.*;

public class ReservationSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant restaurant = new Restaurant();
		restaurant.addTable(new Table(1, 4));
		restaurant.addTable(new Table(2, 2));
		restaurant.addTable(new Table(3, 6));

		try {
			restaurant.reserveTable(1, "Govind");
			restaurant.reserveTable(2, "Akash");
			restaurant.reserveTable(1, "Nitai");
		} catch (TableAlreadyReservedException e) {
			System.out.println("Error: " + e.getMessage());
		}

		restaurant.showAvailableTables();
		restaurant.cancelReservation(2);
		restaurant.showAvailableTables();
	}

}
