package module1_4;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int biggestSum=0;
        int sum = 0;
        int[] biggestIntegers = new int[2];
        int startIndex = 0;
        int[] integerArray = new int[size];
        System.out.println("Enter the integers into the array: ");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i+1) + ": ");
            integerArray[i] = sc.nextInt();
            sum += integerArray[i];
            if (sum > biggestSum) {
                biggestSum = sum;
                biggestIntegers[1] = i + 1;
                biggestIntegers[0] = startIndex;
            }
            if (sum < 0) {
                startIndex = i + 2;
                sum = 0;
            }
        }
        System.out.println("Maximum sum: " +biggestSum);
        System.out.println("Integers: " + biggestIntegers[0] + "–" + biggestIntegers[1]);
    }
}
