package collections.gcr_codebase.exception_handling;

import java.util.*;

public class FinallyBlockExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			int numerator = sc.nextInt();
			int denominator = sc.nextInt();
			System.out.println(numerator / denominator);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Operation completed");
		}
	}

}
