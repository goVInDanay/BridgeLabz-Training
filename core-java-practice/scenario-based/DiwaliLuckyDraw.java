package core_java_practice.scenario_based;
import java.util.*;
public class DiwaliLuckyDraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.println("Enter number of visitors");
				int n = sc.nextInt();
				luckyDraws(n);
				break;
			}	
			catch(InputMismatchException e) {
				System.out.println("Please input a valid number");
			}
		}
	}
	public static int numberGenerator() {
		return (int)(Math.random() * 90000000) + 10000000;
	}
	public static void luckyDraws(int visitors) {
		for(int i = 0; i < visitors; i++) {
			int draw = numberGenerator();
			System.out.println("Visitor " + (i + 1) + " drew this number -> " + draw);
			if(draw % 3 == 0 && draw % 5 == 0) {
				System.out.println("Congratulations! You win the lucky draw!");
			}
			else {
				System.out.println("Sorry You Lose");
			}
		}
	}

}
