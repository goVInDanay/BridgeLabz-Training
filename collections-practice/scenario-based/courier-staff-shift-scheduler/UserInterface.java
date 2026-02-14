package collections.scenario_based.courier_staff_shift_scheduler;

import java.time.LocalTime;

public class UserInterface {

	public static void main(String[] args) {
		try {
			ShiftScheduler scheduler = new ShiftScheduler();

			Employee e1 = new Employee("EMP101", "Nitai");
			Employee e2 = new Employee("EMP102", "Aman");
			Employee e3 = new Employee("EMP103", "Akash");

			scheduler.addEmployee(e1);
			scheduler.addEmployee(e2);
			scheduler.addEmployee(e3);

			ShiftTime morning = new ShiftTime(LocalTime.of(9, 0), LocalTime.of(17, 0));
			ShiftTime evening = new ShiftTime(LocalTime.of(18, 0), LocalTime.of(02, 0));

			scheduler.assignShift(morning, e1);
			scheduler.assignShift(morning, e2);
			scheduler.assignShift(evening, e2);
			scheduler.assignShift(evening, e3);

			System.out.println("All Shift Assignments:");
			scheduler.printShiftAssignments();
			
			scheduler.assignShift(morning, e1);

		} catch (ShiftAlreadyAssignedException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
