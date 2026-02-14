package collections.scenario_based.courier_staff_shift_scheduler;

public class Employee {
	private String employeeID;
	private String name;

	public Employee(String employeeID, String name) {
		this.employeeID = employeeID;
		this.name = name;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name + " | " + employeeID;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Employee)) {
			return false;
		}
		Employee e = (Employee) o;
		return employeeID.equals(e.employeeID);
	}

	@Override
	public int hashCode() {
		return employeeID.hashCode();
	}
}
