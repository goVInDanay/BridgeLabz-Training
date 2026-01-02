package core_java_practice.scenario_based;

import java.util.*;

public class EduQuiz {
	// Method to calculate score
	static int calculateScore(String[] correct, String[] student) {
		int score = 0;

		for (int i = 0; i < correct.length; i++) {
			if (correct[i].equalsIgnoreCase(student[i])) {
				System.out.println("Question " + (i + 1) + ": Correct");
				score++;
			} else {
				System.out.println("Question " + (i + 1) + ": Incorrect");
			}
		}
		System.out.println();
		return score;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String correctAnswers[] = new String[10];
		String studentAnswers[] = new String[10];
		System.out.println("Enter correct options");
		for (int i = 0; i < 10; i++) {
			correctAnswers[i] = sc.next();
		}
		System.out.println("\nEnter student options");
		for (int i = 0; i < 10; i++) {
			studentAnswers[i] = sc.next();
		}
		int score = calculateScore(correctAnswers, studentAnswers);
		double percentage = (score / 10.0) * 100;

		System.out.println("Score: " + score + "/10");
		System.out.println("Percentage: " + percentage + "%");

		if (percentage >= 50) {
			System.out.println("Result: Pass");
		} else {
			System.out.println("Result: Fail");
		}
	}

}
