
import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println("PriorityQueue: " + pq);

        pq.poll();

        System.out.println("After poll: " + pq);

        System.out.println("Top element: " + pq.peek());
    }
}
