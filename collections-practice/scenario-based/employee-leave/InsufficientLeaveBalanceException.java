package collections.scenario_based.employee_leave;

public class InsufficientLeaveBalanceException extends Exception {
	public InsufficientLeaveBalanceException(String message) {
		super(message);
	}
}
