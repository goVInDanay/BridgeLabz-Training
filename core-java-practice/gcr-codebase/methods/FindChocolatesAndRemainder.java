package core_java_practice.gcr_codebase.methods;
import java.util.*;
public class FindChocolatesAndRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numberOfChocolates = sc.nextInt();
		int numberOfChildren = sc.nextInt();
		int arr[] = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
		System.out.println("Number of Chocolates for each child " + arr[0] + " Number of Remaining Chocolate " + arr[1]);
	}
	public static int[] findRemainderAndQuotient(int number, int divisor) {
		int arr[] = new int[2];
		arr[0] = number / divisor;
		arr[1] = number % divisor;
		return arr;
	}

}
