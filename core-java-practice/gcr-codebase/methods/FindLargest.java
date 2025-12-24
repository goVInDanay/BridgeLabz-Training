package core_java_practice.gcr_codebase.methods;
import java.util.*;
public class FindLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sm[] = findSmallestAndLargest(a, b, c);
		System.out.println("Smallest " + sm[0] + " Largest " + sm[1]);
	}
	public static int[] findSmallestAndLargest(int a, int b, int c) {
		int sm[] = new int[2];
		if(a > b && a > c) {
			sm[1] = a;
			sm[0] = b > c ? c : b;
		}
		if(b > a && b > c) {
			sm[1] = b;
			sm[0] = a < c ? a : c;
		}
		else {
			sm[0] = a < b ? a : b;
			sm[1] = c;
		}
		return sm;
	}

}
