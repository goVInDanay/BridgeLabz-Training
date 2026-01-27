package collections.gcr_codebase.exception_handling;

import java.util.*;

public class CatchUncheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter numerator and denominator: ");
			int numerator = sc.nextInt();
			int denominator = sc.nextInt();
			System.out.println(numerator / denominator);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Arthimetic exception: " + e.getMessage());
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Wrong input: " + e);
		}
	}

}
