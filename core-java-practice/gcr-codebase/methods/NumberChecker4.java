package core_java_practice.gcr_codebase.methods;
import java.util.*;
public class NumberChecker4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int digits[] = NumberChecker.getDigitsArray(n);
		System.out.println("Prime Number " + isPrimeNumber(n));
		System.out.println("Neon Number " + isNeonNumber(n));
		System.out.println("Spy Number " + isSpyNumber(digits));
		System.out.println("Automorphic Number " + isAutomorphicNumber(n));
		System.out.println("Buzz Number " + isBuzzNumber(n));
	}
	public static boolean isNeonNumber(int n) {
		int sqr = (int)Math.pow(n, 2);
		int digits[] = NumberChecker.getDigitsArray(n);
		int sumOfDigits = NumberChecker2.sumOfDigits(digits);
		return n == sumOfDigits;
	}
	public static boolean isSpyNumber(int digits[]) {
		int sumOfDigits = NumberChecker2.sumOfDigits(digits);
		int prodOfDigits = 1;
		for(int d : digits) {
			prodOfDigits *= d;
		}
		return sumOfDigits == prodOfDigits;
	}
	public static boolean isAutomorphicNumber(int n) {
		String sqr = String.valueOf(n * n);
		String num = String.valueOf(n);
		return sqr.endsWith(num);
	}
	public static boolean isBuzzNumber(int n) {
		return n % 7 == 0 || n % 10 == 7;
	}
	public static boolean isPrimeNumber(int n) {
		if(n == 1) {
			return true;
		}
		for(int i = 2; i <= n / 2; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
