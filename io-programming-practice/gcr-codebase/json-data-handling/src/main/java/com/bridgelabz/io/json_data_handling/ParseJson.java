package com.bridgelabz.io.json_data_handling;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ParseJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			JsonNode rootArray = objectMapper.readTree(new File("users.json"));
			for (JsonNode userNode : rootArray) {
				int age = userNode.get("age").asInt();
				if (age > 25) {
					String name = userNode.get("name").asText();
					System.out.println("Name: " + name + " Age: " + age);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
