package oops_practice.scenario_based.online_voting_system;

abstract class ElectionService {
	abstract void castVote(int voterId, int candidateId) throws DuplicateVoteException;
	abstract void addCandidate(int id, String name);
	abstract void addVoter(int id, String name);
	abstract void declareResult();
}
