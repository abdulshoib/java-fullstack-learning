package Arrays;

import java.util.Scanner;

public class BinarySearchBasic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50, 60};

        System.out.print("Enter element: ");
        int key = sc.nextInt();

        int low = 0, high = arr.length - 1;
        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                index = mid;
                break;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
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
