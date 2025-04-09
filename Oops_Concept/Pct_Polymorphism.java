package Oops_Concept;
class Poly_base{
     void Addition(int a){
        System.out.println("Only one value so A : "+a);
     }
     void Addition(int a, int b){
        System.out.println("Adition of two numbers: "+(a+b));
     }
     void Addition(int a, int b, int c){
        System.out.println("Addition of three number: "+(a+b+c));
     }
}

public class Pct_Polymorphism {
    public static void main(String[] args) {
        Poly_base obj = new Poly_base();

        obj.Addition(45);
        obj.Addition(12, 18);
        obj.Addition(10, 15, 5);
    }
}

// congratullation, thailand achiever, succeo rbot logos, line get from whatsapp
