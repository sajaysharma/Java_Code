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
class Simple1 extends Thread {
    Display d;
    Simple1(Display d) {
        this.d = d;
    }
    public void run() {
        d.Odd();
    }
}
class Simple2 extends Thread {
    Display d;
    Simple2(Display d) {
        this.d = d;
    }
    public void run() {
        d.Even();
    }
}

public class OddEvenSynch {
    public static void main(String args[]) {
        Display d = new Display();  // Shared Display object
        Simple1 t1 = new Simple1(d);
        Simple2 t2 = new Simple2(d);
        t1.start();
        t2.start();
    }
}