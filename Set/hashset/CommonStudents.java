import java.util.Arrays;
import java.util.HashSet;

public class CommonStudents {
    public static void main(String[] args) {
        HashSet<String> CourseA = new HashSet<>(Arrays.asList("Alice","bob","Vinny"));
        HashSet<String> CourseB =new HashSet<>(Arrays.asList("Charlie","bob","donna"));

        HashSet<String> common=new HashSet<>(CourseA);
        common.removeAll(CourseB);  // keeps only common elements

        System.out.println("Students enrolled in both courses "+ common);
    }
}

