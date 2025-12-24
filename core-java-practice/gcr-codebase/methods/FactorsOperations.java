package core_java_practice.gcr_codebase.methods;
import java.util.*;
public class FactorsOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int factors[] = findFactors(n);
		System.out.println("Factors " + Arrays.toString(factors));
		System.out.println("Greatest Factor " + greatestFactor(factors));
		System.out.println("Sum of Factors " + sumOfFactors(factors));
		System.out.println("Product of Factors " + productOfFactors(factors));
		System.out.println("Product Of Cubes of Factors " + productOfCubeOfFactors(factors));
	}
	public static int[] findFactors(int n) {
		int count = 0;
		for(int i = 1; i <= n / 2; i++) {
			if(n % i == 0) {
				count++;
			}
		}
		count++;
		int factors[] = new int[count];
		int idx = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				factors[idx++] = i;
			}
		}
		return factors;
	}
	public static int greatestFactor(int factors[]) {
		return factors[factors.length - 1];
	}
	public static int sumOfFactors(int factors[]) {
		int sum = 0;
		for(int f : factors) {
			sum += f;
		}
		return sum;
	}
	public static long productOfCubeOfFactors(int factors[]) {
		long prod = 1;
		for(int f : factors) {
			prod *= (long)Math.pow(f,  3);
		}
		return prod;
	}
	public static int productOfFactors(int factors[]) {
		int prod = 1;
		for(int f : factors) {
			prod *= f;
		}
		return prod;
	}
}
