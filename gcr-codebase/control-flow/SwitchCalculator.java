import java.util.*;
public class SwitchCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		char op = sc.next().charAt(0);
		switch(op) {
			case '+':
				double sum = a + b;
				System.out.println("Sum is " + sum);
				break;
			case '-':
				double diff = a - b;
				System.out.println("Difference is " + diff);
				break;
			case '*':
				double prod = a * b;
				System.out.println("Product is " + prod);
				break;
			case '/':
				double quo = a / b;
				System.out.println("Quotient is " + quo);
				break;
			default:
				System.out.println("Invalid Operator");
		}
	}

}
