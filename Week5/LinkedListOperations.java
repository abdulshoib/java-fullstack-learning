import java.util.*;

public class LinkedListOperations {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("SQL");
        list.add("Python");

        System.out.println("Original: " + list);

        list.addFirst("HTML");
        list.addLast("Spring");

        System.out.println("After addFirst & addLast: " + list);

        list.remove("SQL");

        System.out.println("After Remove: " + list);

        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());
    }
}