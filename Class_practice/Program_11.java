// Use of This keyword -: It refers to Current class object

class InnerProgram_11 {
    String name;
    int Age;
    int math, chem, phy;

    InnerProgram_11(String name, int Age, int math, int chem, int phy){
      this.name = name;
      this.Age = Age;
      this.math = math;
      this.chem = chem;
      this.phy = phy;
    }
    int Average(){
        int avg = (math + chem + phy) / 3;
        return avg;
    }
  
}
public class Program_11 {
  public static void main(String[] args) {
      InnerProgram_11 obj = new InnerProgram_11("AJAY", 22, 30, 35, 65);
      System.out.println(obj.name + " " + obj.Age);

      System.out.println("Average: "+ obj.Average());
      
      
      
    //   InnerProgram_10 obj1 = new InnerProgram_10("AJAY", 21, "MCA");
    //   System.out.println("Name : " + obj1.name + " Age: " + obj1.Age + " Class: " + obj1.std);
  }
} 
