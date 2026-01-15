package dsa_practice.gcr_codebase.sorting_algorithms;
import java.lang.reflect.Array;
import java.util.*;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int marks[] = new int[n];
		for(int i = 0; i < n; i++) {
			marks[i] = sc.nextInt();
		}
		bubbleSort(marks);
		System.out.println(Arrays.toString(marks));
	}
	
	public static void bubbleSort(int arr[]) {
		int n = arr.length;
		for(int i = 0; i < n - 1; i++) {
			boolean swapped = false;
			for(int j = 0; j < n - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
		}
	}

}
