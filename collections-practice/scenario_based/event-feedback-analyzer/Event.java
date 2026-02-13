package collections.scenario_based.event_feedback_analyzer;

import java.util.Objects;

class Event {
	private String eventId;
	private String name;

	Event(String eventId, String name) {
		this.eventId = eventId;
		this.name = name;
	}

	public String getEventId() {
		return eventId;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Event)) {
			return false;
		}
		Event event = (Event) o;
		return Objects.equals(eventId, event.eventId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(eventId);
	}

	@Override
	public String toString() {
		return eventId + " | " + name;
	}
}
