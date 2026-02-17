package collections.scenario_based.online_hackathon_submission_evaluator;

import java.util.*;

class Participant {
	private String name;
	Map<String, Boolean> testResults;
	private boolean lateSubmission;
	private int score;

	public Participant(String name, Map<String, Boolean> testResults, boolean lateSubmission) {
		this.name = name;
		this.testResults = testResults;
		this.lateSubmission = lateSubmission;
	}

	public String getName() {
		return name;
	}

	public boolean isLateSubmitted() {
		return lateSubmission;
	}

	public int calculateScore() throws LateSubmissionException {
		if (lateSubmission) {
			throw new LateSubmissionException("Submission is late for: " + name);
		}
		score = 0;
		for (Boolean result : testResults.values()) {
			if (result) {
				score += 10;
			}
		}
		return getScore();
	}

	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
		return name;
	}
}
