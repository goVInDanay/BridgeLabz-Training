package oops_practice.scenario_based.online_voting_system;

class Voter {
	private final int voterId;
	private String name;
	boolean hasVoted;
	Voter(int voterId, String name) {
		this.voterId = voterId;
		this.name = name;
		hasVoted = false;
	}
	
	public int getVoterId() {
		return voterId;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean getHasVoted() {
		return hasVoted;
	}
	
	public void setHasVoted(boolean hasVoted) {
		this.hasVoted = hasVoted;
	}
	
}
