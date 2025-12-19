import java.util.Scanner;
public class FindPowerWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int power = sc.nextInt();
		int ans = 1;
		int i = 1;
		while(i <= power) {
			ans = ans * n;
			i++;
		}
		System.out.println(n + " to the power " + power + " is " + ans);
	}

}
