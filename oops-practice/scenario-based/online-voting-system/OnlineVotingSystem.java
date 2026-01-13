package oops_practice.scenario_based.online_voting_system;

public class OnlineVotingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Service service = new Service();
		service.addCandidate(1, "Govind");
		service.addCandidate(2, "Akash");
		service.addVoter(1, "Nitai");
		service.addVoter(2, "Aman");
		service.addVoter(3, "Hariom");
		
		try {
			service.castVote(1, 1);
			service.castVote(2, 2);
			service.castVote(3, 2);
			service.castVote(1, 1);
		}
		catch (DuplicateVoteException e) {
			// TODO: handle exception
			System.err.println(e);
		}
		
		service.declareResult();
	}

}
