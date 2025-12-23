import java.util.*;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		for(int i = 6; i <= 9; i++) {
			int prod = n * i;
			System.out.println(n + " X " + i + " = " + prod);
		}
	}

}
