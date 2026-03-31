
import java.util.Scanner;

public class StudentMarksAnalyzer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        // Input marks
        System.out.println("Enter marks:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        // Initialize values
        int sum = 0;
        int max = marks[0];
        int min = marks[0];

        // Process data
        for (int i = 0; i < n; i++) {
            sum += marks[i];

            if (marks[i] > max) {
                max = marks[i];
            }

            if (marks[i] < min) {
                min = marks[i];
            }
        }

        double average = (double) sum / n;

        // Output results
        System.out.println("\n--- Results ---");
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        // Reverse array
        System.out.print("Reversed Array: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(marks[i] + " ");
        }

        sc.close();
    }
}
