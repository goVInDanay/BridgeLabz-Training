package dsa_practice.gcr_codebase.stack_and_queue;

import java.util.Stack;

public class SortStack {

	public static void sortStackR(Stack<Integer> stack) {
		if (!stack.isEmpty()) {
			int val = stack.pop();
			sortStackR(stack);
			insert(stack, val);
		}
	}

	private static void insert(Stack<Integer> stack, int val) {
		if (stack.isEmpty() || stack.peek() <= val) {
			stack.push(val);
			return;
		}
		int temp = stack.pop();
		insert(stack, val);
		stack.push(temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();

		stack.push(20);
		stack.push(10);
		stack.push(40);
		stack.push(30);
		sortStackR(stack);

		System.out.println("Stack in sorted Order");
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

}
