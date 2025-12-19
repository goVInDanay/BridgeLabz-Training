import java.util.*;
public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isPrime = true;
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime && n != 1) {
			System.out.println(n + " is Prime");
		}
		else {
			System.out.println(n + " is not prime");
		}
	}

}
