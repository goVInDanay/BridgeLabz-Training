package core_java_practice.scenario_based;

import java.util.*;

public class StudentTestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int scores[] = new int[n];
		for (int i = 0; i < n; i++) {
			try {
				System.out.println("Enter score: ");
				int score = sc.nextInt();
				if (score < 0) {
					System.out.println("Score cannot be negative. Please enter again");
					i--;
					continue;
				}
				scores[i] = score;
			} catch (Exception e) {
				System.out.println("You entered an invalid input. Please enter a number");
				i--;
				continue;
			}
		}
		int highest = 0;
		int lowest = Integer.MAX_VALUE;
		double sum = 0;

		// Traverse through the array to find the highest, lowest and sum of scores
		for (int i = 0; i < n; i++) {
			sum += scores[i];
			if (scores[i] > highest) {
				highest = scores[i];
			}
			if (scores[i] < lowest) {
				lowest = scores[i];
			}
		}

		double average = sum / n;
		System.out.println("Average score is: " + average);
		System.out.println("Highest Marks are: " + highest);
		System.out.println("Lowest Marks are: " + lowest);
		System.out.println("Scores above average are: ");
		for (int score : scores) {
			if (score > average) {
				System.out.println(score);
			}
		}
	}

}
