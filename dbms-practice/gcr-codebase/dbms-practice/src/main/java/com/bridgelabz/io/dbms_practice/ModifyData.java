package com.bridgelabz.io.dbms_practice;

import java.sql.*;

public class ModifyData {

	public static void updateStudentGrade(int studentId, String newGrade) {
		String sql = "Update students set grade = ? where id = ?";
		try (Connection conn = DatabaseConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, newGrade);
			pstmt.setInt(2, studentId);
			int rowsAffected = pstmt.executeUpdate();
			if (rowsAffected > 0) {
				System.out.println("Grade updated");
			} else {
				System.out.println("Student not found!");
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void updateStudentInfo(int id, String name, String email, int age) {
		String sql = "Update students set name = ?, email = ?, age = ? where id = ?";
		try (Connection conn = DatabaseConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setInt(3, id);
			pstmt.setInt(4, id);
			int rowsAffected = pstmt.executeUpdate();
			System.out.println(rowsAffected + " row(s) updated");
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		updateStudentGrade(1, "A+");
		updateStudentInfo(2, "Akash", "akash@gmail.com", 23);
	}

}
