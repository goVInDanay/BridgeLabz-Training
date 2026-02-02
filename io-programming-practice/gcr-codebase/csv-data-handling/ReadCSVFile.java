package io_programming_practice.gcr_codebase.csv_data_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSVFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "students.csv";
		String line;
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			br.readLine();
			System.out.println("Student Details:");
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				System.out.println("ID    : " + data[0]);
				System.out.println("Name  : " + data[1]);
				System.out.println("Age   : " + data[2]);
				System.out.println("Marks : " + data[3]);
				System.out.println();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
