package oops_practice.gcr_codebase.encapsulation_polymorphism_interface_and_abstraction;

import java.util.*;

interface Loanable {

	void applyForLoan(double amount);

	double calculateLoanEligibility();
}

abstract class BankAccount {
	private String accountNumber;
	private String holderName;
	private double balance;

	BankAccount(String accountNumber, String holderName, double balance) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		if (accountNumber == null || accountNumber.isEmpty()) {
			throw new IllegalArgumentException("Account number cannot be empty");
		}
		this.accountNumber = accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		if (holderName == null || holderName.isEmpty()) {
			throw new IllegalArgumentException("Holder name cannot be empty");
		}
		this.holderName = holderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if (balance < 0) {
			throw new IllegalArgumentException("Balance Cannot be Negative");
		}
		this.balance = balance;
	}

	void deposit(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Deposit must be Positive");
		}

		balance += amount;
		System.out.println(amount + " credited");
		System.out.println("Balance : " + balance);
	}

	void withdraw(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Withdrawal must be Positive");
		}
		if (amount > balance) {
			throw new IllegalArgumentException("Insufficient Balance");
		}
		balance -= amount;
		System.out.println(amount + " debited");
		System.out.println("Balance : " + balance);
	}

	abstract double calculateInterest();

	void displayDetails() {
		System.out.println("BankAccount Number: " + accountNumber);
		System.out.println("BankAccount Type: " + holderName);
		System.out.println("Rental Rate per day: " + balance);
	}
}

class SavingsAccount extends BankAccount implements Loanable {

	private static final double INTEREST_RATE = 0.05;

	SavingsAccount(String accountNumber, String type, double balance) {
		super(accountNumber, type, balance);
	}

	@Override
	public double calculateInterest() {
		return getBalance() * INTEREST_RATE;
	}

	@Override
	public void applyForLoan(double amount) {
		System.out.println("Loan of " + amount + " applied for Savings Account");
	}

	@Override
	public double calculateLoanEligibility() {
		return getBalance() * 5;
	}

}

class CurrentAccount extends BankAccount implements Loanable {

	private static final double INTEREST_RATE = 0.03;

	CurrentAccount(String accountNumber, String type, double balance) {
		super(accountNumber, type, balance);
	}

	@Override
	public double calculateInterest() {
		return getBalance() * INTEREST_RATE;
	}

	@Override
	public void applyForLoan(double amount) {
		System.out.println("Loan of " + amount + " applied for Savings Account");
	}

	@Override
	public double calculateLoanEligibility() {
		return getBalance() * 3;
	}

}

public class BankingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<BankAccount> accounts = new ArrayList<BankAccount>();
		accounts.add(new SavingsAccount("214812094", "Govind", 10000));
		accounts.add(new CurrentAccount("134342512", "Akash", 30000));

		for (BankAccount b : accounts) {
			double interest = b.calculateInterest();
			b.displayDetails();
			System.out.println("Interest: " + interest);
			System.out.println();
		}
	}

}
