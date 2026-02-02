package io_programming_practice.gcr_codebase.csv_data_handling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToCSVFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "employees.csv";
		try (FileWriter writer = new FileWriter(fileName)) {
			writer.append("ID,Name,Department,Salary\n");
			writer.append("101,Govind,IT,60000\n");
			writer.append("102,Akash Yadav, HR,55000\n");
			writer.append("103,Nitai Gupta,Finance,70000\n");
			writer.append("104,Aman Verma,Marketing,50000\n");
			writer.append("105,Hariom Sharma,Operations,65000\n");
			System.out.println("CSV file written successfully!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
