import java.util.*;
public class FindFactorialWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		if(n >= 0) {
			int fact = 1;
			while(n >= 1) {
				fact = fact * n--;
			}
			System.out.println("Factorial of number is " + fact);
		}
		else {
			System.out.println("Enter a natural number");
		}
	}

}
