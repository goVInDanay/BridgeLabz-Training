package oops_practice.gcr_codebase.this_static_final_and_instanceOf;

class Product {
	private static double discount;
	private String productName;
	final private String productId;
	private double price;
	private int quantity;

	static {
		discount = 10;
	}

	static void updateDiscount(double discount) {
		Product.discount = discount;
	}

	Product(String productName, double price, int quantity, String productID) {
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.productId = productID;
	}

	void display() {
		System.out.println("Product ID: " + productId);
		System.out.println("Product Name: " + productName);
		System.out.println("Price: " + price);
		System.out.println("Quantity: " + quantity);
		System.out.println("Discount: " + discount + "%");
		System.out.println("Price after Discount: " + calculateCost());
		System.out.println();
	}

	double calculateCost() {
		return price - ((discount * price) / 100);
	}
}

public class ShoppingCartSystem {
	static boolean checkInstanceOfProduct(Object obj) {
		return obj instanceof Product;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product("Laptop", 1200, 5, "P001");
		Product p2 = new Product("SmartPhone", 800, 10, "P002");
		if (checkInstanceOfProduct(p1)) {
			p1.display();
		} else {
			System.out.println("Invalid Instance");
		}
		if (checkInstanceOfProduct(p2)) {
			p2.display();
		} else {
			System.out.println("Invalid Instance");
		}
	}

}
