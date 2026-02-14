package collections.scenario_based.disaster_relief_resource_allocation_system;

import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReliefManager manager = new ReliefManager();
		ReliefCenter rc1 = new ReliefCenter("CenterA");

		rc1.addResource("Water", 100);
		rc1.addResource("Food", 50);
		rc1.addResource("Medical Kit", 30);

		ReliefCenter rc2 = new ReliefCenter("CenterB");
		rc2.addResource("Water", 50);
		rc2.addResource("Food", 100);
		rc2.addResource("Medical Kit", 20);

		manager.addReliefCenter(rc1);
		manager.addReliefCenter(rc2);

		Map<String, Integer> area1Resources = new HashMap<>();
		area1Resources.put("Water", 70);
		area1Resources.put("Food", 40);
		manager.addAreaRequest(new AreaRequest("Area1", area1Resources));

		Map<String, Integer> area2Resources = new HashMap<>();
		area2Resources.put("Water", 90);
		area2Resources.put("Medical Kit", 40);
		manager.addAreaRequest(new AreaRequest("Area2", area2Resources));

		manager.processRequests();
		manager.printReliefCenters();
	}

}
