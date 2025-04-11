// package Oops_Concept;

class InnerGetter_Setter {

    int num; //Intance variable
    String name;

    void SetKaro(int num, String name){
        this.num = num; //Temporary variable
        this.name = name;
    }

    String getName(){
        return name;
    }
    int getNum(){
        return num;
    }


    
}

public class Getter_Setter {
    public static void main(String[] args) {
        InnerGetter_Setter obj = new InnerGetter_Setter();
        obj.SetKaro(12, "Ajay");

        System.out.println("Name :" + obj.getName() + " Number : " + obj.getNum());
    }
}
