package oops_practice.gcr_codebase.address_book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class AddressBook8 {
	private List<Contacts2> contacts = new ArrayList<>();

	public void addContact(Contacts2 contact) {
		if (contacts.contains(contact)) {
			System.out.println("Duplicate Contact. Cannot add");
			return;
		}
		contacts.add(contact);
		System.out.println("Contact added successfully");
	}

	public void editContact(String name, Contacts2 updatedContact) {
		for (int i = 0; i < contacts.size(); i++) {
			Contacts2 contact = contacts.get(i);
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
		Iterator<Contacts2> it = contacts.iterator();
		while (it.hasNext()) {
			Contacts2 contact = it.next();
			if (contact.getFirstName().equalsIgnoreCase(name)
					|| (contact.getLastName() != null && contact.getLastName().equalsIgnoreCase(name))) {
				it.remove();
				System.out.println("Contact deleted successfully");
				return;
			}
		}
		System.out.println("Contact not found");
	}

	public List<Contacts2> searchByCity(String city) {
		List<Contacts2> ans = new ArrayList<Contacts2>();
		for (Contacts2 contact : contacts) {
			if (contact.getCity().equalsIgnoreCase(city)) {
				ans.add(contact);
			}
		}
		return ans;
	}

	public List<Contacts2> searchByState(String state) {
		List<Contacts2> ans = new ArrayList<Contacts2>();
		for (Contacts2 contact : contacts) {
			if (contact.getState().equalsIgnoreCase(state)) {
				ans.add(contact);
			}
		}
		return ans;
	}

	public List<Contacts2> getContacts() {
		return contacts;
	}

	public void sortContactsByName() {
		if (contacts.isEmpty()) {
			System.out.println("No contacts to sort.");
			return;
		}
		contacts.sort((c1, c2) -> {
			int firstCompare = c1.getFirstName().compareToIgnoreCase(c2.getFirstName());
			if (firstCompare != 0) {
				return firstCompare;
			}
			String last1 = c1.getLastName() != null ? c1.getLastName() : "";
			String last2 = c2.getLastName() != null ? c2.getLastName() : "";
			return last1.compareToIgnoreCase(last2);
		});
		System.out.println("Contacts sorted alphabetically by name:");
		displayContacts();
	}

	public void displayContacts() {
		if (contacts.isEmpty()) {
			System.out.println("No contacts found");
			return;
		}
		System.out.println("Contacts: ");
		for (Contacts2 contact : contacts) {
			System.out.println(contact);
		}
		System.out.println();
	}
}