package com.bridgelabz.io.json_data_handling;

import java.io.File;
import java.util.Iterator;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PrintKeyAndValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			JsonNode jsonObject = objectMapper.readTree(new File("users.json"));
			Iterator<Map.Entry<String, JsonNode>> fields = jsonObject.fields();
			while (fields.hasNext()) {
				Map.Entry<String, JsonNode> entry = fields.next();
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
