public class Program_04 {
    public static void main(String[] args) {
        Program_04 obj = new Program_04();

        System.out.println("Factorial of N number: "+obj.Factorial(0));
    }  
    public int Factorial(int n){
        if(n < 0){
            return 1;
        }
        if (n == 0) {
            return 1;
        }
        return n * Factorial(n - 1);
      }  
}
