import java.util.Scanner;
public class FindFactorialFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		if(n >= 0) {
			int fact = 1;
			for(int i = 1; i <= n; i++) {
				fact = fact * i;
			}
			System.out.println("Factorial of number is " + fact);
		}
		else {
			System.out.println("Enter a natural number");
		}
	}

}
