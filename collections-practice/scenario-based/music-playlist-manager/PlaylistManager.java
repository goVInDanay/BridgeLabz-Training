package collections.scenario_based.music_playlist_manager;

import java.util.*;

class PlaylistManager {

	private LinkedList<Song> playlist = new LinkedList<>();
	private Stack<Song> recentlyPlayed = new Stack<>();
	private Set<Song> songSet = new HashSet<>();

	public void addSong(Song song) throws SongAlreadyExistsException {
		if (songSet.contains(song)) {
			throw new SongAlreadyExistsException("Song already exists in playlist");
		}
		playlist.add(song);
		songSet.add(song);
	}

	public void removeSong(Song song) {
		playlist.remove(song);
		songSet.remove(song);
	}

	public void playSong(Song song) {
		if (playlist.contains(song)) {
			recentlyPlayed.push(song);
			System.out.println("Now Playing: " + song);
		} else {
			System.out.println("Song not found in playlist");
		}
	}

	public void viewPlaylist() {
		System.out.println("Playlist:");
		for (Song song : playlist) {
			System.out.println(song);
		}
	}

	public void viewRecentlyPlayed() {
		System.out.println("Recently Played:");
		for (Song song : recentlyPlayed) {
			System.out.println(song);
		}
	}
}
