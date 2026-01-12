package oops_practice.scenario_based.ecommerce_order_management_system;

public class ECommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product laptop = new Product("L001", "HP Victus", 76000);
		Product mobile = new Product("M001", "Samsung S24", 85000);
		Product tablet = new Product("T001", "Samsung A12", 20000);

		Customer customer1 = new Customer(1, "Govind");
		Customer customer2 = new Customer(1, "Akash");
		Customer customer3 = new Customer(3, "Nitai");

		Order order1 = new Order(laptop, customer1);
		Order order2 = new Order(mobile, customer2);
		Order order3 = new Order(tablet, customer3);

		Payment payment1 = new UpiPayment();
		Payment payment2 = new CardPayment();
		Payment payment3 = new WalletPayment();

		order1.placeOrder(payment1);
		order2.placeOrder(payment2);
		order2.cancelOrder();
		order3.placeOrder(payment3);
	}

}
