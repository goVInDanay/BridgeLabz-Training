package dsa_practice.gcr_codebase.hash_maps_and_functions;

import java.util.*;

public class LongestConsecutiveSequence {

	public static void longestConsecutiveSequence(int arr[]) {
		Map<Integer, Boolean> map = new HashMap<>();
		int max = 0;

		for (int n : arr) {
			map.put(n, true);
		}

		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i] - 1)) {
				int curr = arr[i];
				int len = 1;
				while (map.containsKey(curr + len)) {
					len++;
				}
				max = Math.max(max, len);
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		longestConsecutiveSequence(arr);
	}

}
