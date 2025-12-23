import java.util.*;
public class IsHarshadNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  =sc.nextInt();
		int num = n;
		int sum = 0;
		while(num > 0) {
			int digit = num % 10;
			sum += digit;
			num = num / 10;
		}
		if(n % sum == 0) {
			System.out.println("Harshad Number");
		}
		else {
			System.out.println("Not a Harshad Number");
		}
	}

}
