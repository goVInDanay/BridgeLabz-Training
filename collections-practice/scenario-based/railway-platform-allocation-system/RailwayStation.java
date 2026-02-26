package collections.scenario_based.railway_platform_allocation_system;

import java.util.*;

class RailwayStation {
	private Map<Integer, Platform> platformMap = new HashMap<Integer, Platform>();
	private PriorityQueue<Train> trainQueue = new PriorityQueue<Train>();

	public RailwayStation(int numberOfPlatforms) {
		// TODO Auto-generated constructor stub
		for (int i = 1; i <= numberOfPlatforms; i++) {
			platformMap.put(i, new Platform(i));
		}
	}

	public void addTrain(Train train) {
		trainQueue.add(train);
	}

	private Platform findAvailablePlatform(Train train) {
		for (Platform platform : platformMap.values()) {
			if (platform.isAvailable()) {
				return platform;
			}

			Train current = platform.getCurrentTrain();
			if (current.getDepartureTime().isBefore(train.getArrivalTime())
					|| current.getDepartureTime().equals(train.getArrivalTime())) {
				platform.resignTrain();
				return platform;
			}
		}
		return null;
	}

	public void allocatePlatforms() throws PlatformUnavailableException {
		while (!trainQueue.isEmpty()) {
			Train train = trainQueue.poll();
			Platform platform = findAvailablePlatform(train);
			if (platform == null) {
				throw new PlatformUnavailableException("No platform available for " + train.getTrainId());
			}
			platform.assignTrain(train);
			System.out.println(train + " allocated to Platform " + platform.getPlatformNumber());
		}
	}
}
