import java.util.*;
public class isArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int num = n;
		int sum = 0;
		while(num > 0) {
			int digit = num % 10;
			sum += digit * digit * digit;
			num = num / 10;
		}
		if(sum == n) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not an Armstrong Number");
		}
	}

}
