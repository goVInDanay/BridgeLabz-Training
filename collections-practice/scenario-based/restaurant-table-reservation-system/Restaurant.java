package collections.scenario_based.restaurant_table_reservation_system;

import java.util.*;

class Restaurant {
	private Map<Integer, Table> tables;
	private List<Reservation> reservations;

	public Restaurant() {
		tables = new HashMap<>();
		reservations = new ArrayList<>();
	}

	public void addTable(Table table) {
		tables.put(table.getTableNumber(), table);
	}

	public void reserveTable(int tableNumber, String customerName) throws TableAlreadyReservedException {
		Table table = tables.get(tableNumber);
		if (table == null) {
			System.out.println("Table " + tableNumber + " does not exist.");
			return;
		}

		for (Reservation res : reservations) {
			if (res.getTable().getTableNumber() == tableNumber) {
				throw new TableAlreadyReservedException("Table " + tableNumber + " is already reserved");
			}
		}
		Reservation reservation = new Reservation(table, customerName);
		reservations.add(reservation);
		reservation.display();
	}

	public void cancelReservation(int tableNumber) {
		Reservation res = null;
		for (Reservation reservation : reservations) {
			if (reservation.getTable().getTableNumber() == tableNumber) {
				res = reservation;
				break;
			}
		}
		if (res != null) {
			reservations.remove(res);
			System.out.println("Reservation cancelled for Table " + tableNumber);
		} else {
			System.out.println("No such table found");
		}
	}

	public void showAvailableTables() {
		System.out.println("Available tables: ");
		for (Table table : tables.values()) {
			boolean isReserved = false;
			for (Reservation res : reservations) {
				if (res.getTable().getTableNumber() == table.getTableNumber()) {
					isReserved = true;
					break;
				}
			}
			if (!isReserved) {
				table.display();
			}
		}
	}
}
