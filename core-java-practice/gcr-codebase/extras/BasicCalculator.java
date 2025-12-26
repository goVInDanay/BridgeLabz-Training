package core_java_practice.gcr_codebase.extras;
import java.util.*;
public class BasicCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter add for addition\nsub for Subtraction\nmul for Multiplication\ndiv for Division");
		String s = sc.next();
		switch(s) {
			case "add" -> System.out.println("Added value is " + addOperation(a, b));
			case "sub" -> System.out.println("Subtracted value is " + subOperation(a, b));
			case "mul" -> System.out.println("Multiplied value is " + multiplicationOperation(a, b));
			case "div" -> System.out.println("Divided value is " + divisionOperation(a, b));
			default -> System.out.println("Wrong value");
		}
		
	}
	public static int addOperation(int n1, int n2) {
		return n1 + n2;
	}
	public static int subOperation(int n1, int n2) {
		return n1 - n2;
	}
	public static int multiplicationOperation(int n1, int n2) {
		return n1 * n2;
	}
	public static int divisionOperation(int dividend, int divisor) {
		return dividend / divisor;
	}

}
