package collections.gcr_codebase.generics.dynamic_online_marketplace;

class Discount {
	static <T extends Product<? extends Category>> void applyDiscount(T product, double percentage) {
		double discount = product.getPrice() * (percentage / 100);
		product.setPrice(product.getPrice() - discount);
	}
}
