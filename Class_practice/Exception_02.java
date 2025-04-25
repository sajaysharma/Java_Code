// import java.lang.*;
public class Exception_02 {

    public static void main(String[] args) {
        try {
            Div();
        } catch (ArithmeticException e) {
            System.out.println("Inside 2nd catch");
            throw new NullPointerException();
        }finally{
            System.out.println("hello");
        }
        
    }

    static void Div() throws Exception{
      int result = 10/0;
    }

}
