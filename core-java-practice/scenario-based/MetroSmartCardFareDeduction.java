import java.util.*;
public class MetroSmartCardFareDeduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount in card");
		double cardAmount = sc.nextDouble();
		calculateFare(cardAmount);
	}
	private static void calculateFare(double cardAmount) {
		Scanner sc = new Scanner(System.in);
		try{
			while(true) {
				System.out.println("Enter distance you want to travel. \n0 - 12 km -> Rs 2.5 per km. \n13 - 20 km -> Rs 8 per km. \n> 20 km -> Rs 12.5 per km");
				double dist = sc.nextDouble();
				double fare = dist <= 12 ? 2.5 : dist >= 13 && dist <= 20 ? 8 : 12.5;
				double totalFare = fare * dist;
				if(totalFare > cardAmount) {
					System.out.println("You cannot cover that distance with you remaining Smart Card Balance");
					continue;
				}
				double remainingBalance = cardAmount - totalFare;
				System.out.println("Total fare : " + totalFare + " Remaining Balance : " + remainingBalance);
				if(remainingBalance <= 0) {
					System.out.println("Balance has run out. Quitting");
					break;
				}
				cardAmount = remainingBalance;
			}
		}
		catch(InputMismatchException e) {
			System.out.println("Quitting");
		}
	}

}
