package com.bridgelabz.io.dbms_practice;

import java.sql.*;

public class InsertData {

	public static void insertStudent(String name, String email, int age, String grade) {
		String sql = "INSERT INTO students (name, email, age, grade, enrollment_date) VALUES (?, ?, ?, ?, ?)";
		try (Connection conn = DatabaseConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setInt(3, age);
			pstmt.setString(4, grade);
			pstmt.setDate(5, new java.sql.Date(System.currentTimeMillis()));
			int rowsAffected = pstmt.executeUpdate();
			System.out.println(rowsAffected + " row(s) inserted successfully");
		} catch (SQLException e) {
			System.err.println("Insert failed: " + e.getMessage());
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertStudent("John Doe", "john.doe@email.com", 20, "A");
		insertStudent("Jane Smith", "jane.smith@email.com", 22, "B");
	}
}
