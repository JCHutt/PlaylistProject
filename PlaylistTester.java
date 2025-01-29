
/**
 * Tester of the Playlist class, that creates and demonstrates all of
 * the functions of a Playlist object filled with Song objects
 * Assignment for AP Computer Science A at Polytechnic School
 * @author Jujube Hutt & Maddie Delbridge
 * @version 2025-01-28
 */
public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        Playlist p = new Playlist();

        System.out.println("Adding songs to the Playlist...\n");
        p.addSong(new Song("Nomad", "Clairo", 226));
        p.addSong(new Song("Sunny Day", "beabadoobee", 162));
        p.addSong(new Song("You're So Vain", "Carly Simon", 282));
        p.addSong(new Song("Blackbird", "Beatles", 139));


        System.out.println("Printing the songs...\n");
        //Print out all the songs in the playlist to verify it's working correctly
        p.displayAllSongs();

        System.out.println("\nLiking the songs in position 1 & 3\n");
        //Once your songs are 'liked', this should be reflected in the next printout
        p.likeSong(1);
        p.likeSong(3);

        System.out.println("Printing the songs...\n");
        p.displayAllSongs();

        System.out.println("\nRemoving the song in position 2\n");
        p.removeSong(2);

        System.out.println("Printing the songs...\n");
        p.displayAllSongs();

        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!
        p.displayLikedSongs();

        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds
        System.out.println(p.getTotalDuration());
        
        System.out.println("\nUnliking the song in position 1");
        p.UnlikeSong(1);
        
        System.out.println("\nPrinting the songs...\n");
        p.displayAllSongs();
        
        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call
        p.removeUnlikedSongs();

        System.out.println("Printing all songs...\n");
        //This should now look like only the liked songs list from before
        p.displayAllSongs();
    }
}
