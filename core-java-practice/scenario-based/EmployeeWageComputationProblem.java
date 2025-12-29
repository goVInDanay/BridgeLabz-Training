package core_java_practice.scenario_based;
public class EmployeeWageComputationProblem {
	
	//UC-1 Check if Employee is Present Or Absent using Random()
	public int getAttendance() {
		return (int)(Math.random() * 3);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		System.out.println();
		
		EmployeeWageComputationProblem obj = new EmployeeWageComputationProblem();
		
		final int WAGE_PER_HOUR = 20;
		final int FULL_TIME_HOURS = 8;
		final int PART_TIME_HOURS = 8;
		final int MAX_WORKING_DAYS = 20;
		final int MAX_WORKING_HOURS = 100;
		
		int totalWorkingHours = 0;
		int totalWorkingDays = 0;
		int totalWage = 0;
		
		
		//UC-6	Calculate wages till total working hours or total working days condition is reached 
		while(totalWorkingHours < MAX_WORKING_HOURS && totalWorkingDays < MAX_WORKING_DAYS) {
			totalWorkingDays++;
			
			//UC-1  Check is employee is present or absent by calling getAttendance() method
			// 0 for absent, 1 for pull time present, 2 for part time present
			int attendance = obj.getAttendance();
			int dailyHours = 0;
			
			//UC-4	Solving Using Switch Case
			switch(attendance) {
				//UC-2	Full-Time Employee Daily Wage Calculation 
				case 1 -> {
					dailyHours = FULL_TIME_HOURS;
					System.out.println("Day " + totalWorkingDays + " : Full Time Present");
				}
				//UC-3 Part-Time Employee Wage Calculation
				case 2 -> {
					dailyHours = PART_TIME_HOURS;
					System.out.println("Day " + totalWorkingDays + " : Part Time Present");
				}
				default -> {
					System.out.println("Day " + totalWorkingDays + " : Absent");
				}
			}
			
			//UC-6 Ensuring Total Hours Do Not Exceed Max Working Hours
			if(totalWorkingHours + dailyHours > MAX_WORKING_HOURS) {
				dailyHours = MAX_WORKING_HOURS - totalWorkingHours;
			}
			
			totalWorkingHours += dailyHours;
			
			//UC-2	Daily Wage Calculation
			int dailyWage = dailyHours * WAGE_PER_HOUR;
			
			//UC-5	Calculating Wages For A Month
			totalWage += dailyWage;
			
			System.out.println("Day " + totalWorkingDays + " : Daily Hours : " + dailyHours + "\nDaily Wage : " + dailyWage);
			System.out.println();
		}
		System.out.println();
		System.out.println("Total Working Days : " + totalWorkingDays);
		System.out.println("Total Working Hours : " + totalWorkingHours);
		System.out.println("Total Monthly Wage : Rs " + totalWage);
	}
}
