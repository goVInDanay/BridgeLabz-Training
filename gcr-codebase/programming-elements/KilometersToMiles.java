import java.util.*;
public class KilometersToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in kilometers");
        double kilometers = sc.nextDouble();
        System.out.println("Miles = " + kilometers * 0.621371);
    }
}
