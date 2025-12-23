import java.util.*;
public class FindFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		if(n >= 0) {
			for(int i = 1; i <= n; i++) {
				if(n % i == 0) {
					System.out.println(i);
				}
			}
		}
		else {
			System.out.println("Enter a positive number");
		}
	}

}
