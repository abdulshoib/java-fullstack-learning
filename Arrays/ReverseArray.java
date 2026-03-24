package Arrays;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        reverse(arr);

    }

    public static void reverse(int[] arr) {
        int[] reverseArray = new int[arr.length];
        int index = arr.length;
        for (int i = 0; i < arr.length; i++) {
            reverseArray[index - 1] = arr[i];
            index = index - 1;

        }
        System.out.println("Original Array:=" + Arrays.toString(arr));
        System.out.println("Reverse Array:=" + Arrays.toString(reverseArray));

    }

}
