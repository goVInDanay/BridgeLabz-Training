package oops_practice.scenario_based.hotel_reservation_system;

class Guest {
	private int id;
	private String name;

	Guest(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
