package oops_practice.gcr_codebase.encapsulation_polymorphism_interface_and_abstraction;
import java.awt.geom.GeneralPath;
import java.util.*;

interface Discountable {
	double applyDiscount();

	String getDiscountDetails();
}

abstract class FoodItem {
	private String itemName;
	private double price;
	private int quantity;

	FoodItem(String itemName, double price, int quantity){
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}

	public String getItemName() {
		return itemName;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setItemName(String itemName) {
		if (itemName == null || itemName.isEmpty()) {
			throw new IllegalArgumentException("Name cannot be empty");
		}
		this.itemName = itemName;
	}

	public void setPrice(double price) {
		if (price <= 0) {
			throw new IllegalArgumentException("Price must be positive");
		}
		this.price = price;
	}

	public void setQuantity(int quantity) {
		if (quantity <= 0) {
			throw new IllegalArgumentException("Quantity must be positive");
		}
		this.quantity = quantity;
	}

	abstract double calculateTotalPrice();

	void getItemDetails() {
		System.out.println("Item Name: " + itemName);
		System.out.println("Price: " + price);
		System.out.println("Quantity: " + quantity);
	}
}

class VegItem extends FoodItem implements Discountable {

	private static final double DISCOUNT = 0.15;
	
	VegItem(String itemName, double price, int quantity){
		super(itemName, price, quantity);
	}
	
	@Override
	public double applyDiscount() {
		return getPrice() * DISCOUNT * getQuantity();
	}
	
	@Override
	public String getDiscountDetails() {
		return "Discount is " + DISCOUNT + " %";
	}
	
	@Override
	public double calculateTotalPrice() {
		return getQuantity() * getPrice() - applyDiscount();
	}
}

class NonVegItem extends FoodItem implements Discountable {

	private static final double DISCOUNT = 0.13;
	double additionalCharges;
	
	NonVegItem(String itemName, double price, int quantity, double additionalCharges){
		super(itemName, price, quantity);
		this.additionalCharges = additionalCharges;
	}
	
	@Override
	public double applyDiscount() {
		return getPrice() * DISCOUNT * getQuantity();
	}
	
	@Override
	public String getDiscountDetails() {
		return "Discount is " + DISCOUNT +" %";
	}
	
	@Override
	public double calculateTotalPrice() {
		System.out.println("Additional Charges: Rs " + additionalCharges);
		return getQuantity() * (getPrice() + additionalCharges) - applyDiscount();
	}
}

public class OnlineFoodDeliverySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<FoodItem> items = new ArrayList<FoodItem>();
		
		items.add(new VegItem("Paneer Tikka", 150, 4));
		items.add(new NonVegItem("Chicken 65", 250, 1, 15));
		for (FoodItem item : items) {
			double discount = 0;
			if (item instanceof Discountable) {
				discount = ((Discountable) item).applyDiscount();
			}
			item.getItemDetails();
			double totalAmount = item.calculateTotalPrice();
			System.out.println("Discount: Rs " + discount);
			System.out.println("Total Price: Rs " + totalAmount);
			System.out.println();
		}
	}

}
