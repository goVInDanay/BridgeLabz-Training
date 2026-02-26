package collections.scenario_based.railway_platform_allocation_system;

class Platform {
	private int platformNumber;
	private Train currentTrain;

	Platform(int platformNumber) {
		this.platformNumber = platformNumber;
	}

	public int getPlatformNumber() {
		return platformNumber;
	}

	public boolean isAvailable() {
		return currentTrain == null;
	}

	public void assignTrain(Train train) {
		this.currentTrain = train;
	}

	public void resignTrain() {
		this.currentTrain = null;
	}

	public Train getCurrentTrain() {
		return currentTrain;
	}
}
