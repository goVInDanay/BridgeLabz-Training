package collections.scenario_based.smart_water_tracking_system;

class WaterTank {
	private String tankId;
	private double capacity;
	private double currentLevel;

	public WaterTank(String tankId, double capacity, double currentLevel) {
		// TODO Auto-generated constructor stub
		this.tankId = tankId;
		this.capacity = capacity;
		this.currentLevel = currentLevel;
	}

	public String getTankId() {
		return tankId;
	}

	public double getCapacity() {
		return capacity;
	}

	public double getCurrentLevel() {
		return currentLevel;
	}

	public void setCurrentLevel(double currentLevel) throws InvalidWaterLevelException {
		if (currentLevel > capacity || currentLevel < 0) {
			throw new InvalidWaterLevelException("Current level should be between 0 - " + capacity);
		}
		this.currentLevel = currentLevel;
	}

	public double usagePercentage() {
		return (currentLevel / capacity) * 100;
	}

	public boolean isLevelLow() {
		return usagePercentage() < 20;
	}

	@Override
	public String toString() {
		return tankId + "| Level: " + currentLevel + " / " + capacity;
	}
}
