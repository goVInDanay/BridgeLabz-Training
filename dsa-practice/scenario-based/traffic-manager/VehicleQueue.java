package oops_practice.scenario_based.traffic_manager;

class VehicleQueue {
	String queue[];
	int front;
	int rear;
	int size;
	int capacity;

	VehicleQueue(int capacity) {
		this.capacity = capacity;
		queue = new String[capacity];
		front = 0;
		rear = -1;
		size = 0;
	}

	boolean isFull() {
		return size == capacity;
	}

	boolean isEmpty() {
		return size == 0;
	}

	public void enqueue(String vehicle) {
		if (isFull()) {
			System.out.println("Overflow");
			return;
		}

		rear = (rear + 1) % capacity;
		queue[rear] = vehicle;
		size++;
		System.out.println(vehicle + " added to queue");
	}

	public String dequeue() {
		if (isEmpty()) {
			System.out.println("Underflow");
			return null;
		}

		String vehicle = queue[front];
		front = (front + 1) % capacity;
		size--;
		return vehicle;
	}
}
