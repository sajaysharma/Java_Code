import java.util.Scanner;

class InnerProgram_05 {
     public boolean IsPrime(int n){
        if(n <= 1){
            return false;
        }
        if(n == 2){
            return true;
        }
        if(n % 2 == 0){
            return false;
        }
        int limit = (int) Math.sqrt(n);
        for(int i = 3; i <= limit; i+=2){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    } 
    
    public void PrimeNumber(int loweBound, int upperBound){
        for(int i = loweBound; i <= upperBound; i++){
            if(IsPrime(i)){
                System.out.println("Prime number: "+i);
            }
        }
        // System.out.println();
    }
}
public class Program_05 {
    public static void main(String[] args) {
        InnerProgram_05 obj = new InnerProgram_05();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the starting value: ");
        int LwrBound = sc.nextInt();
        System.out.print("Enter the last value: ");
        int UprBound = sc.nextInt();


        // obj.IsPrime(20);
        obj.PrimeNumber(LwrBound, UprBound);
    }
}
