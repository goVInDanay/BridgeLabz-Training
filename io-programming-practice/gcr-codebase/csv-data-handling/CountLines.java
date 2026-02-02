package io_programming_practice.gcr_codebase.csv_data_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountLines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "employees.csv";
		int count = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			br.readLine();
			while (br.readLine() != null) {
				count++;
			}
			System.out.println("Number of records in the CSV file: " + count);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
