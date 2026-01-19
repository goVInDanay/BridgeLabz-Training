package oops_practice.scenario_based.traffic_manager;

class VehicleFlow {
	Vehicle last;

	public boolean isEmpty() {
		return last == null;
	}

	public void addVehicle(String vehicleNumber) {
		Vehicle vehicle = new Vehicle(vehicleNumber);

		if (isEmpty()) {
			last = vehicle;
			last.next = last;
			System.out.println(last.vehicleNumber + " has entered");
			return;
		}
		vehicle.next = last.next;
		last.next = vehicle;
		last = vehicle;
		System.out.println(vehicle.vehicleNumber + " has entered");
	}

	public void removeVehicle() {
		if (isEmpty()) {
			System.out.println("Empty Cannot remove");
			return;
		}

		Vehicle temp = last.next;
		if (temp == last) {
			System.out.println(temp.vehicleNumber + " exited");
			last = null;
			return;
		}
		System.out.println(temp.vehicleNumber + " has exited");
		last.next = temp.next;
	}

	public void displayVehicles() {
		if (isEmpty()) {
			System.out.println("Empty");
			return;
		}
		System.out.println("Vehicles: ");
		Vehicle temp = last.next;
		do {
			System.out.print(temp.vehicleNumber + " ");
			temp = temp.next;
		} while (temp != last.next);
		System.out.println();
	}
}
