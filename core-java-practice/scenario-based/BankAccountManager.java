package oops_practice.scenario_based;
import java.util.*;
class BankAccount {
	private String accountNumber;
	private double balance;

	BankAccount() {
		this("N/A", 0);
	}

	BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void deposit(double amount) {

		// checks if valid account or not
		if (accountNumber.equals("N/A")) {
			System.err.println("Unauthorized account");
			return;
		}

		// checks for valid amount
		if (amount <= 0) {
			System.err.println("Invalid amount");
			return;
		}
		balance += amount;
		System.out.println("Current balance: " + balance);
	}

	public void withdraw(double amount) {

		// checks for valid account
		if (accountNumber.equals("N/A")) {
			System.err.println("Unauthorized account");
			System.out.println();
			return;
		}

		// checks for valid amount
		if (amount <= 0) {
			System.err.println("Invalid amount");
			return;
		}

		// checks if sufficient balance in account
		if (amount > balance) {
			System.err.println("Insufficient balance in account");
			return;
		}
		System.out.println("Withdrew: " + amount);
		balance -= amount;
		System.out.println("Current balance: " + balance);
		System.out.println();
	}

	public double checkBalance() {

		// checks for valid account
		if (accountNumber.equals("N/A")) {
			System.err.println("Unauthorized account");
			return -1;
		}
		System.out.println("Current balance: " + balance);

		return balance;

	}
}

public class BankAccountManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String accountNumber = sc.next();
		double amount = sc.nextDouble();
		BankAccount ba1 = new BankAccount(accountNumber, amount);
		double deposit = sc.nextDouble();
		double withdraw = sc.nextDouble();
		ba1.deposit(deposit);
		ba1.withdraw(withdraw);
		ba1.checkBalance();
	}

}
