package dsa_practice.gcr_codebase.binary_search;
import java.util.*;

public class FindRotationPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int idx = findRotationPoint(arr);
		System.out.println("Rotation point index: " + idx + " value: " + arr[idx]);
	}
	
	public static int findRotationPoint(int arr[]) {
		int left = 0;
		int right = arr.length - 1;
		while(left < right) {
			int mid = left + (right - left) / 2;
			if(arr[mid] > arr[right]) {
				left = mid + 1;
			}
			else {
				right = mid;
			}
		}
		return left;
	}

}
