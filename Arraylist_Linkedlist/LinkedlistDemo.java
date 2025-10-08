import java.util.*;

public class LinkedlistDemo {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("John");
        names.add("Vinny");
        names.add("Robinson");
        names.add("jean");

        System.out.println("Linked list after adding elements"+names);

        String FirstElement=names.getFirst();
        System.out.println("First element:"+FirstElement);

        names.remove("Vinny");
        System.out.println("Linked list after removing elements"+names);

        System.out.println("Iterating through elements");
        for (String name : names) {
            System.out.println(name);
        }

    }
}
