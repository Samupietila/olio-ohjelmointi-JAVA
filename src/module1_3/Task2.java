package module1_3;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Give a binary number: ");
        String s = sc.nextLine();
        String flippedS = new StringBuilder(s).reverse().toString();
        double decimal = 0;
        for (int i = 0; i <= (flippedS.length() - 1); i++) {
            if (flippedS.charAt(i) != '0') {
                decimal += Math.pow(2,i);


            }
        }
        System.out.println((int)decimal);
    }

}
