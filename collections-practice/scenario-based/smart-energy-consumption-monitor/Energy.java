package collections.scenario_based.smart_energy_consumption_monitor;

import java.time.LocalDate;

public class Energy {
	private LocalDate date;
	private double usage;

	public Energy(LocalDate date, double usage) throws InvalidEnergyReadingException {
		if (usage < 0) {
			throw new InvalidEnergyReadingException("Energy usage cannot be negative: " + usage);
		}
		this.date = date;
		this.usage = usage;
	}

	public LocalDate getDate() {
		return date;
	}

	public double getUsage() {
		return usage;
	}

	@Override
	public String toString() {
		return "Date: " + date + "| " + usage + " kwh";
	}
}
