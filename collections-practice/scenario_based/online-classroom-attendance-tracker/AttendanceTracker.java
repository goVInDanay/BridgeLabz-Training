package collections.scenario_based.online_classroom_attendance_tracker;

import java.util.*;

public class AttendanceTracker {

	private Map<String, Set<String>> sessionAttendance = new HashMap<>();

	public void markAttendance(String sessionId, String studentId) throws DuplicateAttendanceException {
		sessionAttendance.putIfAbsent(sessionId, new HashSet<>());
		Set<String> students = sessionAttendance.get(sessionId);
		if (!students.add(studentId)) {
			throw new DuplicateAttendanceException(
					"Attendance already marked for student " + studentId + " in session " + sessionId);
		}
	}

	public void removeAttendance(String sessionId, String studentId) {
		Set<String> students = sessionAttendance.get(sessionId);
		if (students != null) {
			students.remove(studentId);
		}
	}

	public void displayAttendance(String sessionId) {
		Set<String> students = sessionAttendance.get(sessionId);

		if (students == null || students.isEmpty()) {
			System.out.println("No attendance recorded for session " + sessionId);
		} else {
			System.out.println("Attendance for session " + sessionId + ":");
			for (String studentId : students) {
				System.out.println(studentId);
			}
		}
	}
}
