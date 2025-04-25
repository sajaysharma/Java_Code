class Age extends Exception{
    Age(String m){
        super(m);
    }
}
public class Exception_03 {
    public static void main(String[] args) {
        int age = 20;
        try {
            if (age < 18 || age > 60) {
                throw new Age("Invalid Age");
            }
        } catch (Age e) {
            // TODO: handle exception
            System.out.println("Age Exception" + e);
        }
    }
}
