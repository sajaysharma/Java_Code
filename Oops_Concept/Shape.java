package Oops_Concept;

class InnerShape {
    float Area(){
        return 0;
    }
}class Square extends InnerShape {
    float side;
    
    Square(float l){
        side = l;
       
    }
    float Area(){
        return side * side;
    }
}
class Rectangle extends InnerShape {
    float length;
    float width;
    Rectangle(float l, float w){
        length = l;
        width = w;
    }
    float Area(){
        return length * width;
    }
}
class Circle extends InnerShape {
    float radious;
    double PI = 3.14;
    Circle(float radious){
        this.radious = radious;
    }
    float Area(){
        return PI * radious * radious;
    }
}

public class Shape {
    public static void main(String[] args) {
        InnerShape obj1 = new Square(4);
        InnerShape obj2 = new Rectangle(4, 6);
        InnerShape obj3 = new Circle(4);

        System.out.println("The Area of Square:" + obj1.Area());
        System.out.println("The Area of Rectangle: " + obj2.Area());
        System.out.println("The Area of Circle: " + obj3.Area());
        

    
    }
}
