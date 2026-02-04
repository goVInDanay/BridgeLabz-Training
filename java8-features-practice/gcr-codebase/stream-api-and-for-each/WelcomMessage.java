package java8_features_practice.gcr_codebase.stream_api_and_for_each;

import java.util.List;

public class WelcomMessage {
	public static void main(String[] args) {
		List<String> attendees = List.of("Govind", "Akash", "Nital");
		attendees.forEach(name -> System.out.println("Welcome " + name));
	}
}
