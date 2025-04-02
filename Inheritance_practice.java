class Animal {
    
    void dog(){
        System.out.println("Dog is Bark !");
    }
}
class Subclass extends Animal {
        void cat(){
            System.out.println("Cat is meow !");
        }   
}
public class Inheritance_practice {
    public static void main(String[] args) {
        Subclass obj = new Subclass();
        obj.dog();
        obj.cat();
    }
}
