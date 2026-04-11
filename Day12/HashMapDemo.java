

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");

        System.out.println("HashMap: " + map);

        System.out.println("Value for key 2: " + map.get(2));

        map.remove(3);

        System.out.println("After removal: " + map);
    }
}