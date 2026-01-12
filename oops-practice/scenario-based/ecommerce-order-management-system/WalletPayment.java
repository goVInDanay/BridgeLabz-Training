package oops_practice.scenario_based.ecommerce_order_management_system;

class WalletPayment implements Payment {

	@Override
	public void pay(double amount) throws PaymentFailedException {
		if (amount <= 0) {
			throw new PaymentFailedException("Invalid Payment Amount");
		}
		if (amount > 5000) {
			throw new PaymentFailedException("Insufficient Balance in Wallet");
		}
		System.out.println("Payed Rs " + amount + " successfully");
	}
}
