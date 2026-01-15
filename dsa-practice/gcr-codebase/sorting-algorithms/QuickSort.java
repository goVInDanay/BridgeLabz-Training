package dsa_practice.gcr_codebase.sorting_algorithms;
import java.util.*;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int prices[] = new int[n];
		for(int i = 0; i < n; i++) {
			prices[i] = sc.nextInt();
		}
		quickSort(prices, 0, n - 1);
		System.out.println(Arrays.toString(prices));
	}

	public static void quickSort(int arr[], int left, int right) {
		if(left < right) {
			int pivotIdx = partition(arr, left, right);
			quickSort(arr, left, pivotIdx - 1);
			quickSort(arr, pivotIdx + 1, right);
		}
	}
	
	public static int partition(int arr[], int left, int right) {
		int pivot = arr[right];
		int i = left - 1;
		for(int j = left; j < right; j++) {
			if(arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = pivot;
		arr[right] = temp;
		return i + 1;
	}
}
