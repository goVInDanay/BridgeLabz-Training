package collections.scenario_based.ev_charging_management_system;

public class UserInterface {
	public static void main(String[] args) {
		PricingStrategy normalPricing = new NormalPricing();
		ChargingStation station = new ChargingStation(2, normalPricing);

		Vehicle v1 = new Vehicle("EV101");
		Vehicle v2 = new Vehicle("EV102");
		Vehicle v3 = new Vehicle("EV103");

		try {
			station.bookSlot(v1);
			station.bookSlot(v2);
			station.bookSlot(v3);
		} catch (NoChargingSlotAvailableException e) {
			System.out.println(e.getMessage());
		}

		v1.setUnitsConsumed(20);
		station.releaseSlot(1);

		station.setPricingStrategy(new PeakHourPricing());

		v2.setUnitsConsumed(15);
		station.releaseSlot(2);
	}
}
