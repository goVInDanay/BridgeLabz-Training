package collections.scenario_based.music_playlist_manager;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlaylistManager manager = new PlaylistManager();

		Song s1 = new Song("1", "Shape of You", "Ed Sheeran");
		Song s2 = new Song("2", "Blinding Lights", "The Weeknd");

		try {
			manager.addSong(s1);
			manager.addSong(s2);
			manager.addSong(s1);

		} catch (SongAlreadyExistsException e) {
			System.out.println(e.getMessage());
		}

		manager.viewPlaylist();
		manager.playSong(s1);
		manager.playSong(s2);
		manager.viewRecentlyPlayed();
	}

}
