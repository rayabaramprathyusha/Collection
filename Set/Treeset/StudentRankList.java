import java.util.TreeSet;

public class StudentRankList {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(85);
        scores.add(90);
        scores.add(75);
        scores.add(100);

        System.out.println("Student scores in ascending order"+scores);
        System.out.println("Top Score"+scores.first());
        System.out.println("Least Score"+scores.last());
    }
}
