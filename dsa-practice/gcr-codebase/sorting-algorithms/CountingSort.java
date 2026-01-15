package dsa_practice.gcr_codebase.sorting_algorithms;
import java.util.*;

public class CountingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ages[] = new int[n];
		for(int i = 0; i < n; i++) {
			ages[i] = sc.nextInt();
		}
		countingSort(ages);
		System.out.println(Arrays.toString(ages));
	}
	
	public static void countingSort(int arr[]) {
		int max = 0;
		for(int i : arr) {
			if(i > max) {
				max = i;
			}
		}
		int countArr[] = new int[max + 1];
		for(int i : arr) {
			countArr[i]++;
		}
		int idx = 0;
		for(int i = 0; i <= max; i++) {
			while(countArr[i]-- > 0) {
				arr[idx++] = i;
			}
		}
	}

}
