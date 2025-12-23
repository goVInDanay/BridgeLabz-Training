import java.util.*;
public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rounds");
		int rounds = sc.nextInt();
		String data[][] = calculateAll(rounds);
		display(data);
	}
	static String[] choices = {"rock", "paper", "scissors"};
	private static int getComputerChoice() {
		return (int)(Math.random() * (2 - 0 + 1) + 0);
	}
	private static void display(String data[][]) {
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i][0] + " " + data[i][1]);
		}
	}
	private static String[][] calculateAll(int rounds){
		String[][] data = new String[rounds + 1][2];
		int pWins = 0;
		int cWins = 0;
		for(int i = 0; i < rounds; i++) {
			if(findWinner()) {
				pWins++;
				data[i][0] = "Player Wins";
				data[i][1] = "Computer Loses";
			}
			else {
				cWins++;
				data[i][0] = "Player Loses";
				data[i][1] = "Computer Wins";
			}
		}
		double pPercent = (pWins * 100.0)/ rounds;
		double cPercent = (cWins * 100.0) / rounds;
		data[rounds][0] = "Player Win Percent = " + pPercent;
		data[rounds][1] = "Computer Win Percent = " + cPercent;
		return data;
	}
	private static boolean findWinner() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter your choice -> 1. For Rock, 2. For Paper, 3. For Scissors");
			int playerChoice = sc.nextInt() - 1;
			if(playerChoice < 0 || playerChoice > 2) {
				System.out.println("Invalid choice");
			}
			int computerChoice = getComputerChoice();
			if(computerChoice == playerChoice) {
				System.out.println("Both of you chose " + choices[playerChoice] + ". Please try again");
			}
			else if((computerChoice == 0 && playerChoice == 1) || (computerChoice == 1 && playerChoice == 2) || (computerChoice == 2 && playerChoice == 0)) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	
}
