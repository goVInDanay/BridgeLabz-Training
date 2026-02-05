package java8_features_practice.gcr_codebase.collectors;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequencyCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "hello hi how are you i am fine what about you";
		Map<String, Long> frequency = Arrays.stream(text.split(" "))
				.collect(Collectors.groupingBy(word -> word, Collectors.counting()));
		System.out.println(frequency);
	}

}
