package dsa_practice.gcr_codebase.linked_list;

class BookNode {
	String title;
	String author;
	String genre;
	int bookId;
	boolean available;
	BookNode prev;
	BookNode next;

	BookNode(int bookId, String title, String author, String genre, boolean available) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.available = available;
		this.prev = null;
		this.next = null;
	}
}

class Library {
	BookNode head;
	BookNode tail;
	int size = 0;

	public void addBookAtStart(int bookId, String title, String author, String genre, boolean available) {
		BookNode book = new BookNode(bookId, title, author, genre, available);
		if (head == null) {
			head = tail = book;
		} else {
			book.next = head;
			head.prev = book;
			head = book;
		}
		size++;
	}

	public void addBookAtEnd(int bookId, String title, String author, String genre, boolean available) {
		BookNode book = new BookNode(bookId, title, author, genre, available);
		if (head == null) {
			head = tail = book;
		} else {
			tail.next = book;
			book.prev = tail;
			tail = book;
		}
		size++;
	}

	public void addBookAtPosition(int pos, int bookId, String title, String author, String genre, boolean available) {
		if (pos <= 0 || pos > size + 1) {
			System.out.println("Invalid Position");
			return;
		}
		if (pos == 1) {
			addBookAtStart(bookId, title, author, genre, available);
		}
		if (pos > size) {
			addBookAtEnd(bookId, title, author, genre, available);
		}
		BookNode book = new BookNode(bookId, title, author, genre, available);
		BookNode temp = head;
		for (int i = 1; i < pos - 1; i++) {
			temp = temp.next;
		}

		book.next = temp.next;
		book.prev = temp;
		temp.next.prev = book;
		temp.next = book;
		size++;
	}

	public void removeById(int bookId) {
		BookNode temp = head;
		while (temp != null) {
			if (temp.bookId == bookId) {
				if (temp.prev != null) {
					temp.prev.next = temp.next;
				} else {
					head = temp.next;
				}
				if (temp.next != null) {
					temp.next.prev = temp.prev;
				} else {
					tail = temp.prev;
				}
				size--;
				System.out.println("Book removed successfully.");
				return;
			}
			temp = temp.next;
		}
		System.out.println("Book ID not found.");
	}

	public void searchBook(String key) {
		BookNode temp = head;
		boolean flag = false;
		while (temp != null) {
			if (temp.title.equalsIgnoreCase(key) || temp.author.equalsIgnoreCase(key)) {
				displayBook(temp);
				flag = true;
			}
			temp = temp.next;
		}

		if (!flag) {
			System.out.println("No matching book found.");
		}
	}

	public void updateAvailability(int bookId, boolean status) {
		BookNode temp = head;

		while (temp != null) {
			if (temp.bookId == bookId) {
				temp.available = status;
				System.out.println("Availability updated.");
				return;
			}
			temp = temp.next;
		}
		System.out.println("Book ID not found.");
	}

	void displayForward() {
		if (head == null) {
			System.out.println("Library is empty.");
			return;
		}

		BookNode temp = head;
		while (temp != null) {
			displayBook(temp);
			temp = temp.next;
		}
	}

	void displayReverse() {
		if (tail == null) {
			System.out.println("Library is empty.");
			return;
		}

		BookNode temp = tail;
		while (temp != null) {
			displayBook(temp);
			temp = temp.prev;
		}
	}

	int totalBooks() {
		return size;
	}

	private void displayBook(BookNode b) {
		System.out.println("ID: " + b.bookId + ", Title: " + b.title + ", Author: " + b.author + ", Genre: " + b.genre
				+ ", Available: " + (b.available ? "Yes" : "No"));
	}
}

public class LibraryManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library library = new Library();

        library.addBookAtEnd(1, "1984", "George Orwell", "Dystopian", true);
        library.addBookAtStart(2, "The Hobbit", "J.R.R. Tolkien", "Fantasy", true);
        library.addBookAtPosition(2, 3, "Harry Potter", "J.K. Rowling", "Fantasy", false);

        System.out.println("\nBooks (Forward):");
        library.displayForward();

        System.out.println("\nBooks (Reverse):");
        library.displayReverse();

        System.out.println("\nSearch by Author:");
        library.searchBook("George Orwell");

        System.out.println("\nUpdate Availability:");
        library.updateAvailability(3, true);

        System.out.println("\nRemove Book:");
        library.removeById(2);

        System.out.println("\nTotal Books: " + library.totalBooks());
	}

}
