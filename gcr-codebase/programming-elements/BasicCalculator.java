import java.util.*;
public class BasicCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1 and 2");
		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();
		float add = n1 + n2;
		float sub = n1 - n2;
		float mul = n1 * n2;
		float div = n1 / n2;
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + add + " and " + sub + " and " + mul + " and " + div);2
	}

}
