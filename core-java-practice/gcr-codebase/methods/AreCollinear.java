package core_java_practice.gcr_codebase.methods;
import java.util.*;
public class AreCollinear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter co-ordinates");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double x3 = sc.nextDouble();
		double y3 = sc.nextDouble();
		boolean isCollinearS = isCollinearSlope(x1, y1, x2, y2, x3, y3);
		boolean isCollinearT = isCollinearTriangel(x1, y1, x2, y2, x3, y3);
		System.out.println("Using Slope method " + isCollinearS + "\nUsing Triangle Area method " + isCollinearT);
	}
	public static boolean isCollinearSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
		double slope1 = (y2 - y1) / (x2 - x1);
		double slope2 = (y3 - y2) / (x3 - x2);
		double slope3 = (y3 - y1) / (x3 - x1);
		return slope1 == slope2 && slope2 == slope3;
	}
	public static boolean isCollinearTriangel(double x1, double y1, double x2, double y2, double x3, double y3) {
		double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
		return area == 0;
	}

}
