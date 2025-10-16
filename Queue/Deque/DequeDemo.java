import java.util.*;
public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("S");
        deque.addLast("A");
        deque.addLast("I");

        System.out.println("Elements in deque"+deque);

        deque.removeFirst();
        System.out.println("After Removing "+deque);

        deque.removeLast();
        System.out.println("After removing "+deque);
    }
}
