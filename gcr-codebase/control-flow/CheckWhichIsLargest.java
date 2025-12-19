import java.util.*;
public class CheckWhichIsLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		boolean first = false;
		boolean second = false;
		boolean third = false;
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a > b && a > c) {
			first = true;
		}
		else if(b > a && b > c) {
			second = true;
		}
		else if(c > a && c > b) {
			third = true;
		}
		System.out.println("Is the first number the largest? " + first);
		System.out.println("Is the second number the largest? " + second);
		System.out.println("Is the third number the largest? " + third);
	}

}
