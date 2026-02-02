package io_programming_practice.gcr_codebase.csv_data_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SearchRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "employees.csv";
		String searchName = "Akash";
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String header = br.readLine();
			boolean found = false;
			String line;
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				String name = data[1];
				if (name.contains(searchName)) {
					System.out.println("Employee Found: " + name);
					System.out.println("Department: " + data[2]);
					System.out.println("Salary    : " + data[3]);
					found = true;
					break;
				}
			}
			if (!found) {
				System.out.println("Employee not found.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
