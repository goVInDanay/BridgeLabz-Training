package core_java_practice.gcr_codebase.methods;
import java.util.*;
public class NumberOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nums[] = new int[5];
		for(int i = 0; i < 5; i++) {
			nums[i] = sc.nextInt();
		}
		for(int i = 0; i < 5; i++) {
			if(!isPositive(nums[i])) {
				System.out.println("The number is negative");
			}
		}
		int ans = compare(nums[0], nums[nums.length - 1]);
		if(ans == 1) {
			System.out.println("First element is greater than last");
		}
		else if(ans == 0) {
			System.out.println("First and last are equal");
		}
		else {
			System.out.println("Last element is greater than the first");
		}
		
	}
	
	private static int compare(int a, int b) {
		if(a > b) {
			return 1;
		}
		if(a < b) {
			return -1;
		}
		return 0;
	}
	private static boolean isPositive(int n) {
		if(n >= 0) {
			if(isEven(n)) {
				System.out.println("The number is Positive and Even");
				return true;
			}
			else {
				System.out.println("The number is Positive and Odd");
				return true;
			}
		}
		return false;
	}
	private static boolean isEven(int n) {
		if(n % 2 == 0) {
			return true;
		}
		return false;
	}
}
