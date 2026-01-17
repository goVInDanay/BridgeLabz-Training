package dsa_practice.gcr_codebase.binary_search;
import java.util.*;

public class FindPeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int peakIdx = findPeakIndex(arr);
		if(peakIdx == -1){
			System.out.println("No Peak element");
		}
		else {
			System.out.println("Peak element at index: " + peakIdx + " value: " + arr[peakIdx]);
		}
	}
	
	public static int findPeakIndex(int arr[]) {
		int left = 0;
		int right = arr.length - 1;
		while(left <= right) {
			int mid = left + (right - left) / 2;
			if(((mid == 0) || (arr[mid] > arr[mid - 1])) && ((mid == arr.length - 1) || (arr[mid] > arr[mid + 1]))) {
				return mid;
			}
			else if(mid > 0 && arr[mid - 1] > arr[mid]) {
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
		}
		return -1;
	}

}
