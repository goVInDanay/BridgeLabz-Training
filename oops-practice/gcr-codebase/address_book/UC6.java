package oops_practice.gcr_codebase.address_book;

import java.util.*;

class AddressBook5 {
	private List<Contacts> contacts = new ArrayList<>();

	public void addContact(Contacts contact) {
		contacts.add(contact);
		System.out.println("Contact added successfully");
	}

	public void editContact(String name, Contacts updatedContact) {
		for (int i = 0; i < contacts.size(); i++) {
			Contacts contact = contacts.get(i);
			if (contact.getFirstName().equalsIgnoreCase(name)
					|| (contact.getLastName() != null && contact.getLastName().equalsIgnoreCase(name))) {
				contacts.set(i, updatedContact);
				System.out.println("Contact updated successfully");
				return;
			}
		}
		System.out.println("Contact not found");
	}

	public void deleteContact(String name) {
		Iterator<Contacts> it = contacts.iterator();
		while (it.hasNext()) {
			Contacts contact = it.next();
			if (contact.getFirstName().equalsIgnoreCase(name)
					|| (contact.getLastName() != null && contact.getLastName().equalsIgnoreCase(name))) {
				it.remove();
				System.out.println("Contact deleted successfully");
				return;
			}
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
