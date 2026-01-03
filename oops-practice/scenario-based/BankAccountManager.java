package oops_practice.scenario_based;

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
		BankAccount ba1 = new BankAccount("12312421515", 10000);
		ba1.deposit(1000);
		ba1.deposit(-100);
		ba1.checkBalance();
		ba1.withdraw(-100);
		ba1.withdraw(10000);
		ba1.withdraw(10000);
		BankAccount ba2 = new BankAccount();
		ba2.deposit(10);
		ba2.withdraw(100);
		ba2.checkBalance();
	}

}
