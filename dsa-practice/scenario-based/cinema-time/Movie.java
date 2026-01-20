package dsa_practice.scenario_based.cinema_time;

class Movie {
	private String title;
	private String time;

	Movie(String title, String time) {
		this.title = title;
		this.time = time;
	}

	public String getTitle() {
		return title;
	}

	public String getTime() {
		return time;
	}

	public String formattedMovie() {
		return String.format("Movie: %s | Showtime: %s", title, time);
	}
}
