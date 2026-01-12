package oops_practice.scenario_based.inventory_management_system;

public class Alert implements AlertService {
	
	@Override
	public void sendAlert(Product product) {
		System.err.println("ALERT Remaining Stock: " + product.getMinStock() + " for Product " + product.getName());
	}
}
