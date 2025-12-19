import java.util.*;
public class GreatestFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n >= 0) {
			int greatestFactor = -1;
			for(int i = n - 1; i >= 1; i--) {
				if(n % i == 0) {
					greatestFactor = i;
					break;
				}
			}
			System.out.println("Greatest Factor of number " + n + " is " + greatestFactor);
		}
	}

}
