package collections.scenario_based.food_delivery_order_routing_system;

class Order {
	private final int orderId;
	private final int distance;

	public Order(int orderId, int distance) {
		this.orderId = orderId;
		this.distance = distance;
	}

	public int getOrderId() {
		return orderId;
	}

	public int getDistance() {
		return distance;
	}
}
