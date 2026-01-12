package oops_practice.scenario_based.ecommerce_order_management_system;

class Customer {
	private int customerId;
	private String customerName;
	
	public Customer(int customerId, String customerName) {
		// TODO Auto-generated constructor stub
		this.customerId = customerId;
		this.customerName = customerName;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
}
