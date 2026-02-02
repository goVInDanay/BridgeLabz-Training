package io_programming_practice.gcr_codebase.csv_data_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class ValidateCSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "contacts.csv";
		String emailRegex = "[A-Za-z]+([._][A-Za-z0-9])*@([A-Za-z]+([._][A-Za-z0-9])*)\\.[A-Za-z]{2,}";
		Pattern emailPattern = Pattern.compile(emailRegex);
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String header = br.readLine();
			System.out.println(header);
			String line;
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				String email = data[2];
				String phone = data[3];
				boolean valid = true;
				if (!emailPattern.matcher(email).matches()) {
					System.out.println("Invalid Email in row: " + line);
					valid = false;
				}
				if (!phone.matches("\\d{10}")) {
					System.out.println("Invalid Phone in row: " + line);
					valid = false;
				}
				if (valid) {
					System.out.println("Valid row: " + line);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
