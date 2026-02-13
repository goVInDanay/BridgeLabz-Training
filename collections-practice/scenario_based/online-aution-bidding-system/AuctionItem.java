package collections.scenario_based.online_aution_bidding_system;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class AuctionItem {
	private String itemName;
	private TreeMap<User, Double> bids;
	private double highestBid;

	public AuctionItem(String itemName) {
		this.itemName = itemName;
		this.bids = new TreeMap<User, Double>(Comparator.comparing(User::getUserId));
		this.highestBid = 0;
	}

	public void placeBid(Bid bid) throws InvalidBidException {
		if (bid.getAmount() <= highestBid) {
			throw new InvalidBidException("Bid must be higher than current highest bid: " + highestBid);
		}
		bids.put(bid.getUser(), bid.getAmount());
		highestBid = bid.getAmount();
		System.out.println("Bid placed successfully " + bid.getUser() + ": " + bid.getAmount());
	}

	public void showHighestBid() {
		if (bids.isEmpty()) {
			System.out.println("No bids yet");
			return;
		}
		User highestBidder = null;
		double max = 0;
		for (Map.Entry<User, Double> entry : bids.entrySet()) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				highestBidder = entry.getKey();
			}
		}
		System.out.println("Highest bid: " + max);
		System.out.println("Highest bidder: " + highestBidder);
	}
}
