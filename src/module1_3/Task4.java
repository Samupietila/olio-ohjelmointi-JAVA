package module1_3;
import java.util.Scanner;
import java.util.Random;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Tervetuloa kertotaulukokeeseen!");
        int correctAnswers = 0;
        for (int i = 0; i <= 9; i++) {

            int x = random.nextInt(10) + 1;
            int y = random.nextInt(10) + 1;
            System.out.print("Laske: " + x  + " • " + y + " = " );
            int answer = sc.nextInt();

            if (answer == (x*y)) {
                System.out.println("HIENOSTI LASKETTU!");
                correctAnswers += 1;
            }
            else {
                System.out.println("NYYYT MENI PÄIN HONKIA!");
            }
        }
        System.out.println("Koe on nyt päättynyt. Sait " + correctAnswers + "/10.");
    }
}