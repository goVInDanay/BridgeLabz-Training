package oops_practice.scenario_based.inventory_management_system;

class Product {
	private int id;
	private String name;
	private int stock;
	private int minStock;

	Product(int id, String name, int stock, int minStock) {
		this.id = id;
		this.name = name;
		this.stock = stock;
		this.minStock = minStock;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() { 
		return name;
	}
	
	public int getStock() {
		return stock;
	}
	
	public int getMinStock() {
		return minStock;
	}
	
	public void updateStock(int stock) {
		this.stock += stock;
	}
}
