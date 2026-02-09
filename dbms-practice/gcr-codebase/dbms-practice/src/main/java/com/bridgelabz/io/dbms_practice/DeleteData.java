package com.bridgelabz.io.dbms_practice;

import java.sql.*;

public class DeleteData {

	public static void deleteStudent(int studentId) {
		String sql = "Delete from students where id = ?";
		try (Connection conn = DatabaseConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, studentId);
			int rowsAffected = pstmt.executeUpdate();
			if (rowsAffected > 0) {
				System.out.println("Deleted student");
			} else {
				System.out.println("Student not found!");
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static boolean deleteStudentSafe(int studentId) {
		String checkSql1 = "Select Count(*) from students where id = ?";
		String deleteSql1 = "Delete from students where id = ?";
		try (Connection conn = DatabaseConnection.getConnection()) {
			try (PreparedStatement checkStmt = conn.prepareStatement(checkSql1)) {
				checkStmt.setInt(1, studentId);
				ResultSet rs = checkStmt.executeQuery();
				rs.next();
				if (rs.getInt(1) == 0) {
					System.out.println("Student not found!");
					return false;
				}
			}

			try (PreparedStatement deleteStmt = conn.prepareStatement(deleteSql1)) {
				deleteStmt.setInt(1, studentId);
				deleteStmt.executeUpdate();
				System.out.println("Student deleted successfully!");
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deleteStudentSafe(1);
		deleteStudent(2);
	}

}
