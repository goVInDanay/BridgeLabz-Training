package core_java_practice.scenario_based;

import java.util.*;

class InvalidPhoneNumberException extends Exception {
	public InvalidPhoneNumberException(String message) {
		super(message);
	}
}

class Contact {
	private String name;
	private String phoneNumber;

	public Contact(String name, String phoneNumber) throws InvalidPhoneNumberException {
		// TODO Auto-generated constructor stub
		setName(name);
		setPhoneNumber(phoneNumber);
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhoneNumber(String phoneNumber) throws InvalidPhoneNumberException {
		for (int i = 0; i < phoneNumber.length(); i++) {

			// validates length of the phone number
			if (phoneNumber.length() != 10) {
				throw new InvalidPhoneNumberException("Length of phone number must be 10");
			}

			// validate that phone number does not contain anything other than digits
			if (!Character.isDigit(phoneNumber.charAt(i))) {
				throw new InvalidPhoneNumberException("Phone number can't have anything other than numbers");
			}
			this.phoneNumber = phoneNumber;
		}
	}
}

public class PhoneContactOrganizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		PhoneContactOrganizer pco = new PhoneContactOrganizer();
		List<Contact> contacts = new ArrayList<Contact>();
		while (true) {
			System.out.println("Enter exit to exit. Else enter anything else");
			String input = sc.nextLine();
			if (input.equalsIgnoreCase("exit")) {
				break;
			}
			System.out.println("1. Add Contact\n2. Delete Contact\n3. Search Contact");
			try {
				int n = sc.nextInt();
				switch (n) {
				case 1 -> {
					System.out.println("Enter name");
					sc.nextLine();
					String name = sc.nextLine();
					System.out.println("Enter contact number");
					String phoneNumber = sc.nextLine();
					contacts = pco.addContact(contacts, name, phoneNumber);
				}
				case 2 -> {
					System.out.println("Enter phone number to deleted");
					sc.nextLine();
					String phoneNumber = sc.nextLine();
					contacts = pco.deleteContact(contacts, phoneNumber);
				}
				case 3 -> {
					System.out.println("Enter name to search");
					sc.nextLine();
					String name = sc.nextLine();
					pco.searchContact(contacts, name);
				}
				default -> {
					System.out.println("Choose from 1, 2 or 3");
				}

				}
			} catch (InvalidPhoneNumberException e) {
				System.out.println(e);
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println("Enter a number 1, 2 or 3");
			}
		}
	}

	public List<Contact> addContact(List<Contact> contacts, String name, String phoneNumber)
			throws InvalidPhoneNumberException {
		phoneNumber = phoneNumber.trim();
		for (Contact c : contacts) {

			// validates that phone number is unique
			if (c.getPhoneNumber().equals(phoneNumber)) {
				System.out.println("Duplicate Phone Numbers are not allowed");
				return contacts;
			}
		}
		contacts.add(new Contact(name, phoneNumber));
		System.out.println("Added Contact");
		return contacts;
	}

	// deletes phone number
	public List<Contact> deleteContact(List<Contact> contacts, String phoneNumber) {
		phoneNumber = phoneNumber.trim();
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getPhoneNumber().equals(phoneNumber)) {
				contacts.remove(i);
				System.out.println("Contact deleted successfully");
				return contacts;
			}
		}
		System.out.println("Contact not found");
		return contacts;
	}

	// searches for name
	public void searchContact(List<Contact> contacts, String name) {
		for (Contact c : contacts) {
			if (c.getName().equalsIgnoreCase(name)) {
				System.out.println("Found Contact " + c.getName() + " : " + c.getPhoneNumber());
				return;
			}
		}
		System.out.println("Contact Not Found");
	}

}
