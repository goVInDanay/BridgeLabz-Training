package collections.scenario_based.employee_wage_computation_problem;

import java.util.*;

class CompanyEmpWage3 {

	public final String companyName;
	public final int wagePerHour;
	public final int fullTimeHours;
	public final int partTimeHours;
	public final int maxWorkingDays;
	public final int maxWorkingHours;

	private int totalWage;
	private List<Integer> dailyWages;

	public CompanyEmpWage3(String companyName, int wagePerHour, int fullTimeHours, int partTimeHours,
			int maxWorkingDays, int maxWorkingHours) {
		this.companyName = companyName;
		this.wagePerHour = wagePerHour;
		this.fullTimeHours = fullTimeHours;
		this.partTimeHours = partTimeHours;
		this.maxWorkingDays = maxWorkingDays;
		this.maxWorkingHours = maxWorkingHours;
		this.dailyWages = new ArrayList<>();
		this.totalWage = 0;
	}

	public void addDailyWage(int dailyWage) {
		dailyWages.add(dailyWage);
		totalWage += dailyWage;
	}

	public int getTotalWage() {
		return totalWage;
	}

	public List<Integer> getDailyWages() {
		return dailyWages;
	}

	@Override
	public String toString() {
		return "Company: " + companyName + " | Total Wage: Rs " + totalWage + " | Daily Wages: " + dailyWages;
	}
}

class EmpWageBuilder5 implements IEmployeeWageBuilder {

	private List<CompanyEmpWage3> companies;
	private Random random;

	public EmpWageBuilder5() {
		companies = new ArrayList<>();
		random = new Random();
	}

	/*
	 * Add company
	 */
	@Override
	public void addCompany(String companyName, int wagePerHour, int fullTimeHours, int partTimeHours,
			int maxWorkingDays, int maxWorkingHours) {
		companies.add(new CompanyEmpWage3(companyName, wagePerHour, fullTimeHours, partTimeHours, maxWorkingDays,
				maxWorkingHours));
	}

	/*
	 * Compute wage for each company
	 */
	@Override
	public void computeWages() {
		for (CompanyEmpWage3 company : companies) {
			computeWage(company);
			System.out.println(company);
		}
	}

	/*
	 * Compute wage
	 */
	private void computeWage(CompanyEmpWage3 company) {
		int totalHours = 0;
		int totalDays = 0;

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

			company.addDailyWage(dailyWage);

			String status = switch (attendance) {
			case 1 -> "Full-Time Present";
			case 2 -> "Part-Time Present";
			default -> "Absent";
			};

			System.out
					.println("Day " + totalDays + " : " + status + " | Hours: " + dailyHours + " | Wage: " + dailyWage);
		}

		System.out.println("=== " + company.companyName + " Summary ===");
		System.out.println("Total Days Worked: " + totalDays);
		System.out.println("Total Hours Worked: " + totalHours);
		System.out.println("Total Wage: Rs " + company.getTotalWage());
		System.out.println("-------------------------------------------");
	}
}