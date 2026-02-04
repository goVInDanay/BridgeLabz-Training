package java8_features_practice.gcr_codebase.stream_api_and_for_each;

import java.util.List;

public class EmailNotification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> emails = List.of("govind@gmail.com", "akash@gmail.com");
		emails.forEach(email -> sendEmailNotification(email));
	}

	public static void sendEmailNotification(String email) {
		System.out.println("Sending email to: " + email);
	}
}
