// Base class
class Shape {
    void area() {
        System.out.println("Area of shape");
    }
}

// Derived class: Rectangle
class Rectangle extends Shape {
    int length = 5;
    int width = 4;

    @Override
    void area() {
        System.out.println("Area of Rectangle: " + (length * width));
    }
}

// Derived class: Square
class Square extends Shape {
    int side = 6;

    @Override
    void area() {
        System.out.println("Area of Square: " + (side * side));
    }
}

// Derived class: Circle
class Circle extends Shape {
    double radius = 3.0;

    @Override
    void area() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

public class Experiment_12 {
    public static void main(String[] args) {
        Shape s;

        s = new Rectangle();  // Polymorphism
        s.area();

        s = new Square();     // Polymorphism
        s.area();

        s = new Circle();     // Polymorphism
        s.area();
    }
}
