package Basics;

import java.util.Scanner;

public class OddSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {   // check odd
                sum = sum + i;
            }
        }

        System.out.println("Sum of Odd numbers: " + sum);
    }
}
