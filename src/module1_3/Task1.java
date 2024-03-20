package module1_3;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Give the value of a: ");
            double a = sc.nextDouble();

            System.out.print("Give the value of b: ");
            double b = sc.nextDouble();

            System.out.print("Give the value of c: ");
            double c = sc.nextDouble();

            double root1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            double root2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            if (root1 == root2) {
                System.out.println("Root is " + root1);
            } else if (Math.pow(b, 2) - (4 * a * c) < 0) {
                System.out.println("No real roots.");
            } else {
                System.out.println("Roots are " + root1 + " and " + root2);
            }
        }


    }

