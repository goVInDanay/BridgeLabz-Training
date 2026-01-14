package dsa_practice.gcr_codebase.hash_maps_and_functions;

import java.util.*;

public class CheckForAPairWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nums[] = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		findPair(nums, target);
	}

	public static void findPair(int nums[], int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<int[]> ans = new ArrayList<int[]>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				ans.add(new int[] { nums[i], target - nums[i] });
			} else {
				map.put(target - nums[i], nums[i]);
			}
		}
		for (int[] arr : ans) {
			System.out.println(arr[0] + " " + arr[1]);
		}
	}

}
