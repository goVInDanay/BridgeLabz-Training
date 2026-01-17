package dsa_practice.gcr_codebase.linear_search;
import java.util.*;

public class FirstNegativeNumber {
	
	public static int findFirstNegativeNumber(int arr[]) {
		for(int i : arr) {
			if(i < 0) {
				return i;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int num = findFirstNegativeNumber(arr);
		if(num == 0) {
			System.out.println("No negative number");
		}
		else {
			System.out.println(num);
		}
	}

}
