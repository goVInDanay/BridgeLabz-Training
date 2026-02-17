package collections.scenario_based.online_hackathon_submission_evaluator;

import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Boolean> result1 = new HashMap<>();
		result1.put("Q1", true);
		result1.put("Q2", true);
		result1.put("Q3", false);

		Map<String, Boolean> result2 = new HashMap<>();
		result2.put("Q1", true);
		result2.put("Q2", false);
		result2.put("Q3", true);

		Participant p1 = new Participant("Govind", result1, false);
		Participant p2 = new Participant("Akash", result2, true);

		Evaluator evaluator = new Evaluator();

		evaluator.addParticipant(p1);
		evaluator.addParticipant(p2);

		evaluator.evaluate();
		evaluator.displayLeaderboard();
	}

}
