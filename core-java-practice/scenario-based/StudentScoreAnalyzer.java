package core_java_practice.scenario_based;
import java.util.*;

class InvalidScoreException extends Exception{
	public InvalidScoreException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}

public class StudentScoreAnalyzer {

	//validate student scores
	public static void validateScores(int scores[]) throws InvalidScoreException{
		for(int score : scores) {
			if(score < 0 || score > 100) {
				throw new InvalidScoreException("Score must be between 0-100");
			}
		}
	}
	
	//find average scores
	public static double calculateAverage(int scores[]) {
		double sum = 0;
		for(int score : scores) {
			sum += score;
		}
		return sum / scores.length;
	}
	
	// Find Max Score
	public static int findMax(int scores[]) {
		int max = 0;
		for(int score : scores) {
			max = Math.max(max, score);
		}
		return max;
	}
	
	//Find Min Score
	public static int findMin(int scores[]) {
		int min = Integer.MAX_VALUE;
		for(int score : scores) {
			min = Math.min(min, score);
		}
		return min;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students");
		int n = sc.nextInt();
		int scores[] = new int[n];
		System.out.println("Enter scores of students");
		for(int i = 0; i < n; i++) {
			scores[i] = sc.nextInt();
		}
		try {
			validateScores(scores);
			double average = calculateAverage(scores);
			int maxScore = findMax(scores);
			int minScore = findMin(scores);
			System.out.println("Average score : " + average);
			System.out.println("Max score: " + maxScore);
			System.out.println("Min score: " + minScore);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
