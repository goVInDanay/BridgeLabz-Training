import java.util.*;
public class StoreAndSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double nums[] = new double[10];
		int i = 0;
		while(true) {
			System.out.println("Enter a number");
			double n = sc.nextDouble();
			if(n > 0) {
				nums[i++] = n;
			}
			else {
				System.err.println("Invalid Number");
				break;
			}
			if(i == nums.length) {
				break;
			}
		}
		double sum = 0;
		for(int j = 0; j < i; j++) {
			sum += nums[j];
		}
		System.out.println("Sum is " + sum);
	}

}
