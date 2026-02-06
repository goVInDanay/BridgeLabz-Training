package collections.scenario_based.food_delivery_order_routing_system;

import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeliveryService service = new DeliveryService();
		service.addAgent(new Agent(1, 10));
		service.addAgent(new Agent(2, 14));

		service.addOrder(new Order(101, 12));
		service.addOrder(new Order(102, 314));
		service.addOrder(new Order(103, 21));

		try {
			service.assignOrder();
			service.assignOrder();
			service.assignOrder();
		} catch (NoAgentAvailableException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		System.out.println("Active Deliveres");
		service.viewActiveDeliveries();

		service.cancelOrder(101);
		service.cancelOrder(103);
		try {
			service.assignOrder();
		} catch (NoAgentAvailableException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		service.viewActiveDeliveries();

	}
}
