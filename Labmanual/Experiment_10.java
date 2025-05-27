// Class with Constructor
class Student {
    // Data members
    String name;
    int rollNo;

    // Constructor
    Student(String n, int r) {
        name = n;
        rollNo = r;
    }

    // Method to display values
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}

public class Experiment_10 {
    public static void main(String[] args) {
        // Creating object and passing values using constructor
        Student s1 = new Student("Anjali Verma", 101);

        // Displaying values
        s1.displayInfo();
    }
}
