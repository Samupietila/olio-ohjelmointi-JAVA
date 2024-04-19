package module5_1.Task2;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        SumThread thread1 = new SumThread(numbers[0], numbers[1], numbers[2]);
        SumThread thread2 = new SumThread(numbers[3], numbers[4], numbers[5]);
        SumThread thread3 = new SumThread(numbers[6], numbers[7], numbers[8]);


        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int totalSum = thread1.getSum() + thread2.getSum() + thread3.getSum();
        System.out.println("Total sum: " + totalSum);
    }
}
