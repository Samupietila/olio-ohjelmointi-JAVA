package Module1;
import java.util.Scanner;
public class HelloWorld {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tell me your name:");
        String name = scanner.nextLine();

        System.out.println("Good morning " + name + "!")
    }
}