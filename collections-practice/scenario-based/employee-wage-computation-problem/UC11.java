package collections.scenario_based.employee_wage_computation_problem;

import java.util.*;

interface IEmployeeWageBuilder {
	void addCompany(String companyName, int wagePerHour, int fullTimeHours, int partTimeHours, int maxWorkingDays,
			int maxWorkingHours);

	void computeWages();
}

class CompanyEmpWage2 {
	public final String companyName;
	public final int wagePerHour;
	public final int fullTimeHours;
	public final int partTimeHours;
	public final int maxWorkingDays;
	public final int maxWorkingHours;

	public int totalWage;

	public CompanyEmpWage2(String companyName, int wagePerHour, int fullTimeHours, int partTimeHours,
			int maxWorkingDays, int maxWorkingHours) {
		this.companyName = companyName;
		this.wagePerHour = wagePerHour;
		this.fullTimeHours = fullTimeHours;
		this.partTimeHours = partTimeHours;
		this.maxWorkingDays = maxWorkingDays;
		this.maxWorkingHours = maxWorkingHours;
		this.totalWage = 0;
	}

	public void setTotalWage(int totalWage) {
		this.totalWage = totalWage;
	}

	@Override
	public String toString() {
		return "Total Wage for " + companyName + " : Rs " + totalWage;
	}
}

class EmpWageBuilder3 implements IEmployeeWageBuilder {

	private final int MAX_COMPANIES = 10;
	private CompanyEmpWage2[] companies;
	private int companyCount;
	private Random random;

	public EmpWageBuilder3() {
		companies = new CompanyEmpWage2[MAX_COMPANIES];
		companyCount = 0;
		random = new Random();
	}

	/*
	 * Add company
	 */
	@Override
	public void addCompany(String companyName, int wagePerHour, int fullTimeHours, int partTimeHours,
			int maxWorkingDays, int maxWorkingHours) {
		if (companyCount < MAX_COMPANIES) {
			companies[companyCount++] = new CompanyEmpWage2(companyName, wagePerHour, fullTimeHours, partTimeHours,
					maxWorkingDays, maxWorkingHours);
		} else {
			System.out.println("Cannot add more companies. Max limit reached.");
		}
	}

	/*
	 * Compute wage for each company
	 */
	@Override
	public void computeWages() {
		for (int i = 0; i < companyCount; i++) {
			computeWage(companies[i]);
			System.out.println(companies[i]);
		}
	}

	/*
	 * Compute wage
	 */
	private void computeWage(CompanyEmpWage2 company) {
		int totalHours = 0;
		int totalDays = 0;
		int totalWage = 0;

		while (totalHours < company.maxWorkingHours && totalDays < company.maxWorkingDays) {
			totalDays++;
			int attendance = random.nextInt(3);
			int dailyHours = switch (attendance) {
			case 1 -> company.fullTimeHours;
			case 2 -> company.partTimeHours;
			default -> 0;
			};

			if (totalHours + dailyHours > company.maxWorkingHours) {
				dailyHours = company.maxWorkingHours - totalHours;
			}

			totalHours += dailyHours;
			int dailyWage = dailyHours * company.wagePerHour;
			totalWage += dailyWage;

			String status = switch (attendance) {
			case 1 -> "Full-Time Present";
			case 2 -> "Part-Time Present";
			default -> "Absent";
			};

			System.out
					.println("Day " + totalDays + " : " + status + " | Hours: " + dailyHours + " | Wage: " + dailyWage);
		}

		company.setTotalWage(totalWage);

		System.out.println(company.companyName);
		System.out.println("Total Days Worked: " + totalDays);
		System.out.println("Total Hours Worked: " + totalHours);
		System.out.println("Total Wage: Rs " + totalWage);
		System.out.println("-------------------------------------------");
	}
}