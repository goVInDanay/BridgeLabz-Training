package core_java_practice.gcr_codebase.methods;
import java.util.*;
public class FindRoots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double roots[] = findRoots(a, b, c);
		if(roots.length == 0) {
			System.out.println("Roots do not exist");
		}
		else {
			System.out.println("Roots are " + roots[0] + " and " + roots[1]);
		}
	}
	private static double[] findRoots(int a, int b, int c) {
		double delta = Math.pow(b, 2) - (4 * a * c);
		if(delta < 0) {
			return new double[] {};
		}
		double root1 = ((-b) + Math.sqrt(delta))/ (2 * a);
		double root2 = ((-b) - Math.sqrt(delta))/ (2 * a);
		return new double[] {root1, root2};
	}

}
