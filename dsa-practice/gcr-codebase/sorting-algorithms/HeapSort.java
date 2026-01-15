package dsa_practice.gcr_codebase.sorting_algorithms;
import java.util.*;

public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int applicants[] = new int[n];
		for(int i = 0; i < n; i++) {
			applicants[i] = sc.nextInt();
		}
		heapSort(applicants);
		System.out.println(Arrays.toString(applicants));
	}
	
	public static void heapSort(int arr[]) {
		int n = arr.length;
		for(int i = n / 2 - 1; i >= 0; i--) {
			heapify(arr, n, i);
		}
		for(int i = n - 1; i > 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapify(arr, i, 0);
		}
	}
	
	public static void heapify(int arr[], int n, int i) {
		int smallestIdx = i;
		int leftIdx = 2 * i + 1;
		int rightIdx = 2 * i + 2;
		if(leftIdx < n && arr[leftIdx] < arr[smallestIdx]) {
			smallestIdx = leftIdx;
		}
		if(rightIdx < n && arr[rightIdx] < arr[smallestIdx]) {
			smallestIdx = rightIdx;
		}
		if(smallestIdx != i) {
			int temp = arr[i];
			arr[i] = arr[smallestIdx];
			arr[smallestIdx] = temp;
			heapify(arr, n, smallestIdx);
		}
	}

}
