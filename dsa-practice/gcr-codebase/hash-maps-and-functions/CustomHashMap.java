package dsa_practice.gcr_codebase.hash_maps_and_functions;

class HashMap1 {
	private static class Node {
		int key;
		int value;
		Node next;

		Node(int key, int value) {
			this.key = key;
			this.value = value;
		}
	}

	private int size = 16;
	private Node buckets[];

	public HashMap1() {
		buckets = new Node[size];
	}

	private int getIndex(int key) {
		return Math.abs(key) % size;
	}

	public void put(int key, int value) {
		int index = getIndex(key);
		Node head = buckets[index];
		Node curr = head;
		while (curr != null) {
			if (curr.key == key) {
				curr.value = value;
				return;
			}
			curr = curr.next;
		}
		Node node = new Node(key, value);
		node.next = head;
		buckets[index] = node;
	}

	public int get(int key) {
		int index = getIndex(key);

		Node curr = buckets[index];
		while (curr != null) {
			if (curr.key == key) {
				return curr.value;
			}
			curr = curr.next;
		}
		return -1;
	}

	public void remove(int key) {
		int index = getIndex(key);
		Node curr = buckets[index];
		Node prev = null;
		while (curr != null) {
			if (curr.key == key) {
				if (prev == null) {
					buckets[index] = curr.next;
				} else {
					prev.next = curr.next;
				}
				return;
			}
			prev = curr;
			curr = curr.next;
		}
	}
}

public class CustomHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap1 map = new HashMap1();
        map.put(1, 100);
        map.put(2, 200);
        map.put(17, 300);
        System.out.println("Key 1: " + map.get(1));
        System.out.println("Key 2: " + map.get(2));
        System.out.println("Key 17: " + map.get(17));
        map.remove(1);
        System.out.println("Key 1: " + map.get(1));
	}

}
