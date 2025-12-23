import java.util.*;
public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and width");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double perimeter = 2 * (length * width);
        System.out.println("Perimeter = " + perimeter);
    }
}
