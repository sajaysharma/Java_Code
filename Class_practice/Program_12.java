public class Program_12 {

     int recursion(int n){
        // int sum = 0;
        // int m = n;
        //  (sum + (m * m * m));
        
        return n * n * n + recursion(n - 1);
    }
     public static void main(String[] args) {
        Program_12 obj = new Program_12();

        System.out.println(obj.recursion(5));
     }    
}
