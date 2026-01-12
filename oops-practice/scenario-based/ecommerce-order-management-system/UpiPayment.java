package oops_practice.scenario_based.ecommerce_order_management_system;

class UpiPayment implements Payment {

	@Override
	public void pay(double amount) throws PaymentFailedException {
		if (amount <= 0) {
			throw new PaymentFailedException("Invalid Payment Amount");
		}
		System.out.println("Payed Rs " + amount + " successfully");
	}
}
