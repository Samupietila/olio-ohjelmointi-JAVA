package module3_4.Task3;
import java.io.*;
public class Main {
    private final static String FILENAME = "enrollments.ser";

    public static void main(String[] args) {
        Student student = new Student("Jaska", 20);
        Course course = new Course("ABC123", "Alkoholin perusteet", "Dr. Tohtori");
        Enrollment enrollment = new Enrollment(student, course, "1.1.1970");
        File f = new File(FILENAME);

        if (!f.exists() || !f.isFile()) {
            try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILENAME))) {
                outputStream.writeObject(enrollment);
            } catch (IOException e) {
                System.err.println("serializing: "+e.getMessage());
            }
        } else {
            try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILENAME))) {
                Object obj = inputStream.readObject();
                if (obj instanceof Enrollment deserializedEnrollment) {
                    System.out.println("Deserialized Enrollment:");
                    System.out.println("Student: " + deserializedEnrollment.getStudent().getName());
                    System.out.println("Course: " + deserializedEnrollment.getCourse().getCourseName());
                    System.out.println("Enrollment Date: " + deserializedEnrollment.getEnrollmentDate());
                } else {
                    System.out.println("unexpected object type.");
                }
            } catch (IOException | ClassNotFoundException e) {
                System.err.println(e.getMessage());
            }
        }
        }
    }

