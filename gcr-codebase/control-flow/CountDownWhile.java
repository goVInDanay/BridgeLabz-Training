import java.util.*;
public class CountDownWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		while(n >= 1) {
			System.out.println(n--);
		}
	}

}
