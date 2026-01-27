package collections.gcr_codebase.exception_handling;

import java.util.*;

public class NestedTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println("Enter divisor");
			int divisor = sc.nextInt();
			System.out.println("Enter index");
			int index = sc.nextInt();
			int element;
			try {
				element = arr[index];
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid array index!");
				return;
			}
			try {
				System.out.println(element / divisor);
			} catch (ArithmeticException e) {
				System.out.println("Cannot divide by zero!");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
