package collections.scenario_based.ev_charging_management_system;

class PeakHourPricing implements PricingStrategy {
	private static final double RATE = 15.0;

	@Override
	public double calculateBill(double units) {
		return units * RATE;
	}
}
