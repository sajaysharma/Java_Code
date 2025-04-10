public class Program_04 {

    public static long Factorial(int n){
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * Factorial(n - 1);
    }
    public static void main(String[] args) {
        
        long result = Factorial(5);
        System.out.println("Factorial of N number: " + result);
    }    
}
