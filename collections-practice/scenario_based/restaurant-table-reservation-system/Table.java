package collections.scenario_based.restaurant_table_reservation_system;

class Table {
	private int number;
	private int capacity;
	Table(int number, int capacity){
		this.number = number;
		this.capacity = capacity;
	}
	public int  getTableNumber() {
		return number;
	}
	
	public int  getCapacity() {
		return capacity;
	}
	
	public void display() {
		System.out.println("Table: " + number + " Capacity: " + capacity);
	}
}
