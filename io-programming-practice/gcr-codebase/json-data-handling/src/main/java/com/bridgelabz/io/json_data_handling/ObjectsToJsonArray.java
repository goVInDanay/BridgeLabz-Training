package com.bridgelabz.io.json_data_handling;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

class Person {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class ObjectsToJsonArray {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("Govind", 23));
		list.add(new Person("Akash", 21));
		list.add(new Person("Nitai", 22));

		ObjectMapper mapper = new ObjectMapper();
		String jsonArray = mapper.writeValueAsString(list);
		System.out.println(jsonArray);
	}
}
