
import java.util.ArrayList;

public class ArrayListLoop {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Ali");
        names.add("Rahul");
        names.add("John");

        System.out.println("Using for loop:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println("Using for-each loop:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
