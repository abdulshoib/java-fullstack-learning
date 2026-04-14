
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("LinkedList: " + list);

        list.addFirst("Start");
        list.addLast("End");

        System.out.println("After adding first & last: " + list);

        list.removeFirst();
        list.removeLast();

        System.out.println("After removing: " + list);
    }
}
