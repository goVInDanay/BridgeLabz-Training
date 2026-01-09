package dsa_practice.gcr_codebase.linked_list;

class UndoRedo {
	String text;
	UndoRedo prev;
	UndoRedo next;

	UndoRedo(String text) {
		this.text = text;
		this.prev = null;
		this.next = null;
	}
}

class TextEditor {
	UndoRedo head;
	UndoRedo tail;
	UndoRedo current;
	int size;
	final static int MAX = 10;

	public void addState(String text) {
		UndoRedo node = new UndoRedo(text);

		if (head == null) {
			head = tail = current = node;
		} else {
			tail.next = node;
			node.prev = tail;
			tail = node;
			current = node;
		}

		size++;

		if (size > MAX) {
			head = head.next;
			head.prev = null;
			size--;
		}
	}

	public void undo() {
		if (current != null && current.prev != null) {
			current = current.prev;
		} else {
			System.out.println("Cannot undo");
		}
	}

	public void redo() {
		if (current != null && current.next != null) {
			current = current.next;
		} else {
			System.out.println("Cannot redo");
		}
	}

	public void displayCurrentState() {
		if (current != null) {
			System.out.println("Current Text: " + current.text);
		} else {
			System.out.println("No current text");
		}
	}

	private int countSize() {
		int count = 0;
		UndoRedo temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
}

public class UndoRedoTextEditor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextEditor editor = new TextEditor();

		editor.addState("Hello");
		editor.addState("Hello World");
		editor.addState("Hello World!");
		editor.displayCurrentState();

		editor.undo();
		editor.displayCurrentState();

		editor.undo();
		editor.displayCurrentState();

		editor.redo();
		editor.displayCurrentState();

		editor.addState("Hello Java");
		editor.displayCurrentState();

		editor.redo();
	}

}
