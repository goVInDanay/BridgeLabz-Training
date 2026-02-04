package java8_features_practice.gcr_codebase.stream_api_and_for_each;

import java.util.Arrays;
import java.util.List;

public class TransformToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("govind", "aman", "nitai", "akash", "hariom");
		names.stream().map(String::toUpperCase).sorted().forEach(System.out::println);
	}

}
