package dsa_practice.gcr_codebase.sorting_algorithms;
import java.awt.desktop.OpenURIHandler;
import java.util.*;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int prices[] = new int[n];
		for(int i = 0; i < n; i++) {
			prices[i] = sc.nextInt();
		}
		mergeSort(prices, 0, n - 1);
		System.out.println(Arrays.toString(prices));
	}
	
	public static void mergeSort(int arr[], int left, int right) {
		if(left < right) {
			int mid = left + (right - left) / 2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);
			merge(arr, left, right, mid);
		}
	}
	public static void merge(int arr[], int left, int right, int mid) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		
		int leftArr[] = new int[n1];
		int rightArr[] = new int[n2];
		for(int i = 0; i < n1; i++) {
			leftArr[i] = arr[i];
		}
		for(int i = 0; i < n2; i++) {
			rightArr[i] = arr[mid + i + 1];
		}
		int i = 0;
		int j = 0;
		int idx = 0;
		while(i < n1 && j < n2) {
			if(leftArr[i] < rightArr[j]) {
				arr[idx++] = leftArr[i++];
			}
			else {
				arr[idx++] = rightArr[j++];
			}
		}
		while(i < n1) {
			arr[idx++] = leftArr[i++];
		}
		while(j < n2) {
			arr[idx++] = rightArr[j++];
		}
	}

}
