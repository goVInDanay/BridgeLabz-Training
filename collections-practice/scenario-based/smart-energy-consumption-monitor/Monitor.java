package collections.scenario_based.smart_energy_consumption_monitor;

import java.time.LocalDate;
import java.util.*;

public class Monitor {
	private Map<LocalDate, List<Energy>> usageData;

	public Monitor() {
		this.usageData = new HashMap<>();
	}

	public void addReading(Energy reading) {
		List<Energy> dailyReadings = usageData.getOrDefault(reading.getDate(), new ArrayList<>());
		dailyReadings.add(reading);
		usageData.put(reading.getDate(), dailyReadings);
	}

	public double getDailyAverage(LocalDate date) {
		List<Energy> dailyReadings = usageData.get(date);
		if (dailyReadings == null || dailyReadings.isEmpty()) {
			return 0;
		}

		double sum = 0;
		for (Energy reading : dailyReadings) {
			sum += reading.getUsage();
		}
		return sum / dailyReadings.size();
	}

	public double getMonthlyAverage(int month, int year) {
		double total = 0;
		int count = 0;

		for (Map.Entry<LocalDate, List<Energy>> entry : usageData.entrySet()) {
			LocalDate date = entry.getKey();
			if (date.getYear() == year && date.getMonthValue() == month) {
				for (Energy reading : entry.getValue()) {
					total += reading.getUsage();
					count++;
				}
			}
		}

		return count == 0 ? 0 : total / count;
	}

	public void printReport() {
		for (Map.Entry<LocalDate, List<Energy>> entry : usageData.entrySet()) {
			LocalDate date = entry.getKey();
			double dailyAverage = getDailyAverage(date);
			System.out.println(
					"Date: " + date + " | Daily Average: " + dailyAverage + " kWh | Readings: " + entry.getValue());
		}
	}
}
