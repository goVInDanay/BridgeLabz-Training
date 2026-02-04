package java8_features_practice.gcr_codebase.stream_api_and_for_each;

import java.time.LocalDateTime;
import java.util.List;

public class LoggingTransactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> transactionIds = List.of("A123", "B456", "C789");
		transactionIds.forEach(id -> System.out.println(LocalDateTime.now() + " - Transaction: " + id));
	}

}
