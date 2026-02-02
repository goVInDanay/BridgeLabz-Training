package io_programming_practice.gcr_codebase.csv_data_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ReadRecordsAndSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "employees.csv";
        List<String[]> records = new ArrayList<>();
        String header;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            header = br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                records.add(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        records.sort((a, b) -> {
            double salaryA = Double.parseDouble(a[3]);
            double salaryB = Double.parseDouble(b[3]);
            return Double.compare(salaryB, salaryA);
        });
        System.out.println(header);
        for (int i = 0; i < Math.min(5, records.size()); i++) {
            String[] emp = records.get(i);
            System.out.println(String.join(",", emp));
        }
	}

}
