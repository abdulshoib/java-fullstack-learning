package Arrays;

import java.util.Scanner;

public class LinearSearchString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Ali", "John", "Sara", "David"};

        System.out.print("Enter name: ");
        String key = sc.next();

        int index = -1;

        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(key)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Found at index: " + index);
        } else {
            System.out.println("Not found");
        }

        sc.close();
    }
}
