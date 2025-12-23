import java.util.*;
public class ElectionBoothManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Election Booth Manager for 3 candidates");
		int votes[] = calculateVotes();
		int winner = 0;
		if(votes[0] > votes[1] && votes[0] > votes[2]) {
			winner = 1;
		}
		else if(votes[1] > votes[0] && votes[1] > votes[2]) {
			winner = 2;
		}
		else if(votes[2] > votes[0] && votes[2] > votes[1]) {
			winner = 3;
		}

		System.out.println("Candidate 1 got " + votes[0] + " votes. \nCandidate 2 got " + votes[1] + " votes. \nCandidate 3 got " + votes[2] + " votes");
		if(winner == 0) {
			System.out.println("There was a tie. No one won");
		}
		else {
			System.out.println("Winner is Candidate " + winner);
		}
	}
	private static int[] calculateVotes() {
		Scanner sc = new Scanner(System.in);
		int votes[] = new int[3];
		try {
			while(true) {
				System.out.println("Enter age of voter. To exit enter anything other than a number");
				int age = sc.nextInt();
				if(age < 18) {
					System.out.println("Invalid age. Cannot vote");
					continue;
				}
				System.out.println("Enter 1 for Candidate 1, 2 for candidate 2 and 3 for candidate 3");
				String vote = sc.next();
				if(vote.charAt(0) != '1' && vote.charAt(0) != '2' && vote.charAt(0) != '3') {
					System.out.println("Invalid input. Vote Will not be registered");
					continue;
				}
				else {
					int v = Integer.valueOf(vote);
					votes[v - 1]++;
				}
			}
		}
		catch(InputMismatchException e) {
			System.out.println("Exiting voting");
		}
		return votes;
	}

}
