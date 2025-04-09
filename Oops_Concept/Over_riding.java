package Oops_Concept;
class Animal {
      void sound(){
         System.out.println("This Animal Make a Sound");
      }    
}
class dog extends Animal {
          void sound(){
            super.sound();
            System.out.println("The dog barks");
          }    
} 
class cat extends Animal{
     void sound(){
        System.out.println("Cat is Meows");
     }    
}
public class Over_riding {
    public static void main(String[] args) {
        dog myDog = new dog();
        Animal myAnimal = new Animal();
        cat myCat = new cat();

        myAnimal.sound();
        myCat.sound();
        myDog.sound();
    }
}
