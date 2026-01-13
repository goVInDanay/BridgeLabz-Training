package oops_practice.scenario_based.digital_wallet_system;

class Wallet {
	private double balance;
	private double limit;

	Wallet() {
		balance = 0;
		limit = 5000;
	}

	Wallet(double balance, double limit) {
		this.balance = balance;
		this.limit = limit;
	}

	public double getBalance() {
		return balance;
	}

	public void depositAmount(double amount) {
		balance += amount;
	}

	public void withdrawAmount(double amount) throws InsufficientBalanceException {
		if (amount > balance) {
			throw new InsufficientBalanceException(
					"Insufficient balance. Required: " + amount + " Remaining: " + balance);
		}
		balance -= amount;
	}

}
