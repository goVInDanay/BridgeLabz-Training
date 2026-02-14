package collections.scenario_based.courier_staff_shift_scheduler;

public class ShiftAlreadyAssignedException extends Exception {
	public ShiftAlreadyAssignedException(String message) {
		super(message);
	}
}
