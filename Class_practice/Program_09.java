// Getter setter use
class InnerProgram_09 {
    String name;
    int age;

    void set(String n, int a) {
        name = n;
        age = a;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

}

public class Program_09 {
    public static void main(String[] args) {
        InnerProgram_09 obj = new InnerProgram_09();

        obj.set("AJAY", 23);
        System.out.println("My Name and Age: " + obj.getName() + " Age: " + obj.getAge());
    }
}
