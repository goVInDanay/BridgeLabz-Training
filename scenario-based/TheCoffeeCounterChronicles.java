import java.util.*;
public class TheCoffeeCounterChronicles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println(" Enter 'exit' to exit? Type anything else and enter to enter customer details");
			String input = sc.next();
			input = input.trim();							// so that extra spaces may be removed
			input = input.toLowerCase();					// so that even if user enter Exit he may exit
			if(input.equals("exit")) {
				System.out.println("Exiting");
				break;
			}
			double totalAmount = 0;
			while(true) {									//as customer may order different coffee types
				System.out.println("Enter coffee type");
				System.out.println("Americano");
				System.out.println("Latte");
				System.out.println("Cappuccino");
				System.out.println("Mocha");
				System.out.println("Macchiato");
				System.out.println("Signature");
				String coffee = sc.next();
				coffee = coffee.trim();							// so that extra spaces may be removed
				coffee = coffee.toLowerCase();					// so that switch can work efficiently
				switch(coffee) {
					case "americano": {
							double price = 270;
							System.out.println("Enter quantity");
							int quantity = sc.nextInt();
							totalAmount += price * quantity;
							break;
					}
					case "cappuccino": {
							double price = 285;
							System.out.println("Enter quantity");
							int quantity = sc.nextInt();
							totalAmount += price * quantity;
							break;
					}
					case "latte": {
						double price = 295;
						System.out.println("Enter quantity");
						int quantity = sc.nextInt();
						totalAmount += price * quantity;
						break;
					}
					case "filter": {
						double price = 295;
						System.out.println("Enter quantity");
						int quantity = sc.nextInt();
						totalAmount += price * quantity;
						break;
					}
					case "mocha": {
						double price = 335;
						System.out.println("Enter quantity");
						int quantity = sc.nextInt();
						totalAmount += price * quantity;
						break;
					}
					case "macchiato": {
						double price = 355;
						System.out.println("Enter quantity");
						int quantity = sc.nextInt();
						totalAmount += price * quantity;
						break;
					}
					case "signature": {
						double price = 355;
						System.out.println("Enter quantity");
						int quantity = sc.nextInt();
						totalAmount += price * quantity;
						break;
					}
					default : {
						System.out.println("You have entered a non-existing blend. Please try again");
					}
				}
				System.out.println("Enter more details for same customer ? Enter exit to display total price and switch to next customer");
				String input2 = sc.next();
				input2 = input2.trim();
				input2 = input2.toLowerCase();
				if(input2.equals("exit")) {
					System.out.println("Total Amount " + totalAmount);
					break;
				}
			}
		}
	}

}
