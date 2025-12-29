package core_java_practice.scenario_based;
import java.util.*;
public class SandeepFitnessChallengeTracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int pushUps[] = new int[7];
		int n = pushUps.length;
		for(int i = 0; i < n; i++) {
			pushUps[i] = sc.nextInt();
		}
		int total = 0;
		int days = 0;
		for(int pushUp : pushUps) {
			if(pushUp == 0 ) {
				continue;
			}
			total += pushUp;
			days++;
		}
		double average = days > 0 ? (double) total / days : 0;
		System.out.println("Total push ups " + total);
		System.out.println("Total Workout Days " + days);
		System.out.println("Average push ups " + average);
	}

}
