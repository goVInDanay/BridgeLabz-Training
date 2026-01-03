package oops_practice.scenario_based;

import java.lang.module.FindException;

class Utility{
	public static long factorial(int n) {
		if(n < 0) {
			return -1;
		}
		if(n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}
	public static boolean isPrime(int n) {
		if(n <= 1) {
			return false;
		}
		n = Math.abs(n);
		for(int i = 2; i <= n / 2; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static int findGcd(int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);
		if(b > a) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		if(b == 0) {
			return a;
		}
		return findGcd(b, a % b);
	}
	
	public static long findNthFibonacci(int n) {
		if(n <= 0) {
			return -1;
		}
		if(n == 1) {
			return 0;
		}
		if(n == 2) {
			return 1;
		}
		long a = 0; 
		long b = 1;
		for(int i = 2; i < n; i++) {
			long c = a + b;
			a = b;
			b = c;
		}
		return b;
	}
}
public class MathematicalOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility util = new Utility();
		long factorial = Utility.factorial(11);
		long factorial2 = Utility.factorial(-1);
		boolean prime1 = Utility.isPrime(-11);
		boolean prime2 = Utility.isPrime(13);
		int gcd1 = Utility.findGcd(-9, 11);
		int gcd2 = Utility.findGcd(21, 49);
		long fib1 = Utility.findNthFibonacci(10);
		long fib2 = Utility.findNthFibonacci(-4);
		System.out.println("Factorial of 11: " + factorial);
		System.out.println("Factorial of -1: " + factorial2);
		System.out.println("Is -11 prime?: " + prime1);
		System.out.println("Is 13 prime?: " + prime2);
		System.out.println("GCD of -9 and 11 : " + gcd1);
		System.out.println("GCD of 21 and 49 : " + gcd2);
		System.out.println("GCD of 31 and 0 : " + Utility.findGcd(31, 0));
		System.out.println("10th fibonacci is: " + fib1);
		System.out.println("-4th fibonacci is: " + fib2);
	}

}
