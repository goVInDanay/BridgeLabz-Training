package oops_practice.scenario_based.ecommerce_order_management_system;

class Order {
	private Product product;
	private Customer customer;
	private boolean isCancelled = false;

	Order(Product product, Customer customer) {
		this.product = product;
		this.customer = customer;
	}

	public void placeOrder(Payment payment) {
		try {
			payment.pay(product.getPrice());
			System.out.println(customer.getCustomerName() + " Order placed for " + product.getProductName());
			System.out.println();
		} catch (PaymentFailedException e) {
			System.err.println("Failed to place order : " + e);
		}
	}

	public void cancelOrder() {
		isCancelled = true;
		System.out.println(customer.getCustomerName() + " Order cancelled successfully");
	}
}
