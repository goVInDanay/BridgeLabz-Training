import java.util.*;
public class IsAbundantNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= n / 2; i++) {
			if(n % i == 0) {
				sum += i;
			}
		}
		if(sum > n) {
			System.out.println("Abundant Number"); 
		}
		else {
			System.out.println("Not a Abundant Number");
		}
	}

}
