package collections.scenario_based.digital_subscription_renewal_system;

import java.util.*;

class SubscriptionService {
	private DiscountStratergy discountStratergy;

	public SubscriptionService(DiscountStratergy discountStratergy) {
		// TODO Auto-generated constructor stub
		this.discountStratergy = discountStratergy;
	}

	public void pay(User user, Subscription subscription) throws PaymentDeclinedException {
		double amount = discountStratergy.applyDiscount(subscription.getPrice());
		user.withdraw(amount);
		System.out.println("Payment processed: " + amount);
	}

	public void autoRenew(List<User> users) {
		for (User user : users) {
			Subscription subscription = user.getSubscription();
			if (!subscription.isExpired()) {
				try {
					pay(user, subscription);
					subscription.renew();
					System.out.println(user.getName() + " renewed");
				} catch (PaymentDeclinedException e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
			}
		}
	}

	public void showExpired(List<User> users) {
		users.stream().filter(user -> user.getSubscription().isExpired())
				.forEach(user -> System.out.println(user.getName() + " account expired"));
	}
}
