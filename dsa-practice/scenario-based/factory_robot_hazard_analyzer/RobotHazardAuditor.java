package dsa_practice.scenario_based.factory_robot_hazard_analyzer;

class RobotHazardAuditor {
	public double calculateHazardRisk(double armPrecision, int workerDensity, String machineryState)
			throws RobotSafetyException {
		if (armPrecision < 0.0 || armPrecision > 1.0) {
			throw new RobotSafetyException("Error: Arm precision must be 0.0-1.0");
		}
		if (workerDensity < 1 || workerDensity > 20) {
			throw new RobotSafetyException("Error: Worker density must be 1-20");
		}
		machineryState = machineryState.toLowerCase();
		double machineRiskFactor;
		switch (machineryState) {
		case "worn" -> {
			machineRiskFactor = 1.3;
		}
		case "faulty" -> {
			machineRiskFactor = 2.0;
		}
		case "critical" -> {
			machineRiskFactor = 3.0;
		}
		default -> {
			throw new RobotSafetyException("Error: Unsupported machinery state");
		}
		}
		double hazardRisk = ((1.0 - armPrecision) * 15.0) + (workerDensity * machineRiskFactor);
		return hazardRisk;
	}
}
