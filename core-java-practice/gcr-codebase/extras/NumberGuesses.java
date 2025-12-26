package core_java_practice.gcr_codebase.extras;
import java.util.*;
public class NumberGuesses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number from 1 to 100");
		int num = sc.nextInt();
		nextGuess(num);
	}
	public static int randomGenerator(int low, int high) {
		return (int)(Math.random() * (high - low + 1)) + low;
	}
	public static String userFeedback(int guess, int num) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Computer's guess is " + guess);
		System.out.println("Enter if guess is higher or lower.\nhigh for higher\nlow for lower\nequal for equal");
		String feedback = sc.next();
		if(guess > num) {
			if(feedback.equals("high")) {
				return feedback;
			}
			else {
				System.out.println("You lied. Its higher");
				return "high";
			}
		}
		if(guess < num) {
			if(feedback.equals("low")) {
				return feedback;
			}
			else {
				System.out.println("You lied. Its lower");
				return "high";
			}
		}
		if(feedback.equals("equal")) {
			return feedback;
		}
		else {
			System.out.println("You lied. Its equal");
			return "equal";
		}
	}
	public static void nextGuess(int num) {
		int low = 0;
		int high = 100;
		int count = 1;
		while(true) {
			int guess = randomGenerator(low, high);
			String feedback = userFeedback(guess, num);
			if(feedback.equals("high")) {
				high = guess - 1;
			}
			else if(feedback.equals("low")){
				low = guess + 1;
			}
			else {
				System.out.println("Guessed it correctly after " + count + " guesses");
				return;
			}
			count++;
		}
	}
}
