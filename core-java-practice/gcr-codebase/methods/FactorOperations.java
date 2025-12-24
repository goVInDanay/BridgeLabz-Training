package core_java_practice.gcr_codebase.methods;
import java.util.*;
public class FactorOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int factors[] = findFactors(n);
		int sum = sumOfFactors(factors);
		long prod = productOfFactors(factors);
		double sumOfSquares = sumOfSquaresFactors(factors);
		System.out.println("Sum " + sum  + " Product " + prod + " Sum of Squares " + sumOfSquares);
	}
	private static int sumOfFactors(int factors[]) {
		int sum = 0;
		for(int i : factors) {
			sum += i;
		}
		return sum;
	}
	private static long productOfFactors(int factors[]) {
		long prod = 0;
		for(int i : factors) {
			prod *= i;
		}
		return prod;
	}
	private static double sumOfSquaresFactors(int factors[]) {
		double sum = 0;
		for(int i : factors) {
			sum += Math.pow(i, 2);
		}
		return sum;
	}
	private static int[] findFactors(int n) {
		int count = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				count++;
			}
		}
		int factors[] = new int[count];
		int idx = 0;
		for(int i = 1; i <= n; i++) {
			factors[idx++] = i;
		}
		return factors;
	}

}
