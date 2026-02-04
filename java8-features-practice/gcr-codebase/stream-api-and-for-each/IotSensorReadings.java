package java8_features_practice.gcr_codebase.stream_api_and_for_each;

import java.util.List;

public class IotSensorReadings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> readings = List.of(12, 25, 18, 30, 10);
		int threshold = 20;
		readings.stream().filter(reading -> reading > threshold)
				.forEach(reading -> System.out.println("High reading: " + reading));
	}

}
