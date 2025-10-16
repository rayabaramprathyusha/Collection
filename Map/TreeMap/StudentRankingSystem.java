import java.util.*;

public class StudentRankingSystem {
    public static void main(String[] args) {
        TreeMap<Integer,String> studentrank = new TreeMap<>();
        studentrank.put(105,"Priya");
        studentrank.put(102,"Ryan");
        studentrank.put(101,"Misha");

        System.out.println("Student sorted by ID"+studentrank);

        studentrank.remove(101);
        System.out.println("Student details after removing:"+studentrank);

        System.out.println("Ascending Order:");
        for(Map.Entry<Integer,String> entry:studentrank.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println("Descending Order:");
        for(Map.Entry<Integer,String> entry:studentrank.descendingMap().entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
