package core_java_practice.gcr_codebase.methods;
import java.util.*;
public class FindQuotientAndRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int divisor = sc.nextInt();
		int arr[] = findRemainderAndQuotient(number, divisor);
		System.out.println("Quotient " + arr[0] + " Remainder " + arr[1]);
	}
	public static int[] findRemainderAndQuotient(int number, int divisor) {
		int arr[] = new int[2];
		arr[0] = number / divisor;
		arr[1] = number % divisor;
		return arr;
	}

}
