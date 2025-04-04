class InnerProgram_10 {
      String name;
      int Age;
      String std;
      InnerProgram_10(String n, int a){
        name = n;
        Age = a;
      }
      InnerProgram_10(String n, int a, String s){
        name = n;
        Age = a;
        std = s;
      }
    
}
public class Program_10 {
    public static void main(String[] args) {
        InnerProgram_10 obj = new InnerProgram_10("AJAY", 22);
        System.out.println(obj.name + " " + obj.Age);
        
        InnerProgram_10 obj1 = new InnerProgram_10("AJAY", 21, "MCA");
        System.out.println("Name : " + obj1.name + " Age: " + obj1.Age + " Class: " + obj1.std);
    }
}
