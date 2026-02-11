package com.govind.junit_practice;

public class Program {
	private double balance;

	Program(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Deposit amount cannot be negative");
		}
		balance += amount;
	}

	public void withdraw(double amount) {
		if (amount > balance) {
			throw new IllegalArgumentException("Insufficient funds");
		}
		balance -= amount;
	}
}
