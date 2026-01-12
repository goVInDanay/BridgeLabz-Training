package oops_practice.scenario_based.inventory_management_system;

public class InventoryManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertService alertService = new Alert();
		Inventory inventory = new Inventory(alertService);
		
		Product laptop = new Product(1, "Laptop", 1000, 150);
		inventory.addInventory(laptop);
		
		try { 
			inventory.sellProduct(laptop, 400);
			inventory.sellProduct(laptop, 500);
			inventory.sellProduct(laptop, 200);
		}
		catch (OutOfStockException e) {
			// TODO: handle exception
			System.err.println(e);
		}
	}

}
