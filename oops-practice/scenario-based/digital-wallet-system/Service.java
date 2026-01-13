package oops_practice.scenario_based.digital_wallet_system;

class Service {
	User users[] = new User[10];
	Transaction transactions[] = new Transaction[10];
	int userCount = 0;
	int transactionCount = 0;

	public void addUser(int id, String name) {
		users[userCount++] = new User(id, name);
		System.out.println("Added User: " + name);
	}

	public User findUser(int userId) {
		for (int i = 0; i < userCount; i++) {
			if (users[i].getId() == userId) {
				return users[i];
			}
		}
		return null;
	}

	public void depositAmount(int userId, double amount) {
		User user = findUser(userId);
		if (user != null) {
			user.getWallet().depositAmount(amount);
			transactions[transactionCount++] = new Transaction("Deposit money", amount);
			System.out.println(user.getName() + " Amount deposited successfully");
		} else {
			System.err.println("User not found");
		}
	}

	public void withdrawAmount(int userId, double amount) throws InsufficientBalanceException {
		User user = findUser(userId);
		if (user != null) {
			user.getWallet().withdrawAmount(amount);
			transactions[transactionCount++] = new Transaction("Withdraw money", amount);
			System.out.println(user.getName() + " Amount withdrawn successfully");
		} else {
			System.err.println("User not found");
		}
	}

	public void transferAmount(int userIdFrom, int userIdTo, double amount, TransferService transferService)
			throws InsufficientBalanceException {
		User from = findUser(userIdFrom);
		User to = findUser(userIdTo);
		if (from != null && to != null) {
			transferService.transfer(from, to, amount);
			transactions[transactionCount++] = new Transaction(
					"Transferred money from " + from.getName() + " to " + to.getName(), amount);
		} else {
			System.out.println("User not found");
		}
	}

	public void showHistory() {
		for (int i = 0; i < transactionCount; i++) {
			System.out.println(transactions[i].getType() + " Amount: " + transactions[i].getAmount());
		}
	}
}
