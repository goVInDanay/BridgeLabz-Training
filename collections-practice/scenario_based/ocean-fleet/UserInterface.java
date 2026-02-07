package collections.scenario_based.ocean_fleet;

import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		VesselUtil util = new VesselUtil();

		System.out.println("Enter the number of vessels to be added");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter vessel details");
		for (int i = 0; i < n; i++) {
			String input = sc.nextLine();
			String[] data = input.split(":");
			Vessel vessel = new Vessel(data[0], data[1], Double.parseDouble(data[2]), data[3]);
			util.addVesselPerformance(vessel);
		}

		System.out.println("Enter the Vessel Id to check speed");
		String searchId = sc.nextLine();

		Vessel found = util.getVesselById(searchId);
		if (found != null) {
			System.out.println(found);
		} else {
			System.out.println("Vessel Id " + searchId + " not found");
		}

		System.out.println("High performance vessels are");
		List<Vessel> highList = util.getHighPerformanceVessels();

		for (Vessel v : highList) {
			System.out.println(v);
		}
	}
}
