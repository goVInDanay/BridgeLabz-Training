package collections.scenario_based.event_feedback_analyzer;

public class UserInteface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FeedbackAnalyzer analyzer = new FeedbackAnalyzer();

			Event e1 = new Event("E101", "Java Workshop");
			Event e2 = new Event("E102", "Python Bootcamp");
			Event e3 = new Event("E103", "AI Conference");

			analyzer.addFeedback(e1, 5);
			analyzer.addFeedback(e1, 4);
			analyzer.addFeedback(e2, 3);
			analyzer.addFeedback(e2, 4);
			analyzer.addFeedback(e3, 5);
			analyzer.addFeedback(e3, 5);

			analyzer.printFeedback();

			System.out.println("Top-Rated Events:");
			for (Event e : analyzer.getTopRatedEvents()) {
				System.out.println(e + " | Average: " + analyzer.getAverageRating(e));
			}
			analyzer.addFeedback(e1, 6);
		} catch (InvalidRatingException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
