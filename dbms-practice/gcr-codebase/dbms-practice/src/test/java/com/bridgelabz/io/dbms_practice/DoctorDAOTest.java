package com.bridgelabz.io.dbms_practice;

import com.bridgelabz.io.dbms_practice.health_clinic_app.dao.DoctorDAO;
import com.bridgelabz.io.dbms_practice.health_clinic_app.model.Doctor;
import org.junit.jupiter.api.*;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DoctorDAOTest {

	private static DoctorDAO doctorDAO;

	@BeforeAll
	public static void setup() {
		doctorDAO = new DoctorDAO();
	}

	@Test
	@Order(1)
	public void testRegisterAndGetDoctor() throws SQLException {
		Doctor doctor = new Doctor.DoctorBulder("Dr. Goviind Acharya", "1234567890", 100).build();
		int doctorId = doctorDAO.addDoctor(doctor, "Cardiology");
		assertTrue(doctorId > 0, "Doctor ID should be greater than 0 after insertion");

		Doctor fetchedDoctor = doctorDAO.getDoctorById(doctorId);
		assertNotNull(fetchedDoctor, "Fetched doctor should not be null");
		assertEquals("Dr. Goviind Acharya", fetchedDoctor.getName(), "Doctor name should match");
		assertEquals("1234567890", fetchedDoctor.getContact(), "Doctor contact should match");

		System.out.println("Doctor inserted and fetched successfully: " + fetchedDoctor);
	}

	@Test
	@Order(2)
	public void testRegisterDoctorWithExistingSpecialty() throws SQLException {
		Doctor doctor = new Doctor.DoctorBulder("Dr. Arpit Gupta", "0987654321", 2032).build();
		int doctorId = doctorDAO.addDoctor(doctor, "Cardiology");
		assertTrue(doctorId > 0, "Doctor ID should be greater than 0 after insertion");
		Doctor fetched = doctorDAO.getDoctorById(doctorId);
		assertNotNull(fetched);
		assertEquals("Dr. Arpit Gupta", fetched.getName());
		System.out.println("Doctor with existing specialty inserted successfully: " + fetched);
	}
}
