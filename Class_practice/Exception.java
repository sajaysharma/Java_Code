public class Exception {
    public static void main(String[] args) {
        Div();
        System.out.println("Write somthing in main");
    }
    static void Div(){
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Inside main");
        }finally{
            System.out.println("Finally in main");
        }
        System.out.println("This is from div");
    }
    
}

