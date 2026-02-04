package java8_features_practice.gcr_codebase.stream_api_and_for_each;

import java.util.List;

public class StockPriceLogger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> stockPrices = List.of(120.5, 121.0, 119.8, 122.3);
		stockPrices.forEach(price -> System.out.println("Stock price: " + price));
	}

}
