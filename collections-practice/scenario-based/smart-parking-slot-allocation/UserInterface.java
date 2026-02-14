package collections.scenario_based.smart_parking_slot_allocation;

public class UserInterface {

	public static void main(String[] args) {
		ParkingLot lot = new ParkingLot(3);

		try {
			lot.parkVehicle(new Car("CAR-101"));
			lot.parkVehicle(new Bike("BIKE-201"));
			lot.parkVehicle(new Car("CAR-102"));
			lot.parkVehicle(new Bike("BIKE-202"));
		} catch (NoParkingSlotAvailableException e) {
			System.out.println("Notice: " + e.getMessage());
		}

		lot.printStatus();
		lot.leaveSlot(2);
		lot.printStatus();
	}

}
