import java.util.*;
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number > 0) {
			int odd[] = new int[number / 2 + 1];
			int even[] = new int[number / 2 + 1];
			int iOdd = 0;
			int iEven = 0;
			for(int i = 1; i <= number; i++) {
				if(i % 2 == 0) {
					even[iEven++] = i;
				}
				else {
					odd[iOdd++] = i;
				}
			}
			System.out.println("Odd ->");
			for(int i = 0; i < iOdd; i++) {
				System.out.print(odd[i] + " ");
			}
			System.out.println();
			System.out.println("Even ->");
			for(int i = 0; i < iEven; i++) {
				System.out.print(even[i] + " ");
			}
			System.out.println();
		}
		else {
			System.err.println("Invalid Number");
		}
	}

}
