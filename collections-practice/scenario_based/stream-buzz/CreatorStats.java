package collections.scenario_based.stream_buzz;

import java.util.*;

class CreatorStats {
	public String creatorName;
	public double weeklyLikes[];

	public CreatorStats() {
		// TODO Auto-generated constructor stub
		this.creatorName = null;
		this.weeklyLikes = new double[7];
	}

	public CreatorStats(String creatorName, double[] weeklyLikes) {
		this.creatorName = creatorName;
		this.weeklyLikes = weeklyLikes;
	}

	public static List<CreatorStats> engagementBoard = new ArrayList<>();
}
