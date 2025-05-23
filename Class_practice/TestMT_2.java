class Even extends Thread{
      //override run() method

      public void run(){
         System.out.println("Hello Word from run");
        for(int i = 1; i < 11; i+=2){
          System.out.println(i);
        }
      }
}

class Odd extends Thread{
      //override run() method

      public void run(){
         System.out.println("Hello Word from run");
        for(int i = 2; i < 11; i+=2){
          System.out.println(i);
        }
      }
}
class TestMT_2{
   public static void main(String args[]){
     Even s = new Even();
     s.start(); //will run new thread
     Odd s1 = new Odd();
     s1.start(); //will run new thread
     System.out.println("Galgotias");
   }
}