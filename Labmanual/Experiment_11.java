class Calculator {
    int a, b;

    // Constructor Overloading
    Calculator(int x) {
        System.out.println("Value is: " + x);
    }

    Calculator(int x, int y) {
        System.out.println("Two values addition: " + (x + y));
    }

    // Method Overloading
    void add(int x) {
        System.out.println("Value: " + x);
    }

    void add(int x, int y) {
        System.out.println("Addition with parameters: " + (x + y));
    }
}

public class Experiment_11 {
    public static void main(String[] args) {
        // Using Constructor Overloading
        Calculator c2 = new Calculator(10);     // a=10, b=0
        Calculator c3 = new Calculator(5, 15);  // a=5, b=15

        // Using Method Overloading
        c2.add(23);              // calls add() → 10 + 0
        c3.add(7, 8);          // calls add(int, int) → 7 + 8
    }
}
