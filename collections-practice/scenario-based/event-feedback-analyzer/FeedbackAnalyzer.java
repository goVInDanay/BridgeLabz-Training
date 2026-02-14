package collections.scenario_based.event_feedback_analyzer;

import java.util.*;

class FeedbackAnalyzer {
	private Map<Event, List<Integer>> feedback;

	FeedbackAnalyzer() {
		feedback = new HashMap<Event, List<Integer>>();
	}

	public void addFeedback(Event event, int rating) throws InvalidRatingException {
		if (rating < 1 || rating > 5) {
			throw new InvalidRatingException("Rating must be between 1 and 5");
		}
		List<Integer> ratings = feedback.getOrDefault(event, new ArrayList<Integer>());
		ratings.add(rating);
		feedback.put(event, ratings);
	}

	public double getAverageRating(Event event) {
		List<Integer> ratings = feedback.get(event);
		if (ratings == null || ratings.isEmpty()) {
			return 0;
		}
		double sum = 0;
		for (int rating : ratings) {
			sum += rating;
		}
		return sum / ratings.size();
	}

	public List<Event> getTopRatedEvents() {
		double maxAverage = 0;
		List<Event> topEvents = new ArrayList<>();
		for (Event event : feedback.keySet()) {
			double average = getAverageRating(event);
			if (average > maxAverage) {
				maxAverage = average;
				topEvents.clear();
				topEvents.add(event);
			} else if (average == maxAverage) {
				topEvents.add(event);
			}
		}
		return topEvents;
	}

	public void printFeedback() {
		for (Event event : feedback.keySet()) {
			double average = getAverageRating(event);
			System.out.println(event + " | Average rating: " + average + " | Ratings: " + feedback.get(event));
		}
	}
}
