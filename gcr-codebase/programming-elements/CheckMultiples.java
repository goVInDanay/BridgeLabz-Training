import java.util.*;
public class CheckMultiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 100; i >= n; i--) {
			if(i % n == 0) {
				System.out.println(i + " is a multiple of " + n);
			}
		}
	}

}
