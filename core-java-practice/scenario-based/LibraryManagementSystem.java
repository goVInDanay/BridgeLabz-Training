package core_java_practice.scenario_based;

import java.util.*;

public class LibraryManagementSystem {

	// Display all books
	static void displayBooks(String titles[], String authors[], String status[]) {
		System.out.println("\nLibrary Books:");
		for (int i = 0; i < titles.length; i++) {
			System.out.println((i + 1) + ". " + titles[i] + " by " + authors[i] + " - Status: " + status[i]);
		}
	}

	// Search book by partial title
	static int searchBook(String titles[], String authors[], String status[], String keyword) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nSearch Results:");

		for (int i = 0; i < titles.length; i++) {
			if (titles[i].toLowerCase().contains(keyword.toLowerCase())) {
				System.out.println(titles[i] + " by " + authors[i] + " - Status: " + status[i]);
				if(status[i].equals("Available")) {
					System.out.println("Do you want to checkout this book? Y/N");
				}
				else {
					System.out.println("Do you want to return this book? Y/N");
				}
				String s = sc.next();
				if(s.trim().toLowerCase().equals("y")) {
					return i;
				}
			}
		}

		System.out.println("No matching books found.");
		return -1;
	}

	// Update book status (checkout or return)
	static void updateStatus(String titles[], String authors[], String status[], int index) {
		String newStatus;
		if(status[index].equals("Checked Out")) {
			newStatus = "Available";
		}
		else {
			newStatus = "Checked Out";
		}
		if (index >= 0 && index < status.length) {
			status[index] = newStatus;
			System.out.println("Book status updated successfully.");
		} else {
			System.out.println("Invalid book index.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of books");
		int n = sc.nextInt();
		String titles[] = new String[n];
		String authors[] = new String[n];
		String status[] = new String[n];
		System.out.println("Enter book details");
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			titles[i] = sc.nextLine();
			authors[i] = sc.nextLine();
		}
		Arrays.fill(status, "Available");
		while (true) {
			displayBooks(titles, authors, status);
			System.out.println("Enter book to search. Exit to exit");
			String input = sc.nextLine();
			if (input.trim().toLowerCase().equals("exit")) {
				break;
			}
			int idx = searchBook(titles, authors, status, input);
			updateStatus(titles, authors, status, idx);
			displayBooks(titles, authors, status);
		}
	}

}
