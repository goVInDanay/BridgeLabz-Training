import java.util.Scanner;
public class CheckNatural3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		if(n >= 0) {
			int sumFormula = (n * (n + 1)) / 2;
			int sumLoop = 0;
			for(int i = 1; i <= n; i++) {
				sumLoop += i;
			}
			System.out.println("Sum using formula " + sumFormula + " and sum using Loop " + sumLoop + " hence " + (sumFormula == sumLoop));
		}
		else {
			System.out.println("Not a natural number");
		}
	}	

}
