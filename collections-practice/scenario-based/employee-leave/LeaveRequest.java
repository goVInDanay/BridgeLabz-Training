package collections.scenario_based.employee_leave;

class LeaveRequest {
	private String employeeId;
	private int numberOfDays;
	private String status;

	public LeaveRequest(String employeeId, int numberOfDays) {
		this.employeeId = employeeId;
		this.numberOfDays = numberOfDays;
		this.status = "PENDING";
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public int getNumberOfDays() {
		return numberOfDays;
	}

	public String getStatus() {
		return status;
	}

	public void approve() {
		this.status = "APPROVED";
	}

	public void reject() {
		this.status = "REJECTED";
	}
}
