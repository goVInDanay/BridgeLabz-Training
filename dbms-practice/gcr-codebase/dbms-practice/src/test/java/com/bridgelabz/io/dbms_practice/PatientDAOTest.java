package com.bridgelabz.io.dbms_practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bridgelabz.io.dbms_practice.health_clinic_app.dao.PatientDAO;
import com.bridgelabz.io.dbms_practice.health_clinic_app.db.DBConnection;
import com.bridgelabz.io.dbms_practice.health_clinic_app.model.Patient;

public class PatientDAOTest {
	private PatientDAO patientDAO;
	private int testId;

	@BeforeEach
	public void setup() {
		patientDAO = new PatientDAO();
	}

	@Test
	public void testRegisterAndFindPatient() throws SQLException {
		Patient patient = new Patient.Builder("Test User", LocalDate.of(2001, 12, 12), "1234567890")
				.address("Test address").bloodGroup("B+").build();
		testId = patientDAO.registerPatient(patient);
		assertTrue(testId > 0, "Generated ID is greater that 0");

		Patient retrieved = patientDAO.getPatientById(testId);
		assertNotNull(retrieved, "Patient found in database");

		assertEquals("Test User", retrieved.getName());
		assertEquals(LocalDate.of(2001, 12, 12), retrieved.getDob());
		assertEquals("1234567890", retrieved.getContact());
		assertEquals("Test address", retrieved.getAddress());
		assertEquals("B+", retrieved.getBloodGroup());
	}

	@AfterEach
	public void tearDown() throws SQLException {
		if (testId > 0) {
			String sql = "Delete from patients where id = ?";
			try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
				ps.setInt(1, testId);
				ps.executeUpdate();
			}
		}
	}
}
