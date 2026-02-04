package java8_features_practice.gcr_codebase.functional_interfaces;

import java.util.function.Function;

public class StringLengthChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, Integer> lengthChecker = s -> s.length();
		String text[] = { "Govind", "Akash", "Aman", "Hariom" };
		for (String s : text) {
			System.out.println(s + " : " + lengthChecker.apply(s));
		}
	}

}
