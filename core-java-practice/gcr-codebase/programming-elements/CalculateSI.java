import java.util.Scanner;
public class CalculateSI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal, Rate and Time");
        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        int time = sc.nextInt();
        double SI = (principal * rate * time) / 100.0;
        System.out.println(SI);
    }
}
