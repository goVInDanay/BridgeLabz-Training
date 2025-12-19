import java.util.Scanner;
public class FindFactorsWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		if(n >= 0) {
			int i = 1;
			while(i <= n) {
				if(n % i == 0) {
					System.out.println(i);
				}
				i++;
			}
		}
		else {
			System.out.println("Enter a positive number");
		}
	}

}
