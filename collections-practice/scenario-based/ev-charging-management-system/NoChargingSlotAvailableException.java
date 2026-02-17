package collections.scenario_based.ev_charging_management_system;

class NoChargingSlotAvailableException extends Exception {
	public NoChargingSlotAvailableException(String message) {
		super(message);
	}
}
