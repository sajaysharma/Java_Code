// package Oops_Concept;

public class Problem {
    public static void main(String[] args) {
        int number = 0; 
        System.out.println("Before");
        try {
            int value = 10 / number;
            System.out.println("Value: " + value);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        System.out.println("Renaining part");
    }
}
