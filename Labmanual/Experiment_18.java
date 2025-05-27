class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running using Thread class.");
    }
    
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread running using Runnable interface.");
    }
}
public class Experiment_18 {
    public static void main(String[] args) {
        MyThread t = new MyThread(); // create thread object
        t.start();                   // start the thread
        MyRunnable obj = new MyRunnable();    // create runnable object
        Thread t2 = new Thread(obj);           // pass it to Thread
        t2.start(); 
    }
}
