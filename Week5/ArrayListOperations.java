import java.util.*;

public class ArrayListOperations {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Original: " + list);

        // get
        System.out.println("First Element: " + list.get(0));

        // set
        list.set(1, 99);
        System.out.println("After Update: " + list);

        // remove
        list.remove(2);
        System.out.println("After Remove: " + list);

        // size
        System.out.println("Size: " + list.size());
    }
}