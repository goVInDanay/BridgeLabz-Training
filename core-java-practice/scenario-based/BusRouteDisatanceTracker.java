package core_java_practice.scenario_based;
import java.util.*;
public class BusRouteDisatanceTracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double distannces[] = getRandomStops(100);
		System.out.printf("Distance travelled %8.2f\n", distanceTracker(distannces));
	}
	public static double[] getRandomStops(int size) {
		double distances[] = new double[size];
		for(int i = 0; i < size; i++) {
			distances[i] = Math.random() * 96 + 5;
		}
		return distances;
	}
	public static double distanceTracker(double distances[]) {
		double dist = 0;
		Scanner sc = new Scanner(System.in);
		int idx = 0;
		while(true) {
			idx = idx % distances.length;
			System.out.printf("Next stop %3.2f km\n", distances[idx]);
			System.out.println("Enter exit to exit from bus. Else type anything else");
			String s = sc.next();
			if(s.equals("exit")) {
				return dist;
			}
			dist += distances[idx++];
		}
	}

}
