import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Abstract class
abstract class NumberProcessor {
    abstract void sortNumbers();
    abstract void displaySumOfEvenNumbers();
}

// Concrete class extending abstract class
class DecimalNumberProcessor extends NumberProcessor {
    private ArrayList<Double> numbers = new ArrayList<>();

    public void addNumber(double num) {
        numbers.add(num);
    }

    @Override
    void sortNumbers() {
        Collections.sort(numbers);
        System.out.println("Sorted numbers in increasing order:");
        for (double num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    @Override
    void displaySumOfEvenNumbers() {
        double sum = 0;
        for (double num : numbers) {
            // Check if the number is an integer and even
            if (num == (int) num && ((int) num) % 2 == 0) {
                System.out.println(num);
                sum += num;
            }
        }
        System.out.println("Sum of even numbers: " + sum);
    }
}

// Main class
public class DecimalList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalNumberProcessor processor = new DecimalNumberProcessor();

        System.out.print("Enter how many numbers you want to input: ");
        int count = scanner.nextInt();

        System.out.println("Enter " + count + " decimal numbers:");
        for (int i = 0; i < count; i++) {
            double num = scanner.nextDouble();
            processor.addNumber(num);
        }

        processor.sortNumbers();
        processor.displaySumOfEvenNumbers();

        scanner.close();
    }
}
