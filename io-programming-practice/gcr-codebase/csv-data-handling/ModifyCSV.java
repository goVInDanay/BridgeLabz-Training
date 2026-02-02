package io_programming_practice.gcr_codebase.csv_data_handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ModifyCSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputFile = "employees.csv";
		String outputFile = "updated_employees.csv";
		try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
				BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
			String line;
			String header = br.readLine();
			bw.write(header);
			bw.newLine();
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				String dept = data[2];
				double salary = Double.parseDouble(data[3]);
				if (dept.equalsIgnoreCase("IT")) {
					salary = salary * 1.1;
				}
				bw.write(data[0] + "," + data[1] + "," + data[2] + "," + (int) salary);
				bw.newLine();
			}
			System.out.println("Updated CSV saved as " + outputFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
