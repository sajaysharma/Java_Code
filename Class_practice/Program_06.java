public class Program_06 {
    public static void main(String[] args) {
        int n = 20; // Change this number for testing
        int count = 0;
        int m = n;

        while (n > 0) {
            int d = n % 10;
            System.out.println(d);
            
            // Avoid division by zero error
            if (d != 0 && m % d == 0) {
                count++;
            }
            
            n /= 10;
        }
        
        System.out.println("Number of divisible digits: " + count);
    }
}
