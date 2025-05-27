import java.io.*;

// Step 1: Create a class and make it Serializable
class Student implements Serializable {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }
}

public class Experiment_20 {
    public static void main(String[] args) {
        try {
            // Step 2: Write object to file
            Student s1 = new Student("Ajay", 20);
            FileOutputStream fos = new FileOutputStream("student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.close();
            fos.close();
            System.out.println("Object written to file.");

            // Step 3: Read object from file
            FileInputStream fis = new FileInputStream("student.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student s2 = (Student) ois.readObject();
            ois.close();
            fis.close();

            // Step 4: Display read data
            System.out.println("Read from file: " + s2.name + ", " + s2.age);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }   
}
