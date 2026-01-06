package core_java_practice.scenario_based;

import java.util.*;

class BookNotAvailableException extends Exception {
	public BookNotAvailableException(String message) {
		super(message);
	}
}

class Book {
	String title;
	String author;
	boolean isAvailable;

	Book(String title, String author, boolean isAvailable) {
		this.title = title;
		this.author = author;
		this.isAvailable = isAvailable;
	}
}

public class LibraryManagementSystemBookSearch {

	private List<Book> bookList = new ArrayList<Book>();

	// search for the book with partial title too
	public void searchByTitle(String keyword) {
		for (Book b : bookList) {
			if (b.title.toLowerCase().contains(keyword.toLowerCase())) {
				System.out.println(b.title + " : " + b.author + " : " + b.isAvailable);
				return;
			}
		}
		System.out.println("No matching bookList found.");
	}

	// checkout book
	public void checkoutBook(String title) throws BookNotAvailableException {
		for (Book b : bookList) {
			if (b.title.equalsIgnoreCase(title)) {
				if (!b.isAvailable) {
					throw new BookNotAvailableException("Book is already checked out.");
				}
				b.isAvailable = false;
				System.out.println("Book checked out successfully.");
				return;
			}
		}
		System.out.println("Book not found.");
	}

	public void displaybookList() {
		for (Book b : bookList) {
			System.out.println(b.title + " : " + b.author + " : " + (b.isAvailable ? "Available" : "Not Available"));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LibraryManagementSystemBookSearch obj = new LibraryManagementSystemBookSearch();
		try {
			System.out.println("Enter book details");

			// Enter books
			while (true) {
				System.out.println("Enter exit to exit. Else enter anything else");
				String input = sc.nextLine();
				if (input.trim().equalsIgnoreCase("exit")) {
					break;
				}
				String books[] = new String[3];
				System.out.println("Enter book title");
				books[0] = sc.nextLine();
				System.out.println("Enter book author");
				books[1] = sc.nextLine();
				obj.bookList.add(new Book(books[0], books[1], true));
			}
			System.out.println("Choose actions");

			// Perform actions
			while (true) {
				System.out.println("Enter exit to exit. Else enter anything else");
				String input = sc.next();
				if (input.trim().equalsIgnoreCase("exit")) {
					break;
				}
				System.out.println("1. To Search\n2. Checkout Book");
				int n = sc.nextInt();
				switch (n) {
				case 1 -> {
					System.out.println("Enter search value");
					sc.nextLine();
					String title = sc.nextLine();
					obj.searchByTitle(title);
				}
				case 2 -> {
					System.out.println("Enter title to checkout");
					sc.nextLine();
					String title = sc.nextLine();
					obj.checkoutBook(title);
					obj.displaybookList();
				}
				default -> {
					System.out.println("Enter from 1 or 2");
				}
				}
			}

		} catch (BookNotAvailableException e) {
			// TODO: handle exception
			System.out.println(e);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
