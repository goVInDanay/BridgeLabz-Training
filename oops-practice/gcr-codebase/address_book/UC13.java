package oops_practice.gcr_codebase.address_book;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class AddressBook10 {
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

	public void sortContactsByCity() {
		if (contacts.isEmpty()) {
			System.out.println("No contacts to sort.");
			return;
		}
		contacts.sort((c1, c2) -> c1.getCity().compareToIgnoreCase(c2.getCity()));
		System.out.println("Contacts sorted by City:");
		displayContacts();
	}

	public void sortContactsByState() {
		if (contacts.isEmpty()) {
			System.out.println("No contacts to sort.");
			return;
		}
		contacts.sort((c1, c2) -> c1.getState().compareToIgnoreCase(c2.getState()));
		System.out.println("Contacts sorted by State:");
		displayContacts();
	}

	public void sortContactsByZip() {
		if (contacts.isEmpty()) {
			System.out.println("No contacts to sort.");
			return;
		}
		contacts.sort((c1, c2) -> Integer.compare(c1.getZip(), c2.getZip()));
		System.out.println("Contacts sorted by ZIP:");
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

	public void writeToFile(String filePath) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
			for (Contacts2 contact : contacts) {
				writer.write(contact.getFirstName() + "," + (contact.getLastName() != null ? contact.getLastName() : "")
						+ "," + contact.getAddress() + "," + contact.getCity() + "," + contact.getState() + ","
						+ contact.getZip() + "," + contact.getPhoneNumber() + ","
						+ (contact.getEmail() != null ? contact.getEmail() : ""));
				writer.newLine();
			}
			System.out.println("Address Book successfully written to file.");
		} catch (IOException e) {
			System.out.println("Error writing to file: " + e.getMessage());
		}
	}
}