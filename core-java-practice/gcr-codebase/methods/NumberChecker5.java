package core_java_practice.gcr_codebase.methods;

import java.util.*;

public class NumberChecker5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    int[] digits = NumberChecker.getDigitsArray(n);
	    System.out.println("Perfect " + isPerfectNumber(n));
	    System.out.println("Abundant " + isAbundantNumber(n));
	    System.out.println("Deficient " + isDeficientNumber(n));
	    System.out.println("Strong " + isStrongNumber(n, digits));
	}
	public static int sumOfProperDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++)
            if (n % i == 0) sum += i;
        return sum;
    }
	public static boolean isPerfectNumber(int n) {
        return sumOfProperDivisors(n) == n;
    }
    public static boolean isAbundantNumber(int n) {
        return sumOfProperDivisors(n) > n;
    }
    public static boolean isDeficientNumber(int n) {
        return sumOfProperDivisors(n) < n;
    }
	public static boolean isStrongNumber(int n, int[] digits) {
	    int sum = 0;
	    for(int d : digits) {
	    	sum += factorial(d);
	    }
	    return sum == n;
	}
	private static int factorial(int n) {
	    int fact = 1;
	    for(int i = 1; i <= n; i++) {
	    	fact *= i;
	    }
	    return fact;
	}
}
