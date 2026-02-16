package oops_practice.gcr_codebase.address_book;

import java.util.*;

class AddressBookManager2 {
	private List<AddressBook7> addressBooks = new ArrayList<>();
	private Map<String, List<Contacts2>> cityDictionary = new HashMap<>();
	private Map<String, List<Contacts2>> stateDictionary = new HashMap<>();

	public void addAddressBook(AddressBook7 book) {
		addressBooks.add(book);
		for (Contacts2 contact : book.getContacts()) {
			addToDictionaries(contact);
		}
	}

	public void addContact(AddressBook6 book, Contacts2 contact) {
		book.addContact(contact);
		addToDictionaries(contact);
	}

	private void addToDictionaries(Contacts2 contact) {
		if (contact.getCity() != null) {
			cityDictionary.computeIfAbsent(contact.getCity().toLowerCase(), k -> new ArrayList<>()).add(contact);
		}
		if (contact.getState() != null) {
			stateDictionary.computeIfAbsent(contact.getState().toLowerCase(), k -> new ArrayList<>()).add(contact);
		}
	}

	public List<Contacts2> getContactsByCity(String city) {
		return cityDictionary.getOrDefault(city.toLowerCase(), Collections.emptyList());
	}

	public List<Contacts2> getContactsByState(String state) {
		return stateDictionary.getOrDefault(state.toLowerCase(), Collections.emptyList());
	}

	public void displayContactsByCity(String city) {
		List<Contacts2> persons = getContactsByCity(city);
		if (persons.isEmpty()) {
			System.out.println("No persons found in city: " + city);
			return;
		}
		System.out.println("Contacts in city " + city + ":");
		persons.forEach(System.out::println);
	}

	public void displayContactsByState(String state) {
		List<Contacts2> persons = getContactsByState(state);
		if (persons.isEmpty()) {
			System.out.println("No persons found in state: " + state);
			return;
		}
		System.out.println("Contacts in state " + state + ":");
		persons.forEach(System.out::println);
	}

	public int getCountByCity(String city) {
		return cityDictionary.getOrDefault(city.toLowerCase(), Collections.emptyList()).size();
	}

	public int getCountByState(String state) {
		return stateDictionary.getOrDefault(state.toLowerCase(), Collections.emptyList()).size();
	}

	public void displayCountByCity(String city) {
		int count = getCountByCity(city);
		System.out.println("Number of contacts in city " + city + ": " + count);
	}

	public void displayCountByState(String state) {
		int count = getCountByState(state);
		System.out.println("Number of contacts in state " + state + ": " + count);
	}
}