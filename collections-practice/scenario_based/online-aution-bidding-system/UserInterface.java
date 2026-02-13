package collections.scenario_based.online_aution_bidding_system;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			User user1 = new User("U101", "Alice");
			User user2 = new User("U102", "Bob");

			AuctionItem item = new AuctionItem("Laptop");

			item.placeBid(new Bid(user1, 5000));
			item.placeBid(new Bid(user2, 6000));
			item.showHighestBid();
			item.placeBid(new Bid(user1, 5500));
		} catch (InvalidBidException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
