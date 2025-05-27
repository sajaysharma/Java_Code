class student{
    String name;
    int age;

    public void setter(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

public class Experiment_09 {
    public static void main(String[] args) {
        student st = new student();
        st.setter("Ajay", 21);
        System.out.println("Name of Student: " + st.getName());
        System.out.println("Age of student: " + st.getAge());
    }
    
}