package collections.scenario_based.restaurant_table_reservation_system;

public class TableAlreadyReservedException extends Exception {
	public TableAlreadyReservedException(String message) {
		super(message);
	}
}
