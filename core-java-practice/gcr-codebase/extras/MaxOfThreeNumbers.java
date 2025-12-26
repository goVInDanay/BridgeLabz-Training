package core_java_practice.gcr_codebase.extras;
import java.util.*;
public class MaxOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("The Max Number is " + findMax(a, b, c));
	}
	public static int findMax(int a, int b, int c) {
		if(a >= b && a >= c) {
			return a;
		}
		if(b >= c && b >= a) {
			return b;
		}
		return c;
	}

}
