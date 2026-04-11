
import java.util.HashMap;

public class HashMapLoop {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        // Loop
        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        // Search
        if (map.containsKey(2)) {
            System.out.println("Key 2 Found");
        }
    }
}
