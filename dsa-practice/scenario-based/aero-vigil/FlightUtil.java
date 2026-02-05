package dsa_practice.scenario_based.aero_vigil;

class FlightUtil {
	public boolean validateFlightNumber(String flightNumber) throws InvalidFlightException {
		String flightRegex = "^FL-[1-9][0-9]{3}$";
		if (flightNumber == null || !flightNumber.matches(flightRegex)) {
			throw new InvalidFlightException("The flight number " + flightNumber + " is invalid");
		}
		return true;
	}

	public boolean validateFlightName(String flightName) throws InvalidFlightException {
		if (!flightName.equalsIgnoreCase("SpiceJet") && !flightName.equalsIgnoreCase("Vistara")
				&& !flightName.equalsIgnoreCase("IndiGo") && !flightName.equalsIgnoreCase("Air Arabia")) {
			throw new InvalidFlightException("The flight name " + flightName + " is invalid");
		}
		return true;
	}

	public boolean validatePassengerCount(int passengerCount, String flightName) throws InvalidFlightException {
		int maxCapacity;
		switch (flightName) {
		case "SpiceJet" -> {
			maxCapacity = 396;
		}
		case "Vistara" -> {
			maxCapacity = 615;
		}
		case "IndiGo" -> {
			maxCapacity = 230;
		}
		case "Air Arabia" -> {
			maxCapacity = 130;
		}
		default -> {
			throw new InvalidFlightException("The flight name " + flightName + " is invalid");
		}
		}
		if (passengerCount <= 0 || passengerCount > maxCapacity) {
			throw new InvalidFlightException("The passenger count " + passengerCount + " is invalid for " + flightName);
		}
		return true;
	}

	public double calculateFuelToFillTank(String flightName, double currentFuelLevel) throws InvalidFlightException {
		int maxCapacity;
		switch (flightName) {
		case "SpiceJet" -> {
			maxCapacity = 200000;
		}
		case "Vistara" -> {
			maxCapacity = 300000;
		}
		case "Indigo" -> {
			maxCapacity = 250000;
		}
		case "Air Arabia" -> {
			maxCapacity = 150000;
		}
		default -> {
			throw new InvalidFlightException("The flight name " + flightName + " is invalid");
		}
		}
		if (currentFuelLevel <= 0 || currentFuelLevel > maxCapacity) {
			throw new InvalidFlightException("Invalid fuel level for " + flightName);
		}
		return maxCapacity - currentFuelLevel;
	}
}
