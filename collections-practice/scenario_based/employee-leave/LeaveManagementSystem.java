package collections.scenario_based.employee_leave;

import java.util.*;

class LeaveManagementSystem {
	private Map<String, Employee> employeeMap = new HashMap<>();
	private List<LeaveRequest> leaveRequests = new ArrayList<>();

	public void addEmployee(Employee employee) {
		employeeMap.put(employee.getEmployeeId(), employee);
	}

	public void applyLeave(String employeeId, int days) throws InsufficientLeaveBalanceException {
		Employee employee = employeeMap.get(employeeId);
		if (employee == null) {
			throw new IllegalArgumentException("Employee not found");
		}

		if (employee.getLeaveBalance() < days) {
			throw new InsufficientLeaveBalanceException("Not enough leave balance");
		}
		LeaveRequest request = new LeaveRequest(employeeId, days);
		leaveRequests.add(request);
	}

	public void approveLeave(LeaveRequest request) throws InsufficientLeaveBalanceException {
		Employee employee = employeeMap.get(request.getEmployeeId());
		if (employee.getLeaveBalance() < request.getNumberOfDays()) {
			throw new InsufficientLeaveBalanceException("Not enough leave balance to approve");
		}
		employee.deductLeave(request.getNumberOfDays());
		request.approve();
	}

	public void rejectLeave(LeaveRequest request) {
		request.reject();
	}

	public List<LeaveRequest> getAllLeaveRequests() {
		return leaveRequests;
	}
}
