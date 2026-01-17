package dsa_practice.gcr_codebase.binary_search;
import java.util.*;

public class SearchMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[][] = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int target = sc.nextInt();
		if(searchMatrix(arr, target)) {
			System.out.println("Found element");
		}
		else {
			System.out.println("Element not found");
		}
	}	
	
	public static boolean searchMatrix(int arr[][], int target) {
		int n = arr.length;
		int m = arr[0].length;
		int left = 0;
		int right = n * m - 1;
		
		while(left <= right) {
			int mid = left + (right - left) / 2;
			
			int row = mid / m;
			int col = mid % m;
			if(arr[row][col] == target) {
				return true;
			}
			else if(arr[row][col] < target) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		return false;
	}
}
