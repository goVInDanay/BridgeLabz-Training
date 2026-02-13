package collections.scenario_based.music_playlist_manager;

import java.util.*;

class Song {
	private String id;
	private String title;
	private String artist;

	public Song(String id, String title, String artist) {
		this.id = id;
		this.title = title;
		this.artist = artist;
	}

	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Song)) {
			return false;
		}
		Song song = (Song) o;
		return Objects.equals(id, song.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return title + " - " + artist;
	}
}
