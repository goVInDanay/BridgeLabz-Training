package collections.gcr_codebase.exception_handling;

import java.util.*;

class InsufficientBalanceException extends RuntimeException {
	public InsufficientBalanceException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}

class BankAccount {
	String accountNumber;
	double balance;

	public BankAccount(String accountNumber, double balance) {
		// TODO Auto-generated constructor stub
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void withdraw(double amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("Invalid amount!");
		}
		if (amount > balance) {
			throw new InsufficientBalanceException("Insufficient balance!");
		}
		balance -= amount;
		System.out.println("Withdrawal successful, new balance: " + balance);
	}
}

public class BankTransactionSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BankAccount b1 = new BankAccount("Govind", 1000);
			b1.withdraw(800);
			try {
				b1.withdraw(300);
			} catch (InsufficientBalanceException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
			try {
				b1.withdraw(-10);
			} catch (IllegalArgumentException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
