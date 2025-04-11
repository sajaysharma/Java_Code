

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to compare: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a number greater than zero.");
            return;
        }

        System.out.print("Enter number 1: ");
        int largest = scanner.nextInt();

        for (int i = 2; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int current = scanner.nextInt();

            if (current > largest) {
                largest = current;
            }
        }

        System.out.println("The largest number is: " + largest);
    }
}
