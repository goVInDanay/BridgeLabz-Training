package oops_practice.scenario_based.digital_wallet_system;

interface TransferService {
	void transfer(User from, User to, double amount) throws InsufficientBalanceException;
}
