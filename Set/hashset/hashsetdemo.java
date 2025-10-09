import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("New York");
        cities.add("Chicago");
        cities.add("Dallas");
        cities.add("New York"); // Duplicate, ignored

        System.out.println("Cities in HashSet: " + cities);

        cities.remove("Chicago");
        System.out.println("After removal: " + cities);

        System.out.println("Iterating through elements:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
