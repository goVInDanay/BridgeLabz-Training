package dsa_practice.gcr_codebase.hash_maps_and_functions;

import java.util.*;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nums[] = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		int pair[] = twoSum(nums, target);
		if (pair.length == 0) {
			System.out.println("No Pairs");
		} else {
			System.out.println(pair[0] + " " + pair[1]);
		}
	}

	public static int[] twoSum(int nums[], int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<int[]> ans = new ArrayList<int[]>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				return new int[] { nums[i], target - nums[i] };
			}
			map.put(target - nums[i], nums[i]);
		}
		return new int[] {};
	}

}
