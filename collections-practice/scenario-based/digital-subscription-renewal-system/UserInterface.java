package collections.scenario_based.digital_subscription_renewal_system;

import java.util.*;
import java.time.*;

class UserInterface {

	public static void main(String[] args) {
		User user1 = new User("Govind", new Subscription(LocalDate.now().plusMonths(1), true, 1000), 1500);
		User user2 = new User("Akash", new Subscription(LocalDate.now().minusDays(10), true, 1500), 1000);
		List<User> users = List.of(user1, user2);
		SubscriptionService service1 = new SubscriptionService(new Discount());
		SubscriptionService service2 = new SubscriptionService(new NoDiscount());
		
		service1.autoRenew(users);
		service1.showExpired(users);

		user1 = new User("Govind", new Subscription(LocalDate.now().plusMonths(1), true, 1000), 1500);
		user2 = new User("Akash", new Subscription(LocalDate.now().minusDays(10), true, 1500), 1000);

		users = List.of(user1, user2);
		service2.autoRenew(users);
		service2.showExpired(users);
	}
}
