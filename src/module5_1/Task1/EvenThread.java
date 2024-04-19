package module5_1.Task1;

public class EvenThread extends Thread{
    private int maxNumber;

    public EvenThread(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    @Override
    public void run() {
        for (int i = 2; i <= maxNumber; i += 2) {
            System.out.println("Even Thread: "+i);
        }
    }
}
