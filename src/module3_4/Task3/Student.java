package module3_4.Task3;
import java.io.*;
public class Student implements Serializable{
    private static int id;
    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
        id++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Student.id = id;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age;
    }
}
