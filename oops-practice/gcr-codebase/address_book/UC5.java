package oops_practice.gcr_codebase.address_book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class AddressBook4 {
	// UC-5 Add multiple contacts
	private List<Contacts> contacts = new ArrayList<Contacts>();

	// UC-2 Add new Contact to address Book
	public void addContact(Contacts contact) {
		contacts.add(contact);
		System.out.println("Contact added successfully");
	}

	// UC-3 edit contact using name
	public void editContact(String name, Contacts updatedContact) {
		for (int i = 0; i < contacts.size(); i++) {
			Contacts contact = contacts.get(i);
			if (contact.getFirstName().equalsIgnoreCase(name) || contact.getLastName().equalsIgnoreCase(name)) {
				contacts.set(i, updatedContact);
				System.out.println("Contact updated successfully");
				return;
			}
		}
		System.out.println("Contact Not Found");
	}

	// UC-4 delete contact using name
	public void deleteContact(String name) {
		int idx = -1;
		for (int i = 0; i < contacts.size(); i++) {
			Contacts contact = contacts.get(i);
			if (contact.getFirstName().equalsIgnoreCase(name) || contact.getLastName().equalsIgnoreCase(name)) {
				idx = i;
				break;
			}
		}
		if (idx != -1) {
			contacts.remove(idx);
			System.out.println("Contact deleted successfully");
		}
		System.out.println("Contact not found");
	}

	public void displayContacts() {
		if (contacts.isEmpty()) {
			System.out.println("No contacts found");
			return;
		}
		System.out.println("Contacts: ");
		for (Contacts contact : contacts) {
			System.out.println(contact);
		}
		System.out.println();
	}
}

public class UC5 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressBook4 addressBook = new AddressBook4();
		while (true) {
			System.out.println("\nAddress Book Menu:");
			System.out.println("1. Add Contact");
			System.out.println("2. Edit Contact");
			System.out.println("3. Delete Contact");
			System.out.println("4. Display All Contacts");
			System.out.println("5. Exit");
			System.out.print("Choose an option: ");

			String choice = sc.nextLine();
			switch (choice) {
			case "1" -> {
				Contacts contact = inputContact();
				addressBook.addContact(contact);
			}

			case "2" -> {
				System.out.print("Enter first or last name to edit: ");
				String nameToEdit = sc.nextLine();
				System.out.println("Enter updated details:");
				Contacts updatedContact = inputContact();
				addressBook.editContact(nameToEdit, updatedContact);
			}

			case "3" -> {
				System.out.print("Enter first or last name to delete: ");
				String nameToDelete = sc.nextLine();
				addressBook.deleteContact(nameToDelete);
			}

			case "4" -> {
				addressBook.displayContacts();
			}

			case "5" -> {
				System.out.println("Exiting Address Book. Goodbye!");
			}

			default -> {
				System.out.println("Invalid choice. Try again.");
			}
			}
		}
	}

	private static Contacts inputContact() {
		System.out.print("First name: ");
		String firstName = sc.nextLine();

		System.out.print("Last name or 'continue': ");
		String lastName = sc.nextLine();
		if (lastName.equalsIgnoreCase("continue")) {
			lastName = null;
		}
		System.out.print("Address: ");
		String address = sc.nextLine();

		System.out.print("City: ");
		String city = sc.nextLine();

		System.out.print("State: ");
		String state = sc.nextLine();

		System.out.print("ZIP code or 'continue': ");
		String zipInput = sc.nextLine();
		int zip = 0;
		if (!zipInput.equalsIgnoreCase("continue")) {
			try {
				zip = Integer.parseInt(zipInput);
			} catch (NumberFormatException e) {
				System.out.println("Invalid ZIP code. Defaulting to 0.");
			}
		}

		System.out.print("Phone number: ");
		String phoneNumber = sc.nextLine();

		System.out.print("Email or 'continue': ");
		String email = sc.nextLine();
		if (email.equalsIgnoreCase("continue")) {
			email = null;
		}

		if (lastName == null && zip == 0 && email == null) {
			return new Contacts(firstName, address, city, state, phoneNumber);
		} else if (lastName == null && zip != 0 && email == null) {
			return new Contacts(firstName, address, city, state, phoneNumber, zip);
		} else if (lastName == null && zip != 0 && email != null) {
			return new Contacts(firstName, address, city, state, phoneNumber, zip, email);
		} else {
			return new Contacts(firstName, lastName, address, city, state, zip, phoneNumber, email);
		}
	}

}
