import java.util.*;

public class RecentlyPlayedSongs {
    public static void main(String[] args) {
        LinkedHashSet<String> playlist = new LinkedHashSet<>();
        playlist.add("Uniqueness");
        playlist.add("lonely");
        playlist.add("london");
        playlist.add("Challenge");
        playlist.add("london"); //removes duplicates automatically by Hashset property
        System.out.println("songs in playlist"+playlist);
        System.out.println("Recently Played songs in order:"); //maintains order like list
        for(String s: playlist){
            System.out.println(s);
        }
    }
}
