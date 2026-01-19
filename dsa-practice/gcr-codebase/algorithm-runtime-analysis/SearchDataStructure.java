package dsa_practice.gcr_codebase.algorithm_runtime_analysis;
import java.util.*;

public class SearchDataStructure {

	public static void searchArr(int arr[], int target) {
		long startTime = System.nanoTime();
		for(int n : arr) {
			if(n == target) {
				break;
			}
		}
		long endTime = System.nanoTime();
		System.out.println("Time Taken: " + (endTime - startTime));
	}
	
	public static void searchSet(Set<Integer> set, int target) {
		long startTime = System.nanoTime();
		set.contains(target);
		long endTime = System.nanoTime();
		System.out.println("Time Taken: " + (endTime - startTime));
	}
	
	public static void searchTreeSet(TreeSet<Integer> set, int target) {
		long startTime = System.nanoTime();
		set.contains(target);
		long endTime = System.nanoTime();
		System.out.println("Time Taken: " + (endTime - startTime));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000000;
		int target = n -1;
		int arr[] = new int[n];
		Set<Integer> set = new HashSet<Integer>();
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		for(int i = 0; i < n; i++) {
			arr[i] = i;
			set.add(i);
			treeSet.add(i);
		}
		
		searchArr(arr, target);
		searchSet(set, target);
		searchTreeSet(treeSet, target);
	}

}
