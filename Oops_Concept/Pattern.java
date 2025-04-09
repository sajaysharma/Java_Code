package Oops_Concept;
class InnerPattern {
        public int missingNumber(int []arr, int n){
            int sum = 0;
            for (int i = 0; i < n; i++){
                sum = sum + arr[i];
          }
          int misNum = n * (n + 1) / 2;
  
          return misNum = misNum - sum;  
        }
        public void Largest(int []arr, int n){
            int large = arr[0];
            // int small = arr[0];
            int seLarge = arr[1];
            for(int i = 0; i < n; i++){
                if(arr[i] > large){
                    large = arr[i];
                    seLarge = arr[i + 1];
                }
                // if(arr[i] < small){
                //     small = arr[i];
                // }
            }
            System.out.println("Largest number: "+large);
            System.out.println("Small number: "+seLarge);
            
        }
}
public class Pattern{
    public static void main(String[] args) {
        InnerPattern obj = new InnerPattern();
        int n = 6;
        int[] arr = {4, 90, 12, 6, 1, 5};
        // int misNum = obj.missingNumber(arr, n);
         obj.Largest(arr, n);
        
        // System.out.println("Missing number: "+misNum); 
        
    }
}