import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class MusicPlaylistManager {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<String>();
        playlist.add("Fearless");
        playlist.add("Happy");
        playlist.add("shape of you");
        playlist.add("Perfect");

        ListIterator<String> it = playlist.listIterator();
        Scanner sc = new Scanner(System.in);
        
        String action="";
        while(!action.equals("exit")){
            System.out.print("Enter Command(next,prev,exit):");
            action=sc.nextLine();

            if(action.equalsIgnoreCase("next")){
                if (it.hasNext())System.out.println("Playing "+it.next());
                else System.out.println("No more playlist");
            }else if(action.equalsIgnoreCase("prev")){
                if (it.hasPrevious())System.out.println("RePlaying "+it.previous());
                else System.out.println("Start of playlist");
            }
        }

    }
}
