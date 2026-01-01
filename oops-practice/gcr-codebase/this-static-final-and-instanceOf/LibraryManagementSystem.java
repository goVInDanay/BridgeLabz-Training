package oops_practice.gcr_codebase.this_static_final_and_instanceOf;

class Book {
	private static String libraryName;
	private String title;
	private String author;
	final private String isbn;
	static {
		libraryName = "Egmore Library";
	}

	static void displayLibraryName() {
		System.out.println("Library Name: " + libraryName);
	}

	Book() {
		this("Unknown", "Unknown", "N/A");
	}

	Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}

	void display() {
		displayLibraryName();
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("ISBN: " + isbn);
	}

	static boolean checkInstance(Object obj) {
		return obj instanceof Book;
	}
}

public class LibraryManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("Effective Java", "Joshua Bloch", "978-0134685991");
		LibraryManagementSystem l1 = new LibraryManagementSystem();
		if (Book.checkInstance(b1)) {
			b1.display();
		} else {
			System.err.println("Invalid instance");
		}
		if (Book.checkInstance(l1)) {
			System.out.println("Display");
		} else {
			System.err.println("Invalid instance");
		}
	}

}
