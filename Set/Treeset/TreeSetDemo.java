import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(8);
        numbers.add(12);
        numbers.add(5);
        numbers.add(8);
        System.out.println("Numbers in Ascending order"+numbers);
        numbers.remove(5);
        System.out.println("Numbers after removing"+numbers);

        System.out.println("iterating through numbers in Ascending order");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
