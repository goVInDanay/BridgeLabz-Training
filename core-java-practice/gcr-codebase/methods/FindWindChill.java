package core_java_practice.gcr_codebase.methods;
import java.util.*;
public class FindWindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double temperature = sc.nextDouble();
		double windSpeed = sc.nextDouble();
		FindWindChill fwc = new FindWindChill();
		double windChill = fwc.findWindChill(temperature, windSpeed);
		System.out.println("Wind Chill " + windChill);
	}
	public double findWindChill(double temperature, double windSpeed) {
		double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
		return windChill;
	}

}
