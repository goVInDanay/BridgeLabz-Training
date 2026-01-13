package oops_practice.scenario_based.online_voting_system;

public class Service extends ElectionService {

	Voter voters[] = new Voter[10];
	Candidate candidates[] = new Candidate[10];
	Vote votes[] = new Vote[10];
	int voterCount = 0;
	int candidateCount = 0;
	int voteCount = 0;

	@Override
	void castVote(int voterId, int candidateId) throws DuplicateVoteException {
		// TODO Auto-generated method stub
		Voter voter = null;
		Candidate candidate = null;
		for (int i = 0; i < voterCount; i++) {
			if (voters[i].getVoterId() == voterId) {
				voter = voters[i];
			}
		}
		for (int i = 0; i < candidateCount; i++) {
			if (candidates[i].getCandidateId() == candidateId) {
				candidate = candidates[i];
			}
		}
		if (voter == null) {
			System.out.println("Voter not found");
			return;
		}
		if (candidate == null) {
			System.out.println("Candidate not found");
			return;
		}
		if (voter.hasVoted) {
			throw new DuplicateVoteException(voter.getName() + " has already voted");
		}
		voter.setHasVoted(true);
		candidate.addVote();
		votes[voteCount++] = new Vote(voterId, candidateId);
		System.out.println(voter.getName() + " has casted vote successfully");
	}

	@Override
	void addCandidate(int id, String name) {
		// TODO Auto-generated method stub
		candidates[candidateCount++] = new Candidate(id, name);
		System.out.println("Candidate Added: " + name);
	}

	@Override
	void addVoter(int id, String name) {
		// TODO Auto-generated method stub
		voters[voterCount++] = new Voter(id, name);
		System.out.println("Voter added: " + name);
	}

	@Override
	void declareResult() {
		// TODO Auto-generated method stub
		System.out.println("Results: ");
		int maxVotes = 0;
		int maxCount = 0;
		Candidate winner = null;
		for (int i = 0; i < candidateCount; i++) {
			String name = candidates[i].getName();
			int votes = candidates[i].getVotes();
			if (votes > maxVotes) {
				maxVotes = votes;
				winner = candidates[i];
				maxCount = 0;
			}
			else if(votes == maxVotes) {
				maxCount++;
			}
			System.out.println("Candidate: " + name + " Votes: " + votes);
		}
		if(maxCount > 0) {
			System.out.println("There is a tie with votes: " + maxVotes);
			return;
		}
		System.out.println("Winner is: " + winner.getName() + " with " + maxVotes + " votes");
	}

}
