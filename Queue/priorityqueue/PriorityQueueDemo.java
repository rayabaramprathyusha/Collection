import java.util.*;
public class PriorityQueueDemo{
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(30);
        pq.offer(20);
        pq.offer(10);

        System.out.println("Priority Queue elements: "+pq);

        System.out.println("Head Element(smallest): "+pq.peek());

        pq.poll();
        System.out.println("Priority Queue elements after removing one element: "+pq);

    }
}
