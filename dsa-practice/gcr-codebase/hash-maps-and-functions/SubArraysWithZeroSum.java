package dsa_practice.gcr_codebase.hash_maps_and_functions;

import java.util.*;

public class SubArraysWithZeroSum {

	public static void zeroSumSubArrays(int arr[]) {
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (sum == 0) {
				System.out.println("Subarray found from 0 to " + i);
			}
			if (map.containsKey(sum)) {
				List<Integer> idx = map.get(sum);
				for (int j : idx) {
					System.out.println("Subarray found from " + (j + 1) + " to " + i);
				}
				idx.add(i);
			} else {
				List<Integer> idx = new ArrayList<Integer>();
				idx.add(i);
				map.put(sum, idx);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		zeroSumSubArrays(arr);
	}

}
