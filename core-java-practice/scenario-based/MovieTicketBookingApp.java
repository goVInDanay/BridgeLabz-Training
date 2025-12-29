package core_java_practice.scenario_based;
import java.util.*;
public class MovieTicketBookingApp {
	private static int[] bookSeats(int seatTypes[][], int movieType){
		if(movieType == -1) {
			return new int[] {};
		}
		Scanner sc = new Scanner(System.in);
		int bookedSeats[] = new int[2];
		System.out.println("Number of gold seats " + seatTypes[movieType][0] + " Number of silver seats " + seatTypes[movieType][1]);
		System.out.println("Do you want to book any gold seats? Y/N");
		String seatType = sc.next();
		if(seatType.equals("Y")) {
			if(seatTypes[movieType][0] == 0) {
				System.out.println("Sorry! All gold seats are full");
			}
			else {
				System.out.println("Enter number of seats to book");
				int n = sc.nextInt();
				if(n > seatTypes[movieType][0]) {
					while(n >  seatTypes[movieType][0]) {
						System.out.println("Available seats insufficient");
						System.out.println("Enter number of seats to book");
						n = sc.nextInt();
					}
				}
				bookedSeats[0] = n;
				seatTypes[movieType][0] -= n;
			}
		}
		System.out.println("Do you want to book any silver seats? Y/N");
		seatType = sc.next();
		if(seatType.equals("Y")) {
			if(seatTypes[movieType][1] == 0) {
				System.out.println("Sorry! All silver seats are full");
			}
			else {
				System.out.println("Enter number of seats to book");
				int n = sc.nextInt();
				if(n > seatTypes[movieType][1]) {
					while(n > seatTypes[movieType][1]) {
						System.out.println("Available seats insufficient");
						System.out.println("Enter number of seats to book");
						n = sc.nextInt();
					}
				}
				bookedSeats[1] = n;
				seatTypes[movieType][1] -= n;
			}
		}
		return bookedSeats;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int gold = 20;
		int silver = 50;
		String movieTypes[] = {"action", "comedy", "thriller", "horror", "romance"};
		int seatTypes[][] = {{gold, silver}, {gold, silver}, {gold, silver}, {gold, silver}, {gold, silver}};
		int totalSeats = (gold + silver) * 5;
		int filled = 0;
		while(true) {
			if(filled == totalSeats) {
				System.out.println("All seats are full for all movie Types");
				System.out.println("Exiting");
				break;
			}
			System.out.println("Enter Customer Name. Else enter exit to stop booking process");
			String input = sc.next();
			if(input.equals("exit")) {
				System.out.println("Exiting");
				break;
			}
			System.out.println("Enter customer movie type");
			String s = sc.next();
			int movieType = -1;
			switch(s) {
				case "action" -> {
					if(seatTypes[0][0] + seatTypes[0][1] == 0) {
						System.out.println("Sorry! All seats are full");
						break;
					}
					System.out.println("Booking an action movie");
					movieType = 0;
				}
				case "comedy" ->{
					if(seatTypes[1][0] + seatTypes[1][1] == 0) {
						System.out.println("Sorry! All seats are full");
						break;
					}
					System.out.println("Booking a comedy movie");
					movieType = 1;
				}
				case "thriller" ->{
					if(seatTypes[2][0] + seatTypes[2][1] == 0) {
						System.out.println("Sorry! All seats are full");
						break;
					}
					System.out.println("Booking a thriller movie");
					movieType = 2;
				}
				case "horror" ->{
					if(seatTypes[3][0] + seatTypes[3][1] == 0) {
						System.out.println("Sorry! All seats are full");
						break;
					}
					System.out.println("Booking an horror movie");
					movieType = 3;
				}
				case "romance" ->{
					if(seatTypes[4][0] + seatTypes[4][1] == 0) {
						System.out.println("Sorry! All seats are full");
						break;
					}
					System.out.println("Booking a romance movie");
					movieType = 4;
				}
				default ->{
					System.out.println("No such movie type");
				}
			}
			if(movieType == -1) {
				continue;
			}
			int bookedSeats[] = bookSeats(seatTypes, movieType);
			filled += bookedSeats[0] + bookedSeats[1];
			System.out.println("Do you want snacks ? Y/N");
			String wantSnacks = sc.next();
			String snacks = "";
			if(wantSnacks.equals("Y")) {
				while(true) {
					System.out.println("Enter snacks you want ->\nPopcorn\nCoca Cola\nPepsi");
					String snack = sc.nextLine();
					if(!snack.equals("Popcorn") && !snack.equals("Coca Cola") && !snack.equals("Pepsi")) {
						System.out.println("No Such Snack");
						continue;
					}
					snacks += snack + " ";
					System.out.println("Do you want more? Y / N");
					if(sc.next().equals("N")) {
						break;
					}
				}
			}
			System.out.println("Customer Name -> " + input + "\nMovie Type -> " + movieTypes[movieType] + "\nGold Seats booked -> " + bookedSeats[0] + "\nSilver seats booked -> " + bookedSeats[1] + "\nSnacks -> " + snacks);
		}
	}

}
