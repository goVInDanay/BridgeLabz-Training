package com.bridgelabz.io.json_data_handling;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import java.io.File;

public class ValidateEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			JsonNode schemaNode = objectMapper.readTree(new File("src/schema.json"));
			JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
			JsonSchema schema = factory.getJsonSchema(schemaNode);
			JsonNode jsonData = objectMapper.readTree(new File("src/user.json"));
			if (schema.validate(jsonData).isSuccess()) {
				System.out.println("JSON is valid!");
			} else {
				System.out.println("Invalid JSON!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
