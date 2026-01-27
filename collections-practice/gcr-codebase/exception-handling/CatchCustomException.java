package collections.gcr_codebase.exception_handling;

import java.util.*;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}

public class CatchCustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			int age = sc.nextInt();
			validateAge(age);
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void validateAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Age must be 18 or above");
		}
		System.out.println("Access granted!");
	}

}
