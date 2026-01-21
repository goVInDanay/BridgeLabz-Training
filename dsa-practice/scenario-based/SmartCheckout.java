package dsa_practice.scenario_based;

import java.util.*;

class Customer {
	String name;
	List<String> items = new ArrayList<String>();

	Customer(String name, List<String> items) {
		this.name = name;
		for (String item : items) {
			this.items.add(item);
		}
	}
}

public class SmartCheckout {

	Queue<Customer> checkoutQueue = new LinkedList<Customer>();
	Map<String, Double> priceMap;
	Map<String, Integer> stockMap;

	public SmartCheckout(Map<String, Double> priceMap, Map<String, Integer> stockMap) {
		// TODO Auto-generated constructor stub
		this.priceMap = priceMap;
		this.stockMap = stockMap;
	}

	public void addCustomer(Customer customer) {
		checkoutQueue.offer(customer);
	}

	public void nextCustomer() {
		Customer customer = checkoutQueue.poll();
		if (customer == null) {
			System.out.println("No customers");
			return;
		}

		double totalBill = 0;
		System.out.println("Customer: " + customer.name);

		for (String item : customer.items) {
			if (!priceMap.containsKey(item)) {
				System.out.println(item + " not avaiable");
				continue;
			}
			int stock = stockMap.getOrDefault(item, 0);
			if (stock <= 0) {
				System.out.println(item + " out of stock");
				continue;
			}

			double price = priceMap.get(item);
			totalBill += price;
			stockMap.put(item, stock - 1);
		}
		System.out.println("Total Bill: " + totalBill);
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Double> priceMap = new HashMap<>();
		priceMap.put("Milk", 35.5);
		priceMap.put("Bread", 55.5);
		priceMap.put("Apple", 102.5);

		Map<String, Integer> stockMap = new HashMap<>();
		stockMap.put("Milk", 10);
		stockMap.put("Bread", 5);
		stockMap.put("Apple", 20);

		SmartCheckout checkout = new SmartCheckout(priceMap, stockMap);

		Customer c1 = new Customer("Akash", Arrays.asList("Milk", "Bread", "Apple"));
		Customer c2 = new Customer("Aman", Arrays.asList("Apple", "Bread", "Milk"));
		Customer c3 = new Customer("Nitai", Arrays.asList("Milk", "Chocolate"));

		checkout.addCustomer(c1);
		checkout.addCustomer(c2);
		checkout.addCustomer(c3);
		
		checkout.nextCustomer();
		checkout.nextCustomer();
		checkout.nextCustomer();
	}

}
