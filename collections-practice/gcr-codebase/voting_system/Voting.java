package collections.gcr_codebase.voting_system;

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VotingSystem votingSystem = new VotingSystem();
		votingSystem.castVote("Govind");
		votingSystem.castVote("Akash");
		votingSystem.castVote("Govind");
		votingSystem.castVote("Nitai");
		votingSystem.castVote("Aman");

		votingSystem.displayCandidates();
		votingSystem.displayVotingOrder();
		votingSystem.displayResult();
	}

}
