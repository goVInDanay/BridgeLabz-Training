package dsa_practice.gcr_codebase.sorting_algorithms;
import java.util.*;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int marks[] = new int[n];
		for(int i = 0; i < n; i++) {
			marks[i] = sc.nextInt();
		}
		selectionSort(marks);
		System.out.println(Arrays.toString(marks));
	}
	
	public static void selectionSort(int arr[]) {
		int n = arr.length;
		for(int i = 0; i < n - 1; i++) {
			int minIdx = i;
			for(int j = i + 1; j < n; j++) {
				if(arr[j] < arr[minIdx]) {
					minIdx = j;
				}
			}
			int temp = arr[minIdx];
			arr[minIdx] = arr[i];
			arr[i] = temp;
		}
	}

}
