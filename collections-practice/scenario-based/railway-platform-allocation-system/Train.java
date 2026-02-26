package collections.scenario_based.railway_platform_allocation_system;

import java.time.*;

class Train implements Comparable<Train> {
	private String trainId;
	private LocalTime arrivalTime;
	private LocalTime departureTime;

	Train(String trainId, LocalTime arrivalTime, LocalTime departureTime) {
		this.trainId = trainId;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
	}

	public String getTrainId() {
		return trainId;
	}

	public LocalTime getArrivalTime() {
		return arrivalTime;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	@Override
	public int compareTo(Train other) {
		return this.arrivalTime.compareTo(other.arrivalTime);
	}

	@Override
	public String toString() {
		return trainId + " | " + arrivalTime + " | " + departureTime;
	}
}
