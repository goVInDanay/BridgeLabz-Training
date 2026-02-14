package collections.scenario_based.courier_staff_shift_scheduler;

import java.util.*;

public class ShiftScheduler {
	private List<Employee> employees;
	private Map<ShiftTime, List<Employee>> shiftAssignments;

	public ShiftScheduler() {
		employees = new ArrayList<>();
		shiftAssignments = new HashMap<>();
	}

	public void addEmployee(Employee e) {
		employees.add(e);
	}

	public void assignShift(ShiftTime shift, Employee e) throws ShiftAlreadyAssignedException {
		List<Employee> assigned = shiftAssignments.getOrDefault(shift, new ArrayList<>());

		if (assigned.contains(e)) {
			throw new ShiftAlreadyAssignedException(e + " is already assigned to shift " + shift);
		}

		assigned.add(e);
		shiftAssignments.put(shift, assigned);
		System.out.println(e + " assigned to shift " + shift);
	}

	public void printShiftAssignments() {
		for (Map.Entry<ShiftTime, List<Employee>> entry : shiftAssignments.entrySet()) {
			System.out.println("Shift: " + entry.getKey() + " | Employees: " + entry.getValue());
		}
	}
}
