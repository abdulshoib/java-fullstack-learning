package Day02;

public class MaxArray {

    public static void main(String[] args) {

        int[] arr = {5, 8, 2, 15, 3};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Max = " + max);
    }
}
