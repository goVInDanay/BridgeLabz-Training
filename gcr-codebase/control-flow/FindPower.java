import java.util.*;
public class FindPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int power = sc.nextInt();
		int ans = 1;
		for(int i = 1; i <= power; i++) {
			ans = ans * n;
		}
		System.out.println(n + " to the power " + power + " is " + ans);
	}

}
