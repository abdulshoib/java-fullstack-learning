package Arrays;

import java.util.Scanner;

public class LinearSearchCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 20, 40, 20};

        System.out.print("Enter element: ");
        int key = sc.nextInt();

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
            }
        }

        System.out.println("Occurrences: " + count);

        sc.close();
    }
}
