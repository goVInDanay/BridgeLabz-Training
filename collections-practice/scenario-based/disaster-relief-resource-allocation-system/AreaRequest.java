package collections.scenario_based.disaster_relief_resource_allocation_system;

import java.util.*;

class AreaRequest {
	private String areaName;
	private Map<String, Integer> requested;

	public AreaRequest(String areaName, Map<String, Integer> requested) {
		// TODO Auto-generated constructor stub
		this.areaName = areaName;
		this.requested = requested;
	}

	public String getAreaName() {
		return areaName;
	}

	public Map<String, Integer> getRequested() {
		return requested;
	}

	@Override
	public String toString() {
		return "Request from: " + areaName + ": Request Resources: " + requested;
	}
}
