package dsa_practice.gcr_codebase.linked_list;

class TaskNode{
	int taskId;
	String taskName;
	int priority;
	String dueDate;
	TaskNode next;
	TaskNode(int taskId, String taskName, int priority, String dueDate){
		this.taskId = taskId;
		this.taskName = taskName;
		this.priority = priority;
		this.dueDate = dueDate;
		this.next = null;
	}
}

class TaskList{
	TaskNode head = null;
	TaskNode tail = null;
	TaskNode current = null;
	int size = 0;
	public void addAtStart(int taskId, String taskName, int priority, String dueDate) {
		TaskNode node = new TaskNode(taskId, taskName, priority, dueDate);
		if(head == null) {
			head = node;
			current = head;
			node.next = head;
			tail = head;
		}
		else {
			tail.next = node;
			node.next = head;
			head = node;
		}
		size++;
		System.out.println("Added Task");
	}
	
	public void addAtEnd(int taskId, String taskName, int priority, String dueDate) {
		TaskNode node = new TaskNode(taskId, taskName, priority, dueDate);
		if(head == null) {
			head = node;
			current = head;
			node.next = head;
			tail = head;
		}
		else {
			tail.next = node;
			tail = node;
			tail.next = head;
		}
		size++;
		System.out.println("Added Task");
	}
	
	public void addAtPostition(int pos, int taskId, String taskName, int priority, String dueDate) {
		if(pos <= 0 || pos > size + 1) {
			System.out.println("Invalid position");
			return;
		}
		if(pos == 1) {
			addAtStart(taskId, taskName, priority, dueDate);
			return;
		}
		if(pos == size + 1) {
			addAtEnd(taskId, taskName, priority, dueDate);
			return;
		}
		TaskNode node = new TaskNode(taskId, taskName, priority, dueDate);
		TaskNode temp = head;
		for(int i = 1; i < pos - 1; i++) {
			temp = temp.next;
		}
		node.next = temp.next;
		temp.next = node;
		size++;
		System.out.println("Task added at postion : " + pos);
	}
	
	public void removeByTaskId(int taskId) {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		TaskNode temp = head;
		TaskNode prev = null;
		do {
			if(temp.taskId == taskId) {
				if(temp == head && temp.next == head) {
					head = tail = current = null;
				}
				else if(temp == head) {
					tail.next = head.next;
					head = tail.next;
				}
				else {
					prev.next = temp.next;
				}
				size--;
				System.out.println("Removed Task");
				return;
			}
			prev = temp;
			temp = temp.next;
		}
		while(temp != head);
		System.out.println("Task Not Found");
	}
	
	public void viewTaskAndMove() {
		if(current == null) {
			System.out.println("No Tasks Available");
			return;
		}
		System.out.println("Current Task ");
		System.out.println("Task ID: " + current.taskId + "\nTask Name: " + current.taskName + "\nTask Priority: " + current.priority + "\nDue Date:" + current.dueDate);
		System.out.println();
		current = current.next;
	}
	
	public void displayAllTasks() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		TaskNode temp = head;
		do {
			System.out.println("Task ID: " + temp.taskId + "\nTask Name: " + temp.taskName + "\nTask Priority: " + temp.priority + "\nDue Date:" + temp.dueDate);
			System.out.println();
			temp = temp.next;
		}
		while(temp != head);
	}
	
	public void searchByPriority(int priority) {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		TaskNode temp = head;
		boolean found = false;
		do {
			if(temp.priority == priority) {
				System.out.println("Task ID: " + temp.taskId + "\nTask Name: " + temp.taskName + "\nTask Priority: " + temp.priority + "\nDue Date:" + temp.dueDate);
				found = true;
			}
			temp = temp.next;
		}
		while(temp != head);
		if(!found) {
			System.out.println("No task with required priority");
		}
	}
	
}

public class TaskScheduler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaskList tasks = new TaskList();

        tasks.addAtEnd(1, "Design Module", 2, "10-01-2026");
        tasks.addAtEnd(2, "Write Code", 1, "11-01-2026");
        tasks.addAtStart(3, "Requirement Analysis", 1, "14-01-2026");

        tasks.displayAllTasks();

        tasks.viewTaskAndMove();
        tasks.viewTaskAndMove();

        tasks.searchByPriority(1);

        tasks.removeByTaskId(2);
        tasks.displayAllTasks();
	}

}
