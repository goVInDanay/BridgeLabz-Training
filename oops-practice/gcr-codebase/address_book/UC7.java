package oops_practice.gcr_codebase.address_book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

class Contacts2 {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zip;
	private String phoneNumber;
	private String email;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	Contacts2(String firstName, String lastName, String address, String city, String state, int zip, String phoneNumber,
			String email) {
		setFirstName(firstName);
		setLastName(lastName);
		setAddress(address);
		setCity(city);
		setState(state);
		setZip(zip);
		setPhoneNumber(phoneNumber);
		setEmail(email);
	}

	// for those contacts that do not have a last name, zip-code or email
	Contacts2(String firstName, String address, String city, String state, String phoneNumber) {
		setFirstName(firstName);
		setAddress(address);
		setCity(city);
		setState(state);
		setPhoneNumber(phoneNumber);
	}

	// for those contacts that do not have a last name or email
	Contacts2(String firstName, String address, String city, String state, String phoneNumber, int zip) {
		setFirstName(firstName);
		setAddress(address);
		setCity(city);
		setState(state);
		setZip(zip);
		setPhoneNumber(phoneNumber);
	}

	// for those contacts that do not have a last name
	Contacts2(String firstName, String address, String city, String state, String phoneNumber, int zip, String email) {
		setFirstName(firstName);
		setLastName(lastName);
		setAddress(address);
		setCity(city);
		setState(state);
		setZip(zip);
		setPhoneNumber(phoneNumber);
		setEmail(email);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Contacts)) {
			return false;
		}
		Contacts2 other = (Contacts2) obj;
		return firstName.equalsIgnoreCase(other.firstName)
				&& Objects.equals(lastName != null ? lastName.toLowerCase() : null,
						other.lastName != null ? other.lastName.toLowerCase() : null);
	}

	@Override
	public String toString() {
		return firstName + " " + (lastName != null ? lastName : "") + ", Address: " + address + ", " + city + ", "
				+ (zip != 0 ? zip + "," : "") + state + "\nContact Info: " + phoneNumber + " "
				+ (email != null ? email : "");
	}
}

class AddressBook6 {
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
