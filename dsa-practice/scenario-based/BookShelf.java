package oops_practice.scenario_based;

import java.util.*;

class Book2 {
	private String title;
	private String author;
	boolean available;
	Book2 next;

	Book2(String title, String author) {
		this.title = title;
		this.author = author;
		this.next = null;
		this.available = true;
	}

	public void setAvaiable(boolean available) {
		this.available = available;
	}

	public boolean isAvailable() {
		return available;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthorName() {
		return author;
	}
}

class Books {
	Book2 head;

	public void addBook(String title, String author) {
		Book2 book = new Book2(title, author);
		if (head == null) {
			head = book;
			return;
		} else {
			Book2 temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = book;
		}
		System.out.println("Book added");
	}

	public Book2 searchBook(String name) {
		Book2 temp = head;
		while (temp != null) {
			if (temp.getTitle().equalsIgnoreCase(name) || temp.getAuthorName().equalsIgnoreCase(name)) {
				return temp;
			}
			temp = temp.next;
		}
		return null;
	}

	public void borrowBook(String name) {
		Book2 book = searchBook(name);
		if (book == null) {
			System.out.println("No such book found");
			return;
		}
		if (!book.isAvailable()) {
			System.out.println("Book is not available currently");
			return;
		}
		book.setAvaiable(false);
		System.out.println("Borrowed book " + book.getTitle());
	}

	public void returnBook(String name) {
		Book2 book = searchBook(name);
		if (book == null) {
			System.out.println("No such book found");
			return;
		}
		book.setAvaiable(true);
		System.out.println("Returned book " + book.getTitle());
	}

	public void displayBooks() {
		if (head == null) {
			System.out.println("No books available.");
			return;
		}
		Book2 temp = head;
		while (temp != null) {
			System.out.println(temp.getTitle() + " " + temp.getAuthorName() + " Available: " + temp.isAvailable());
			temp = temp.next;
		}
	}

}

public class BookShelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Map<String, Books> genres = new HashMap<String, Books>();
		Set<String> uniqueBooks = new HashSet<String>();

		while (true) {
			System.out.println("1. Add Book");
			System.out.println("2. Borrow Book");
			System.out.println("3. Return Book");
			System.out.println("4. Display Genre");
			System.out.println("5. Exit");
			System.out.print("Enter choice: ");
			int choice = Integer.parseInt(sc.nextLine());
			if (choice == 5) {
				System.out.println("Exiting");
				break;
			}
			System.out.print("Enter genre: ");
			String genre = sc.nextLine().trim();
			if (!genres.containsKey(genre)) {
				genres.put(genre, new Books());
			}
			Books bookList = genres.get(genre);
			switch (choice) {

			case 1 -> {
				System.out.print("Enter book title: ");
				String title = sc.nextLine().trim();
				System.out.print("Enter author name: ");
				String author = sc.nextLine().trim();
				String unique = genre + title + author;
				if (uniqueBooks.contains(unique)) {
					System.out.println("Duplicate book not allowed.");
				} else {
					bookList.addBook(title, author);
					uniqueBooks.add(unique);
				}
			}

			case 2 -> {
				System.out.print("Enter book title or author: ");
				bookList.borrowBook(sc.nextLine());
			}

			case 3 -> {
				System.out.print("Enter book title or author: ");
				bookList.returnBook(sc.nextLine());
			}
			case 4 -> {
				System.out.println("Books in genre: " + genre);
				bookList.displayBooks();
			}
			default -> {
				System.out.println("Invalid choice.");
			}
			}
		}
	}
}
