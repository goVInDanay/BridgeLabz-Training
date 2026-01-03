package oops_practice.scenario_based;
import java.util.*;
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
		Scanner sc = new Scanner(System.in);
		int factN = sc.nextInt();
		int primeN = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int fibN = sc.nextInt();
		long factorial = Utility.factorial(factN);
		boolean prime = Utility.isPrime(primeN);
		int gcd = Utility.findGcd(a, b);
		long fib = Utility.findNthFibonacci(fibN);
		System.out.println("Factorial of 11: " + factorial);
		System.out.println("Is 13 prime?: " + prime);
		System.out.println("GCD of -9 and 11 : " + gcd);
		System.out.println("10th fibonacci is: " + fib);
	}

}
