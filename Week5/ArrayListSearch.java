import java.util.*;

public class ArrayListSearch {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("SQL");
        list.add("Python");

        String search = "SQL";

        if (list.contains(search)) {
            System.out.println(search + " found in list");
        } else {
            System.out.println(search + " not found");
        }
    }
}