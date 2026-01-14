package dsa_practice.gcr_codebase.stack_and_queue;

import java.util.Stack;

class Queue1 {
	private Stack<Integer> enqueueStack;
	private Stack<Integer> dequeueStack;

	public Queue1() {
		// TODO Auto-generated constructor stub
		enqueueStack = new Stack<>();
		dequeueStack = new Stack<>();
	}

	public void enqueue(int val) {
		enqueueStack.push(val);
	}

	public int dequeue() {
		if (dequeueStack.isEmpty()) {
			while (!enqueueStack.isEmpty()) {
				dequeueStack.push(enqueueStack.pop());
			}
		}
		if (dequeueStack.isEmpty()) {
			System.err.println("Queue is Empty");
			return -1;
		}
		return dequeueStack.pop();
	}

	public int peek() {
		if (dequeueStack.isEmpty()) {
			while (!enqueueStack.isEmpty()) {
				dequeueStack.push(enqueueStack.pop());
			}
		}

		if (dequeueStack.isEmpty()) {
			System.err.println("Queue is Empty");
			return -1;
		}
		return dequeueStack.peek();
	}

	public boolean isEmpty() {
		return enqueueStack.isEmpty() && dequeueStack.isEmpty();
	}
}

public class QueueUsingStacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue1 queue = new Queue1();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);

		System.out.println(queue.dequeue());
		System.out.println(queue.peek());
		queue.enqueue(40);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.isEmpty());
	}

}
