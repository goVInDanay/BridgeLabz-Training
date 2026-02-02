package io_programming_practice.gcr_codebase.csv_data_handling;

import java.util.*;
import java.io.*;

public class DetectDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "students.csv";
		Set<String> ids = new HashSet<>();
		List<String> duplicates = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			br.readLine();
			String line;
			while ((line = br.readLine()) != null) {
				String id = line.split(",")[0];
				if (ids.contains(id)) {
					duplicates.add(line);
				}
				ids.add(id);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (duplicates.isEmpty()) {
			System.out.println("No duplicate records found.");
		} else {
			System.out.println("Duplicate records:");
			for (String duplicate : duplicates) {
				System.out.println(duplicate);
			}
		}
	}
}
