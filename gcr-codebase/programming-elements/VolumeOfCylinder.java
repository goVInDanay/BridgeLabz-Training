import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius and height");
        double radius = sc.nextInt();
        double height = sc.nextInt();
        System.out.println("Volume = " + radius * radius * height * Math.PI);
    }
}
