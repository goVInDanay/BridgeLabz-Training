import java.util.Scanner;
public class GreatestFactorWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n >= 0) {
			int greatestFactor = -1;
			int i = n - 1;
			while(i >= 1) {
				if(n % i == 0) {
					greatestFactor = i;
					break;
				}
				i--;
			}
			System.out.println("Greatest Factor of number " + n + " is " + greatestFactor);
		}
	}

}
