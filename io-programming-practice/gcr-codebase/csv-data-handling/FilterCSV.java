package io_programming_practice.gcr_codebase.csv_data_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilterCSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "students.csv";
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String header = br.readLine();
			System.out.println(header);
			String line;
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				int marks = Integer.parseInt(data[3]);
				if (marks > 80) {
					System.out.println(line);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
