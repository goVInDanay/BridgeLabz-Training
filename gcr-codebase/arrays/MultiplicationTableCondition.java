import java.util.*;
public class MultiplicationTableCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int table[] = new int[4];
		for(int i = 6; i <= 9; i++) {
			int prod = n * i;
			System.out.println(n + " X " + i + " = " + prod);
		}
	}

}
