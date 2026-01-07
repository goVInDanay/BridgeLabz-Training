package oops_practice.scenario_based;

import java.util.*;

// Custom exception class
class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}

// Interface + Abstraction
interface BankService {
	void transfer(Account fromAccount, Account toAccount, double amount) throws InsufficientBalanceException;

	void printBalance(Account account);

	void printHistory();
}

// Create Account class
class Account {
	private String accountNumber;
	private String accountHolder;
	private double balance;

	// Create
	Account(String accountNumber, String accountHolder, double balance) {
		validateAccountNumber(accountNumber);
		validateAccountHolder(accountHolder);
		validateBalance(balance);
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	// Validation
	private void validateAccountNumber(String accountNumber) {
		if (accountNumber == null || accountNumber.isEmpty()) {
			throw new IllegalArgumentException("Account number cannot be empty");
		}
	}

	// Validation
	private void validateAccountHolder(String accountHolder) {
		if (accountHolder == null || accountHolder.isEmpty()) {
			throw new IllegalArgumentException("Account holder name cannot be empty");
		}
	}

	// Validation
	private void validateBalance(double balance) {
		if (balance < 0) {
			throw new IllegalArgumentException("Balance cannot be negative");
		}
	}

	public double getBalance() {
		return balance;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	// Deposit + Update
	public void deposit(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Deposit Amount must be positive");
		}
		balance += amount;
	}

	// Withdraw + Update
	public void withdraw(double amount) throws InsufficientBalanceException {
		if (amount <= 0) {
			throw new IllegalArgumentException("Withdrawal Amount must be positive");
		}

		if (amount > balance) {
			System.out.println("Current Balance: " + balance + " Required Amount: " + amount);
			throw new InsufficientBalanceException("Insufficient Balance");
		}

		balance -= amount;
	}

	public double calculateInterest() {
		return 0;
	}
}

// Inheritance
class SavingsAccount extends Account {
	private double interestRate;

	// Create
	public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
		super(accountNumber, accountHolder, balance);
		this.interestRate = interestRate;
	}

	// Polymorphism
	@Override
	public double calculateInterest() {
		return getBalance() * interestRate / 100;
	}
}

//Inheritance
class CurrentAccount extends Account {

	// Create
	public CurrentAccount(String accountNumber, String accountHolder, double balance) {
		super(accountNumber, accountHolder, balance);
	}

	// Polymorphism
	@Override
	public double calculateInterest() {
		return 0;
	}
}

// Bank Services
class Services implements BankService {

	// Transaction History
	List<String> history = new ArrayList<String>();

	// Fund Transfer
	@Override
	public void transfer(Account fromAccount, Account toAccount, double amount) throws InsufficientBalanceException {
		fromAccount.withdraw(amount);
		toAccount.deposit(amount);
		history.add("Transferred amount: Rs " + amount + " from: " + fromAccount.getAccountHolder() + " to: "
				+ toAccount.getAccountHolder());
		System.out.println("Transferred amount: Rs " + amount + " from: " + fromAccount.getAccountHolder() + " to: "
				+ toAccount.getAccountHolder());
		printBalance(fromAccount);
		printBalance(toAccount);
		System.out.println();
	}

	// Read + Balance Check
	@Override
	public void printBalance(Account account) {
		System.out.println("Account Number: " + account.getAccountNumber() + "\nName : " + account.getAccountHolder()
				+ " : Balance: " + account.getBalance());
		System.out.println("Interest: " + account.calculateInterest());
		System.out.println();
	}

	// Read + Transaction History
	@Override
	public void printHistory() {
		System.out.println("Transaction History: ");
		for (String h : history) {
			System.out.println(h);
		}
	}

}

public class OnlineBankingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Services service = new Services();

		Account account1 = new SavingsAccount("135126313", "Govind", 50000, 7.5);
		Account account2 = new CurrentAccount("352709534", "Hariom", 100000);

		try {
			service.transfer(account1, account2, 10000);
			service.transfer(account2, account1, 30000);
			service.transfer(account1, account2, 100000);
		} catch (InsufficientBalanceException e) {
			System.err.println(e);
			System.out.println();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println();
		}

		service.printBalance(account1);
		service.printBalance(account2);

		service.printHistory();
	}

}
