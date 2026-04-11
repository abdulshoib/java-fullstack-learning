
import java.util.LinkedList;
import java.util.Queue;

public class QueueSearch {

    public static void main(String[] args) {

        Queue<String> q = new LinkedList<>();

        q.add("Java");
        q.add("Python");
        q.add("C++");

        System.out.println("Queue: " + q);

        // Search element
        if (q.contains("Python")) {
            System.out.println("Python Found");
        } else {
            System.out.println("Not Found");
        }

        // Loop through queue
        System.out.println("All elements:");
        for (String item : q) {
            System.out.println(item);
        }
    }
}
