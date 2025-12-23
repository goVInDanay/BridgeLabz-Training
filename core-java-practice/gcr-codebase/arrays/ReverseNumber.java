import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = n;
		int count = 0;
		while(num > 0) {
			num = num / 10;
			count++;
		}
		int digits[] = new int[count];
		int i = 0;
		while(n > 0) {
			digits[i++] = n % 10;
			n = n / 10;
		}
		for(int j = 0; j < count; j++) {
			System.out.print(digits[j]);
		}
		System.out.println();
	}

}
