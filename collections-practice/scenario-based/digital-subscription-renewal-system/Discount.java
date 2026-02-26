package collections.scenario_based.digital_subscription_renewal_system;

class Discount implements DiscountStratergy {

	@Override
	public double applyDiscount(double amount) {
		return amount - (0.2 * amount);
	}
}
