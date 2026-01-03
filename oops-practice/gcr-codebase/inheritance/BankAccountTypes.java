package oops_practice.gcr_codebase.inheritance;

class BankAccount {
	private String accountNumber;
	private double balance;

	BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	void displayAccountType() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: Rs " + balance);
	}
}

class SavingsAccount extends BankAccount {
	private double increaseRate;

	SavingsAccount(String accountNumber, double balance, double increaseRate) {
		super(accountNumber, balance);
		this.increaseRate = increaseRate;
	}

	@Override
	void displayAccountType() {
		super.displayAccountType();
		System.out.println("Increase rate: " + increaseRate + "%");
	}
}

class CheckingAccount extends BankAccount {
	private double withdrawalLimit;

	CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
		super(accountNumber, balance);
		this.withdrawalLimit = withdrawalLimit;
	}

	@Override
	void displayAccountType() {
		super.displayAccountType();
		System.out.println("New Withdrawal Limit: Rs " + withdrawalLimit);
	}
}

class FixedDepositAccount extends BankAccount {
	private int depositPeriod;

	FixedDepositAccount(String accountNumber, double balance, int depositPeriod) {
		super(accountNumber, balance);
		this.depositPeriod = depositPeriod;
	}

	@Override
	void displayAccountType() {
		super.displayAccountType();
		System.out.println("Deposit Period: " + depositPeriod + " years");
	}
}

public class BankAccountTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b1 = new BankAccount("2142411515", 100000);
		BankAccount b2 = new SavingsAccount("34251315", 100000, 7.5);
		BankAccount b3 = new CheckingAccount("3241341341", 300000, 50000);
		BankAccount b4 = new FixedDepositAccount("3435325434", 400000, 5);
		b1.displayAccountType();
		System.out.println();
		b2.displayAccountType();
		System.out.println();
		b3.displayAccountType();
		System.out.println();
		b4.displayAccountType();
	}

}
