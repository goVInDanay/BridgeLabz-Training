package collections.scenario_based.digital_subscription_renewal_system;

import java.time.LocalDate;

class Subscription {
	private LocalDate expiry;
	private boolean active;
	private double price;

	public Subscription(LocalDate expiry, boolean active, double price) {
		// TODO Auto-generated constructor stub
		this.expiry = expiry;
		this.active = active;
		this.price = price;
	}

	public boolean isExpired() {
		return LocalDate.now().isAfter(expiry);
	}

	public void renew() {
		expiry = expiry.plusMonths(1);
		active = true;
	}

	public double getPrice() {
		return price;
	}

	public LocalDate getExpiryDate() {
		return expiry;
	}
}
