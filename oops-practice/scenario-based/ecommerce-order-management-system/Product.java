package oops_practice.scenario_based.ecommerce_order_management_system;

class Product {
	private String productId;
	private String productName;
	private double price;

	Product(String productId, String productName, double price) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	public String getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
