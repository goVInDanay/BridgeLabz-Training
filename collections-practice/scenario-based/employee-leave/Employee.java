package collections.scenario_based.employee_leave;

class Employee {
	private String employeeId;
	private String name;
	private int leaveBalance;

	public Employee(String employeeId, String name, int leaveBalance) {
		this.employeeId = employeeId;
		this.name = name;
		this.leaveBalance = leaveBalance;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}

	public int getLeaveBalance() {
		return leaveBalance;
	}

	public void deductLeave(int days) {
		this.leaveBalance -= days;
	}

	public void addLeave(int days) {
		this.leaveBalance += days;
	}
}
