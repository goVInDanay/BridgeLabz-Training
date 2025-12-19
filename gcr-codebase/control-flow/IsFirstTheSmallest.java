import java.util.*;
public class IsFirstTheSmallest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a < b && a < c) {
			System.out.println("Is the first the smallest number? Yes");
		}
		else {
			System.out.println("Is the first the smallest number? No");
		}
	}

}
