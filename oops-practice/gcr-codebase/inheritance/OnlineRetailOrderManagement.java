package oops_practice.gcr_codebase.inheritance;

class Order {
	private int orderId;
	private String orderDate;

	Order(int orderId, String orderDate) {
		this.orderId = orderId;
		this.orderDate = orderDate;
	}

	String getOrderStatus() {
		return "Order placed on " + orderDate + " with order ID: " + orderId;
	}
}

class ShippedOrder extends Order {
	private String trackingNumber;

	ShippedOrder(int orderId, String orderDate, String trackingNumber) {
		super(orderId, orderDate);
		this.trackingNumber = trackingNumber;
	}

	@Override
	String getOrderStatus() {
		return super.getOrderStatus() + ".\nOrder shipped with tracking number: " + trackingNumber;
	}

}

class DeliveredOrder extends ShippedOrder {
	private String deliveryDate;

	DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
		super(orderId, orderDate, trackingNumber);
		this.deliveryDate = deliveryDate;
	}

	String getOrderStatus() {
		return super.getOrderStatus() + ".\nOrder delivered on: " + deliveryDate;
	}

}

public class OnlineRetailOrderManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order1 = new Order(1, "12-2-2025");
		Order order2 = new ShippedOrder(2, "13-12-2025", "1251412451");
		Order order3 = new DeliveredOrder(3, "19-01-2026", "32515321532", "22-01-2026");
		System.out.println(order1.getOrderStatus() + "\n");
		System.out.println(order2.getOrderStatus() + "\n");
		System.out.println(order3.getOrderStatus() + "\n");
	}

}
