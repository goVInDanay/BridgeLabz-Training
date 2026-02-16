package collections.scenario_based.employee_wage_computation_problem;

import java.util.Random;

class UC8 {
	private Random random = new Random();

	/*
	 * Method 1: Get attendance, 0 = Absent, 1 = Full Time, 2 = Part time
	 */
	public int getAttendance() {
		return random.nextInt(3);
	}

	/*
	 * Calculate Daily Hours based on attendance
	 */
	public int getDailyHours(int attendance, int fullTimeHours, int partTimeHours) {
		switch (attendance) {
		case 1 -> {
			return fullTimeHours;
		}
		case 2 -> {
			return partTimeHours;
		}
		default -> {
			return 0;
		}
		}
	}

	/*
	 * Calculate Daily Wage
	 */
	public int calculateDailyWage(int dailyHours, int wagePerHour) {
		return dailyHours * wagePerHour;
	}

	/*
	 * Calculate Monthly Wage
	 */
	public void calculateMonthyWage(String companyName, int wagePerHour, int fullTimeHours, int partTimeHours,
			int maxWorkingDays, int maxWorkingHours) {
		int totalWorkingDays = 0;
		int totalWorkingHours = 0;
		int totalWage = 0;

		while (totalWorkingHours < maxWorkingHours && totalWorkingDays < maxWorkingDays) {
			totalWorkingDays++;
			int attendance = getAttendance();
			int dailyHours = getDailyHours(attendance, fullTimeHours, partTimeHours);

			if (totalWorkingHours + dailyHours > maxWorkingHours) {
				dailyHours = maxWorkingHours - totalWorkingHours;
			}

			totalWorkingHours += dailyHours;
			int dailyWage = calculateDailyWage(dailyHours, wagePerHour);
			totalWage += dailyWage;

			String status = switch (attendance) {
			case 1 -> "Full Time Present";
			case 2 -> "Part Time Present";
			default -> "Absent";
			};
			System.out.println("Day " + totalWorkingDays + " : " + status);
			System.out.println("Daily Hours: " + dailyHours + " | Daily Wage: " + dailyWage);
		}

		System.out.println(companyName);
		System.out.println("Total Working Days: " + totalWorkingDays);
		System.out.println("Total Working Hours: " + totalWorkingDays);
		System.out.println("Total Monthly Wage: Rs " + totalWage);
	}
}
