package dsa_practice.gcr_codebase.linked_list;

class ItemNode {
	int itemId;
	String itemName;
	int quantity;
	double price;
	ItemNode next;

	public ItemNode(int itemId, String itemName, int quantity, double price) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
		this.next = null;
	}
}

class InventoryList {
	ItemNode head = null;

	public void addAtStart(int itemId, String itemName, int quantity, double price) {
		ItemNode item = new ItemNode(itemId, itemName, quantity, price);
		item.next = head;
		head = item;
	}

	public void addAtEnd(int itemId, String itemName, int quantity, double price) {
		ItemNode item = new ItemNode(itemId, itemName, quantity, price);
		if (head == null) {
			head = item;
			return;
		}
		ItemNode temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = item;
	}

	public void addAtPosition(int pos, int itemId, String itemName, int quantity, double price) {
		if (pos <= 0) {
			System.out.println("Invalid Position");
		}
		if (pos == 1) {
			addAtStart(itemId, itemName, quantity, price);
		}
		ItemNode item = new ItemNode(itemId, itemName, quantity, price);
		ItemNode temp = head;
		for (int i = 1; i < pos - 1 && temp != null; i++) {
			temp = temp.next;
		}
		if (temp == null) {
			System.out.println("Invalid Position");
			return;
		}
		item.next = temp.next;
		temp.next = item;
	}

	public void removeById(int itemId) {
		if (head == null) {
			return;
		}

		if (head.itemId == itemId) {
			head = head.next;
			return;
		}
		ItemNode temp = head;
		while (temp.next != null && temp.next.itemId != itemId) {
			temp = temp.next;
		}
		if (temp.next == null) {
			System.out.println("Item Not Found");
			return;
		}
		temp.next = temp.next.next;
	}

	public void updateById(int itemId, int quantity) {
		ItemNode temp = head;
		while (temp != null) {
			if (temp.itemId == itemId) {
				temp.quantity = quantity;
				return;
			}
			temp = temp.next;
		}
		System.out.println("Item Not Found");
	}

	public void searchById(int itemId) {
		ItemNode temp = head;
		while (temp != null) {
			if (temp.itemId == itemId) {
				System.out.println("Item ID: " + itemId + " Item Name: " + temp.itemName + " Quantity: " + temp.quantity
						+ " Price: " + temp.price);
				return;
			}
			temp = temp.next;
		}
		System.out.println("Item Not Found");
	}

	public void searchByName(String itemName) {
		ItemNode temp = head;
		while (temp != null) {
			if (temp.itemName.equals(itemName)) {
				System.out.println("Item ID: " + temp.itemId + " Item Name: " + temp.itemName + " Quantity: "
						+ temp.quantity + " Price: " + temp.price);
				return;
			}
			temp = temp.next;
		}
		System.out.println("Item Not Found");
	}

	public double calculateTotalValue() {
		double total = 0;
		ItemNode temp = head;
		while (temp != null) {
			total += temp.quantity * temp.price;
			temp = temp.next;
		}
		return total;
	}

	public void sortByPriceAscending() {
		if (head == null) {
			return;
		}
		ItemNode temp1 = head;
		ItemNode temp2;
		while (temp1 != null) {
			temp2 = temp1.next;
			while (temp2 != null) {
				if (temp1.price > temp2.price) {
					swap(temp1, temp2);
				}
				temp2 = temp2.next;
			}
			temp1 = temp1.next;
		}
	}

	public void sortByPriceDescending() {
		if (head == null) {
			return;
		}
		ItemNode temp1 = head;
		ItemNode temp2;
		while (temp1 != null) {
			temp2 = temp1.next;
			while (temp2 != null) {
				if (temp1.price < temp2.price) {
					swap(temp1, temp2);
				}
				temp2 = temp2.next;
			}
			temp1 = temp1.next;
		}
	}

	public void sortByNameAscending() {
		if (head == null) {
			return;
		}
		ItemNode temp1 = head;
		ItemNode temp2;
		while (temp1 != null) {
			temp2 = temp1.next;
			while (temp2 != null) {
				if (temp1.itemName.compareToIgnoreCase(temp2.itemName) > 0) {
					swap(temp1, temp2);
				}
				temp2 = temp2.next;
			}
			temp1 = temp1.next;
		}
	}

	public void sortByNameDescending() {
		if (head == null) {
			return;
		}
		ItemNode temp1 = head;
		ItemNode temp2;
		while (temp1 != null) {
			temp2 = temp1.next;
			while (temp2 != null) {
				if (temp1.itemName.compareToIgnoreCase(temp2.itemName) < 0) {
					swap(temp1, temp2);
				}
				temp2 = temp2.next;
			}
			temp1 = temp1.next;
		}
	}

	public void swap(ItemNode temp1, ItemNode temp2) {
		int itemId = temp1.itemId;
		String itemName = temp1.itemName;
		int quantity = temp1.quantity;
		double price = temp1.price;

		temp1.itemId = temp2.itemId;
		temp1.itemName = temp2.itemName;
		temp1.quantity = temp2.quantity;
		temp1.price = temp2.price;

		temp2.itemId = itemId;
		temp2.itemName = itemName;
		temp2.quantity = quantity;
		temp2.price = price;
	}

	public void display() {
		ItemNode temp = head;
		while (temp != null) {
			System.out.println("Item ID: " + temp.itemId + " Item Name: " + temp.itemName + " Quantity: "
					+ temp.quantity + " Price: " + temp.price);
			temp = temp.next;
		}
		System.out.println("Total Price: " + calculateTotalValue());
	}
}

public class InventoryManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InventoryList inventory = new InventoryList();

		inventory.addAtEnd(1, "Laptop", 2, 50000);
		inventory.addAtStart(2, "Mouse", 3, 500);
		inventory.addAtEnd(3, "Keyboard", 4, 1000);

		System.out.println("Inventory:");
		inventory.display();
		inventory.updateById(1, 3);
		
		System.out.println();
		System.out.println("After Updating Quantity:");
		inventory.display();
		
		System.out.println();
		System.out.println("Total Inventory Value: " + inventory.calculateTotalValue());
		
		System.out.println("Ascending Price sort");
		inventory.sortByPriceAscending();
		inventory.display();
		
		System.out.println("Descending Price sort");
		inventory.sortByPriceDescending();
		inventory.display();
		
		System.out.println("Ascending name sort");
		inventory.sortByNameAscending();
		inventory.display();
		
		System.out.println("Desscending Name sort");
		inventory.sortByNameDescending();
		inventory.display();
		
		System.out.println();
		System.out.println("Remove Item");
		inventory.removeById(2);
		System.out.println();
		inventory.display();
	}

}
