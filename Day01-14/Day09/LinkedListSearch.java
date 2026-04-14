
import java.util.LinkedList;

public class LinkedListSearch {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        if (list.contains("Python")) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
