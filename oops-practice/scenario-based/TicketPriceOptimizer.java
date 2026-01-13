package oops_practice.scenario_based;

import java.util.*;

public class TicketPriceOptimizer {

	public static void quickSort(int prices[], int low, int high) {
		if (low < high) {
			int pivot = partition(prices, low, high);
			quickSort(prices, low, pivot - 1);
			quickSort(prices, pivot + 1, high);
		}
	}

	public static int partition(int prices[], int low, int high) {
		int pivot = prices[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (prices[j] < pivot) {
				i++;
				int temp = prices[j];
				prices[j] = prices[i];
				prices[i] = temp;
			}
		}
		int temp = prices[i + 1];
		prices[i + 1] = prices[high];
		prices[high] = temp;

		return i + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of tickets");
		int n = sc.nextInt();
		
		int tickets[] = new int[n];
		for(int i = 0; i < n; i++) {
			tickets[i] = sc.nextInt();
		}
		
		System.out.println("Sorting tickets");
		quickSort(tickets, 0, n - 1);
		
		System.out.println("Enter how many tickets you want to see");
		int m = sc.nextInt();
		
		System.out.println("Top " + m + " cheapest tickets");
		for(int i = 0; i < (m < n ? m : n); i++) {
			System.out.print(tickets[i] + " ");
		}
		System.out.println();
		
		System.out.println("Top " + m + " expensive tickets");
		for(int i = n - 1; i >= (n - m >= 0 ? n - m : 0); i--) {
			System.out.print(tickets[i] + " ");
		}
		System.out.println();
	}

}
