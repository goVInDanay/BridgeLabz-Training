package dsa_practice.scenario_based.cinema_time;

public class CinemaTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager();
		try {
			manager.addMovie("Inception", "18:30");
			manager.addMovie("Interstellar", "21:00");
			manager.addMovie("The Matrix", "25:99");
		} catch (InvalidTimeFormatException e) {
			// TODO: handle exception
			System.err.println(e);
		}
		
		manager.displayAllMovie();
		manager.searchMovie("Inter");
		manager.printReport();
	}

}
