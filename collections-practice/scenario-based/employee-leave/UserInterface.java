package collections.scenario_based.employee_leave;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeaveManagementSystem system = new LeaveManagementSystem();
		Employee emp1 = new Employee("E101", "John", 10);
		system.addEmployee(emp1);
		try {
			system.applyLeave("E101", 5);
			LeaveRequest request = system.getAllLeaveRequests().get(0);
			system.approveLeave(request);
			System.out.println("Leave Approved!");
			System.out.println("Remaining Balance: " + emp1.getLeaveBalance());
			system.applyLeave("E101", 4);
			request = system.getAllLeaveRequests().get(1);
			system.rejectLeave(request);
			System.out.println("Leave rejected");
			System.out.println("Remaining Balance: " + emp1.getLeaveBalance());
			system.applyLeave("E101", 6);

		} catch (InsufficientLeaveBalanceException e) {
			System.out.println(e.getMessage());
		}
	}

}
