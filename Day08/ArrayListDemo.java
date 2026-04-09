
import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Ali");
        names.add("Rahul");
        names.add("John");

        System.out.println(names);

        names.remove("Rahul");

        System.out.println("After removal: " + names);
    }
}
