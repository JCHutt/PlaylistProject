import java.util.ArrayList;

/**
 * The Playlist class, which keeps track of a playlist of Song objects.
 */
public class Playlist {

    /**
     * Field: An ArrayList to store the list of Song objects.
     */
    private ArrayList<Song> songs;

    /**
     * Constructor: Initializes the playlist as an empty ArrayList.
     */
    public Playlist() {
        this.songs = new ArrayList<>();
    }

    /**
     * Adds a song to the playlist.
     * @param song the Song object to be added.
     */
    public void addSong(Song song) {
        songs.add(song);
    }

    /**
     * Likes a song at the specified index.
     * @param index the index of the song to like.
     */
    public void likeSong(int index) {
        if (index >= 0 && index < songs.size()) {
            songs.get(index).likeOrUnlike();
        } else {
            System.out.println("Invalid index.");
        }
    }

    /**
     * Removes a song at the specified index.
     * @param index the index of the song to remove.
     */
    public void removeSong(int index) {
        if (index >= 0 && index < songs.size()) {
            songs.remove(index);
        } else {
            System.out.println("Invalid index.");
        }
    }

    /**
     * Displays all songs in the playlist.
     */
    public void displayAllSongs() {
        for (Song song : songs) {
            System.out.println(song.toString());
        }
    }

    /**
     * Returns a sublist of liked songs.
     * @return an ArrayList containing only liked songs.
     */
    public ArrayList<Song> getLikedSongs() {
        ArrayList<Song> likedSongs = new ArrayList<>();
        for (Song song : songs) {
            if (song.isLiked()) {
                likedSongs.add(song);
            }
        }
        for (Song song : likedSongs)
        {
        System.out.println(song.toString());
        }
        return likedSongs;
    }

    /**
     * Calculates the total duration of all songs in the playlist.
     * @return the total duration of all songs in seconds.
     */
    public int getTotalDuration() {
        int totalDuration = 0;
        for (Song song : songs) {
            totalDuration += song.getDuration();
        }
        return totalDuration;
    }

    /**
     * Removes all unliked songs from the playlist.
     */
    public void removeUnlikedSongs() {
        if (!song.getLikedStatus())
        songs.remove(song);
    }
}
