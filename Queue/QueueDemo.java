import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> tasks = new LinkedList();

        tasks.offer("Task1");
        tasks.offer("Task2");
        tasks.offer("Task3");

        System.out.println("Tasks in queue"+tasks);

        System.out.println("Peek: "+tasks.peek());

        tasks.poll();
        System.out.println("After removing one task: "+tasks);

        System.out.println("Iterating over tasks");
        for(String t:tasks){
            System.out.println(t);
        }
    }
}
