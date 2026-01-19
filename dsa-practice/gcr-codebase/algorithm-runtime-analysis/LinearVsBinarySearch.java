package dsa_practice.gcr_codebase.algorithm_runtime_analysis;

import java.util.*;

public class LinearVsBinarySearch {

	public static void linearSearch(int nums[], int target) {
		long startTime = System.nanoTime();
		for (int i : nums) {
			if (i == target) {
				System.out.println("Found element");
				break;
			}
		}
		long endTime = System.nanoTime();
		System.out.println("Time taken: " + (endTime - startTime));
	}

	public static void binarySearch(int nums[], int target) {
		Arrays.sort(nums);

		int start = 0;
		int end = nums.length - 1;

		long startTime = System.nanoTime();
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == target) {
				System.out.println("Found element at: " + mid);
				break;
			} else if (nums[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		long endTime = System.nanoTime();
		System.out.println("Time taken: " + (endTime - startTime));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000000;
		int nums[] = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = i;
		}
		int target = n - 1;
		;
		linearSearch(nums, target);
		binarySearch(nums, target);
	}

}
