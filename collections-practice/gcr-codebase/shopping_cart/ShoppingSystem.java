package collections.gcr_codebase.shopping_cart;

public class ShoppingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoppingCart cart = new ShoppingCart();

		cart.addItem("Apple", 50.0);
		cart.addItem("Banana", 20.0);
		cart.addItem("Orange", 30.0);
		cart.addItem("Apple", 25.0);
		cart.addItem("Mango", 80.0);
		cart.addItem("Banana", 10.0);

		cart.displayItems();
		cart.displayOrder();
		cart.displayPrice();
	}

}
