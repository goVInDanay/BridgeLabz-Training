package java8_features_practice.gcr_codebase.stream_api_and_for_each;

import java.util.Arrays;
import java.util.List;

class Member {
	String name;
	int expiryDays;

	Member(String name, int expiryDays) {
		this.name = name;
		this.expiryDays = expiryDays;
	}

	@Override
	public String toString() {
		return name + " | Expiry in " + expiryDays + " days";
	}
}

public class FilterExpiringMembership {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Member> members = Arrays.asList(new Member("Govind", 10), new Member("Akash", 45), new Member("Nitai", 25),
				new Member("Aman", 5));
		members.stream().filter(m -> m.expiryDays <= 30).forEach(System.out::println);
	}

}
