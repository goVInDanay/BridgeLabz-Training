package collections.scenario_based.online_hackathon_submission_evaluator;

import java.util.*;

class Evaluator {
	private List<Participant> participants = new ArrayList<Participant>();

	public void addParticipant(Participant participant) {
		participants.add(participant);
	}

	public void evaluate() {
		for (Participant participant : participants) {
			try {
				int score = participant.calculateScore();
				System.out.println(participant + " : " + score);
			} catch (LateSubmissionException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		}
	}

	public void displayLeaderboard() {
		participants.sort(new Comparator<Participant>() {
			@Override
			public int compare(Participant p1, Participant p2) {
				return Integer.compare(p1.getScore(), p2.getScore());
			}
		});

		System.out.println("Leaderboard");
		int rank = 1;
		for (Participant participant : participants) {
			System.out.println(rank + " " + participant + " " + participant.getScore());
			rank++;
		}
	}
}
