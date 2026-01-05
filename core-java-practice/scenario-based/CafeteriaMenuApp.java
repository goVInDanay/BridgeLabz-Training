package core_java_practice.scenario_based;

import java.util.*;

public class CafeteriaMenuApp {

	public static void displayMenu(String menu[]) {
		for (int i = 0; i < menu.length; i++) {
			System.out.println((i + 1) + " " + menu[i]);
		}
	}

	public static String getItemByIndex(String menu[], int index) {
		if (index >= 0 && index < menu.length) {
			return menu[index];
		}
		return "Invalid Index";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String menu[] = new String[10];
		System.out.println("Enter menu items");
		for (int i = 0; i < 10; i++) {
			menu[i] = sc.next();
		}

		displayMenu(menu);
		System.out.println("Enter item number you want to order");
		int choice = sc.nextInt();
		System.out.println("You have ordered: " + getItemByIndex(menu, choice));
	}

}
