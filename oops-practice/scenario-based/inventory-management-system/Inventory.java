package oops_practice.scenario_based.inventory_management_system;

class Inventory {
	private Product products[];
	private int countProducts;
	private AlertService alertService;

	Inventory(AlertService alertService) {
		this.alertService = alertService;
		products = new Product[100];
	}

	public void addInventory(Product product) {
		if (countProducts < 100) {
			products[countProducts] = product;
			System.out.println("Added product " + product.getName());
		}
	}

	public void sellProduct(Product product, int quantity) throws OutOfStockException {
		if (product == null) {
			System.out.println("Product not found");
			return;
		}

		if (product.getStock() < quantity) {
			throw new OutOfStockException("Insufficient Stocks");
		}

		product.updateStock(-quantity);
		System.out.println("Sold " + quantity + " of " + product.getName());
		if (product.getStock() <= product.getMinStock()) {
			alertService.sendAlert(product);
		}
	}
}
