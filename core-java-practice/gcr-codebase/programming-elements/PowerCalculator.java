import java.util.*;
public class PowerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and exponent");
        double b = sc.nextDouble();
        double e = sc.nextDouble();
        System.out.println(Math.pow(e, b));
    }
}
