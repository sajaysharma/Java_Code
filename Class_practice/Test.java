/*Create a program to display odd and even numbers using two threads. But the condition is that use only one run() method
  to do this task.
*/

class Display {
    synchronized void Odd() {
        System.out.println("Thread one");
        for (int i = 1; i < 20; i += 2) {
            System.out.println("T1 " + i);
        }
    }
    synchronized void Even() {
        System.out.println("Thread two");
        for (int i = 2; i < 20; i += 2) {
            System.out.println("T2 " + i);
        }
    }
}
class TestThread extends Thread{
     Display d;
     TestThread(Display d){
     this.d = d;
     }
     public void run(){
       d.Odd();
     }
  
}
class Test{
   public static void main(String[] args){
        Display d = new Display();
        TestThread t1 = new TestThread(d);
        t1.start();
        TestThread t2 = new TestThread(d);
        t2.start();
}
}