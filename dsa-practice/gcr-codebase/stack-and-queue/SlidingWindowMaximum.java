package dsa_practice.gcr_codebase.stack_and_queue;

import java.util.*;

public class SlidingWindowMaximum {

	public static int[] findMaxSlidingWindow(int nums[], int k) {
		int n = nums.length;
		int max[] = new int[n - k + 1];
		Deque<Integer> deque = new ArrayDeque<Integer>();
		for(int i = 0; i < n; i++) {
			while(!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
				deque.pollFirst();
			}
			
			while(!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
				deque.pollLast();
			}
			
			deque.offerLast(i);
			if(i >= k - 1) {
				max[i - k + 1] = nums[deque.peekFirst()];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nums[] = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		int max[] = findMaxSlidingWindow(nums, k);
		for(int i : max) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
