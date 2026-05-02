
import java.util.*;

public class LinkedListQueue {

    public static void main(String[] args) {

        LinkedList<String> queue = new LinkedList<>();

        queue.add("A");
        queue.add("B");
        queue.add("C");

        System.out.println("Queue: " + queue);

        // FIFO
        System.out.println("Removed: " + queue.removeFirst());

        System.out.println("After removal: " + queue);
    }
}
