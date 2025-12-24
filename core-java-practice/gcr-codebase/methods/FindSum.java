package core_java_practice.gcr_codebase.methods;
import java.util.*;
public class FindSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		FindSum fs = new FindSum();
		int sum = fs.getSum(n);
		System.out.println(sum);
	}
	private int getSum(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

}
