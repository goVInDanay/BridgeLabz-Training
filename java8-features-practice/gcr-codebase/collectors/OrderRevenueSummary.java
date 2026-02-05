package java8_features_practice.gcr_codebase.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Order {
	String customer;
	double total;

	Order(String customer, double total) {
		this.customer = customer;
		this.total = total;
	}

	public String getCustomer() {
		return customer;
	}

	public double getTotal() {
		return total;
	}
}

public class OrderRevenueSummary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Order> orders = Arrays.asList(new Order("Aman", 1000), new Order("Akash", 814), new Order("Nitai", 2352),
				new Order("Aman", 145114));
		Map<String, Double> orderTotal = orders.stream()
				.collect(Collectors.groupingBy(Order::getCustomer, Collectors.summingDouble(Order::getTotal)));
		System.out.println(orderTotal);
	}

}
