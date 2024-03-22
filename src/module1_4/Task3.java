package module1_4;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] integerArray = new int[size];
        int[] betterArray = new int[size];
        int counter = 0;
        System.out.println("Enter the integers into the array: ");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i+1) + ": ");
            integerArray[i] = sc.nextInt();
        }
        boolean samenumber;
        for (int i : integerArray) {
            samenumber = false;

            for(int j : betterArray) {

                if (i == j) {
                    samenumber = true;
                    break;
                }
            }
            if(!samenumber){
                betterArray[counter] = i;
                counter += 1;
            }
        }
        int[] noDublicatesArray = new int[counter];
        System.arraycopy(betterArray,0,noDublicatesArray, 0, counter);
        System.out.println("The array without duplicates: ");
        for(int i : noDublicatesArray){
            System.out.print(i + " ");
        }


    }
}
