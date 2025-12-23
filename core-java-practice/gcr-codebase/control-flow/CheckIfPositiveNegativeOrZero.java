import java.util.*;
public class CheckIfPositiveNegativeOrZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		if(n > 0) {
			System.out.println("Positive");
		}
		else if(n < 0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Zero");
		}
	}

}
