package oops_practice.scenario_based.digital_wallet_system;

public class DigitalWalletSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Service service = new Service();
		service.addUser(1, "Govind");
		service.addUser(2, "Akash");
		
		try {
			service.depositAmount(1, 5000);
			service.withdrawAmount(1, 100);
			service.transferAmount(1, 2, 4000, new WalletTransfer());
			service.transferAmount(2, 1, 5000, new WalletTransfer());
		}
		catch (InsufficientBalanceException e) {
			// TODO: handle exception
			System.err.println(e);
		}
		service.showHistory();
	}

}
