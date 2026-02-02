package io_programming_practice.gcr_codebase.csv_data_handling;

import java.io.*;

public class ReadLargeCSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "large.csv";
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String header = br.readLine();
			int batchSize = 100;
			int count = 0;
			String line;
			int batchCounter = 0;
			while ((line = br.readLine()) != null) {
				count++;
				batchCounter++;
				if (batchCounter == batchSize) {
					batchCounter = 0;
				}
			}
			System.out.println("Total records processed: " + count);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
