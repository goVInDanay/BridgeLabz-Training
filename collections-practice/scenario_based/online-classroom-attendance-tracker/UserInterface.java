package collections.scenario_based.online_classroom_attendance_tracker;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AttendanceTracker tracker = new AttendanceTracker();

		try {
			tracker.markAttendance("S101", "GLA-01");
			tracker.markAttendance("S101", "GLA-02");
			tracker.markAttendance("S101", "GLA-03");
		} catch (DuplicateAttendanceException e) {
			System.out.println(e.getMessage());
		}

		tracker.displayAttendance("S101");
		tracker.removeAttendance("S101", "GLA-02");
		tracker.displayAttendance("S101");
	}
}
