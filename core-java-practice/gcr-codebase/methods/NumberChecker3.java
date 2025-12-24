package core_java_practice.gcr_codebase.methods;
import java.util.*;
public class NumberChecker3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = NumberChecker.countDigits(n);
		int digits[] = NumberChecker.getDigitsArray(n);
		int reverse[] = reverseArray(digits);
		boolean areEqual = compare(digits, reverse);
		boolean isPalindrome = isPalindromeNumber(digits);
		boolean isDuck = NumberChecker.isDuckNumber(digits);
		System.out.println("Count " + count);
		System.out.println("Digits " + Arrays.toString(digits));
		System.out.println("Reverse Digits " + Arrays.toString(reverse));
		System.out.println("Are arrays equal " + areEqual);
		System.out.println("Is Number Palindrome " + isPalindrome);
		System.out.println("Is Duck Number " + isDuck);
	}
	public static boolean isPalindromeNumber(int digits[]) {
		int n = digits.length;
		for(int i = 0; i <= n / 2; i++) {
			if(digits[i] != digits[n - i - 1]) {
				return false;
			}
		}
		return true;
	}
	public static int[] reverseArray(int digits[]) {
		int n = digits.length;
		for(int i = 0; i <= n / 2; i++) {
			int temp = digits[i];
			digits[i] = digits[n - i - 1];
			digits[n - i - 1] = temp;
		}
		return digits;
	}
	public static boolean compare(int arr1[], int arr2[]) {
		if(arr1.length != arr2.length) {
			return false;
		}
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

}
