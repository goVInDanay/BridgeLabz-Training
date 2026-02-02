package io_programming_practice.gcr_codebase.csv_data_handling;

import java.util.*;
import java.io.*;

public class MergeCSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String[]> map = new HashMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader("students1.csv"))) {
			String line = br.readLine();
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				map.put(data[0], data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		List<String> merged = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader("students2.csv"))) {
			String line = br.readLine();
			while ((line = br.readLine()) != null) {
				String[] data2 = line.split(",");
				String[] data1 = map.get(data2[0]);
				if (data1 != null) {
					String data = String.join(",", data1) + "," + data2[1] + "," + data2[2];
					merged.add(data);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("students_merged.csv"))) {
			bw.write("ID,Name,Age,Marks,Grade");
			bw.newLine();
			for (String line : merged) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Merged CSV created.");
	}

}
