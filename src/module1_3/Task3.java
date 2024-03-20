package module1_3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First positive number: ");
        int firstNumber = sc.nextInt();

        System.out.print("Second positive number: ");
        int secondNumber = sc.nextInt();

        if (firstNumber < secondNumber) {
            int number = secondNumber;
            secondNumber = firstNumber;
            firstNumber = number;
        }
        boolean primenumber;


        for (double i = secondNumber + 1; i <= firstNumber; i++) {
            primenumber = true;
            if (i == 2 || i == 1) {
                System.out.println((int)i + " is a prime number.");
                continue;
            }
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    primenumber = false;
                    break;
                }
            }
             if (primenumber)  {
                 System.out.println((int)i + " is a prime number.");
                }
            }
        }
    }


