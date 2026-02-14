package collections.scenario_based.courier_staff_shift_scheduler;

import java.time.LocalTime;

public class ShiftTime {
	private LocalTime start;
	private LocalTime end;

	public ShiftTime(LocalTime start, LocalTime end) {
		this.start = start;
		this.end = end;
	}

	public LocalTime getStart() {
		return start;
	}

	public LocalTime getEnd() {
		return end;
	}

	@Override
	public String toString() {
		return start + " - " + end;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof ShiftTime)) {
			return false;
		}
		ShiftTime s = (ShiftTime) o;
		return start.equals(s.start) && end.equals(s.end);
	}

	@Override
	public int hashCode() {
		return start.hashCode() * 15 + end.hashCode();
	}
}
