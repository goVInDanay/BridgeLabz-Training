package oops_practice.scenario_based.digital_wallet_system;

class WalletTransfer implements TransferService {

	@Override
	public void transfer(User from, User to, double amount) throws InsufficientBalanceException {
		from.getWallet().withdrawAmount(amount);
		to.getWallet().depositAmount(amount);
		System.out.println(
				"Transferred Rs " + amount + " from " + from.getName() + " to " + to.getName() + " using wallet");
	}
}
