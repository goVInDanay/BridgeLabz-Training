package core_java_practice.scenario_based;

import java.util.*;

class InvalidInvoiceFormatException extends Exception {
	public InvalidInvoiceFormatException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}

public class InvoiceGeneratorForFreelancers {

	public static String[] parseInvoice(String input) throws InvalidInvoiceFormatException {
		if (input == null || input.trim().isEmpty()) {
			throw new InvalidInvoiceFormatException("Invoice input cannot be empty");
		}

		// split all tasks from input
		String tasks[] = input.split(",");
		for (int i = 0; i < tasks.length; i++) {

			// check if task has -
			if (!tasks[i].contains("-")) {
				throw new InvalidInvoiceFormatException("Invalid format for task, missing -");
			}

			// split tasks into specific orders
			String arr[] = tasks[i].split("-");
			if (arr.length != 2) {
				throw new InvalidInvoiceFormatException("Invalid Format For Task");
			}
		}
		return tasks;
	}

	public static int getTotalAmout(String tasks[]) throws InvalidInvoiceFormatException {
		int sum = 0;
		for (String task : tasks) {
			String arr[] = task.split("-");
			if (arr.length != 2) {
				throw new InvalidInvoiceFormatException("Invalid Format For Task");
			}

			// replace INR with "" to easily access the number
			String amount = arr[1].replace("INR", "").trim();
			try {
				int val = Integer.valueOf(amount);
				sum += val;
			} catch (Exception e) {
				throw new InvalidInvoiceFormatException("Invalid amount For Task");
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter tasks");
		String input = sc.nextLine();
		try {
			String tasks[] = parseInvoice(input);
			System.out.println("Invoice Details: ");
			for (String task : tasks) {
				System.out.println(task.trim());
			}
			int total = getTotalAmout(tasks);
			System.out.println("Total Amount : Rs " + total);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
