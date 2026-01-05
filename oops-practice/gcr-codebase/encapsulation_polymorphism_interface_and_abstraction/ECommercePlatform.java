package oops_practice.gcr_codebase.encapsulation_polymorphism_interface_and_abstraction;

import java.util.*;

import core_java_practice.gcr_codebase.methods.CalculateCalendar;

interface Taxable {
	double calculateTax();

	double getTaxDetails();
}

abstract class Product {
	private int productId;
	private String name;
	private double price;

	Product(int productId, String name, double price) {
		this.productId = productId;
		this.name = name;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	abstract double calculateDiscount();
}

class Electronics extends Product implements Taxable {
	public Electronics(int productId, String name, double price) {
		// TODO Auto-generated constructor stub
		super(productId, name, price);
	}

	@Override
	protected double calculateDiscount() {
		return getPrice() * 0.20;
	}

	@Override
	public double calculateTax() {
		return getPrice() * 0.18;
	}

	@Override
	public double getTaxDetails() {
		return 18;
	}
}

class Clothing extends Product implements Taxable {
	public Clothing(int productId, String name, double price) {
		// TODO Auto-generated constructor stub
		super(productId, name, price);
	}

	@Override
	protected double calculateDiscount() {
		return getPrice() * 0.15;
	}

	@Override
	public double calculateTax() {
		return getPrice() * 0.15;
	}

	@Override
	public double getTaxDetails() {
		return 15;
	}
}

class Groceries extends Product implements Taxable {
	public Groceries(int productId, String name, double price) {
		// TODO Auto-generated constructor stub
		super(productId, name, price);
	}

	@Override
	protected double calculateDiscount() {
		return getPrice() * 0.03;
	}

	@Override
	public double calculateTax() {
		return getPrice() * 0.05;
	}

	@Override
	public double getTaxDetails() {
		return 5;
	}
}

public class ECommercePlatform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> products = new ArrayList<Product>();

		Product p1 = new Electronics(1, "Laptop", 76000);
		Product p2 = new Clothing(2, "Hoodie", 2000);
		Product p3 = new Groceries(3, "Apples", 120);

		products.add(p1);
		products.add(p2);
		products.add(p3);

		calculateFinalPrice(products);
	}

	private static void calculateFinalPrice(List<Product> products) {
		for (Product p : products) {
			double price = p.getPrice();
			double discount = p.calculateDiscount();
			double tax = 0;
			if (p instanceof Taxable) {
				tax = ((Taxable) p).calculateTax();
			}

			double totalPrice = price + tax - discount;
			System.out.println("Product Name: " + p.getName());
			System.out.println("Product Price: " + p.getPrice());
			System.out.println("Discount: " + discount);
			System.out.println("Tax: " + tax);
			System.out.println("Final Price: " + totalPrice);
			System.out.println();
		}
	}

}
