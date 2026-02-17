package collections.scenario_based.ev_charging_management_system;

class NormalPricing implements PricingStrategy {
	private static final double RATE = 10.0;

	@Override
	public double calculateBill(double units) {
		return units * RATE;
	}
}
