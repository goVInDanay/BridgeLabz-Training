import java.util.Scanner;
public class CheckMultiplesWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 100;
		while(i >= n) {
			if(i % n == 0) {
				System.out.println(i + " is a multiple of " + n);
			}
			i--;
		}
	}

}
