import java.util.*;
public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base and height");
		double base = sc.nextDouble();
		double height = sc.nextDouble();
		double area = 0.5 * base * height;
		double areaInch = area / (2.54 * 2.54);
		System.out.println("Area in cm^2 " + area + " and in inch^2 " + areaInch);
	}

}
