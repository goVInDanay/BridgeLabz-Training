import java.util.*;
public class FindQuotientAndRemainder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers 1 and 2");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int quotient = n1 / n2;
		int remainder = n1 % n2;
		System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two numbers " + n1 + " and " + n2);
	}

}
