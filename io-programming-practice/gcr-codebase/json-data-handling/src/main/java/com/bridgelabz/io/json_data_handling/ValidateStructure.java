package com.bridgelabz.io.json_data_handling;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ValidateStructure {

	public static boolean isValidJson(String json) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			JsonNode node = mapper.readTree(json);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String validJson = "{ \"name\": \"Alice\", \"age\": 25 }";
		String invalidJson = "{ name: Alice, age: 25 }";
		System.out.println(isValidJson(validJson));
		System.out.println(isValidJson(invalidJson));
	}
}
