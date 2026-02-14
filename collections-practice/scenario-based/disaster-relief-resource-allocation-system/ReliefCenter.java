package collections.scenario_based.disaster_relief_resource_allocation_system;

import java.util.*;

class ReliefCenter {
	private String name;
	private Map<String, Integer> resources;

	public ReliefCenter(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.resources = new HashMap<String, Integer>();
	}

	public String getName() {
		return name;
	}

	public Map<String, Integer> getResources() {
		return resources;
	}

	public void addResource(String item, int quantity) {
		resources.put(item, resources.getOrDefault(item, 0) + quantity);
	}

	public void allocateResouces(String item, int quantity) throws InsufficientResourceException {
		int available = resources.getOrDefault(item, 0);
		if (available < quantity) {
			throw new InsufficientResourceException("Insufficient resources: " + available);
		}
		resources.put(item, available - quantity);
	}
}
