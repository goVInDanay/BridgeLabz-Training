package collections.scenario_based.employee_wage_computation_problem;

import java.util.*;

class UC7 {
	private static final int WAGE_PER_HOUR = 20;
	private static final int FULL_TIME_HOURS = 8;
	private static final int PART_TIME_HOURS = 4;
	private static final int MAX_WORKING_DAYS = 20;
	private static final int MAX_WORKING_HOURS = 100;

	private Random random;

	/*
	 * instance variables
	 */
	private int totalWorkingDays;
	private int totalWorkingHours;
	private int totalWage;

	/*
	 * Constructor
	 */
	public UC7() {
		random = new Random();
		totalWorkingDays = 0;
		totalWorkingHours = 0;
		totalWage = 0;
	}

	/*
	 * Get attendance, 0 = Absent, 1 = Full Time, 2 = Part time
	 */
	public int getAttendance() {
		return random.nextInt(3);
	}

	/*
	 * Calculate Daily Hours based on attendance
	 */
	public int getDailyHours(int attendance) {
		switch (attendance) {
		case 1 -> {
			return FULL_TIME_HOURS;
		}
		case 2 -> {
			return PART_TIME_HOURS;
		}
		default -> {
			return 0;
		}
		}
	}

	/*
	 * Calculate Daily Wage
	 */
	public int calculateDailyWage(int dailyHours) {
		return dailyHours * WAGE_PER_HOUR;
	}

	/*
	 * Calculate Monthly Wage
	 */
	public void calculateMonthyWage() {
		while (totalWorkingHours < MAX_WORKING_HOURS && totalWorkingDays < MAX_WORKING_DAYS) {
			totalWorkingDays++;
			int attendance = getAttendance();
			int dailyHours = getDailyHours(attendance);

			if (totalWorkingHours + dailyHours > MAX_WORKING_HOURS) {
				dailyHours = MAX_WORKING_HOURS - totalWorkingHours;
			}

			totalWorkingHours += dailyHours;
			int dailyWage = calculateDailyWage(dailyHours);
			totalWage += dailyWage;

			String status = switch (attendance) {
			case 1 -> "Full Time Present";
			case 2 -> "Part Time Present";
			default -> "Absent";
			};
			System.out.println("Day " + totalWorkingDays + " : " + status);
			System.out.println("Daily Hours: " + dailyHours + " | Daily Wage: " + dailyWage);
		}

		System.out.println("Total Working Days: " + totalWorkingDays);
		System.out.println("Total Working Hours: " + totalWorkingDays);
		System.out.println("Total Monthly Wage: Rs " + totalWage);
	}

	/*
	 * Getters
	 */

	public int getTotalWorkingDays() {
		return totalWorkingDays;
	}

	public int getTotalWorkingHours() {
		return totalWorkingHours;
	}

	public int getTotalWage() {
		return totalWage;
	}

}
