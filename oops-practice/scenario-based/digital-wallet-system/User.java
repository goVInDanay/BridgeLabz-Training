package oops_practice.scenario_based.digital_wallet_system;

class User {
	private int id;
	private String name;
	private Wallet wallet;

	User(int id, String name) {
		this.id = id;
		this.name = name;
		this.wallet = new Wallet();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Wallet getWallet() {
		return wallet;
	}
}
