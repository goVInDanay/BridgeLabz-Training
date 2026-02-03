package com.bridgelabz.io.json_data_handling;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeTwoJson {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode json1 = mapper.createObjectNode();
		json1.put("name", "Govind");
		json1.put("age", 23);
		ObjectNode json2 = mapper.createObjectNode();
		json2.put("email", "govind@gmail.com");
		json2.put("city", "Agra");
		json1.setAll(json2);
		System.out.println(mapper.writeValueAsString(json1));
	}

}
