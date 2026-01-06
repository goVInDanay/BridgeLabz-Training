package core_java_practice.scenario_based;

import java.util.*;

class InvalidQuizSubmissionException extends Exception {
	public InvalidQuizSubmissionException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}

public class OnlineQuizPlatform {

	public static void main(String[] args) throws InvalidQuizSubmissionException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of questions");
		int n = sc.nextInt();
		String correctAns[] = new String[n];
		System.out.println("Enter correct options");
		for (int i = 0; i < n; i++) {
			try {
				String ans = sc.next();
				if (ans.length() > 1) {
					throw new InvalidQuizSubmissionException("Length of answer cannot exceed 1");
				}
				correctAns[i] = ans;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
				System.out.println("Enter value again");
				i--;
			}
		}
		List<Integer> scores = new ArrayList<Integer>();
		while (true) {
			System.out.println("Enter exit to exit. Enter anything else to continue");
			String input = sc.next();
			if (input.trim().equalsIgnoreCase("exit")) {
				break;
			}

			// Store student answers
			String studentAns[] = new String[n];
			System.out.println("Enter Student answers");
			for (int i = 0; i < n; i++) {
				try {
					String ans = sc.next();
					if (ans.length() > 1) {
						throw new InvalidQuizSubmissionException("Length of answer cannot exceed 1");
					}
					studentAns[i] = ans;
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e);
					System.out.println("Enter value again");
					i--;
				}
			}
			int score = calculateScore(correctAns, studentAns);
			System.out.println("Score of the student is " + score + " and grade is: " + getGrade(score, n));
			scores.add(score);

		}
	}

	// get grades
	public static char getGrade(double score, double max) {
		if (score >= (max - max / 10)) {
			return 'O';
		}
		if (score >= (max - max / 8)) {
			return 'A';
		}
		if (score >= (max - max / 6)) {
			return 'B';
		}
		if (score >= (max - max / 4)) {
			return 'C';
		}
		if (score >= (max - max / 2)) {
			return 'D';
		}
		return 'F';
	}

	// calculate scores
	public static int calculateScore(String correctAns[], String studentAns[]) {
		int score = 0;
		for (int i = 0; i < studentAns.length; i++) {
			score = compareAnswer(correctAns[i], studentAns[i]) ? score + 1 : score;
		}
		return score;
	}

	// check answers
	public static boolean compareAnswer(String correct, String student) {
		return correct.equalsIgnoreCase(student);
	}

}
