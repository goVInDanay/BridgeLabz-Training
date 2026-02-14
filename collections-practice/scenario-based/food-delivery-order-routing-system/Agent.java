package collections.scenario_based.food_delivery_order_routing_system;

class Agent {
	private final int agentId;
	private int distance;
	private boolean isAvailable;

	public Agent(int agentId, int distance) {
		this.agentId = agentId;
		this.distance = distance;
		this.isAvailable = true;
	}

	public int getAgentId() {
		return agentId;
	}

	public int getDistance() {
		return distance;
	}

	public boolean getIsAvailable() {
		return isAvailable;
	}

	public void assignOrder() {
		System.out.println("Assigned Order");
		isAvailable = false;
	}

	public void completeOrder() {
		isAvailable = true;
	}
}
