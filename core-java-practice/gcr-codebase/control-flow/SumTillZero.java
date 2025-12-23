import java.util.*;
public class SumTillZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double sum = 0.0;
		while(true) {
			System.out.println("Enter a number. Loop will end if you enter zero");
			double n = sc.nextDouble();
			if(n <= 0) {
				break;
			}
			sum += n;
		}
		System.out.println(sum);
	}

}
