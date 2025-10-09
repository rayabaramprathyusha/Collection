import java.util.HashSet;
import java.util.Scanner;

public class DuplicateWordsFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a paragraph");
        String paragraph = sc.nextLine().toLowerCase();

        String[] words=paragraph.split("\\W+");
        HashSet<String> seen=new HashSet<>();
        HashSet<String> duplicates=new HashSet<>();

        for(String word:words){
            if(!seen.add(word)){
                duplicates.add(word);
            }
        }
        System.out.println("Duplicate words:"+duplicates);
        sc.close();

    }
}
