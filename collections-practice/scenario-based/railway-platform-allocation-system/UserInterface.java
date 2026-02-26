package collections.scenario_based.railway_platform_allocation_system;

import java.time.LocalTime;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RailwayStation station = new RailwayStation(2);
		station.addTrain(new Train("T1", LocalTime.of(10, 0), LocalTime.of(10, 30)));
		station.addTrain(new Train("T2", LocalTime.of(10, 5), LocalTime.of(10, 40)));
		station.addTrain(new Train("T3", LocalTime.of(10, 10), LocalTime.of(10, 50)));
		try {
			station.allocatePlatforms();
		} catch (PlatformUnavailableException e) {
			System.out.println(e.getMessage());
		}
	}
}
