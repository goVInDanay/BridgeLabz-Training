package dsa_practice.gcr_codebase.sorting_algorithms;
import java.util.*;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ids[] = new int[n];
		for(int i = 0; i < n; i++) {
			ids[i] = sc.nextInt();
		}
		insertionSort(ids);
		System.out.println(Arrays.toString(ids));
	}
	
	public static void insertionSort(int arr[]) {
		int n = arr.length;
		for(int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}

}
