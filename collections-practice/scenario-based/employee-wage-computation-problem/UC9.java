package collections.scenario_based.employee_wage_computation_problem;

import java.util.Random;

class EmpWageBuilder {

	/*
	 * Instance variables
	 */
	private final String companyName;
	private final int wagePerHour;
	private final int fullTimeHours;
	private final int partTimeHours;
	private final int maxWorkingDays;
	private final int maxWorkingHours;

	private int totalWage;

	private Random random;

	/*
	 * Constructor
	 */
	public EmpWageBuilder(String companyName, int wagePerHour, int fullTimeHours, int partTimeHours, int maxWorkingDays,
			int maxWorkingHours) {
		this.companyName = companyName;
		this.wagePerHour = wagePerHour;
		this.fullTimeHours = fullTimeHours;
		this.partTimeHours = partTimeHours;
		this.maxWorkingDays = maxWorkingDays;
		this.maxWorkingHours = maxWorkingHours;
		this.random = new Random();
		this.totalWage = 0;
	}

	/*
	 * Get attendance, 0 = Absent, 1 = Full Time, 2 = Part time
	 */
	private int getAttendance() {
		return random.nextInt(3);
	}

	/*
	 * Calculate Daily Hours based on attendance
	 */
	private int getDailyHours(int attendance) {
		return switch (attendance) {
		case 1 -> fullTimeHours;
		case 2 -> partTimeHours;
		default -> 0;
		};
	}

	/*
	 * Calculate Daily Wage
	 */
	private int calculateDailyWage(int dailyHours) {
		return dailyHours * wagePerHour;
	}

	/*
	 * Calculate Monthly Wage
	 */
	public void computeTotalWage() {
		int totalHours = 0;
		int totalDays = 0;

		while (totalHours < maxWorkingHours && totalDays < maxWorkingDays) {
			totalDays++;
			int attendance = getAttendance();
			int dailyHours = getDailyHours(attendance);

			if (totalHours + dailyHours > maxWorkingHours) {
				dailyHours = maxWorkingHours - totalHours;
			}

			totalHours += dailyHours;
			int dailyWage = calculateDailyWage(dailyHours);
			totalWage += dailyWage;

			String status = switch (attendance) {
			case 1 -> "Full-Time Present";
			case 2 -> "Part-Time Present";
			default -> "Absent";
			};

			System.out
					.println("Day " + totalDays + " : " + status + " | Hours: " + dailyHours + " | Wage: " + dailyWage);
		}

		System.out.println(companyName);
		System.out.println("Total Days Worked: " + totalDays);
		System.out.println("Total Hours Worked: " + totalHours);
		System.out.println("Total Wage: Rs " + totalWage);
		System.out.println();
	}

	/*
	 * Getters
	 */
	public int getTotalWage() {
		return totalWage;
	}

	public String getCompanyName() {
		return companyName;
	}
}