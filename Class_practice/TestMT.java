class TestMT{
   public static void main(String args[]){
     System.out.println("Hello World");
     System.out.println("Thread Information " +Thread.currentThread());
     try{
         for(int i = 0; i < 10; i++){
           System.out.println(i);
           Thread.sleep(1000);
          }
     }catch(InterruptedException e){
      }
   }
}