import java.util.*;
public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int num = n;
		while(num > 0) {
			count++;
			num = num / 10;
		}
		System.out.println("The number of digits in " + n + " is " + count);
	}

}
