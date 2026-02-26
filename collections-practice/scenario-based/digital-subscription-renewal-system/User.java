package collections.scenario_based.digital_subscription_renewal_system;

class User {
	private String name;
	private Subscription subscription;
	private double balance;

	public User(String name, Subscription subscription, double balance) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.subscription = subscription;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public Subscription getSubscription() {
		return subscription;
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(double amount) throws PaymentDeclinedException {
		if (amount > balance) {
			throw new PaymentDeclinedException("Not sufficient funds. Payment decliend");
		}
		balance -= amount;
	}

}
