package dsa_practice.gcr_codebase.binary_search;
import java.util.*;

public class FirstAndLastOccurence {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int target = sc.nextInt();
		int firstIdx = findFirstOccurence(arr, target);
		int lastIdx = findLastOccurence(arr, target);
		if(firstIdx == -1) {
			System.out.println("Target not found");
		}
		else {
			System.out.println("First occurence at index: " + firstIdx + " last occurence at index: " + lastIdx);
		}
	}
	
	public static int findFirstOccurence(int arr[], int target) {
		int left = 0;
		int right = arr.length - 1;
		int idx = -1;
		while(left <= right) {
			int mid = left + (right - left) / 2;
			if(arr[mid] == target) {
				idx = mid;
				right = mid - 1;
			}
			else if(arr[mid] < target){
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		return idx;
	}
	
	public static int findLastOccurence(int arr[], int target) {
		int left = 0;
		int right = arr.length - 1;
		int idx = -1;
		while(left <= right) {
			int mid = left + (right - left) / 2;
			if(arr[mid] == target) {
				idx = mid;
				left = mid + 1;
			}
			else if(arr[mid] < target) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		return idx;
	}

}
