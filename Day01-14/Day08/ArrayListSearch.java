
import java.util.ArrayList;

public class ArrayListSearch {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        int search = 20;

        if (numbers.contains(search)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
