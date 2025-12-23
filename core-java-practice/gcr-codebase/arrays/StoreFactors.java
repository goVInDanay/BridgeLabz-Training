import java.util.*;
public class StoreFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int maxFactor = 10;
		int factors[] = new int[maxFactor];
		int i = 0;
		for(int x = 1; x <= n; x++) {
			if(n % x == 0) {
				factors[i++] = x;
			}
			if(i == maxFactor) {
				maxFactor = maxFactor * 2;
				int temp[] = new int[maxFactor];
				for(int j = 0; j < i; j++) {
					temp[j] = factors[j];
				}

				factors = temp;
			}
		}
		System.out.println("Factors ->");
		for(int j = 0; j < i; j++) {
			System.out.print(factors[j] + " ");
		}
		System.out.println();
	}

}
