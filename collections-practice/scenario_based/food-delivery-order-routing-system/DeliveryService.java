package collections.scenario_based.food_delivery_order_routing_system;

import java.util.*;

class DeliveryService {
	private Queue<Order> orders = new LinkedList<Order>();
	private List<Agent> agents = new ArrayList<Agent>();
	private Map<Integer, Integer> activeDeliveries = new HashMap<Integer, Integer>();

	public void addOrder(Order order) {
		System.out.println("Added order");
		orders.add(order);
	}

	public void addAgent(Agent agent) {
		agents.add(agent);
	}

	public void assignOrder() throws NoAgentAvailableException {
		if (orders.isEmpty()) {
			System.out.println("No Orders Pending");
			return;
		}
		Order order = orders.peek();
		Agent agent = findNearestAgent(order);
		if (agent == null) {
			throw new NoAgentAvailableException("No agent available at the moment for order: " + order.getOrderId());
		}
		agent.assignOrder();
		orders.poll();
		activeDeliveries.put(order.getOrderId(), agent.getAgentId());
	}

	private Agent findNearestAgent(Order order) {
		Agent nearestAgent = null;
		int minDistance = Integer.MAX_VALUE;
		for (Agent agent : agents) {
			if (agent.getIsAvailable()) {
				int distance = Math.abs(agent.getDistance() - order.getDistance());
				if (distance < minDistance) {
					nearestAgent = agent;
					minDistance = distance;
				}
			}
		}
		return nearestAgent;
	}

	public void cancelOrder(int orderId) {
		if (activeDeliveries.containsKey(orderId)) {
			int agentId = activeDeliveries.get(orderId);
			activeDeliveries.remove(orderId);
			for (Agent agent : agents) {
				if (agent.getAgentId() == agentId) {
					agent.completeOrder();
					break;
				}
			}
			System.out.println("Order " + orderId + " cancelled");
			return;
		}
		Iterator<Order> iterator = orders.iterator();
		while (iterator.hasNext()) {
			Order order = iterator.next();
			if (order.getOrderId() == orderId) {
				iterator.remove();
				System.out.println("Order " + orderId + " cancelled");
				return;
			}
		}
		System.out.println("Order " + orderId + " not found");
	}

	public void viewActiveDeliveries() {
		for (Map.Entry<Integer, Integer> entry : activeDeliveries.entrySet()) {
			System.out.println("Order: " + entry.getKey() + " assigned to Agent " + entry.getValue());
		}
	}
}
