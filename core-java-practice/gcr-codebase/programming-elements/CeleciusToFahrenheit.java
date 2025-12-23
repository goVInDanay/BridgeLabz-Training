import java.util.*;
public class CeleciusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in celcius (in decimal)");
        double celcius = sc.nextDouble();
        double fahrenheit = ((celcius * 9)/5 + 32);
        System.out.println(fahrenheit);
    }    
}
