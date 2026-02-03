package com.bridgelabz.io.json_data_handling;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class ReadJson {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper();
		JsonNode rootNode = mapper.readTree(new File("users.json"));
		for (JsonNode node : rootNode) {
			String name = node.get("name").asText();
			String email = node.get("email").asText();
			System.out.println("Name: " + name + ", Email: " + email);
		}
	}

}
