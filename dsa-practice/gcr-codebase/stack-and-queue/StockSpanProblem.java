package dsa_practice.gcr_codebase.stack_and_queue;

import java.util.*;

public class StockSpanProblem {

	public int[] stockSpan(int prices[]) {
		int span[] = new int[prices.length];
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < prices.length; i++) {
			while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
				span[i] += span[stack.pop()];
			}
			stack.push(i);
			span[i]++;
		}
		return span;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StockSpanProblem obj = new StockSpanProblem();
		int n = sc.nextInt();
		int prices[] = new int[n];
		for (int i = 0; i < n; i++) {
			prices[i] = sc.nextInt();
		}
		int span[] = obj.stockSpan(prices);
		for (int i : span) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
