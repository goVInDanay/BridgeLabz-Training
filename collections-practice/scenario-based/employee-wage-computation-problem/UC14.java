package collections.scenario_based.employee_wage_computation_problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class EmpWageBuilder6 implements IEmployeeWageBuilder {

	private List<CompanyEmpWage3> companies;
	private Random random;

	public EmpWageBuilder6() {
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

	/*
	 * Get total wage by company
	 */
	public int getTotalWageByCompany(String companyName) {
		for (CompanyEmpWage3 company : companies) {
			if (company.companyName.equalsIgnoreCase(companyName)) {
				return company.getTotalWage();
			}
		}
		System.out.println("Company " + companyName + " not found.");
		return -1;
	}
}