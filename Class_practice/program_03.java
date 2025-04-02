//decesion making (if- else)
//loop control (for, while, do-while)
//jump control (break, continue)
class Innerprogram_03 {
    public void sumEvnOdd(int n){
      int EvnSum = 0, OddSum = 0;
      for(int i = 0; i <= n; i++){
        if (i % 2 == 0) {
          EvnSum = EvnSum + i;
        }else{
          OddSum = OddSum + i;
        }
      }
      System.out.println("The sum of all even number: "+EvnSum);
      System.out.println("The sum of all odd number: "+OddSum);
    }
}

public class program_03{
  public static void main(String args[]){
    Innerprogram_03 obj = new Innerprogram_03();

    obj.sumEvnOdd(20);
}
}