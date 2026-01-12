package oops_practice.scenario_based.ecommerce_order_management_system;

interface Payment {
	void pay(double amount) throws PaymentFailedException;
}