package oops_practice.scenario_based;

import java.util.*;

public class BookArrangement {

	String books[];
	int count = 0;

	public void addBook(String title) {
		int i = count - 1;
		while (i >= 0 && books[i].compareToIgnoreCase(title) > 0) {
			books[i + 1] = books[i];
			i--;
		}
		books[i + 1] = title;
		count++;
		System.out.println("Added " + title);
	}

	public void displayBooks() {
		for (String book : books) {
			System.out.println(book);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BookArrangement obj = new BookArrangement();

		System.out.println("Enter number of books");
		int n = sc.nextInt();
		obj.books = new String[n];
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter title");
			String title = sc.nextLine();
			obj.addBook(title);
		}
		obj.displayBooks();
	}

}
