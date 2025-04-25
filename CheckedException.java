class LowBalance extends Exception {
   LowBalance(String m){
        super(m);
    }
}
public class CheckedException{
    public static void main(String[] args) {
        int bal = 8000;
        try {
            if(bal < 10000) 
                throw new LowBalance("Balance is Low");
        } catch (LowBalance e) {
            System.out.println("Low balance exception");
        }
    }
}
