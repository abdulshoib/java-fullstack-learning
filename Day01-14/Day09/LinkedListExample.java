package day09;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("Initial List: " + list);

        // Add at beginning and end
        list.addFirst("Start");
        list.addLast("End");

        System.out.println("After addFirst & addLast: " + list);

        // Remove element
        list.remove("Python");
        System.out.println("After removal: " + list);

        // Search element
        if (list.contains("Java")) {
            System.out.println("Java Found");
        } else {
            System.out.println("Java Not Found");
        }

        // Loop through list
        System.out.println("All elements:");
        for (String item : list) {
            System.out.println(item);
        }
    }
}
