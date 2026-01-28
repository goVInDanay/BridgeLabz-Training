package collections.scenario_based.restaurant_table_reservation_system;

class Reservation {
	private Table table;
	private String customerName;

	public Reservation(Table table, String customerName) {
		this.table = table;
		this.customerName = customerName;
	}

	public Table getTable() {
		return table;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void display() {
		System.out.print(customerName + " reserved ");
		table.display();
		System.out.println();
	}
}
