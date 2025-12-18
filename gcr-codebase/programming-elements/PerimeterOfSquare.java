import java.util.*;
public class PerimeterOfSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side of square");
		double side = sc.nextDouble();
		double perimeter = side *4;
		System.out.println("The lenght of the side is " + side + " whose perimeter is " + perimeter);
	}

}
