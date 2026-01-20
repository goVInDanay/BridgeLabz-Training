package collections.gcr_codebase.generics.dynamic_online_marketplace;

public class DynamicOnlineMarketplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product<BookCategory> book = new Product<>("Java Book", 500, new BookCategory());
		Product<ClothingCategory> shirt = new Product<>("T-Shirt", 800, new ClothingCategory());

		Discount.applyDiscount(book, 10);
		Discount.applyDiscount(shirt, 20);

		ProductCatalog catalog = new ProductCatalog();
		catalog.addProduct(book);
		catalog.addProduct(shirt);

		for (Product<? extends Category> p : catalog.getProducts()) {
			System.out.println(p.getName() + " | " + p.getCategory().getCategoryName() + " | Price: " + p.getPrice());
		}
	}

}
