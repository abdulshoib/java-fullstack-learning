package Arrays;

public class ArraySum {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        // for (int i = 0; i < numbers.length; i++) {
        //     sum = sum + numbers[i];
        // }
        //for each loop

        for (int num : numbers) {
            sum = sum + num;
        }
        System.out.println("Total Sum:" + sum);
    }
}
