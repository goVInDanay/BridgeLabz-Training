package java8_features_practice.gcr_codebase.stream_api_and_for_each;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Insurance {
	String type;
	double amount;

	Insurance(String type, double amount) {
		this.type = type;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return type + " | Amount: " + amount;
	}
}

public class InsuranceClaim {
	public static void main(String[] args) {
		List<Insurance> claims = List.of(new Insurance("Health", 1200), new Insurance("Car", 1000),
				new Insurance("Health", 1600), new Insurance("Car", 1000), new Insurance("Home", 2500));
		Map<String, Double> average = claims.stream()
				.collect(Collectors.groupingBy(claim -> claim.type, Collectors.averagingDouble(claim -> claim.amount)));
		System.out.println(average);
	}
}
