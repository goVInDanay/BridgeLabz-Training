package collections.scenario_based.digital_subscription_renewal_system;

class NoDiscount implements DiscountStratergy {

	@Override
	public double applyDiscount(double amount) {
		return amount;
	}
}
