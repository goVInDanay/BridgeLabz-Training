package collections.scenario_based.online_aution_bidding_system;

class User {
	private String userId;
	private String name;

	User(String userId, String name) {
		this.userId = userId;
		this.name = name;
	}

	public String getUserId() {
		return userId;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return userId + " | " + name;
	}
}
