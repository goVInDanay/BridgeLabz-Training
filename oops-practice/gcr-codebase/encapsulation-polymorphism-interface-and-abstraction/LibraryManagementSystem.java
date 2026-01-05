package oops_practice.gcr_codebase.encapsulation_polymorphism_interface_and_abstraction;

import java.util.*;

interface Reservable {
	void reserveItem();

	boolean checkAvailability();
}

abstract class LibraryItem {
	private String itemId;
	private String title;
	private String author;
	private String borrower;

	LibraryItem(String itemId, String title, String author) {
		this.itemId = itemId;
		this.title = title;
		this.author = author;
		this.borrower = null;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		if (itemId == null || itemId.isEmpty()) {
			throw new IllegalArgumentException("Item ID cannot be empty");
		}
		this.itemId = itemId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if (title == null || title.isEmpty()) {
			throw new IllegalArgumentException("Title cannot be empty");
		}
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		if (author == null || author.isEmpty()) {
			throw new IllegalArgumentException("Author name cannot be empty");
		}
		this.author = author;
	}

	public String getBorrower() {
		return borrower;
	}

	public void setBorrower(String borrower) {
		if (borrower == null || borrower.isEmpty()) {
			throw new IllegalArgumentException("Borrower name cannot be empty");
		}
		this.borrower = borrower;
	}

	abstract int getLoanDuration();

	void getItemDetails() {
		System.out.println("Item ID: " + itemId);
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Borrower: " + (borrower != null ? borrower : "Available"));
	}
}

class Book extends LibraryItem implements Reservable {

	Book(String itemId, String title, String author) {
		super(itemId, title, author);
	}

	@Override
	public int getLoanDuration() {
		return 14;
	}

	@Override
	public void reserveItem() {
		if (checkAvailability()) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter borrower name");
			String borrower = sc.nextLine();
			setBorrower(borrower);
			System.out.println("Book reserved by: " + borrower);
		} else {
			System.out.println("Book already reserved by: " + getBorrower());
		}
	}

	public boolean checkAvailability() {
		return getBorrower() == null;
	}
}

class Magazine extends LibraryItem implements Reservable {

	Magazine(String itemId, String title, String author) {
		super(itemId, title, author);
	}

	@Override
	public int getLoanDuration() {
		return 14;
	}

	@Override
	public void reserveItem() {
		if (checkAvailability()) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter borrower name");
			String borrower = sc.nextLine();
			setBorrower(borrower);
			System.out.println("Book reserved by: " + borrower);
		} else {
			System.out.println("Book already reserved by: " + getBorrower());
		}
	}

	public boolean checkAvailability() {
		return getBorrower() == null;
	}
}

class DVD extends LibraryItem implements Reservable {

	DVD(String itemId, String title, String author) {
		super(itemId, title, author);
	}

	@Override
	public int getLoanDuration() {
		return 14;
	}

	@Override
	public void reserveItem() {
		if (checkAvailability()) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter borrower name");
			String borrower = sc.nextLine();
			setBorrower(borrower);
			System.out.println("Book reserved by: " + borrower);
		} else {
			System.out.println("Book already reserved by: " + getBorrower());
		}
	}

	public boolean checkAvailability() {
		return getBorrower() == null;
	}
}

public class LibraryManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<LibraryItem> items = new ArrayList<LibraryItem>();
		items.add(new Book("100", "One Piece", "Eiichiro Oda"));
		items.add(new Magazine("101", "India Times", "India"));
		items.add(new DVD("102", "LOTR", "JRR Tolkien"));

		for (LibraryItem item : items) {
			item.getItemDetails();
			System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
			if (item instanceof Reservable) {
				((Reservable) item).reserveItem();
			}
			System.out.println();
		}

		for (LibraryItem item : items) {
			item.getItemDetails();
			System.out.println();
		}
		
	}

}
