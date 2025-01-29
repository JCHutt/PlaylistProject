/**
 * The Playlist class, which keeps track of a playlist of Song objects.
 * Assignment for AP Computer Science A at Polytechnic School
 * @author Maddie Delbridge & Jujube Hutt
 * @version 2025-01-28
 */

 import java.util.ArrayList;
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
     * Likes a song at the specified index.
     * @param index the index of the song to like.
     */
    public void UnlikeSong(int index) {
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
     * Displays all the liked songs in the playlist.
     */
    public void displayLikedSongs() {
        ArrayList<Song> likedSongs = new ArrayList<>();
        for (Song song : songs) {
            if (song.getLikedStatus()) {
                likedSongs.add(song);
            }
        }
        for (Song song : likedSongs)
        {
        System.out.println(song.toString());
        }
    }

    /**
     * Calculates the total duration of all songs in the playlist.
     * @return the total duration of all songs in minutes and seconds
     */
    public String getTotalDuration() {
        int totalDuration = 0;
        String totalDurationString = "(";
        for (Song song : songs) {
            totalDuration += song.getDuration();
        }
        int minutes = totalDuration / 60;
        totalDurationString += minutes;
        int seconds = totalDuration % 60;
        totalDurationString += ":";
        if (seconds <= 9)
        {
            totalDurationString += "0" + seconds;
        }
        else
        {
          totalDurationString += seconds;  
        }
        totalDurationString += ")";
        return totalDurationString;
    }

    /**
     * Removes all unliked songs from the playlist.
     */
    public void removeUnlikedSongs() {
        for (int i = songs.size() - 1; i >= 0; i--)
        {
            if (!songs.get(i).getLikedStatus())
            {
                 songs.remove(i);
            }
        }
    }
}