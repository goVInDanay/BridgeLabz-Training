package core_java_practice.gcr_codebase.extras;
import java.util.*;
public class CalculateFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int fact = findFactorial(n);
		display(fact);
	}
	public static int findFactorial(int n) {
		if(n <= 1) {
			return 1;
		}
		return n * findFactorial(n - 1);
	}
	public static void display(int fact) {
		System.out.println("The factorial of the number is " + fact);
	}

}
