package module1_4;
import java.util.Scanner;
import java.util.Random;
public class Task1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            String[] firstNames = { "Pekka","Matti","Pirkko","Janne","Riitta","Jorma" };
            String[] lastNames = {"Vesalainen", "Korhonen", "Virtanen", "Hämäläinen", "Vuori", "Virolainen" };

            System.out.print("How many names will we create? ");
            int size = scanner.nextInt();

            for (int i = 0; i < size; i++) {
                String Name = (firstNames[random.nextInt(6)] + " " + lastNames[random.nextInt(6)]);
                System.out.println(Name);

            }
        }
}

