package collections.scenario_based.employee_wage_computation_problem;

import java.util.*;

class EmpWageBuilder4 implements IEmployeeWageBuilder {
	private List<CompanyEmpWage> companies;
	private Random random;

	public EmpWageBuilder4() {
		companies = new ArrayList<>();
		random = new Random();
	}

	/*
	 * Add company
	 */
	@Override
	public void addCompany(String companyName, int wagePerHour, int fullTimeHours, int partTimeHours,
			int maxWorkingDays, int maxWorkingHours) {
		companies.add(new CompanyEmpWage(companyName, wagePerHour, fullTimeHours, partTimeHours, maxWorkingDays,
				maxWorkingHours));
	}

	/*
	 * Compute wage for each company
	 */
	@Override
	public void computeWages() {
		for (CompanyEmpWage company : companies) {
			computeWage(company);
			System.out.println(company);
		}
	}

	/*
	 * Compute wage
	 */
	private void computeWage(CompanyEmpWage company) {
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