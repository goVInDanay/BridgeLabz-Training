package collections.scenario_based.smart_energy_consumption_monitor;

import java.time.LocalDate;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Monitor monitor = new Monitor();

			LocalDate date1 = LocalDate.of(2026, 2, 1);
			LocalDate date2 = LocalDate.of(2026, 2, 2);

			monitor.addReading(new Energy(date1, 5.0));
			monitor.addReading(new Energy(date1, 7.2));
			monitor.addReading(new Energy(date2, 6.5));
			monitor.addReading(new Energy(date2, 8.0));

			System.out.println("Daily Avg Feb 1: " + monitor.getDailyAverage(date1));
			System.out.println("Daily Avg Feb 2: " + monitor.getDailyAverage(date2));
			System.out.println("Monthly Avg Feb 2026: " + monitor.getMonthlyAverage(2, 2026));

			monitor.printReport();

			monitor.addReading(new Energy(date1, -2.0));
		} catch (InvalidEnergyReadingException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
