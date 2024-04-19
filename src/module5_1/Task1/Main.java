package module5_1.Task1;
import java.util.Scanner;
class Main implements Runnable {

    public void run() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number: ");
            int maxNumber = scanner.nextInt();
            Thread evenThread = new Thread(new EvenThread(maxNumber));
            Thread oddThread = new Thread(new OddThread(maxNumber));
            oddThread.start();
            evenThread.start();
            evenThread.join();
            oddThread.join();
            System.out.println("Printing complete.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
}
