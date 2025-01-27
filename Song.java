/**
 * Models a Song object with a title, artist, duration, and liked status
 * for the Playlist Project
 * @author Jujube Hutt & Maddie Delbridge
 * @version 2025-01-24
 */
public class Song {
    String title; 
    String artist;
    int duration;
    boolean liked;

    /**
     * Constructs a song with a title, artist, and duration
     * @param title  the title of the song
     * @param artist  the creator of the song
     * @param duration  the duration of the song in seconds
     */
    public Song(String title, String artist, int duration)
    {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        liked = false;
    }

    public String getTitle()
    {
        return title;
    }

    public String getArtist()
    {
        return artist;
    }

    public int getDuration()
    {
        return duration;
    }

    public int getLikedStatus()
    {
        return liked;
    }

    public void likeOrUnlike()
    {
        if (liked)
        {
        liked = false;
        }
        else 
        {
        liked = true;
        }
    }

    public String toString()
    {
        String stringSong = "\"";

        for (int i = 0; i<title.length(); i++)
        {
            stringSong+= title.substring(i,i+1);
        }
        stringSong+= "\" by ";
        for (int i = 0; i<artist.length(); i++)
        {
            stringSong+= artist.substring(i,i+1);
        }
        stringSong+= " (";
        int minutes = duration / 60;
        stringSong += minutes;
        int seconds = duration % 60;
        stringSong += ":";
        if (seconds <= 9)
        {
            stringSong += "0" + seconds;
        }
        else
        {
          stringSong += seconds;  
        }
        stringSong+= ")";
        if (liked)
        {
           stringSong += " -- liked"; 
        }
        return stringSong;
    }

}