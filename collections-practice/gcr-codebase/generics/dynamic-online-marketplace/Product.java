package collections.gcr_codebase.generics.dynamic_online_marketplace;

class Product<T extends Category> {
	private String name;
	private double price;
	private T category;

	Product(String name, double price, T category) {
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	double getPrice() {
		return price;
	}
	
	void setPrice(double price) {
		this.price = price;
	}
	
	String getName() {
		return name;
	}
	
	T getCategory() {
		return category;
	}
}
