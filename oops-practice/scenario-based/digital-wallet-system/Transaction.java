package oops_practice.scenario_based.digital_wallet_system;

class Transaction {
	private String type;
	private double amount;

	Transaction(String type, double amount) {
		this.type = type;
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public double getAmount() {
		return amount;
	}
}
