package core_java_practice.gcr_codebase.extras;
import java.util.*;
public class CalculateGcdAndLcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int gcd = findGcd(a, b);
		long lcm = findLcm(a, b, gcd);
		System.out.println("GCD is " + gcd + " and LCM is " + lcm);
	}
	public static int findGcd(int a, int b) {
		if(b > a) {
			a = a ^ b;
			b = b ^ a;
			a = a ^ b;
		}
		if(b == 0) {
			return a;
		}
		return findGcd(b, a % b);
	}
	public static long findLcm(int a, int b, int gcd) {
		long product = (long)a * b;
		return product / gcd;
	}

}
