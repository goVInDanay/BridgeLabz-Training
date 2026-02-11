package com.bridgelabz.io.dbms_practice.health_clinic_app.dao;

import java.sql.*;

import com.bridgelabz.io.dbms_practice.health_clinic_app.db.DBConnection;
import com.bridgelabz.io.dbms_practice.health_clinic_app.model.Patient;

public class PatientDAO {
	public int registerPatient(Patient patient) throws SQLException {
		String sql = "Insert into patients (name, dob, contact, address, blood_group) values (?,?,?,?,?)";
		try (Connection conn = DBConnection.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
			ps.setString(1, patient.getName());
			ps.setDate(2, Date.valueOf(patient.getDob()));
			ps.setString(3, patient.getContact());
			ps.setString(4, patient.getAddress());
			ps.setString(5, patient.getBloodGroup());

			int affectedRows = ps.executeUpdate();
			if (affectedRows == 0) {
				throw new SQLException("Inserting patient failed, no rows affected.");
			}
			try (ResultSet rs = ps.getGeneratedKeys()) {
				if (rs.next()) {
					return rs.getInt(1);
				} else {
					throw new SQLException("Inserting patient failed, no ID obtained.");
				}
			}
		}
	}

	public Patient getPatientById(int id) throws SQLException {
		String sql = "Select * from patients where id = ?";
		try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			try (ResultSet rs = ps.executeQuery()) {
				if (rs.next()) {
					return new Patient(rs.getInt("id"), rs.getString("name"), rs.getDate("dob").toLocalDate(),
							rs.getString("contact"), rs.getString("address"), rs.getString("blood_group"));
				}
			}
		}
		return null;
	}
}
