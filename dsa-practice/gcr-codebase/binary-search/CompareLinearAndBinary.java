package dsa_practice.gcr_codebase.binary_search;

import java.util.*;

public class CompareLinearAndBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("First missing positive: " + firstMissingPositive(arr));
		
		int target = sc.nextInt();
		Arrays.sort(arr);
		System.out.println("Target at index: " + binarySearch(arr, target));
	}

	public static int firstMissingPositive(int[] arr) {
		int n = arr.length;
		boolean flag[] = new boolean[n + 1];
		for(int i : arr) {
			if(i > 0 && i <= n) {
				flag[i] = true;
			}
		}

		for(int i = 1; i <= n; i++) {
			if(!flag[i]) {
				return i;
			}
		}
		return n + 1;
	}

	public static int binarySearch(int arr[], int target) {
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

}
