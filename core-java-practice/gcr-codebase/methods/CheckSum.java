package core_java_practice.gcr_codebase.methods;
import java.util.*;
public class CheckSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n >= 0) { 
			int sumR = sumRecursion(n);
			int sumF = sumFormula(n);
			System.out.println("Sum from recursion " + sumR + " sum from formula " + sumF + " are equal " + (sumR == sumF));
		}
		else {
			System.out.println("Not a natural number");
		}
	}
	private static int sumRecursion(int n) {
		if(n == 0) {
			return 0;
		}
		return n + sumRecursion(n - 1);
	}
	private static int sumFormula(int n) {
		return (n * (n + 1)) / 2;
	}
}
