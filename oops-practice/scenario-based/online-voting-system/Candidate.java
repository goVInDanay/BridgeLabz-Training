package oops_practice.scenario_based.online_voting_system;

class Candidate {
	private int candidateId;
	private String name;
	int voteCount;
	Candidate(int candidateId, String name) {
		this.candidateId = candidateId;
		this.name = name;
		this.voteCount = 0;
	}
	
	public int getCandidateId() {
		return candidateId;
	}
	
	public String getName() {
		return name;
	}
	
	public int getVotes() {
		return voteCount;
	}
	
	public void addVote() {
		voteCount++;
	}
}
