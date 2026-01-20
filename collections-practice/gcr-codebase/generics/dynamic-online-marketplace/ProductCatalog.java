package collections.gcr_codebase.generics.dynamic_online_marketplace;
import java.util.*;

class ProductCatalog {
	private List<Product<? extends Category>> products = new ArrayList<>();
	
	void addProduct(Product<? extends Category> product) {
		products.add(product);
	}
	
	List<Product<? extends Category>> getProducts() {
		return products;
	}
}
