package collections.scenario_based.disaster_relief_resource_allocation_system;

import java.util.*;

class ReliefManager {
	private Map<String, ReliefCenter> reliefCenters = new HashMap<String, ReliefCenter>();
	private Queue<AreaRequest> requestQueue = new LinkedList<AreaRequest>();

	public void addReliefCenter(ReliefCenter reliefCenter) {
		reliefCenters.put(reliefCenter.getName(), reliefCenter);
	}

	public void addAreaRequest(AreaRequest request) {
		requestQueue.offer(request);
	}

	public void processRequests() {
		System.out.println("Processing");
		while (!requestQueue.isEmpty()) {
			AreaRequest request = requestQueue.poll();
			System.out.println("Allocating for area: " + request.getAreaName());
			for (Map.Entry<String, Integer> entry : request.getRequested().entrySet()) {
				String item = entry.getKey();
				int quantity = entry.getValue();
				boolean allocated = false;
				for (ReliefCenter center : reliefCenters.values()) {
					try {
						center.allocateResouces(item, quantity);
						System.out.println("Allocated " + quantity + " from " + center.getName());
						allocated = true;
						break;
					} catch (InsufficientResourceException e) {
						// TODO: handle exception
						System.out.println(e.getMessage());
					}
				}
				if (!allocated) {
					System.out.println("Failed to allocate resources");
				}
			}
		}
	}

	public void printReliefCenters() {
		reliefCenters.forEach((name, center) -> {
			System.out.println(name + " : " + center.getResources());
		});
	}
}
