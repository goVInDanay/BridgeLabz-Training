package core_java_practice.gcr_codebase.extras;
import java.util.*;
public class FindFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of terms of fibonacci sequence");
		int n = sc.nextInt();
		calculateSequence(n);
	}
	public static void calculateSequence(int size) {
		long fibonacci[] = new long[size];
		for(int i = 0; i < size; i++) {
			if(i == 0) {
				fibonacci[i] = 0;
			}
			else if(i == 1) {
				fibonacci[i] = 1;
			}
			else {
				fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
			}
		}
		System.out.println("The fibonacci squence -> ");
		for(long n : fibonacci) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

}
